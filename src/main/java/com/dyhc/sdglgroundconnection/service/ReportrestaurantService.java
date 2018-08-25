package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportrestaurant;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账餐厅业务接口
 **/
public interface ReportrestaurantService {

    /**
     * 根据报账编号查询报账餐厅信息
     * @param value1 报账编号
     * @return 返回报账餐厅信息集合
     */
    List<Reportrestaurant> listReportrestaurantByValueId(Integer value1);
}
