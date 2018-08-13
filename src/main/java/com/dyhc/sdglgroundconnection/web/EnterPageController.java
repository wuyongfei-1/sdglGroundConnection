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

    /**
     * git测试页面
     * @return
     */
    @RequestMapping("/index.html")
    public String enterIndex() {
        return "index";
    }

    /**
     * 分页demo1
     * @return
     */
    @RequestMapping("/PageDemo1.html")
    public String enterPageDemo1() {
        return "PageDemo1";
    }


    /**
     * 分页demo2
     * @return
     */
    @RequestMapping("/PageDemo2.html")
    public String enterPageDemo2() {
        return "PageDemo2";
    }
}
