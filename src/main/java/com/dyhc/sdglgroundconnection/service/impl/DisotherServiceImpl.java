package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DisotherMapper;
import com.dyhc.sdglgroundconnection.service.DisotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Service
public class DisotherServiceImpl implements DisotherService {

    @Autowired
    private DisotherMapper disotherMapper;
}
