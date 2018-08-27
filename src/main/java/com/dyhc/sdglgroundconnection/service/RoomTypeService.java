package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店类型业务接口
 **/
public interface RoomTypeService {
    /**
     * 通过酒店编号查询所属的所有房间类型（wuyongfei）
     *
     * @param hotelId 酒店编号
     * @return 房间类型列表
     * @throws Exception 全局异常
     */
    List<RoomType> listRoomTypesByHotelId(Integer hotelId) throws Exception;

    RoomType getTypeId(Integer id) throws Exception;

    /**
     * 添加房屋类型（dubingkun）
     *
     * @param roomType
     * @return
     */
    int insertRoomType(RoomType roomType) throws Exception;

    /**
     * 修改房屋类型信息（dubingkun）
     *
     * @param roomType
     * @return
     */
    int updateRoomType(RoomType roomType) throws Exception;

    /**
     * 删除房屋信息（dubingkun）
     *
     * @param id
     * @return
     */
    int deleteRoomType(Integer id) throws Exception;
}
