package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.GuidescheduleParam;
import com.dyhc.sdglgroundconnection.mapper.DisguideMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideScheduleMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    @Autowired
    private GuideMapper guideMapper;


    /**
     * 给团修改导游 （lixiaojie)
     *
     * @param guideId
     * @param offerId
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "修改了团的导游")
    public Integer updateDispatchGuide(Integer guideId, Integer offerId) {
        int reuslt = 0;
        //修改团导游   将此表的  guideId修改成  传过来的值
        DisguideExample disguideExample = new DisguideExample();
        DisguideExample.Criteria disguideExampleCriteria = disguideExample.createCriteria();
        disguideExampleCriteria.andOfferidEqualTo(offerId);
        List<Disguide> disguides = disguideMapper.selectByExample(disguideExample);
        Disguide disguide = disguides.get(0);


        //并且将导游行程表  此导游 此次 带团记录全部删除

        GuideScheduleExample guideScheduleExample = new GuideScheduleExample();
        GuideScheduleExample.Criteria guideScheduleExampleCriteria = guideScheduleExample.createCriteria();
        guideScheduleExampleCriteria.andGuideidEqualTo(disguide.getGuideId());
        guideScheduleExampleCriteria.andValue2EqualTo(offerId + "");
        List<GuideSchedule> guideSchedules = guideScheduleMapper.selectByExample(guideScheduleExample);
        disguide.setGuideId(guideId);
        reuslt = disguideMapper.updateByPrimaryKeySelective(disguide);
        for (GuideSchedule guideSchedule : guideSchedules) {
            guideSchedule.setValue1(1 + "");
            reuslt = guideScheduleMapper.updateByPrimaryKeySelective(guideSchedule);
        }
        //然后点一下插一条
        return reuslt;
    }

    /**
     * 新增导游日程  (lixiaojie)
     *
     * @param guideId
     * @param Day
     * @param offerId
     * @return
     * @throws ParseException
     */
    @Override
    @RecordOperation(type = "总控", desc = "新增了导游日程")
    public Integer insertGuideScheduleInfo(Integer guideId, String Day, Integer offerId) throws ParseException {

        GuideSchedule guideSchedule = new GuideSchedule();
        guideSchedule.setGuideid(guideId);
        guideSchedule.setValue2(offerId + "");
        guideSchedule.setSchedulestate(3);
        guideSchedule.setValue1(0 + "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String beginDate = "2018-08-" + Day;
        Date date = simpleDateFormat.parse(beginDate);
        guideSchedule.setSchedulebegintime(date);
        return guideScheduleMapper.insert(guideSchedule);
    }


/*
    public PageInfo<GuidescheduleParam> chaxunsuoyoucaiwuxinxi() {
        PageHelper.startPage(1, 6, true);
        List<String> Value3s = null;
        List<GuidescheduleParam> guidescheduleParams = new ArrayList<>();
        for (String items : Value3s) {
            if (items == "" || items == null || "".equals(items)) {
                continue;
            }

            GuidescheduleParam guidescheduleParam = new GuidescheduleParam();
            GuideScheduleExample guideScheduleExample = new GuideScheduleExample();
            GuideScheduleExample.Criteria guideScheduleExampleCriteria = guideScheduleExample.createCriteria();
            guideScheduleExampleCriteria.andValue3EqualTo(items);
            List<GuideSchedule> guideSchedules = guideScheduleMapper.selectByExample(guideScheduleExample);
            Guide guide = guideMapper.selectByPrimaryKey(guideSchedules.get(0).getGuideid());
            guidescheduleParam.setSchedulestate(guideSchedules.get(0).getSchedulestate());
            guidescheduleParam.setSchedulebegintime(guideSchedules.get(0).getSchedulebegintime());
            guidescheduleParam.setScheduleendtime(guideSchedules.get(guideSchedules.size() - 1).getSchedulebegintime());
            guidescheduleParam.setGuideName(guide.getGuideName());
            guidescheduleParam.setCertificate(guide.getCertificate());
            guidescheduleParams.add(guidescheduleParam);

        }

        return new PageInfo<>(guidescheduleParams);
    }*/

    /**
     * 查询请假的导游信息  和 日程信息(lixiaojie)
     *
     * @return
     */
    @Override
    public PageInfo<GuidescheduleParam> selectScheduleScheduleStateBy2(Integer pageNo, Integer pageSize, String guideName, String firstDate, String lastDate) throws ParseException {
       /* PageHelper.startPage(pageNo, pageSize, true);
        GuideScheduleExample guideScheduleExample=new GuideScheduleExample();
        GuideScheduleExample.Criteria guideScheduleExampleCriteria=guideScheduleExample.createCriteria();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        if (!"".equals(firstDate)){
            guideScheduleExampleCriteria.andSchedulebegintimeBetween(simpleDateFormat.parse(firstDate),simpleDateFormat.parse("2099-09-23"));
        }
        if (!"".equals(lastDate)){
            guideScheduleExampleCriteria.andSchedulebegintimeBetween(simpleDateFormat.parse("1099-09-23"),simpleDateFormat.parse(lastDate));
        }
        guideScheduleExampleCriteria.andValue1EqualTo("0");
        guideScheduleExampleCriteria.andSchedulestateEqualTo(2);
        List<GuideSchedule> guideSchedules=guideScheduleMapper.selectByExample(guideScheduleExample);

        for (GuideSchedule items:guideSchedules) {
            items.setGuide(guideMapper.selectByPrimaryKey(items.getGuideid()));
            if (items.getGuide().getGuideName().equals(guideName)){
                items=null;
            }
        }
        return new PageInfo<GuideSchedule>(guideSchedules);*/
        List<String> Value2s = guideScheduleMapper.selectGroupByGuideScheduleByValue3(guideName, firstDate, lastDate);
        PageHelper.startPage(pageNo, pageSize, true);
        List<String> Value3s = guideScheduleMapper.selectGroupByGuideScheduleByValue3(guideName, firstDate, lastDate);
        List<GuidescheduleParam> guidescheduleParams = new ArrayList<>();
        for (String items : Value3s) {
            if (items == "" || items == null || "".equals(items)) {
                continue;
            }
            GuidescheduleParam guidescheduleParam = new GuidescheduleParam();
            GuideScheduleExample guideScheduleExample = new GuideScheduleExample();
            GuideScheduleExample.Criteria guideScheduleExampleCriteria = guideScheduleExample.createCriteria();
            guideScheduleExampleCriteria.andValue3EqualTo(items);
            List<GuideSchedule> guideSchedules = guideScheduleMapper.selectByExample(guideScheduleExample);
            Guide guide = guideMapper.selectByPrimaryKey(guideSchedules.get(0).getGuideid());
            guidescheduleParam.setSchedulestate(guideSchedules.get(0).getSchedulestate());
            guidescheduleParam.setSchedulebegintime(guideSchedules.get(0).getSchedulebegintime());
            guidescheduleParam.setScheduleendtime(guideSchedules.get(guideSchedules.size() - 1).getSchedulebegintime());
            guidescheduleParam.setGuideName(guide.getGuideName());
            guidescheduleParam.setCertificate(guide.getCertificate());
            guidescheduleParams.add(guidescheduleParam);
        }
        PageInfo<GuidescheduleParam> guidescheduleParam=new  PageInfo<GuidescheduleParam>(guidescheduleParams);
        guidescheduleParam.setTotal(Value2s.size());
        return guidescheduleParam;
    }

    /**
     * 新增导游请假信息(lixiaojie)
     *
     * @param guideSchedule
     * @return
     */
    @Override
    @RecordOperation(type = "总控", desc = "新增了导游请假信息")
    public Integer insertGuideScheduleStatus2(GuideSchedule guideSchedule) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date beginTime = guideSchedule.getSchedulebegintime();
        Date endTime = guideSchedule.getScheduleendtime();
        String beginDateStr = format.format(beginTime);
        String endDateStr = format.format(endTime);
        beginTime = format.parse(beginDateStr);
        endTime = format.parse(endDateStr);
        int result = 0;
        Long Number = (endTime.getTime() - beginTime.getTime()) / (24 * 60 * 60 * 1000) + 1;  //相减  得到 旅游天数
        String uuid = EncryUtil.getUUID32();
        for (int i = 0; i < Number; i++) {
            Calendar c = Calendar.getInstance();
            c.setTime(beginTime);
            c.add(Calendar.DAY_OF_MONTH, i+1);  //然后做出旅游天数每天的时间对象 填入 导游日程表中
            Date tomorrow = c.getTime();
            GuideSchedule gs = new GuideSchedule();
            gs.setGuideid(guideSchedule.getGuideid());
            gs.setSchedulebegintime(tomorrow);
            gs.setSchedulestate(2);
            gs.setValue1(0 + "");
            gs.setValue3(uuid);
            result = guideScheduleMapper.insert(gs);
        }

        return result;
    }
}
