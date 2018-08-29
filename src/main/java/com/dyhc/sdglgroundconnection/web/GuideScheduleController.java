package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 查询请假的导游信息  和 日程信息(lixiaojie)
     * @param pageNo
     * @param pageSize
     * @param guideName
     * @param firstDate
     * @param lastDate
     * @return
     */
    @RequestMapping(value = "/selectScheduleScheduleStateBy2", method = RequestMethod.POST)
    public ReponseResult selectScheduleScheduleStateBy2(Integer pageNo, Integer pageSize, String guideName, String firstDate, String lastDate) {
        try {
            pageSize = 6;
            PageInfo<GuideSchedule> pageInfo = guideScheduleService.selectScheduleScheduleStateBy2(pageNo, pageSize, guideName, firstDate, lastDate);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "查询请假的导游信息和日程信息成功！");

            logger.info(" method:selectScheduleScheduleStateBy2  分页查询请假的导游信息和日程信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectScheduleScheduleStateBy2  分页查询请假的导游信息和日程信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 新增导游请假信息(lixiaojie)
     */
    @RequestMapping(value="/insertGuideScheduleStatus2", method = RequestMethod.POST)
    public ReponseResult insertGuideScheduleStatus2(GuideSchedule guideSchedule) {
        try {
            int result = guideScheduleService.insertGuideScheduleStatus2(guideSchedule);
            System.out.println(result);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "新增导游请假信息成功！");
                System.out.println(date);
                logger.info(" method:insertGuideScheduleStatus2  新增导游请假信息成功！");

            } else {
                date = ReponseResult.ok("0", "新增导游请假信息失败！");
                logger.info(" method:insertGuideScheduleStatus2  新增导游请假信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertGuideScheduleStatus2  新增导游请假信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

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
