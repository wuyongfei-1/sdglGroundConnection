package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportqutsubsidyMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportqutsubsidy;
import com.dyhc.sdglgroundconnection.pojo.ReportqutsubsidyExample;
import com.dyhc.sdglgroundconnection.service.ReportqutsubsidyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账出团补助业务实现
 **/
@Service
public class ReportqutsubsidyServiceImpl implements ReportqutsubsidyService {

    @Autowired
    private ReportqutsubsidyMapper reportqutsubsidyMapper;

    /**
     * 根据报账编号查询报账出团补助信息
     * @param value1 报账编号
     * @return 报账出团补助信息对象
     */
    @Override
    public Reportqutsubsidy getReportqutsubsidyByValueId(Integer value1) {
        ReportqutsubsidyExample reportqutsubsidyExample=new ReportqutsubsidyExample();
        ReportqutsubsidyExample.Criteria criteria=reportqutsubsidyExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportqutsubsidy> reportqutsubsidyList=reportqutsubsidyMapper.selectByExample(reportqutsubsidyExample);
        Reportqutsubsidy reportqutsubsidy=null;
        if(reportqutsubsidyList!=null){
            reportqutsubsidy=reportqutsubsidyList.get(0);
        }
        return reportqutsubsidy;
    }
}
