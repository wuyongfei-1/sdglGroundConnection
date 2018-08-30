package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ReportrestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.pojo.Reportrestaurant;
import com.dyhc.sdglgroundconnection.pojo.ReportrestaurantExample;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import com.dyhc.sdglgroundconnection.service.ReportrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账餐厅业务实现
 **/
@Service
public class ReportrestaurantServiceImpl implements ReportrestaurantService {

    @Autowired
    private ReportrestaurantMapper reportrestaurantMapper;

    @Autowired
    private ReportdetailService reportdetailService;

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

    /**
     * 新增报账餐馆信息
     * @param reportrestaurant 报账餐馆对象
     * @return 返回受影响行数
     */
    @Override
    public Integer insertReportrestaurant(Reportrestaurant reportrestaurant) {
        reportrestaurant.setCreateDate(new Date());
        reportrestaurant.setStatus(0);
        //根据调度表编号查询
        Reportdetail reportdetail=reportdetailService.getReportdetailByDispatchId(Integer.parseInt(reportrestaurant.getValue1()));
        Integer reportDetailId=reportdetail.getReportDetailId();
        reportrestaurant.setValue1(reportDetailId.toString());
        return reportrestaurantMapper.insert(reportrestaurant);
    }
}
