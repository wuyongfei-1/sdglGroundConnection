package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程安排 控制层
 **/
@RestController
@RequestMapping("/guideSchedule")
public class GuideScheduleController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideScheduleController.class);

    @Autowired
    private GuideScheduleService guideScheduleService;

    /**
     * 新增导游日程(lixiaojie)
     */
    @RequestMapping("/insertGuideScheduleInfo")
    public ReponseResult insertGuideScheduleInfo(Integer guideId, String Day, Integer offerId) {
        try {
            int result = guideScheduleService.insertGuideScheduleInfo(guideId,Day,offerId);
            System.out.println(result);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "新增导游日程成功！");
                System.out.println(date);
                logger.info(" method:insertGuideScheduleInfo  新增导游日程成功！");

            } else {
                date = ReponseResult.ok("0", "新增导游日程失败！");
                logger.info(" method:insertGuideScheduleInfo  新增导游日程失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertGuideScheduleInfo  新增导游日程失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
