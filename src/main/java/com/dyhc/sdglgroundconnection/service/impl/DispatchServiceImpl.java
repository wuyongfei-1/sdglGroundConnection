package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.DispatchParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Integer onCheckDispatchInfo(Integer dispatchId) {
        Dispatch dispatch=dispatchMapper.selectByPrimaryKey(dispatchId);
        dispatch.setStatus(2);
        Integer result =dispatchMapper.updateByPrimaryKey(dispatch);
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
