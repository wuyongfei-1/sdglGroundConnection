package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.GuideScheduleMapper;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程 业务实现
 **/
@Service
public class GuideScheduleServiceImpl implements GuideScheduleService {

    @Autowired
    private GuideScheduleMapper guideScheduleMapper;
}
