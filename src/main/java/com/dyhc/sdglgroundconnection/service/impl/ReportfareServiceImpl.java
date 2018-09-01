package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.ReportfareMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.pojo.Reportfare;
import com.dyhc.sdglgroundconnection.pojo.ReportfareExample;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import com.dyhc.sdglgroundconnection.service.ReportfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费业务实现
 **/
@Service
public class ReportfareServiceImpl implements ReportfareService {

    @Autowired
    private ReportfareMapper reportfareMapper;

    @Autowired
    private ReportdetailService reportdetailService;

    /**
     * 根据报账编号查询报账车票信息
     * @param value1 报账编号
     * @return 报账车票信息对象
     */
    @Override
    public Reportfare getReportfareByValueId(Integer value1) {
        ReportfareExample reportfareExample=new ReportfareExample();
        ReportfareExample.Criteria criteria=reportfareExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportfare> reportfareList=reportfareMapper.selectByExample(reportfareExample);
        Reportfare reportfare=null;
        if(reportfareList!=null && reportfareList.size()>0){
            reportfare=reportfareList.get(0);
        }
        return reportfare;
    }

    /**
     * 新增报账车费信息
     * @param reportfare 报账车费对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "报账车费信息",desc = "新增一条报账车费信息！")
    public Integer insertReportfareInfo(Reportfare reportfare) {
        reportfare.setCreateDate(new Date());
        reportfare.setStatus(0);
        //根据调度表编号查询
        Reportdetail reportdetail=reportdetailService.getReportdetailByDispatchId(Integer.parseInt(reportfare.getValue1()));
        Integer reportDetailId=reportdetail.getReportDetailId();
        reportfare.setValue1(reportDetailId.toString());
        return reportfareMapper.insert(reportfare);
    }
}
