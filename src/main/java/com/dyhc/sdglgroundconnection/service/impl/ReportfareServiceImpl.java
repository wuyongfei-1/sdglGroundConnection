package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportfareMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportfare;
import com.dyhc.sdglgroundconnection.pojo.ReportfareExample;
import com.dyhc.sdglgroundconnection.service.ReportfareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费业务实现
 **/
@Service
public class ReportfareServiceImpl implements ReportfareService {

    @Autowired
    private ReportfareMapper reportfareMapper;

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
        if(reportfareList!=null){
            reportfare=reportfareList.get(0);
        }
        return reportfare;
    }
}
