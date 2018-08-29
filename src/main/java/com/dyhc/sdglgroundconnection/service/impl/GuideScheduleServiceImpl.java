package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideScheduleMapper;
import com.dyhc.sdglgroundconnection.pojo.Disguide;
import com.dyhc.sdglgroundconnection.pojo.DisguideExample;
import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import com.dyhc.sdglgroundconnection.pojo.GuideScheduleExample;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程 业务实现
 **/
@Service
public class GuideScheduleServiceImpl implements GuideScheduleService {

    @Autowired
    private GuideScheduleMapper guideScheduleMapper;
    @Autowired
    private DisguideMapper disguideMapper;





    /**
     * 给团修改导游 （lixiaojie)
     * @param guideId
     * @param offerId
     * @return
     */
    @Override
    public Integer updateDispatchGuide(Integer guideId, Integer offerId) {
        int reuslt=0;
        //修改团导游   将此表的  guideId修改成  传过来的值
        DisguideExample disguideExample =new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria=disguideExample.createCriteria();
        disguideExampleCriteria.andOfferidEqualTo(offerId);
        List<Disguide> disguides=disguideMapper.selectByExample(disguideExample);
        Disguide disguide=disguides.get(0);


        //并且将导游行程表  此导游 此次 带团记录全部删除

        GuideScheduleExample guideScheduleExample=new GuideScheduleExample();
        GuideScheduleExample.Criteria guideScheduleExampleCriteria=guideScheduleExample.createCriteria();
        guideScheduleExampleCriteria.andGuideidEqualTo(disguide.getGuideId());
        guideScheduleExampleCriteria.andValue2EqualTo(offerId+"");
        List<GuideSchedule> guideSchedules=guideScheduleMapper.selectByExample(guideScheduleExample);
        disguide.setGuideId(guideId);
        reuslt=disguideMapper.updateByPrimaryKeySelective(disguide);
        for (GuideSchedule guideSchedule : guideSchedules) {
            guideSchedule.setValue1(1+"");
            reuslt=guideScheduleMapper.updateByPrimaryKeySelective(guideSchedule);
        }


        //然后点一下插一条

        return reuslt;
    }

    /**
     * 新增导游日程  (lixiaojie)
     * @param guideId
     * @param Day
     * @param offerId
     * @return
     * @throws ParseException
     */
    @Override
    public Integer insertGuideScheduleInfo(Integer guideId, String Day, Integer offerId) throws ParseException {

        GuideSchedule guideSchedule=new GuideSchedule();
        guideSchedule.setGuideid(guideId);
        guideSchedule.setValue2(offerId+"");
        guideSchedule.setSchedulestate(3);
        guideSchedule.setValue1(0+"");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String beginDate="2018-08-"+Day;
        Date date=simpleDateFormat.parse(beginDate);
        guideSchedule.setSchedulebegintime(date);
        return guideScheduleMapper.insert(guideSchedule);
    }
}
