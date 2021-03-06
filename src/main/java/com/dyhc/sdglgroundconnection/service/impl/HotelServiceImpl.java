package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.HotelMapper;
import com.dyhc.sdglgroundconnection.mapper.RoomTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.HotelExample;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.pojo.RoomtypeExample;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店业务实现
 **/
@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;
    @Autowired
    private RoomTypeMapper roomTypeMapper;


    /**
     * 酒店信息多条件模糊分页查询（dubingkun）
     * @param pageNo 当前页码
     * @param PageSize 当前页码显示数据数
     * @param hotelName 酒店名称
     * @param hotelAddress 酒店地址
     * @param offer 最低报价
     * @param offer2 最高报价
     * @param status 状态
     * @return
     */
    public PageInfo<Hotel> listHotels(Integer pageNo, Integer PageSize,String hotelName,String hotelAddress,Integer offer,Integer offer2,Integer status) {
        PageHelper.startPage(pageNo, PageSize, true);
        //查询酒店
        HotelExample hotelExample = new HotelExample();
        HotelExample.Criteria criteria = hotelExample.createCriteria();
        if(hotelName!=""&&hotelName!=null){
            criteria.andHotelnameLike("%"+hotelName+"%");
        }
        if(hotelAddress!=""&&hotelAddress!=null){
            criteria.andHoteladdressLike("%"+hotelAddress+"%");
        }
        if(offer!=null){
            criteria.andOfferGreaterThanOrEqualTo(offer);
        }
        if(offer2!=null){
            criteria.andOfferLessThanOrEqualTo(offer2);
        }
        if(status!=null){
            criteria.andStatusEqualTo(status);
        }
        criteria.andWhetherdelEqualTo(0);
        List<Hotel> hotels = hotelMapper.selectByExample(hotelExample);
        //查询酒店房间
        for (Hotel item:hotels) {
            RoomtypeExample roomtypeExample=new RoomtypeExample();
            RoomtypeExample.Criteria criteria1 = roomtypeExample.createCriteria();
            criteria1.andHotelidEqualTo(item.getHotelId());
            //查询未删除
            criteria1.andWhetherdelEqualTo(0);
            List<RoomType> roomTypeList=roomTypeMapper.selectByExample(roomtypeExample);
            item.setRoomTypeList(roomTypeList);
        }
        PageInfo<Hotel> pageInfo = new PageInfo<>(hotels);
        return pageInfo;
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Hotel> listByaHotel() {
        HotelExample hotelExample=new HotelExample();
        HotelExample.Criteria criteria=hotelExample.createCriteria();
        criteria.andWhetherdelEqualTo(0);
        return hotelMapper.selectByExample(hotelExample);
    }

    /**
     * 增加
     *
     * @return
     */
    @Override
    @RecordOperation(type = "酒店", desc = "添加了一条酒店信息")
    public int insertHotel(Hotel hotel) {
        return hotelMapper.insert(hotel);
    }

    /**
     * 修改
     *
     * @return
     */
    @Override
    @RecordOperation(type = "酒店", desc = "修改了一条酒店信息")
    public int updateHotel(Hotel hotel) {
        return hotelMapper.updateByPrimaryKey(hotel);
    }

    /**
     * 删除酒店房屋信息（dubingkun）
     * @param id
     * @return
     */
    @Override
    @Transactional
    @RecordOperation(type = "酒店", desc = "删除了一条酒店信息")
    public int deleteHotelByID(int id) {
        RoomtypeExample roomtypeExample=new RoomtypeExample();
        RoomtypeExample.Criteria criteria=roomtypeExample.createCriteria();
        criteria.andHotelidEqualTo(id);
        //获取酒店下的房间信息
        List<RoomType> roomTypes=roomTypeMapper.selectByExample(roomtypeExample);
        for (RoomType item:roomTypes) {
            //循环修改删除状态列
            RoomType roomType=roomTypeMapper.selectByPrimaryKey(item.getTypeId());
            roomType.setWhetherDel(1);
            roomTypeMapper.updateByPrimaryKey(roomType);
        }
        Hotel hotel=hotelMapper.selectByPrimaryKey(id);
        hotel.setWhetherDel(1);
        int a=hotelMapper.updateByPrimaryKey(hotel);
        return a;
    }

    /**
     * id查询
     *
     * @return
     */
    @Override
    public Hotel selectHotelById(int id) {
        return hotelMapper.selectByPrimaryKey(id);
    }


}
