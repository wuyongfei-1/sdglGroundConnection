package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportaccommodationMapper;
import com.dyhc.sdglgroundconnection.service.ReportaccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账住宿业务实现
 **/
@Service
public class ReportaccommodationServiceImpl implements ReportaccommodationService {

    @Autowired
    private ReportaccommodationMapper reportaccommodationMapper;

}
