package com.dyhc.sdglgroundconnection.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游带团日志交互接口
 **/
@RequestMapping("/tourLog")
@RestController
public class GuideLogController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideLogController.class);

}