package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportaccommodationMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportaccommodation;
import com.dyhc.sdglgroundconnection.pojo.ReportaccommodationExample;
import com.dyhc.sdglgroundconnection.service.ReportaccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账住宿业务实现
 **/
@Service
public class ReportaccommodationServiceImpl implements ReportaccommodationService {

    @Autowired
    private ReportaccommodationMapper reportaccommodationMapper;

    /**
     * 根据报账编号查询报账住宿信息
     * @param value1 报账编号
     * @return 返回报账住宿集合
     */
    @Override
    public List<Reportaccommodation> listReportaccommodationByValueId(Integer value1) {
        ReportaccommodationExample reportaccommodationExample=new ReportaccommodationExample();
        ReportaccommodationExample.Criteria criteria=reportaccommodationExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportaccommodation> reportaccommodationList=reportaccommodationMapper.selectByExample(reportaccommodationExample);
        return reportaccommodationList;
    }

    /**
     * 新增报账酒店信息
     * @param reportaccommodation 报账酒店对象
     * @return 受影响行数
     */
    @Override
    public Integer insertReportaccommodation(Reportaccommodation reportaccommodation) {
        reportaccommodation.setCreateDate(new Date());
        reportaccommodation.setStatus(0);
        return reportaccommodationMapper.insert(reportaccommodation);
    }
}
