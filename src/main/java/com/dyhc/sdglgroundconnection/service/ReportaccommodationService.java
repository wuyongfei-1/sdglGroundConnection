package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportaccommodation;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账住宿业务接口
 **/
public interface ReportaccommodationService {


    /**
     * 根据报账编号查询报账住宿信息
     * @param value1 报账编号
     * @return 返回报账住宿集合
     */
    List<Reportaccommodation> listReportaccommodationByValueId(Integer value1);

    /**
     * 新增报账酒店信息
     * @param reportaccommodation 报账酒店对象
     * @return 受影响行数
     */
    Integer insertReportaccommodation(Reportaccommodation reportaccommodation)throws Exception;
}
