package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Dispatch;

import java.text.ParseException;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程 业务接口
 **/
public interface GuideScheduleService {




    /**
     * 给团修改导游 （lixiaojie)
     * @param guideId
     * @param offerId
     * @return
     */
    Integer updateDispatchGuide(Integer guideId, Integer offerId );

    /**
     * 新增导游日程(lixiaojie)
     * @param guideId
     * @param Day
     * @param offerId
     * @return
     * @throws ParseException
     */
    Integer insertGuideScheduleInfo(Integer guideId, String Day, Integer offerId ) throws ParseException;

}
