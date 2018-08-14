package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.TrafficMapper;
import com.dyhc.sdglgroundconnection.service.TrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 交通业务实现
 **/
@Service
public class TrafficServiceImpl implements TrafficService {

    @Autowired
    private TrafficMapper trafficMapper;
}
