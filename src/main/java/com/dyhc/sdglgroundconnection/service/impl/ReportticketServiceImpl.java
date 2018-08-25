package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportticketMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportticket;
import com.dyhc.sdglgroundconnection.pojo.ReportticketExample;
import com.dyhc.sdglgroundconnection.service.ReportticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账门票业务实现
 **/
@Service
public class ReportticketServiceImpl implements ReportticketService {

    @Autowired
    private ReportticketMapper reportticketMapper;

    /**
     * 根据报账编号查询报账门票信息
     * @param value1 报账编号
     * @return 返回报账门票信息集合
     */
    @Override
    public List<Reportticket> listReportticketByValueId(Integer value1) {
        ReportticketExample reportticketExample=new ReportticketExample();
        ReportticketExample.Criteria criteria=reportticketExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportticket> reportticketList=reportticketMapper.selectByExample(reportticketExample);
        return reportticketList;
    }
}
