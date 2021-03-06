package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.TourguideMapper;
import com.dyhc.sdglgroundconnection.pojo.Tourguide;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.service.TourguideService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 导游带团日志 业务实现类 wangtao
 */
@Service
public class TourguideServiceImpl implements TourguideService {

    @Autowired
    private TourguideMapper tourguideMapper;

    @Autowired
    private DispatchService dispatchService;

    @Autowired
    private GuideService guideService;


    /**
     * 根据导游带团日志编号查询导游带团日志信息 （wangtao）
     * @param tourguideId 导游带团日志编号
     * @return 返回导游带团日志对象
     */
    @Override
    public Tourguide getTourguideInfoByTourguideId(Integer tourguideId) throws Exception{
        Tourguide tourguide=null;
        if(ConditionValidation.validation(tourguideId)==true){
            tourguide=tourguideMapper.selectByPrimaryKey(tourguideId);
            if(tourguide!=null){
                tourguide.setDispatch(dispatchService.getDispatchInfoByDispatchInfoId(tourguide.getOffid()));
                tourguide.setGuide(guideService.selectGuideByIds(tourguide.getGuideid()));
            }
        }
        return tourguide;
    }

    @Override
    public Integer insertTourguide(Tourguide tourguide) throws Exception {
        tourguide.setCreatedate(new Date());
        return tourguideMapper.insert(tourguide);
    }
}
