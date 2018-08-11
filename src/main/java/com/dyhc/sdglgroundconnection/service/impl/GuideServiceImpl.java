package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;
}
