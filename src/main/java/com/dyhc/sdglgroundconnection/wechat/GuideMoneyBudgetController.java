package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.dto.WechatEatAndHotelParam;
import com.dyhc.sdglgroundconnection.dto.WechatInformationParam;
import com.dyhc.sdglgroundconnection.dto.WechatTicketbudgetParam;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游经费预算交互接口
 **/
@RequestMapping("/moneyBudget")
@RestController
public class GuideMoneyBudgetController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideMoneyBudgetController.class);
    //调度service
    @Autowired
    private DispatchService dispatchService;

    /**
     * 根据调度id获取调度信息(lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/getDispatchByDispatchId", method = RequestMethod.GET)
    public ReponseResult getDispatchByDispatchId(Integer dispatchId) {
        try {
            Dispatch dispatch = dispatchService.getDispatchByDispatchId( dispatchId);
            ReponseResult<Dispatch> data = ReponseResult.ok(dispatch,  "根据调度id获取调度信息成功！");
            logger.info(" method:getDispatchByDispatchId  根据调度id获取调度信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getDispatchByDispatchId  根据调度id获取调度信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据调度id查询所有的景点信息(lixiaojie)
     * @param dispatchId
     * @return WechatTicketbudgetParam 微信景点参数类
     */
    @RequestMapping(value = "/selectDispatchByScenicspotInfo", method = RequestMethod.GET)
    public ReponseResult selectDispatchByScenicspotInfo(Integer dispatchId) {
        ReponseResult<List> data;
        try {
            List<WechatTicketbudgetParam> Lists = dispatchService.selectDispatchByScenicspotInfo(dispatchId);
            data = ReponseResult.ok(Lists, "根据调度id查询所有的景点信息成功！");
            logger.info(" method:selectDispatchByScenicspotInfo  根据调度id查询所有的景点信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchByScenicspotInfo  根据调度id查询所有的景点信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }



    /**
     * 根据调度表id 和权重获取每天的吃饭信息和住宿信息(lixiaojie)
     * @param dispatchId
     * @param weight
     * @return
     */
    @RequestMapping(value = "/selectDispatchInfoByWeightDispatchId", method = RequestMethod.GET)
    public ReponseResult selectDispatchInfoByWeightDispatchId(Integer dispatchId, Integer weight) {
        try {
            WechatEatAndHotelParam wechatEatAndHotelParam = dispatchService.selectDispatchInfoByWeightDispatchId( dispatchId,  weight);
            ReponseResult<WechatEatAndHotelParam> data = ReponseResult.ok(wechatEatAndHotelParam,  "根据调度表id 和权重获取每天的吃饭信息和住宿信息成功！");
            logger.info(" method:selectDispatchInfoByWeightDispatchId  根据调度表id 和权重获取每天的吃饭信息和住宿信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchInfoByWeightDispatchId  根据调度表id 和权重获取每天的吃饭信息和住宿信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 根据调度id获取该团的所有天数(lixiaojie)
     * @param dispatchId
     * @return  微信基本信息参数类  WechatInformationParam
     */
    @RequestMapping(value = "/selectDispatchDaysByDispatchId", method = RequestMethod.GET)
    public ReponseResult selectDispatchDaysByDispatchId(Integer dispatchId) {
        ReponseResult<List> data;
        try {
            List<String> Lists = dispatchService.selectDispatchDaysByDispatchId(dispatchId);
            data = ReponseResult.ok(Lists, "根据调度id获取该团的所有天数成功！");
            logger.info(" method:selectDispatchDaysByDispatchId  根据调度id获取该团的所有天数成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchDaysByDispatchId  根据调度id获取该团的所有天数失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 根据导游id查询调度表(lixiaojie)
     * @param guideId
     * @return  微信基本信息参数类  WechatInformationParam
     */
    @RequestMapping(value = "/selectDispatchInfoByGuideId", method = RequestMethod.GET)
    public ReponseResult selectDispatchInfoByGuideId(Integer guideId) {
        ReponseResult<WechatInformationParam> data;
        try {
            WechatInformationParam wechatInformationParam = dispatchService.selectDispatchInfoByGuideId(guideId);
            data = ReponseResult.ok(wechatInformationParam, "获取微信带团基本信息成功！");
            logger.info(" method:selectDispatchInfoByGuideId  获取微信带团基本信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchInfoByGuideId  获取微信带团基本信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


}
