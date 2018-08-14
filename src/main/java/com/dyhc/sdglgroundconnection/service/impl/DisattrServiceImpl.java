package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DisattrMapper;
import com.dyhc.sdglgroundconnection.service.DisattrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点业务实现
 **/
@Service
public class DisattrServiceImpl implements DisattrService {

    @Autowired
    private DisattrMapper disattrMapper;

}
