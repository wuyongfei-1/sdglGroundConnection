package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.dto.NewFileParam;
import com.dyhc.sdglgroundconnection.mapper.*;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private AccountTypeMapper accountTypeMapper;
    @Autowired
    private TravelMapper travelMapper;

    @Autowired
    private StaffMapper staffMapper;

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
    @Autowired
    private DisguideService disguideService;
    @Autowired
    private GuideService guideService;
    @Autowired
    private DislineMapper dislineMapper;
    @Autowired
    private CompanyMapper companyMapper;





    /**
     * 根据报账详情id修改报账状态 打回(lixiaojie)
     * @param reportDetailId
     * @return
     */
    @Override
    public Integer updateReportDetailStatusCallBack(Integer reportDetailId,Integer updateinfoid,Date updateData) {

        Reportdetail oldReportdetail = reportdetailMapper.selectByPrimaryKey(reportDetailId);
        oldReportdetail.setStatus(3);
        Integer result= reportdetailMapper.updateByPrimaryKey(oldReportdetail);

        return result;
    }

    @Override
    public Integer insertChangBook(Dispatch dispatch) {
        Dispatch oldDispatch=dispatchMapper.selectByPrimaryKey(dispatch.getDispatchId());
        String biangenshu=oldDispatch.getSendLine();
        if (!"".equals(biangenshu)&&""!=biangenshu){
            oldDispatch.setSendLine(oldDispatch.getSendLine()+","+dispatch.getSendLine());
        }else {
            oldDispatch.setSendLine(dispatch.getSendLine());
        }
        oldDispatch.setModifiedData(dispatch.getModifiedData());
        oldDispatch.setModifier(dispatch.getModifier());

        return dispatchMapper.updateByPrimaryKey(oldDispatch);
    }

    /**
     * 根据调度id获取  团  结算账单(lixiaojie)
     * @param reportDetailId
     * @return
     */
    @Override
    public NewFileParam getReportdetailById(Integer reportDetailId) {
        Reportdetail reportdetail=reportdetailMapper.selectByPrimaryKey(reportDetailId);
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(reportdetail.getDispatchId());
        Staff staff=staffMapper.selectByPrimaryKey(dispatch.getCreater());
        Company company=companyMapper.selectByPrimaryKey(1);
        AccountType companyAccount=accountTypeMapper.selectByPrimaryKey(1);
        AccountType personalAccount=accountTypeMapper.selectByPrimaryKey(2);

        Travel travel=travelMapper.selectByPrimaryKey(1);
        NewFileParam newFileParam=new NewFileParam();
        newFileParam.setStaff(staff);
        newFileParam.setCompany(company);
        newFileParam.setCompanyAccount(companyAccount);
        newFileParam.setPersonalAccount(personalAccount);
        newFileParam.setTravel(travel);
        newFileParam.setDispatch(dispatch);
        newFileParam.setReportdetail(reportdetail);
        return newFileParam;
    }

    /**
     * 根据报账详情id修改报账状态 通过(lixiaojie)
     * @param reportDetailId
     * @return
     */
    @Override
    public Integer updateReportDetailStatus(Integer reportDetailId, Integer updateinfoid, Date updateData) {

        Reportdetail oldReportdetail = reportdetailMapper.selectByPrimaryKey(reportDetailId);
        oldReportdetail.setStatus(2);
        Integer result= reportdetailMapper.updateByPrimaryKey(oldReportdetail);

        return result;
    }

    /**
     * 按导游报账明细表编号查询（yunguohao）
     * @param reportDetailId
     * @return
     */
    @Override
    public Reportdetail selectReportdetailById(int reportDetailId) {
        Reportdetail reportdetail=null;
        if(ConditionValidation.validation(reportDetailId)==true){
            reportdetail=reportdetailMapper.selectByPrimaryKey(reportDetailId);
            if(reportdetail!=null){
                //给调度表对象赋值
                reportdetail.setDispatch(dispatchMapper.selectByPrimaryKey(reportdetail.getDispatchId()));
                //给线路对象赋值
                DislineExample dislineExample=new DislineExample();
                DislineExample.Criteria dislineExampleCriteria=dislineExample.createCriteria();
                dislineExampleCriteria.andOfferidEqualTo(dispatchMapper.selectByPrimaryKey(reportdetail.getDispatchId()).getDispatchId());
                reportdetail.setDisline(dislineMapper.selectByExample(dislineExample).get(0));
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
            }
        }
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
     * 根据调度编号查询报账信息
     * @param dispatchId 调度编号
     * @return 返回报账信息对象
     */
    @Override
    public Reportdetail getReportdetailByDispatchId(Integer dispatchId) {
        ReportdetailExample reportdetailExample=new ReportdetailExample();
        ReportdetailExample.Criteria criteria=reportdetailExample.createCriteria();
        criteria.andDispatchidEqualTo(dispatchId);
        List<Reportdetail> reportdetailList=reportdetailMapper.selectByExample(reportdetailExample);
        Reportdetail reportdetail=new Reportdetail();
        if(reportdetailList!=null&&reportdetailList.size()>0){
            reportdetail=reportdetailList.get(0);
        }
        return reportdetail;
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

    @Override
    public PageInfo<Reportdetail> listReportdetail(Integer pageNo, Integer pageSize, String groupNumber,Integer states)throws Exception {
        PageHelper.startPage(pageNo, pageSize, true);
        ReportdetailExample reportdetailExample=new ReportdetailExample();
        ReportdetailExample.Criteria criteria=reportdetailExample.createCriteria();
        if(states!=null&&states!=0){
            criteria.andStatusEqualTo(states);
        }
        List<Reportdetail> reportdetailList=reportdetailMapper.selectByExample(reportdetailExample);//获取所有报账明细
        if(reportdetailList!=null&&reportdetailList.size()!=0){
        for (Reportdetail item :
                reportdetailList) {
            //根据报账编号获取调度信息
            Dispatch dispatch=dispatchMapper.selectByPrimaryKey(item.getDispatchId());
            if(dispatch!=null)
            item.setGroupNumber(dispatch.getGroupNumber());//查询团号
            //查询导游
            Disguide disguide=disguideService.getDisguideByDispatchId(item.getDispatchId());//根据调度编号获取到由信息
            if(disguide!=null) {
                Guide guide = guideService.selectGuideByIds(disguide.getGuideId());
                item.setUsername(guide.getUsername());//查询导游名称
            }
        }
        //根据团号进行筛选
        if(groupNumber!=null&&groupNumber!=""){
            List<Reportdetail> reportdetails=new ArrayList<Reportdetail>();
            for (int i=0;i<reportdetailList.size();i++){
                String name=reportdetailList.get(i).getGroupNumber();
                if(name.equals(groupNumber)){
                    reportdetails.add(reportdetailList.get(i));
                }
            }
            reportdetailList=reportdetails;
        }
        }
        PageInfo<Reportdetail> pageInfo = new PageInfo<Reportdetail>(reportdetailList);
        return pageInfo;
    }
}
