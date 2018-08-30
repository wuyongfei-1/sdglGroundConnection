package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.GuidescheduleParam;
import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.PageInfo;
import org.hibernate.validator.constraints.Range;

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

    /**
     * 查询请假的导游信息  和 日程信息(lixiaojie)
     * @return
     */
    PageInfo<GuidescheduleParam> selectScheduleScheduleStateBy2(Integer pageNo, Integer pageSize, String guideId, String firstDate, String lastDate) throws ParseException;

    /**
     * 新增导游请假信息
     * @param guideSchedule
     * @return
     */
    Integer insertGuideScheduleStatus2(GuideSchedule guideSchedule) throws ParseException;



}
