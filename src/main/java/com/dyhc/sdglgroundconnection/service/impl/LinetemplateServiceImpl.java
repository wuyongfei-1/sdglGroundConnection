package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.LinetemplateMapper;
import com.dyhc.sdglgroundconnection.service.LinetemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板 业务实现
 **/
@Service
public class LinetemplateServiceImpl implements LinetemplateService {

    @Autowired
    private LinetemplateMapper linetemplateMapper;

}
