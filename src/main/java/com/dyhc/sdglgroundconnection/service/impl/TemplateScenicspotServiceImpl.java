package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.TemplateScenicspotMapper;
import com.dyhc.sdglgroundconnection.service.TemplateScenicspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板景点业务实现
 **/
@Service
public class TemplateScenicspotServiceImpl implements TemplateScenicspotService {

    @Autowired
    private TemplateScenicspotMapper templateScenicspotMapper;
}
