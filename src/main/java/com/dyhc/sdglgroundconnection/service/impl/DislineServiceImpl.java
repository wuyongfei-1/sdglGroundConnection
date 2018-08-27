package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DislineMapper;
import com.dyhc.sdglgroundconnection.service.DislineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路信息业务实现
 **/
@Service
public class DislineServiceImpl implements DislineService {

    @Autowired
    private DislineMapper dislineMapper;
}
