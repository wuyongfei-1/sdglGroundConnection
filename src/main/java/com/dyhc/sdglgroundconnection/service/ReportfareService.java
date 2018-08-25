package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportfare;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费业务接口
 **/
public interface ReportfareService {

    /**
     * 根据报账编号查询报账车票信息
     * @param value1 报账编号
     * @return 报账车票信息对象
     */
    Reportfare getReportfareByValueId(Integer value1);
}
