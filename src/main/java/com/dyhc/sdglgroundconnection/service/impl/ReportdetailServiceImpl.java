package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.mapper.ReportdetailMapper;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账明细业务实现
 **/
@Service
public class ReportdetailServiceImpl implements ReportdetailService {

    @Autowired
    private ReportdetailMapper reportdetailMapper;

    @Autowired
    private DispatchMapper dispatchMapper;

    @Autowired
    private ReportaccommodationService reportaccommodationService;

    @Autowired
    private ReportrestaurantService reportrestaurantService;

    @Autowired
    private ReportticketService reportticketService;

    @Autowired
    private ReportfareService reportfareService;

    @Autowired
    private  ReportingotherexpensesService reportingotherexpensesService;

    @Autowired
    private ReportqutsubsidyService reportqutsubsidyService;

    /**
     * 按导游报账明细表编号查询（yunguohao）
     * @param reportDetailId
     * @return
     */
    @Override
    public Reportdetail selectReportdetailById(int reportDetailId) {
        Reportdetail reportdetail=reportdetailMapper.selectByPrimaryKey(reportDetailId);
        //给调度表对象赋值
        reportdetail.setDispatch(dispatchMapper.selectByPrimaryKey(reportdetail.getDispatchId()));
        //给导游报账住宿集合赋值
        reportdetail.setReportaccommodationList(reportaccommodationService.listReportaccommodationByValueId(reportDetailId));
        //给导游报账餐厅集合赋值
        reportdetail.setReportrestaurantList(reportrestaurantService.listReportrestaurantByValueId(reportDetailId));
        //给导游报账门票集合赋值
        reportdetail.setReportticketList(reportticketService.listReportticketByValueId(reportDetailId));
        //给导游报账车费对象赋值
        reportdetail.setReportfare(reportfareService.getReportfareByValueId(reportDetailId));
        //给导游报账其他支出对象赋值
        reportdetail.setReportingotherexpenses(reportingotherexpensesService.getReportingotherexpensesByValueId(reportDetailId));
        //给导游报账出团补助对象赋值
        reportdetail.setReportqutsubsidy(reportqutsubsidyService.getReportqutsubsidyByValueId(reportDetailId));
        return reportdetail;
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
