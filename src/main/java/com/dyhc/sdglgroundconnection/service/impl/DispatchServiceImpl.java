package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.*;
import com.dyhc.sdglgroundconnection.dto.DispatchParam;
import com.dyhc.sdglgroundconnection.dto.GuideRouteParam;
import com.dyhc.sdglgroundconnection.dto.MissionParam;
import com.dyhc.sdglgroundconnection.dto.TravelPathParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.mapper.*;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    private DislineMapper dislineMapper;  // 调度线路
    @Autowired
    private ShoppingMapper shoppingMapper;  // 商品dao
    @Autowired
    private DisshoppMapper disshoppMapper;  // 调度持久化
    @Autowired
    private DispatchhotelMapper dispatchhotelMapper;  // 调度酒店持久化
    @Autowired
    private DiscarMapper discarMapper;  // 调度持久化
    @Autowired
    private DisguideMapper disguideMapper; //调度导游dao
    @Autowired
    private StaffMapper staffMapper; //用户dao
    @Autowired
    private HotelMapper hotelMapper; //酒店dao
    @Autowired
    private MealTypeMapper mealTypeMapper; //餐馆类型dao
    @Autowired
    private DisattrMapper disattrMapper; //调度旅游dao

    @Autowired
    private ScenicspotMapper scenicspotMapper; //景点dao
    @Autowired
    private RestaurantMapper restaurantMapper; //餐馆dao
    @Autowired
    private DisrestaurantMapper disrestaurantMapper; //调度餐厅dao
    @Autowired
    private GuideMapper guideMapper; //导游dao
    @Autowired
    private DisshoppService disshoppService; // 调度购物业务

    @Autowired
    private TravelService travelService; // 组团社业务

    @Autowired
    private DislineService dislineService; // 调度线路业务

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
    private DispatchtourgroupServer dispatchtourgroupServer; // 调度旅行社业务

    @Autowired
    private DisattrService disattrService; // 调度景点业务

    @Autowired
    private CompanyService companyService;

    @Autowired
    private StaffService staffService;

    /**
     * 根据调度id获取调度信息(lixiaojie)
     * @param dispatchId
     * @return
     */
    @Override
    public Dispatch getDispatchByDispatchId(Integer dispatchId)throws Exception {
        return dispatchMapper.selectByPrimaryKey(dispatchId);
    }

    /**
     * 根据调度id查询所有的景点信息(lixiaojie)
     * @param dispatchId
     * @return
     */
    @Override
    public List<WechatTicketbudgetParam> selectDispatchByScenicspotInfo(Integer dispatchId) throws Exception{
        DisattrExample disattrExample=new DisattrExample();
        DisattrExample.Criteria disattrExampleCriteria=disattrExample.createCriteria();
        disattrExample.setOrderByClause("weight");
        List<Disattr> disattrs= disattrMapper.selectByExample(disattrExample);
        disattrExampleCriteria.andOfferidEqualTo(dispatchId);
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
        List<WechatTicketbudgetParam> wechatTicketbudgetParams=new ArrayList<>();
        for (Disattr disattr:disattrs) {
            WechatTicketbudgetParam wechatTicketbudgetParam=new WechatTicketbudgetParam();
            wechatTicketbudgetParam.setDispatch(dispatch);
            wechatTicketbudgetParam.setDisattr(disattr);
            Scenicspot scenicspot=scenicspotMapper.selectByPrimaryKey(disattr.getScenicSpotId());
            wechatTicketbudgetParam.setScenicspot(scenicspot);
            wechatTicketbudgetParams.add(wechatTicketbudgetParam);
        }
        return wechatTicketbudgetParams;
    }

    /**
     * 根据调度表id 和权重获取每天的吃饭信息和住宿信息(lixiaojie)
     *
     * @param dispatchId
     * @param weight
     * @return
     */
    @Override
    public WechatEatAndHotelParam selectDispatchInfoByWeightDispatchId(Integer dispatchId, Integer weight)throws Exception {
        WechatEatAndHotelParam wechatEatAndHotelParam = new WechatEatAndHotelParam();
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
        DisrestaurantExample noonDisrestaurantExample = new DisrestaurantExample();
        DisrestaurantExample.Criteria noonDisrestaurantExampleCriteria = noonDisrestaurantExample.createCriteria();
        noonDisrestaurantExampleCriteria.andOfferidEqualTo(dispatchId);
        noonDisrestaurantExampleCriteria.andWeightEqualTo(weight);
        noonDisrestaurantExampleCriteria.andDindateEqualTo(2);
        List<Disrestaurant> noonDisrestaurant = disrestaurantMapper.selectByExample(noonDisrestaurantExample);
/*        disrestaurantExampleCriteria.andDindateEqualTo(3);
        List<Disrestaurant> nightDisrestaurant = disrestaurantMapper.selectByExample(noonDisrestaurantExample);*/
        DisrestaurantExample nightDisrestaurantExample = new DisrestaurantExample();
        DisrestaurantExample.Criteria nightDisrestaurantExampleCriteria = nightDisrestaurantExample.createCriteria();
        nightDisrestaurantExampleCriteria.andOfferidEqualTo(dispatchId);
        nightDisrestaurantExampleCriteria.andWeightEqualTo(weight);
        nightDisrestaurantExampleCriteria.andDindateEqualTo(3);
        List<Disrestaurant> nightDisrestaurant = disrestaurantMapper.selectByExample(nightDisrestaurantExample);
        DispatchhotelExample dispatchhotelExample=new DispatchhotelExample();
        DispatchhotelExample.Criteria dispatchhotelExampleCriteria=dispatchhotelExample.createCriteria();
        dispatchhotelExampleCriteria.andOfferidEqualTo(dispatchId);
        dispatchhotelExampleCriteria.andWeightEqualTo(weight);
        List<Dispatchhotel> dispatchhotels=dispatchhotelMapper.selectByExample(dispatchhotelExample);
         Dispatchhotel dispatchhotel=dispatchhotels.get(0);  //调度酒店对象
         Disrestaurant noonDisrestaurantinfo=noonDisrestaurant.get(0);  //中午调度调度餐厅对象
         Disrestaurant nightDisrestaurantinfo=nightDisrestaurant.get(0);
        dispatchhotel.setHotel(hotelMapper.selectByPrimaryKey(dispatchhotel.getHotelId()));
        MealType zhongmealType=mealTypeMapper.selectByPrimaryKey(noonDisrestaurantinfo.getTypeId());
        noonDisrestaurantinfo.setRestaurant(restaurantMapper.selectByPrimaryKey(zhongmealType.getRestaurantId()));
        MealType wanmealType=mealTypeMapper.selectByPrimaryKey(nightDisrestaurantinfo.getTypeId());
        nightDisrestaurantinfo.setRestaurant(restaurantMapper.selectByPrimaryKey(wanmealType.getRestaurantId()));
        wechatEatAndHotelParam.setDispatchhotel(dispatchhotel);
        wechatEatAndHotelParam.setNoonDisrestaurant(noonDisrestaurantinfo);
        wechatEatAndHotelParam.setNightDisrestaurant(nightDisrestaurantinfo);
        wechatEatAndHotelParam.setDispatch(dispatch);
        return wechatEatAndHotelParam;
    }

    /**
     * 根据调度id获取该团的所有天数(lixiaojie)
     *
     * @return
     */
    @Override
    public List<String> selectDispatchDaysByDispatchId(Integer dispatchId) throws Exception {
        List<String> Days = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Dispatch dispatch = dispatchMapper.selectByPrimaryKey(dispatchId);//根据调度id获取调度对象
        Date beginTime = dispatch.getTravelStartTime();//从调度对象中获取开始时间和结束时间
        Date endTime = dispatch.getTravelEndTime();
        String beginDateStr = dateFormat.format(beginTime);
        String endDateStr = dateFormat.format(endTime);
        beginTime = dateFormat.parse(beginDateStr);
        endTime = dateFormat.parse(endDateStr);
        Long Number = (endTime.getTime() - beginTime.getTime()) / (24 * 60 * 60 * 1000) + 1;//计算旅游天数

        for (int i = 0; i < Number; i++) {
            Calendar c = Calendar.getInstance();
            c.setTime(beginTime);
            c.add(Calendar.DAY_OF_MONTH, i);  //然后做出旅游天数每天的时间对象 填入 导游日程表中
            Date tomorrow = c.getTime();
            String dayString = dateFormat.format(tomorrow);
            Days.add(dayString);
        }


        return Days;
    }

    /**
     * 根据导游id查询调度表(lixiaojie)
     *
     * @param guideId
     * @return 微信基本信息参数类
     */
    @Override
    public WechatInformationParam selectDispatchInfoByGuideId(Integer guideId)throws Exception {
        //创建微信基本信息参数对象
        WechatInformationParam wechatInformationParam = null;
        DisguideExample disguideExample = new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria = disguideExample.createCriteria();
        disguideExampleCriteria.andGuideidEqualTo(guideId);
        List<Disguide> disguideList = disguideMapper.selectByExample(disguideExample);  //查询调度导游表是否有该导游的带团信息， 没有的话  返回null
        if (disguideList.size() == 0) {
            return wechatInformationParam;
        }
        //有的话，查询调度表  有没有 调度表里的调度  id   并且 状态为 2 的 信息
        Dispatch dispatch = null;
        for (Disguide disguide : disguideList) {
            DispatchExample dispatchExample = new DispatchExample();
            DispatchExample.Criteria dispatchExampleCriteria = dispatchExample.createCriteria();
            dispatchExampleCriteria.andDispatchidEqualTo(disguide.getOfferId());
            dispatchExampleCriteria.andStateEqualTo(2);
            List<Dispatch> dispatchList = dispatchMapper.selectByExample(dispatchExample);
            if (dispatchList.size() > 0) {
                dispatch = dispatchList.get(0);
            }
        }
        //要是没查到信息  返回null  不执行后续操作
        if (dispatch == null) {
            return wechatInformationParam;
        }
        wechatInformationParam = new WechatInformationParam();
        wechatInformationParam.setDispatch(dispatch);
        wechatInformationParam.setGuide(guideMapper.selectByPrimaryKey(guideId));//给微信基本信息参数对象赋导游对象
        wechatInformationParam.setStaff(staffMapper.selectByPrimaryKey(dispatch.getCreater()));//给staff 对象赋值
        DiscarExample discarExample = new DiscarExample();
        DiscarExample.Criteria discarExampleCriteria = discarExample.createCriteria();
        discarExampleCriteria.andOfferidEqualTo(dispatch.getDispatchId());
        List<Discar> discarList = discarMapper.selectByExample(discarExample);
        wechatInformationParam.setDiscar(discarList != null ? discarList.get(0) : null);//给Discar对象赋值
        return wechatInformationParam;
    }

    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     *
     * @param dispathId 调度编号
     * @return
     */
    @Override
    public List<TravelPathParam>  getTravelPathParam(Integer dispathId) throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Dispatch dispatch = dispatchMapper.selectByPrimaryKey(dispathId);//根据调度id获取调度对象
        Date beginTime = dispatch.getTravelStartTime();//从调度对象中获取开始时间和结束时间
        Date endTime = dispatch.getTravelEndTime();
        String beginDateStr = dateFormat.format(beginTime);
        String endDateStr = dateFormat.format(endTime);
        beginTime = dateFormat.parse(beginDateStr);
        endTime = dateFormat.parse(endDateStr);
        Long Number = (endTime.getTime() - beginTime.getTime()) / (24 * 60 * 60 * 1000) + 1;//计算旅游天数


        DisattrExample disattrExample=new DisattrExample();
        DisattrExample.Criteria disattrExampleCriteria=disattrExample.createCriteria();//景点
        disattrExampleCriteria.andOfferidEqualTo(dispathId);
        disattrExample.setOrderByClause("weight");
        List<Disattr> disattrs=disattrMapper.selectByExample(disattrExample);

        DislineExample dislineExample=new DislineExample();
        DislineExample.Criteria dislineExampleCriteria=dislineExample.createCriteria();//线路
        dislineExampleCriteria.andOfferidEqualTo(dispathId);
        dislineExample.setOrderByClause("weight");
        List<Disline> dislines=dislineMapper.selectByExample(dislineExample);

        DisrestaurantExample disrestaurantExample =new DisrestaurantExample();
        DisrestaurantExample.Criteria disrestaurantExampleCriteria=disrestaurantExample.createCriteria();//餐馆
        disrestaurantExampleCriteria.andOfferidEqualTo(dispathId);
        disrestaurantExampleCriteria.andDindateEqualTo(2);
        disrestaurantExample.setOrderByClause("weight");
        List<Disrestaurant> disrestaurants=disrestaurantMapper.selectByExample(disrestaurantExample);

        DispatchhotelExample dispatchhotelExample =new DispatchhotelExample();
        DispatchhotelExample.Criteria dispatchhotelExampleCriteria=dispatchhotelExample.createCriteria();//酒店
        dispatchhotelExampleCriteria.andOfferidEqualTo(dispathId);
        dispatchhotelExample.setOrderByClause("weight");
        List<Dispatchhotel> dispatchhotels=dispatchhotelMapper.selectByExample(dispatchhotelExample);

        DisshoppExample disshoppExample =new DisshoppExample();
        DisshoppExample.Criteria disshoppExampleCriteria=disshoppExample.createCriteria();
        disshoppExampleCriteria.andOfferidEqualTo(dispathId);
        disshoppExample.setOrderByClause("weight");
        List<Disshopp> disshopps =disshoppMapper.selectByExample(disshoppExample);
        List<TravelPathParam> travelPathParams = new ArrayList<>();
        for (int i = 0; i < Number; i++) {
            TravelPathParam travelPathParam=new TravelPathParam();
            Calendar c = Calendar.getInstance();
            c.setTime(beginTime);
            c.add(Calendar.DAY_OF_MONTH, i);  //然后做出旅游天数每天的时间对象 填入 参数类对象
            Date tomorrow = c.getTime();
            String dayString = dateFormat.format(tomorrow);
            travelPathParam.setXcdata(dayString);
            travelPathParam.setSzaddress(scenicspotMapper.selectByPrimaryKey(disattrs.get(i).getScenicSpotId()).getScenicSpotAddress());
            travelPathParam.setXctext(dislines.get(i).getLineContent());
            travelPathParam.setShoppaddress(shoppingMapper.selectByPrimaryKey(disshopps.get(i).getShoppingId()).getShoppingSite());
            travelPathParam.setEataddress(restaurantMapper.selectByPrimaryKey(disrestaurants.get(i).getTypeId()).getRestaurantAddress());
            travelPathParam.setZhuaddress(hotelMapper.selectByPrimaryKey(dispatchhotels.get(i).getHotelId()).getHotelAddress());
            travelPathParams.add(travelPathParam);
        }
       return  travelPathParams;
    }
    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     *
     * @param dispathId 调度编号
     * @return
     */
    @Override
    public TravelPathsParam getTravelPathsParam(Integer dispathId) throws Exception {
        TravelPathsParam travelPathsParam = new TravelPathsParam();
        travelPathsParam.setDispatch(dispatchMapper.selectByPrimaryKey(dispathId));
        travelPathsParam.setDiscar(discarService.getDiscarByOffId(dispathId));
        travelPathsParam.setCompany(companyService.selectCompanyByIds(1));
        travelPathsParam.setDisguide(disguideService.getDisguideByDispatchId(dispathId));
        travelPathsParam.setStaff(staffService.getStaffInfoByStaffId(travelPathsParam.getDispatch().getCreater()));
        return travelPathsParam;
    }


    /**
     * 微信根据导游id查询行程的信息（yunguohao）
     * @param guideId 导游id
     * @return
     * @throws Exception
     */
    @Override
    public GuideRouteParam getGuideRouteParam(Integer guideId) throws Exception {
        GuideRouteParam guideRouteParam=null;
        DisguideExample disguideExample =new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria=disguideExample.createCriteria();
        disguideExampleCriteria.andGuideidEqualTo(guideId);
        List<Disguide> disguideList =disguideMapper.selectByExample(disguideExample);  //查询调度导游表是否有该导游的带团信息， 没有的话  返回null
        if (disguideList.size()==0){
            return guideRouteParam;
        }
        //有的话，查询调度表  有没有 调度表里的调度  id   并且 状态为 2 的 信息
        Dispatch dispatch=null;
        for (Disguide disguide: disguideList) {
            DispatchExample dispatchExample =new DispatchExample();
            DispatchExample.Criteria dispatchExampleCriteria=dispatchExample.createCriteria();
            dispatchExampleCriteria.andDispatchidEqualTo(disguide.getOfferId());
            dispatchExampleCriteria.andStateEqualTo(2);
            List<Dispatch> dispatchList=dispatchMapper.selectByExample(dispatchExample);
            if (dispatchList.size()>0){
                dispatch=dispatchList.get(0);
            }
        }
        //要是没查到信息  返回null  不执行后续操作
        if (dispatch==null){
            return guideRouteParam;
        }
        guideRouteParam=new GuideRouteParam();
        guideRouteParam.setClusterTime(dispatchtourgroupServer.getDispatchtourgroupByOffId(dispatch.getDispatchId()).getClustertime());
        guideRouteParam.setClusterAddress(dispatchtourgroupServer.getDispatchtourgroupByOffId(dispatch.getDispatchId()).getClusteraddress());
        guideRouteParam.setFlightId(dispatchtourgroupServer.getDispatchtourgroupByOffId(dispatch.getDispatchId()).getFlightid());
        guideRouteParam.setNum(dispatch.getNum());
        guideRouteParam.setDiscarvalue1(discarService.getDiscarByOffId(dispatch.getDispatchId()).getValue1());
        guideRouteParam.setDiscarvalue2(discarService.getDiscarByOffId(dispatch.getDispatchId()).getValue2());
        guideRouteParam.setDiscarvalue3(discarService.getDiscarByOffId(dispatch.getDispatchId()).getValue3());
        guideRouteParam.setDispatchvalue1(dispatch.getValue1());
        guideRouteParam.setDispatchvalue2(dispatch.getValue2());
        return guideRouteParam;
    }



    /**
     * 获取派团单信息根据调度编号 （wangtao）
     *
     * @param dispatchId 调度编号
     * @return 返回派团单参数对象
     * @throws Exception
     */
    @Override
    public MissionParam getMissionParam(Integer dispatchId) throws Exception {
        MissionParam missionParam = new MissionParam();
        //获取午餐集合
        missionParam.setZdisrestaurantList(disrestaurantService.listDisrestaurantByDispatchId(dispatchId, 2));
        //获取晚餐集合
        missionParam.setWdisrestaurantList(disrestaurantService.listDisrestaurantByDispatchId(dispatchId, 3));
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
     *
     * @param dispatchId 调度编号
     * @return 返回调度表信息集合
     */
    @Override
    public Dispatch getDispatchInfoByDispatchInfoId(Integer dispatchId) throws Exception {
        Dispatch dispatch=null;
        if(ConditionValidation.validation(dispatchId)==true){
            dispatch = dispatchMapper.selectByPrimaryKey(dispatchId);
            dispatch.setDispatchhotel(dispatchhotelService.getDispatchhotelInfoByDispatchId(dispatchId));
            dispatch.setDisguide(disguideService.getDisguideByDispatchId(dispatchId));
            dispatch.setDispatchtourgroup(dispatchtourgroupServer.getDispatchtourgroupByOffId(dispatchId));
            dispatch.setDiscar(discarService.getDiscarByOffId(dispatchId));
            dispatch.setDisattrList(disattrService.listDisattrByOffId(dispatchId));
            dispatch.setCompany(companyService.selectCompanyByIds(1));
            dispatch.setStaff(staffService.getStaffInfoByStaffId(dispatch.getCreater()));
            dispatch.setDisrestaurantList(disrestaurantService.listDisrestaurantByOffId(dispatchId));
        }

        return dispatch;
    }

    /**
     * 保存一条调度信息（wuyongfei）
     * （保存该调度下的基础信息、购物、餐馆、酒店、导游、用车、景点、调度、其他）
     *
     * @param disParam 调度信息参数对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @Transactional
    @RecordOperation(type = "调度信息", desc = "添加了一条调度信息")
    public Integer saveDispatchInfo(DispatchParam disParam) throws DispatchException {
        try {
            // 添加调度基础信息
            Integer dispatchId = dispatchMapper.saveDispatchInfo(disParam.getDispatch());
            // 返回的基础数据编号
            int baseId = dispatchId > 0 ? disParam.getDispatch().getDispatchId() : 1;
            // 添加线路信息
            List<Disline> dislineList = disParam.getDislineList();
            for (Disline disline : dislineList) {
                disline.setOfferId(baseId);
            }
            dislineService.saveDisLineInfo(dislineList);
            // 添加购物信息
            List<Disshopp> disshoppList = disParam.getDisshoppList();
            for (Disshopp disshopp : disshoppList) {
                disshopp.setOfferId(baseId);
            }
            disshoppService.saveDisShopInfo(disshoppList);
            // 添加餐馆信息
            List<Disrestaurant> disrestaurantList = disParam.getDisrestaurantList();
            for (Disrestaurant disrestaurant : disrestaurantList) {
                disrestaurant.setOfferId(baseId);
            }
            disrestaurantService.saveDisrestaurantInfo(disrestaurantList);
            // 添加酒店信息
            List<Dispatchhotel> dispatchhotelList = disParam.getDispatchhotelList();
            for (Dispatchhotel dispatchhotel : dispatchhotelList) {
                dispatchhotel.setOfferId(baseId);
            }
            dispatchhotelService.saveDispatchhotelInfo(dispatchhotelList);
            // 添加导游信息
            Disguide disguide = disParam.getDisguide();
            disguide.setOfferId(baseId);
            disguideService.saveDisguideInfo(disguide);
            // 添加用车信息
            Discar discar = disParam.getDiscar();
            discar.setOfferId(baseId);
            discarService.saveDiscarInfo(discar);
            // 添加景点信息
            List<Disattr> disattrList = disParam.getDisattrList();
            for (Disattr disattr : disattrList) {
                disattr.setOfferId(baseId);
            }
            disattrService.saveDisattrInfoes(disattrList);
            // 添加其他信息
            Disother disother = disParam.getDisother();
            disother.setOfferId(baseId);
            disotherService.saveDisotherInfo(disother);
            // 添加旅行社信息
            Dispatchtourgroup dispatchtourgroup = disParam.getDispatchtourgroup();
            dispatchtourgroup.setOfferid(baseId);
            dispatchtourgroupServer.saveDispatchtourgroupInfo(dispatchtourgroup);
            return baseId;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询所有未审核且删除状态为1的调度信息 (lixiaojie)
     * 1表示未审核
     *
     * @return
     */
    @Override
    public PageInfo<Dispatch> selectDispatchs(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize, true);
        //查询调度表
        DispatchExample dispatchExample = new DispatchExample();
        DispatchExample.Criteria criteria = dispatchExample.createCriteria();
        criteria.andWhetherdelEqualTo(0);
        criteria.andStatusEqualTo(2);
        criteria.andWhetherdelEqualTo(0);
        List<Dispatch> dispatches = dispatchMapper.selectByExample(dispatchExample);

        //查询调度导游表

        for (Dispatch dispatch : dispatches) {
            DisguideExample disguideExample = new DisguideExample();
            DisguideExample.Criteria disguideExamplecriteria = disguideExample.createCriteria();
            disguideExamplecriteria.andOfferidEqualTo(dispatch.getDispatchId());
            List<Disguide> disguides = disguideMapper.selectByExample(disguideExample);
            dispatch.setGuide(guideMapper.selectByPrimaryKey(disguides.get(0).getGuideId()));
        }
        PageInfo<Dispatch> pageInfo = new PageInfo<Dispatch>(dispatches);
        return pageInfo;
    }

    /**
     * 总控审核通过（lixiaojie)
     *
     * @return
     */
    @Override
    public Integer onCheckDispatchInfo(Integer dispatchId, int staffId) throws ParseException {
        Integer result = 0;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //修改团状态

        Dispatch dispatch = dispatchMapper.selectByPrimaryKey(dispatchId);
        dispatch.setStatus(1);
        dispatch.setModifiedData(new Date());
        dispatch.setModifier(staffId);
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
        result = dispatchMapper.updateByPrimaryKey(dispatch);

        return result;
    }

    /**
     * 总控审核未通过（lixiaojie)
     *
     * @return
     */
    @Override
    public Integer noCheckDispatchInfo(Integer dispatchId)throws Exception {
        Dispatch dispatch = dispatchMapper.selectByPrimaryKey(dispatchId);
        dispatch.setStatus(3);
        Integer result = dispatchMapper.updateByPrimaryKey(dispatch);
        return result;
    }

    /**
     * 根据导游id获取调度信息id  没有则返回null(lixiaojie)
     *
     * @param guideId
     * @return
     */
    @Override
    public Integer selectDisGuideInfoByguideId(Integer guideId) throws Exception{
        DisguideExample disguideExample = new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria = disguideExample.createCriteria();
        disguideExampleCriteria.andGuideidEqualTo(guideId);
        List<Disguide> disguideList = disguideMapper.selectByExample(disguideExample);  //查询调度导游表是否有该导游的带团信息， 没有的话  返回null
        if (disguideList.size() == 0) {
            return null;
        }
        //有的话，查询调度表  有没有 调度表里的调度  id   并且 状态为 2 的 信息
        Dispatch dispatch = null;
        for (Disguide disguide : disguideList) {
            DispatchExample dispatchExample = new DispatchExample();
            DispatchExample.Criteria dispatchExampleCriteria = dispatchExample.createCriteria();
            dispatchExampleCriteria.andDispatchidEqualTo(disguide.getOfferId());
            dispatchExampleCriteria.andStateEqualTo(2);
            List<Dispatch> dispatchList = dispatchMapper.selectByExample(dispatchExample);
            if (dispatchList.size() > 0) {
                dispatch = dispatchList.get(0);
            }
        }
        //要是没查到信息  返回null  不执行后续操作
        if (dispatch == null) {
            return null;
        }
        return dispatch.getDispatchId();
    }
}
