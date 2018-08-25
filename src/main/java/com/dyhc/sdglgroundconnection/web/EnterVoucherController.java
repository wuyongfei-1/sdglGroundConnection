package com.dyhc.sdglgroundconnection.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 进入凭证页面 控制器
 */
@Controller
@RequestMapping("/voucher")
public class EnterVoucherController {
    // 日志对象
    private Logger logger = LoggerFactory.getLogger(EnterGeneralControlPageController.class);

    /**
     * 进入山西世达国旅订房通知单 页面
     * @return
     */
    @RequestMapping("/BookingNotice.html")
    public String enterBookingNotice() {
        return "voucher/BookingNotice";
    }

    /**
     * 进入旅游团队运输合同第一页 页面
     * @return
     */
    @RequestMapping("/CarRenting1.html")
    public String enterCarRenting1() {
        return "voucher/CarRenting1";
    }

    /**
     * 进入旅游团队运输合同第二页 页面
     * @return
     */
    @RequestMapping("/CarRenting2.html")
    public String enterCarRenting2() {
        return "voucher/CarRenting2";
    }

    /**
     * 进入确认书 页面
     * @return
     */
    @RequestMapping("/Confirmation.html")
    public String enterConfirmation() {
        return "voucher/Confirmation";
    }

    /**
     * 进入导游报账明细单 页面
     * @return
     */
    @RequestMapping("/GuidesReimbursement.html")
    public String enterGuidesReimbursement() {
        return "voucher/GuidesReimbursement";
    }

    /**
     * 进入导游带团日志单页面
     * @return
     */
    @RequestMapping("/log.html")
    public String enterlog() {
        return "voucher/log";
    }

    /**
     * 进入派团单 页面
     * @return
     */
    @RequestMapping("/Mission.html")
    public String enterMission() {
        return "voucher/Mission";
    }

    /**
     * 进入团结算账单 页面
     * @return
     */
    @RequestMapping("/newFile.html")
    public String enterNewFile() {
        return "voucher/newFile";
    }

    /**
     * 进入导游接团任务工作单(派团单) 页面
     * @return
     */
    @RequestMapping("/ptd.html")
    public String enterPtd() {
        return "voucher/ptd";
    }

    /**
     * 进入山西旅遊注意事項及安全提示单 页面
     * @return
     */
    @RequestMapping("/SecurityHints.html")
    public String enterSecurityHints() {
        return "voucher/SecurityHints";
    }

    /**
     * 进入地接行程计划单 页面
     * @return
     */
    @RequestMapping("/TravelPlan.html")
    public String enterTravelPlan() {
        return "voucher/TravelPlan";
    }





}
