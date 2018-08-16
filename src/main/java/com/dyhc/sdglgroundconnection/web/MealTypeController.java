package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.MealTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型 控制层
 **/
@RestController
@RequestMapping("/mealType")
public class MealTypeController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(MealTypeController.class);

    @Autowired
    private MealTypeService mealTypeService;
}
