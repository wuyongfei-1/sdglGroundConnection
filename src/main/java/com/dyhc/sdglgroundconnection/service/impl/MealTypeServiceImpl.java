package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.MealTypeMapper;
import com.dyhc.sdglgroundconnection.service.MealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型业务实现
 **/
@Service
public class MealTypeServiceImpl implements MealTypeService {

    @Autowired
    private MealTypeMapper mealTypeMapper;
}
