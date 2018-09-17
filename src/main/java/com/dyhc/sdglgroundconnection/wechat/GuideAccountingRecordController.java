package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.dto.WechatReportdetailEatAndHotelParam;
import com.dyhc.sdglgroundconnection.mapper.ReportdetailMapper;
import com.dyhc.sdglgroundconnection.pojo.Bill;
import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.pojo.Reportingotherexpenses;
import com.dyhc.sdglgroundconnection.pojo.Reportticket;
import com.dyhc.sdglgroundconnection.service.BillService;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.dyhc.sdglgroundconnection.utils.WechatFileUploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游上传凭证交互接口
 **/
@RequestMapping("/accountingRecord")
@RestController
public class GuideAccountingRecordController {


    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideAccountingRecordController.class);
    @Autowired
    private ReportdetailService ReportdetailService;


    /**
     * 根据调度id查询其他报账信息(lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/selectReportingotherexpensesBydispatchId", method = RequestMethod.GET)
    public ReponseResult selectReportingotherexpensesBydispatchId(Integer dispatchId) {
        try {
            List<Reportingotherexpenses> result = ReportdetailService.selectReportingotherexpensesBydispatchId(dispatchId);
            ReponseResult<List> date;
            date = ReponseResult.ok(result, "根据调度id查询其他报账信息成功");
            logger.info(" method:selectReportingotherexpensesBydispatchId  根据调度id查询其他报账信息成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:selectReportingotherexpensesBydispatchId  根据调度id查询其他报账信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 根据调度id查询报账景点集合(lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/selectReportticketInfoBydispatchId", method = RequestMethod.GET)
    public ReponseResult selectReportticketInfoBydispatchId(Integer dispatchId) {
        try {
            List<Reportticket> result = ReportdetailService.selectReportticketInfoBydispatchId(dispatchId);
            ReponseResult<List> date;
            date = ReponseResult.ok(result, "根据调度id查询报账景点集合成功");
            logger.info(" method:selectReportticketInfoBydispatchId  根据调度id查询报账景点集合成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:selectReportticketInfoBydispatchId  根据调度id查询报账景点集合失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 根据 调度id查询报账信息  没有返回null(lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/getReportdetailInfoByDispatchId", method = RequestMethod.GET)
    public ReponseResult getReportdetailInfoByDispatchId(Integer dispatchId) {
        try {
            Reportdetail result = ReportdetailService.getReportdetailInfoByDispatchId(dispatchId);
            ReponseResult<Reportdetail> date;
            date = ReponseResult.ok(result, "根据 调度id查询报账信息  没有返回null成功");
            logger.info(" method:getReportdetailInfoByDispatchId  根据 调度id查询报账信息  没有返回null成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:getReportdetailInfoByDispatchId  根据 调度id查询报账信息  没有返回null失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据调度id和日期查询  当日的 吃饭和睡觉地点  (lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/getReportdetailInfoByDispatchIdAndByRiqi", method = RequestMethod.GET)
    public ReponseResult getReportdetailInfoByDispatchIdAndByRiqi(Integer dispatchId,String Riqi) {
        try {
            WechatReportdetailEatAndHotelParam result = ReportdetailService.getReportdetailInfoByDispatchIdAndByRiqi(dispatchId,Riqi);
            ReponseResult<WechatReportdetailEatAndHotelParam> date;
            date = ReponseResult.ok(result, "根据调度id和日期查询  当日的 吃饭和睡觉地点成功");
            logger.info(" method:getReportdetailInfoByDispatchIdAndByRiqi  根据调度id和日期查询  当日的 吃饭和睡觉地点成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:getReportdetailInfoByDispatchIdAndByRiqi  根据调度id和日期查询  当日的 吃饭和睡觉地点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }



}
