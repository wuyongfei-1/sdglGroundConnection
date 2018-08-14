package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferotherMapper;
import com.dyhc.sdglgroundconnection.service.OfferotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价其他业务实现
 **/
@Service
public class OfferotherServiceImpl implements OfferotherService {

    @Autowired
    private OfferotherMapper offerotherMapper;
}
