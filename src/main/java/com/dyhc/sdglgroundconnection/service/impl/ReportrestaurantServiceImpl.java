package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportrestaurantMapper;
import com.dyhc.sdglgroundconnection.service.ReportrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账餐厅业务实现
 **/
@Service
public class ReportrestaurantServiceImpl implements ReportrestaurantService {

    @Autowired
    private ReportrestaurantMapper reportrestaurantMapper;
}
