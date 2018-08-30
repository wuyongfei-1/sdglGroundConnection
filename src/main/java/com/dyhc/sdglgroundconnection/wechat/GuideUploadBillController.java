package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.Bill;
import com.dyhc.sdglgroundconnection.service.BillService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.dyhc.sdglgroundconnection.utils.WechatFileUploadUtil;
import com.dyhc.sdglgroundconnection.pojo.Tourguide;
import com.dyhc.sdglgroundconnection.service.TourguideService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Vector;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游上传凭证交互接口
 **/
@RequestMapping("/bill")
@RestController
public class GuideUploadBillController {

    @Autowired
    private BillService billService;

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideUploadBillController.class);

    /**
     * 上传凭证单（集体照、行程变更书、酒店发票、过路费）（wuyongfei）
     *
     * @param request 当前请求
     * @return 响应结果
     * synchronized  微信多文件上传，同时发送多个线程，所以使用线程锁
     */
    @RequestMapping("/uploadBills")
    public synchronized ReponseResult uploadBills(HttpServletRequest request) {
        try {
            // 获取调度信息的编号
            Integer dispatchId = Integer.parseInt(request.getParameter("dispatchId"));
            // 获取账单类型编号
            Integer billTypeId = Integer.parseInt(request.getParameter("billTypeId"));
            // 获取当前导游编号
            Integer guideId = Integer.parseInt(request.getParameter("guideId"));
            String imageName = WechatFileUploadUtil.uploadImage(request);
            if (ConditionValidation.validation(imageName)) {
                Bill bill = new Bill();
                bill.setPicturePath(imageName);
                bill.setBillTypeId(billTypeId);
                bill.setCreateDate(new Date());
                bill.setCreateBy(guideId);
                bill.setDispatchId(dispatchId);
                bill.setWhetherDel(0);
                billService.insertBill(bill);
                logger.info(" method: uploadBills 上传凭证成功！");
                return ReponseResult.ok("上传成功！");
            } else {
                logger.error(" method: uploadBills 上传凭证失败！");
                return ReponseResult.err("上传失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: uploadBills 上传凭证失败！" + e.getMessage());
            return ReponseResult.err("上传失败！");
        }
    }
    @Autowired
    private TourguideService tourguideService;
    /**
     * 上传导游带团日志（dubingkun）
     * @param tourguide
     * @return
     */
    @RequestMapping(value = "upData")
    public ReponseResult upData(@RequestBody Tourguide tourguide){
        try {
            ReponseResult<String> data;
            int a=tourguideService.insertTourguide(tourguide);
            if(a>0){
                data= ReponseResult.ok("上传成功", "上传导游带团日志成功！");
            }else{
                data= ReponseResult.ok("上传失败", "上传导游带团日志成功！");
            }
            logger.info(" method:getTourguideInfoByTourguideId  上传导游带团日志成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getTourguideInfoByTourguideId  上传导游带团日志数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
