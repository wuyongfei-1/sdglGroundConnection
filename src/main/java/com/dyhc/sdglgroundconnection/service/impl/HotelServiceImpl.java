package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.HotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店业务实现
 **/
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    public PageInfo<Hotel> listHotels(Integer pageNo, Integer PageSize) {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Hotel> pageInfo = new PageInfo<>(hotelMapper.selectAll());
        return pageInfo;
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Hotel> listByaHotel() {
        return hotelMapper.selectAll();
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
    public int updateHotel(Hotel hotel) {
        return hotelMapper.updateByPrimaryKey(hotel);
    }

    /**
     * 删除
     *
     * @return
     */
    @Override
    public int deleteHotelByID(int id) {
        return hotelMapper.deleteByPrimaryKey(id);
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
