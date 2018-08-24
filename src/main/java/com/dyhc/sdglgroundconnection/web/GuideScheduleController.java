package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程安排 控制层
 **/
@RestController
@RequestMapping("/guideSchedule")
public class GuideScheduleController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideScheduleController.class);

    @Autowired
    private GuideScheduleService guideScheduleService;
}
