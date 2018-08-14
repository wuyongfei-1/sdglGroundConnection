package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.TravelMapper;
import com.dyhc.sdglgroundconnection.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社业务实现
 **/
@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelMapper travelMapper;
}
