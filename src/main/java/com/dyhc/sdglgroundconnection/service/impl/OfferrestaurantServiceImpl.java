package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferrestaurantMapper;
import com.dyhc.sdglgroundconnection.service.OfferrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价餐厅业务实现
 **/
@Service
public class OfferrestaurantServiceImpl implements OfferrestaurantService {

    @Autowired
    private OfferrestaurantMapper offerrestaurantMapper;
}
