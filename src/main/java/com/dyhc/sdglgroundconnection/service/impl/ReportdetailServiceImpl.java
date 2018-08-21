package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportdetailMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.pojo.ReportdetailExample;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账明细业务实现
 **/
@Service
public class ReportdetailServiceImpl implements ReportdetailService {

    @Autowired
    private ReportdetailMapper reportdetailMapper;

    /**
     * 按导游报账明细表编号查询（yunguohao）
     * @param reportDetailId
     * @return
     */
    @Override
    public Reportdetail selectReportdetailById(int reportDetailId) {
        return reportdetailMapper.selectByPrimaryKey(reportDetailId);
    }

    /**
     * 按调度编号查询（yunguohao）
     * @return dispatchId
     */
    @Override
    public List<Reportdetail> selectDispatchId(int dispatchId) {
        return reportdetailMapper.selectDispatchId(dispatchId);
    }



    /**
     * 按报账日期区间查询（yunguohao）
     * @param reportDate1
     * @return
     */
    @Override
    public List<Reportdetail> selectreportDate(String reportDate1,String reportDate2) {
        System.out.println(reportDate1);
        System.out.println(reportDate2);
        List<Reportdetail> list = reportdetailMapper.selectreportDate(reportDate1,reportDate2);
        System.out.println(list);
        return list;
    }


    /**
     * 添加报账明细（yunguohao）
     * @param reportdetail
     * @return
     */
    @Override
    public int insertReportdetail(Reportdetail reportdetail) {
        return reportdetailMapper.insert(reportdetail);
    }
}
