package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DisrestaurantMapper;
import com.dyhc.sdglgroundconnection.service.DisrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度餐厅业务实现
 **/
@Service
public class DisrestaurantServiceImpl implements DisrestaurantService {

    @Autowired
    private DisrestaurantMapper disrestaurantMapper;
}
