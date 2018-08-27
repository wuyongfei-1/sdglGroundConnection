package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.RoomTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.pojo.RoomtypeExample;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店类型业务实现
 **/
@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeMapper roomTypeMapper;

    /**
     * 根据酒店编号查询所属的所有房间类型（wuoyongfei）
     *
     * @param hotelId 酒店编号
     * @return 房间类型列表
     * @throws Exception 全局异常
     */
    @Override
    public List<RoomType> listRoomTypesByHotelId(Integer hotelId) throws Exception {
        RoomtypeExample roomtypeExample = new RoomtypeExample();
        RoomtypeExample.Criteria criteria = roomtypeExample.createCriteria();
        criteria.andHotelidEqualTo(hotelId);
        List<RoomType> roomTypes = roomTypeMapper.selectByExample(roomtypeExample);
        return roomTypes;
    }

    @Override
    public RoomType getTypeId(Integer id) throws Exception {
        return roomTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    @RecordOperation(type = "酒店房间", desc = "添加了一条酒店房间信息")
    public int insertRoomType(RoomType roomType) throws Exception {
        return roomTypeMapper.insert(roomType);
    }

    @Override
    @RecordOperation(type = "酒店房间", desc = "修改了一条酒店房间信息")
    public int updateRoomType(RoomType roomType) throws Exception {
        return roomTypeMapper.updateByPrimaryKeySelective(roomType);
    }

    @Override
    @RecordOperation(type = "酒店房间", desc = "删除了一条酒店房间信息")
    public int deleteRoomType(Integer id) throws Exception {
        return roomTypeMapper.deleteByPrimaryKey(id);
    }
}
