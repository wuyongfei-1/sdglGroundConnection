package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportticket;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账门票业务接口
 **/
public interface ReportticketService {

    /**
     * 根据报账编号查询报账门票信息
     * @param value1 报账编号
     * @return 返回报账门票信息集合
     */
    List<Reportticket> listReportticketByValueId(Integer value1);
}
