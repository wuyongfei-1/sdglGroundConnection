package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportingotherexpensesMapper;
import com.dyhc.sdglgroundconnection.service.ReportingotherexpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账其他支出业务实现
 **/
@Service
public class ReportingotherexpensesServiceImpl implements ReportingotherexpensesService {

    @Autowired
    private ReportingotherexpensesMapper reportingotherexpensesMapper;
}
