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

    PageInfo<Hotel> listHotels(Integer pageNo,Integer PageSize) throws Exception;

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
