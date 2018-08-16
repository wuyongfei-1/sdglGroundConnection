package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.ReportticketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账门票 控制层
 **/
@RestController
@RequestMapping("/reportticket")
public class ReportticketController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ReportticketController.class);

    @Autowired
    private ReportticketService reportticketService;
}
