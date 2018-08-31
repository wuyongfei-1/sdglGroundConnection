package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportingotherexpenses;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账其他支出业务接口
 **/
public interface ReportingotherexpensesService {

    /**
     * 根据报账编号查询报账其他支出信息
     * @param value1 报账编号
     * @return 报账其他支出信息对象
     */
    Reportingotherexpenses getReportingotherexpensesByValueId(Integer value1);

    /**
     * 添加报账其他支出信息
     * @param reportingotherexpenses 报账其他支出对象
     * @return 返回受影响行数
     */
    Integer insertReportingotherexpensesInfo(Reportingotherexpenses reportingotherexpenses);
}
