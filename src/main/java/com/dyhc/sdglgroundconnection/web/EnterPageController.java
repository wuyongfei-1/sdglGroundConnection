package com.dyhc.sdglgroundconnection.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 进入页面-控制器
 **/
@Controller
public class EnterPageController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(EnterPageController.class);

    @RequestMapping("/index.html")
    public String enterIndex() {
        return "index";
    }
}
