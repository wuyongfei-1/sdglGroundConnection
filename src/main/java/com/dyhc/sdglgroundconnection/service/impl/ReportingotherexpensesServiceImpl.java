package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportingotherexpensesMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportingotherexpenses;
import com.dyhc.sdglgroundconnection.pojo.ReportingotherexpensesExample;
import com.dyhc.sdglgroundconnection.service.ReportingotherexpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账其他支出业务实现
 **/
@Service
public class ReportingotherexpensesServiceImpl implements ReportingotherexpensesService {

    @Autowired
    private ReportingotherexpensesMapper reportingotherexpensesMapper;

    /**
     * 根据报账编号查询报账其他支出信息
     * @param value1 报账编号
     * @return 报账其他支出信息对象
     */
    @Override
    public Reportingotherexpenses getReportingotherexpensesByValueId(Integer value1) {
        ReportingotherexpensesExample reportingotherexpensesExample=new ReportingotherexpensesExample();
        ReportingotherexpensesExample.Criteria criteria=reportingotherexpensesExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportingotherexpenses> reportingotherexpensesList=reportingotherexpensesMapper.selectByExample(reportingotherexpensesExample);
        Reportingotherexpenses reportingotherexpenses=null;
        if(reportingotherexpensesList!=null){
            reportingotherexpenses=reportingotherexpensesList.get(0);
        }
        return reportingotherexpenses;
    }
}
