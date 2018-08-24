package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游调度
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class GuideScheduleMapperTest {

    @Resource
    private GuideScheduleMapper guideScheduleMapper;

    @Test
    public void testListGuideSchedules(){
        List<GuideSchedule> guideSchedules = guideScheduleMapper.selectAll();
        for (GuideSchedule guideSchedule : guideSchedules) {
            System.out.println(guideSchedule.getGuideid());
        }
    }
}
