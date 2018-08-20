package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.LinetemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板 控制层
 **/
@RestController
public class LinetemplateController {

    @Autowired
    private LinetemplateService linetemplateService;
}
