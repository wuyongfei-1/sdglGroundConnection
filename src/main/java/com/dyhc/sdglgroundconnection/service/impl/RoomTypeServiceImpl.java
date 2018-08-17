package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.RoomTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
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
    private RoomTypeMapper roomTypeMapper ;

    @Override
    public RoomType getTypeId(Integer id) throws Exception {
        return roomTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertRoomType(RoomType roomType)throws Exception {
        return roomTypeMapper.insert(roomType);
    }

    @Override
    public int updateRoomType(RoomType roomType) throws Exception{
        return roomTypeMapper.updateByPrimaryKeySelective(roomType);
    }

    @Override
    public int deleteRoomType(Integer id) throws Exception{
        return roomTypeMapper.deleteByPrimaryKey(id);
    }
}
