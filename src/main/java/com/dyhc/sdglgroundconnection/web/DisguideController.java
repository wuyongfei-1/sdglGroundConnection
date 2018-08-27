package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Disguide;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import com.dyhc.sdglgroundconnection.service.GuideScheduleService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游 控制层
 **/
@RestController
@RequestMapping("/disguide")
public class DisguideController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(DisguideController.class);

    @Autowired
    private DisguideService disguideService;
    @Autowired
    private GuideScheduleService guideScheduleService;

    /**
     * 给团修改导游 （lixiaojie)
     * @param guideId
     * @param offerId
     * @return
     */
    @RequestMapping("/updateDispatchGuide")
    public ReponseResult updateDispatchGuide(Integer guideId, Integer offerId) {
        try {
            int result = guideScheduleService.updateDispatchGuide( guideId,  offerId);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "给团修改导游成功！");
                logger.info("method:updateDispatchGuide  给团修改导游成功！");

            } else {
                date = ReponseResult.ok("0", "给团修改导游失败！");
                logger.info(" method:updateDispatchGuide  给团修改导游失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateDispatchGuide  修改导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据导游id和调度id获取调度导游信息(lixiaojie)
     * @param guideId   导游id
     * @param offerId   调度id
     * @return
     */
    @RequestMapping("/getDisGuideByOfferIdAndGuideId")
    public ReponseResult getDisGuideByOfferIdAndGuideId(Integer guideId, Integer offerId){
        try {
            Disguide disguide=disguideService.getDisGuideByOfferIdAndGuideId(guideId,offerId);
            ReponseResult<Disguide> data = ReponseResult.ok( disguide,"根据导游id和调度id获取调度导游信息成功！");
            logger.info(" method:getDisGuideByOfferIdAndGuideId  根据导游id和调度id获取调度导游信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getDisGuideByOfferIdAndGuideId  根据导游id和调度id获取调度导游信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }



    /**
     * 按调度导游编号查询(yunguohao)
     * @param
     * @return
     */
    @RequestMapping("/selectdisGuideId")
    public ReponseResult dispatchIdList(int disGuideId){
        try {
            List<Disguide> list=disguideService.selectdisGuideId(disGuideId);
            ReponseResult<List> data = ReponseResult.ok( list,"调度导游编号查询成功！");
            logger.info(" method:selectdisGuideId  调度导游编号查询成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectdisGuideId  调度导游编号查询数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
