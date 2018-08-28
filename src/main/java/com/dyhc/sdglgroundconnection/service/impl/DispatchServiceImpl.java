package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.DispatchParam;
import com.dyhc.sdglgroundconnection.dto.MissionParam;
import com.dyhc.sdglgroundconnection.dto.TravelPathParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideScheduleMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度业务实现
 **/
@Service
@Transactional
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    private DispatchMapper dispatchMapper;  // 调度持久化

    @Autowired
    private DisguideMapper disguideMapper; //调度导游dao

    @Autowired
    private GuideScheduleMapper guideScheduleMapper; //调度导游dao

    @Autowired
    private GuideMapper guideMapper; //导游dao
    @Autowired
    private DisshoppService disshoppService; // 调度购物业务

    @Autowired
    private TravelService travelService; // 组团社业务

    @Autowired
    private DisrestaurantService disrestaurantService; // 调度餐馆业务

    @Autowired
    private DispatchhotelService dispatchhotelService; // 调度酒店业务

    @Autowired
    private DisotherService disotherService; // 调度其他业务

    @Autowired
    private DisguideService disguideService; // 调度导游业务

    @Autowired
    private DiscarService discarService; // 调度用车业务

    @Autowired
    private DisattrService disattrService; // 调度景点业务

    @Autowired
    private DispatchtourgroupServer dispatchtourgroupServer; // 调度旅游表业务

    @Autowired
    private CompanyService companyService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private DislineService dislineService;

    @Autowired
    private ShoppingService shoppingService;

    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     * @param dispathId 调度编号
     * @return
     */
    @Override
    public TravelPathParam getTravelPathParam(Integer dispathId) throws Exception{
        TravelPathParam travelPathParam=new TravelPathParam();
        travelPathParam.setDispatch(dispatchMapper.selectByPrimaryKey(dispathId));
        travelPathParam.setDiscar(discarService.getDiscarByOffId(dispathId));
        travelPathParam.setCompany(companyService.selectCompanyByIds(1));
        travelPathParam.setDisguide(disguideService.getDisguideByDispatchId(dispathId));
        travelPathParam.setStaff(staffService.getStaffInfoByStaffId(travelPathParam.getDispatch().getCreater()));
        travelPathParam.setDisattrList(disattrService.listDisattrByOffId(dispathId));
        travelPathParam.setDislineList(dislineService.dislineList(dispathId));
        travelPathParam.setDisshoppList(disshoppService.getDisshopp(dispathId));
        travelPathParam.setDisrestaurantList(disrestaurantService.listDisrestaurantByOffId(dispathId));
        travelPathParam.setDispatchhotelList(dispatchhotelService.getDispatchhotelInfoByDispatchId(dispathId));

        List<TravelPathParam> travelPathParams=new ArrayList<>();

        for (int i=0;i<travelPathParam.getDisattrList().size();i++){
            TravelPathParam travelPathParam1=new TravelPathParam();
            travelPathParam1.setSzaddress(travelPathParam.getDisattrList().get(i).getScenicspot().getScenicSpotAddress());
            travelPathParams.add(travelPathParam1);
            System.out.println(travelPathParam1.getSzaddress());
        }

        for (int i=0;i<travelPathParam.getDispatchhotelList().size();i++){

            travelPathParams.get(i).setZhuaddress(travelPathParam.getDispatchhotelList().get(i).getHotel().getHotelName());

            System.out.println(travelPathParams.get(i).getZhuaddress());
        }

        for (int i=0;i<travelPathParam.getDisshoppList().size();i++){

            travelPathParams.get(i).setShoppaddress(travelPathParam.getDisshoppList().get(i).getShopping().getShoppingSite());
            System.out.println(travelPathParams.get(i).getShoppaddress());
        }

        for (int i=0;i<travelPathParam.getDisrestaurantList().size();i++){

            travelPathParams.get(i).setEataddress(travelPathParam.getDisrestaurantList().get(i).getMealType().getRestaurant().getRestaurantAddress());
            System.out.println(travelPathParams.get(i).getEataddress());
        }

        for (int i=0;i<travelPathParam.getDislineList().size();i++){

            travelPathParams.get(i).setXctext(travelPathParam.getDislineList().get(i).getLineContent());
            System.out.println(travelPathParams.get(i).getXctext());
        }

        travelPathParam.setTravelPathParamList(travelPathParams);
        return travelPathParam;
    }

    /**
     * 获取派团单信息根据调度编号 （wangtao）
     * @param dispatchId 调度编号
     * @return 返回派团单参数对象
     * @throws Exception
     */
    @Override
    public MissionParam getMissionParam(Integer dispatchId) throws Exception {
        MissionParam missionParam=new MissionParam();
        //获取午餐集合
        missionParam.setZdisrestaurantList(disrestaurantService.listDisrestaurantByDispatchId(dispatchId,2));
        //获取晚餐集合
        missionParam.setWdisrestaurantList(disrestaurantService.listDisrestaurantByDispatchId(dispatchId,3));
        //获取住宿集合
        missionParam.setDispatchhotelList(dispatchhotelService.getDispatchhotelInfoByDispatchId(dispatchId));
        //获取景点门票集合
        missionParam.setDisattrList(disattrService.listDisattrByOffId(dispatchId));
        //获取调度对象
        missionParam.setDispatch(getDispatchInfoByDispatchInfoId(dispatchId));
        return missionParam;
    }

    /**
     * 根据调度编号查询调度信息 （wangtao）
     * @param dispatchId 调度编号
     * @return 返回调度表信息集合
     */
    @Override
    public Dispatch getDispatchInfoByDispatchInfoId(Integer dispatchId) throws Exception{
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
        dispatch.setDispatchhotel(dispatchhotelService.getDispatchhotelInfoByDispatchId(dispatchId));
        dispatch.setDisguide(disguideService.getDisguideByDispatchId(dispatchId));
        dispatch.setDispatchtourgroup(dispatchtourgroupServer.getDispatchtourgroupByOffId(dispatchId));
        dispatch.setDiscar(discarService.getDiscarByOffId(dispatchId));
        dispatch.setDisattrList(disattrService.listDisattrByOffId(dispatchId));
        dispatch.setCompany(companyService.selectCompanyByIds(1));
        dispatch.setStaff(staffService.getStaffInfoByStaffId(dispatch.getCreater()));
        dispatch.setDisrestaurantList(disrestaurantService.listDisrestaurantByOffId(dispatchId));
        return dispatch;
    }

    /**
     * 保存一条调度信息（wuyongfei）
     * （保存该调度下的购物、餐馆、酒店、导游、用车、景点、调度、其他）
     *
     * @param disParam 调度信息参数对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @Transactional
    @RecordOperation(type = "调度信息", desc = "添加了一条调度信息")
    public Integer saveDispatchInfo(DispatchParam disParam) throws DispatchException {
        // 添加购物信息
        disshoppService.saveDisShopInfo(disParam.getDisshoppList());
        // 添加餐馆信息
        disrestaurantService.saveDisrestaurantInfo(disParam.getDisrestaurantList());
        // 添加酒店信息
        dispatchhotelService.saveDispatchhotelInfo(disParam.getDispatchhotelList());
        // 添加导游信息
        disguideService.saveDisguideInfo(disParam.getDisguide());
        // 添加用车信息
        discarService.saveDiscarInfo(disParam.getDiscar());
        // 添加景点信息
        disattrService.saveDisattrInfoes(disParam.getDisattrList());
        // 添加其他信息
        disotherService.saveDisotherInfo(disParam.getDisother());
        // 添加调度信息
        return dispatchMapper.insert(disParam.getDispatch());
    }
    /**
     * 查询所有未审核且删除状态为1的调度信息 (lixiaojie)
     * 1表示未审核
     * @return
     */
    @Override
    public PageInfo<Dispatch> selectDispatchs(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize, true);
        //查询调度表
        DispatchExample dispatchExample=new DispatchExample();
        DispatchExample.Criteria criteria= dispatchExample.createCriteria();
        criteria.andWhetherdelEqualTo(0);
        criteria.andStatusEqualTo(1);
        List<Dispatch> dispatches=dispatchMapper.selectByExample(dispatchExample);

        //查询调度导游表

        for (Dispatch dispatch: dispatches) {
            DisguideExample disguideExample=new DisguideExample();
            DisguideExample.Criteria disguideExamplecriteria=disguideExample.createCriteria();
            disguideExamplecriteria.andOfferidEqualTo(dispatch.getDispatchId());
            List<Disguide> disguides=disguideMapper.selectByExample(disguideExample);
            dispatch.setGuide(guideMapper.selectByPrimaryKey(disguides.get(0).getGuideId()));
        }
        PageInfo<Dispatch> pageInfo =new PageInfo<Dispatch>(dispatches);
        return pageInfo;
    }
    /** 总控审核通过（lixiaojie)
     * @return
     */
    @Override
    public Integer onCheckDispatchInfo(Integer dispatchId) throws ParseException {
        Integer result=0;

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //修改团状态

            Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
            dispatch.setStatus(2);
/*
            //查询调度导游表   ，根据调度表的id查询
            DisguideExample disguideExample=new DisguideExample();
            DisguideExample.Criteria disguideExamplecriteria=disguideExample.createCriteria();
            disguideExamplecriteria.andOfferidEqualTo(dispatchId);
            List<Disguide> disguides=disguideMapper.selectByExample(disguideExample);
            //从调度表里获取开团时间 和开团结束时间
            Date beginTime=dispatch.getTravelStartTime();
            Date endTime=dispatch.getTravelEndTime();
            String beginDateStr = format.format(beginTime);
            String endDateStr =format.format(endTime);
            beginTime = format.parse(beginDateStr);
            endTime= format.parse(endDateStr);
            Long Number=(endTime.getTime()-beginTime.getTime())/(24*60*60*1000)+1;  //相减  得到 旅游天数

            for (int i=0;i<Number;i++){
                Calendar c = Calendar.getInstance();
                c.setTime(beginTime);
                c.add(Calendar.DAY_OF_MONTH, i);  //然后做出旅游天数每天的时间对象 填入 导游日程表中
                Date tomorrow = c.getTime();

                //判断数据库中有没有这个值
                GuideScheduleExample guideScheduleExample =new GuideScheduleExample();
                GuideScheduleExample.Criteria guideScheduleCriteria=guideScheduleExample.createCriteria();
                guideScheduleCriteria.andSchedulebegintimeEqualTo(tomorrow);
                guideScheduleCriteria.andGuideidEqualTo(disguides.get(0).getGuideId());
                guideScheduleCriteria.andValue1EqualTo(0+"");
                List<GuideSchedule> guideSchedules =guideScheduleMapper.selectByExample(guideScheduleExample);
                //有的话 跳出方法   返回3
                if (guideSchedules.size()>0){

                    throw new NullPointerException();

                }
                //没有的话新增数据
                GuideSchedule guideSchedule=new GuideSchedule();
                guideSchedule.setGuideid(disguides.get(0).getGuideId());
                guideSchedule.setSchedulebegintime(tomorrow);
                guideSchedule.setSchedulestate(3);
                guideSchedule.setValue1(0+"");
                guideSchedule.setValue2(dispatchId+"");
                guideScheduleMapper.insert(guideSchedule);

            }*/
            result =dispatchMapper.updateByPrimaryKey(dispatch);

        return result;
    }
    /** 总控审核未通过（lixiaojie)
     * @return
     */
    @Override
    public Integer noCheckDispatchInfo(Integer dispatchId) {
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
        dispatch.setStatus(3);
        Integer result =dispatchMapper.updateByPrimaryKey(dispatch);
        return result;
    }
}
