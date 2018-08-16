package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.ReportfareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费 控制层
 **/
@RestController
@RequestMapping("/reportfare")
public class ReportfareController{

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ReportfareController.class);

    @Autowired
    private ReportfareService reportfareService;
}
