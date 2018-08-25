package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportrestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportrestaurant;
import com.dyhc.sdglgroundconnection.pojo.ReportrestaurantExample;
import com.dyhc.sdglgroundconnection.service.ReportrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账餐厅业务实现
 **/
@Service
public class ReportrestaurantServiceImpl implements ReportrestaurantService {

    @Autowired
    private ReportrestaurantMapper reportrestaurantMapper;

    /**
     * 根据报账编号查询报账餐厅信息
     * @param value1 报账编号
     * @return 返回报账餐厅信息集合
     */
    @Override
    public List<Reportrestaurant> listReportrestaurantByValueId(Integer value1) {
        ReportrestaurantExample reportrestaurantExample=new ReportrestaurantExample();
        ReportrestaurantExample.Criteria criteria=reportrestaurantExample.createCriteria();
        criteria.andValue1EqualTo(value1.toString());
        List<Reportrestaurant> reportrestaurantList=reportrestaurantMapper.selectByExample(reportrestaurantExample);
        return reportrestaurantList;
    }
}
