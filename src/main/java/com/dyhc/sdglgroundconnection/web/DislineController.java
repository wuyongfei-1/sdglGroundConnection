package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.DislineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路信息  控制层
 **/
@RestController
@RequestMapping("/disline")
public class DislineController {

    @Autowired
    private DislineService dislineService;
}
