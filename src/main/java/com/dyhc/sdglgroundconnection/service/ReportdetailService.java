package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账明细业务接口
 **/
public interface ReportdetailService {
    /**
     * 按导游报账明细表编号查询（yunguohao）
     * @param reportDetailId
     * @return
     */
    Reportdetail selectReportdetailById(int reportDetailId);

    /**
     * 按调度编号查询（yunguohao）
     * @return
     */
    List<Reportdetail> selectDispatchId(int dispatchId);

    /**
     * 按日期区间查询（yunguohao）
     * @param reportDate1
     * @return
     */
    List<Reportdetail> selectreportDate(String reportDate1,String reportDate2);

    /**
     * 添加导游明细
     * @param reportdetail
     * @return
     */
    int insertReportdetail(Reportdetail reportdetail);
}
