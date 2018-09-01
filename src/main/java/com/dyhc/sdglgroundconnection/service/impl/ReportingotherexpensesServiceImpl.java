package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.ReportingotherexpensesMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.pojo.Reportingotherexpenses;
import com.dyhc.sdglgroundconnection.pojo.ReportingotherexpensesExample;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import com.dyhc.sdglgroundconnection.service.ReportingotherexpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账其他支出业务实现
 **/
@Service
public class ReportingotherexpensesServiceImpl implements ReportingotherexpensesService {

    @Autowired
    private ReportingotherexpensesMapper reportingotherexpensesMapper;

    @Autowired
    private ReportdetailService reportdetailService;

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
        if(reportingotherexpensesList!=null && reportingotherexpensesList.size()>0){
            reportingotherexpenses=reportingotherexpensesList.get(0);
        }
        return reportingotherexpenses;
    }

    /**
     * 添加报账其他支出信息
     * @param reportingotherexpenses 报账其他支出对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "报账其他支出信息",desc = "新增一条报账其他支出信息！")
    public Integer insertReportingotherexpensesInfo(Reportingotherexpenses reportingotherexpenses) {
        reportingotherexpenses.setCreateDate(new Date());
        reportingotherexpenses.setStatus(0);
        //根据调度表编号查询
        Reportdetail reportdetail=reportdetailService.getReportdetailByDispatchId(Integer.parseInt(reportingotherexpenses.getValue1()));
        Integer reportDetailId=reportdetail.getReportDetailId();
        reportingotherexpenses.setValue1(reportDetailId.toString());
        return reportingotherexpensesMapper.insert(reportingotherexpenses);
    }
}
