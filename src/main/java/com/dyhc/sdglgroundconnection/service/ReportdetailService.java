package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.github.pagehelper.PageInfo;

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
    Reportdetail selectReportdetailById(int reportDetailId) throws Exception;

    /**
     * 按调度编号查询（yunguohao）
     * @return
     */
    List<Reportdetail> selectDispatchId(int dispatchId);

    /**
     * 根据调度编号查询报账信息
     * @param dispatchId 调度编号
     * @return 返回报账信息对象
     */
    Reportdetail getReportdetailByDispatchId(Integer dispatchId);

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

    /**
     * 按照团号分页查询所有导游报账明细（dubingkun）
     * @param pageNo
     * @param pageSize
     * @param groupNumber
     * @return
     */
    PageInfo<Reportdetail> listReportdetail(Integer pageNo, Integer pageSize, String groupNumber,Integer states);
}
