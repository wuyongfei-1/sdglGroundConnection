package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportticketMapper;
import com.dyhc.sdglgroundconnection.service.ReportticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账门票业务实现
 **/
@Service
public class ReportticketServiceImpl implements ReportticketService {

    @Autowired
    private ReportticketMapper reportticketMapper;
}
