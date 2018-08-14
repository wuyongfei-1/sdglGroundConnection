package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.HoteroomTypeMapper;
import com.dyhc.sdglgroundconnection.service.HoteroomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店房间类型业务实现
 **/
@Service
public class HoteroomTypeServiceImpl implements HoteroomTypeService {

    @Autowired
    private HoteroomTypeMapper hoteroomTypeMapper;
}
