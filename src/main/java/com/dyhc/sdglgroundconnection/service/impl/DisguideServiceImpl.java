package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.pojo.Disguide;
import com.dyhc.sdglgroundconnection.pojo.DisguideExample;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import com.dyhc.sdglgroundconnection.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private GuideService guideService;

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
     * 根据调度表编号查询调度导游表信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度导游表对象
     */
    @Override
    public Disguide getDisguideByDispatchId(Integer dispatchId) {
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
