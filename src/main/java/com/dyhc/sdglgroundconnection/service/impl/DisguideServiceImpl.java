package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.BillMapper;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import com.dyhc.sdglgroundconnection.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游业务实现
 **/
@Service
public class DisguideServiceImpl implements DisguideService {

    @Autowired
    private DisguideMapper disguideMapper;

    @Autowired
    private GuideMapper guideMapper;

    @Autowired
    private GuideService guideService;

    @Autowired
    private DispatchMapper dispatchMapper;

    @Autowired
    private BillMapper billMapper;

    /**
     * 根据导游编号查询该导游带团记录
     * @param guideId 导游编号
     * @return 返回调度信息集合
     */
    @Override
    public List<Dispatch> listDispatchGuideByGuideId(Integer guideId) {
        DisguideExample disguideExample=new DisguideExample();
        DisguideExample.Criteria criteria=disguideExample.createCriteria();
        criteria.andGuideidEqualTo(guideId);
        List<Disguide> disguideList=disguideMapper.selectByExample(disguideExample);
        List<Dispatch> dispatchList=new ArrayList<>();
        for (Disguide disguide: disguideList) {
            Dispatch dispatch=dispatchMapper.selectByPrimaryKey(disguide.getOfferId());
            BillExample billExample=new BillExample();
            BillExample.Criteria criteria1=billExample.createCriteria();
            criteria1.andDispatchidEqualTo(dispatch.getDispatchId());
            criteria1.andBilltypeidEqualTo(3);
            dispatch.setBill(billMapper.selectByExample(billExample).get(0));
            dispatchList.add(dispatch);
        }
        return dispatchList;
    }



    /**
     * 调度导游查询
     * @param disGuideId
     * @return
     */
    @Override
    public List<Disguide> selectdisGuideId(int disGuideId) {
        return disguideMapper.selectdisGuideId(disGuideId);
    }

    /**
     * 根据导游id  和调度id获取  调度导游信息(lixiaojie)
     * @param guideId   导游id
     * @param offerId   调度id
     * @return
     */
    @Override
    public Disguide getDisGuideByOfferIdAndGuideId(Integer guideId, Integer offerId) {

        //查询调度导游表
        DisguideExample disguideExample =new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria=disguideExample.createCriteria();
        disguideExampleCriteria.andOfferidEqualTo(offerId);
        List<Disguide> disguides=disguideMapper.selectByExample(disguideExample);
        //查询导游
        Guide guide=guideMapper.selectByPrimaryKey(guideId);

        Disguide disguide=null;
        if (disguides.size()>0){
            disguide=  disguides.get(0);
            disguide.setGuide(guide);
        }

        return disguide;
    }

    /**
     * 根据调度表编号查询调度导游表信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度导游表对象
     */
    @Override
    public Disguide getDisguideByDispatchId(Integer dispatchId) throws Exception {
        DisguideExample disguideExample=new DisguideExample();
        DisguideExample.Criteria criteria=disguideExample.createCriteria();
        criteria.andOfferidEqualTo(dispatchId);
        List<Disguide> disguideList=disguideMapper.selectByExample(disguideExample);
        Disguide disguide=null;
        if(disguideList!=null){
            disguide=disguideList.get(0);
            disguide.setGuide(guideService.selectGuideByIds(disguide.getGuideId()));
        }
        return disguide;
    }

    /**
     * 添加调度导游信息（wuyongfei）
     *
     * @param disguide 调度导游对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度导游", desc = "添加了一条调度导游信息")
    public Integer saveDisguideInfo(Disguide disguide) throws DispatchException {
        return disguideMapper.insert(disguide);
    }
}
