package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Service
public class DisguideServiceImpl implements DisguideService {

    @Autowired
    private DisguideMapper disguideMapper;
}
