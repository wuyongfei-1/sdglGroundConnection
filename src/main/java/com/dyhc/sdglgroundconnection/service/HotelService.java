package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店业务接口
 **/
public interface HotelService {

    /**
     * 酒店信息多条件模糊分页查询（dubingkun）
     * @param pageNo 当前页码
     * @param PageSize 当前页码显示数据数
     * @param hotelName 酒店名称
     * @param hotelAddress 酒店地址
     * @param offer 报价
     * @param status 状态
     * @return
     */
    PageInfo<Hotel> listHotels(Integer pageNo, Integer PageSize,String hotelName,String hotelAddress,Integer offer,Integer offer2,Integer status);

    /**
     * 查询全部
     * @return
     */
    List<Hotel> listByaHotel();
    /**
     * 增加
     */
    int insertHotel(Hotel hotel);
    /**
     * 修改
     */
    int updateHotel(Hotel hotel);
    /**
     * 删除
     */
    int deleteHotelByID(int id);

    /**
     * id查询
     * @param id
     * @return
     */
    Hotel selectHotelById(int id);
}
