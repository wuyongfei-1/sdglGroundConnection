package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.ReportqutsubsidyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账出团补助 控制层
 **/
@RestController
@RequestMapping("/reportqutsubsidy")
public class ReportqutsubsidyController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ReportqutsubsidyController.class);

    @Autowired
    private ReportqutsubsidyService reportqutsubsidyService;
}
