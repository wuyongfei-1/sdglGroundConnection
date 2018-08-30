package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.dto.GuideRouteParam;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游行程交互接口
 **/
@RequestMapping("/route")
@RestController
public class GuideRouteController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideRouteController.class);

    @Autowired
    private DisguideService disguideService;
    @Autowired
    private DispatchService dispatchService;
    /**
     * 根据导游编号查询行程 小程序方法 （yunguohao）
     * @param guideId 导游编号
     * @return
     */
    @RequestMapping("/getGuideRouteParam")
    public ReponseResult getGuideRouteParam(@RequestParam("guideId") Integer guideId){
        try {
            GuideRouteParam guideRouteParam=dispatchService.getGuideRouteParam(guideId);
            ReponseResult<GuideRouteParam> date;
            if (guideRouteParam!=null) {
                date = ReponseResult.ok(guideRouteParam, "获取导游行程成功！");
                logger.info("method:getGuideRouteParam  获取导游行程成功！");

            } else {
                date = ReponseResult.ok("获取导游行程失败！");
                logger.info(" method:getGuideRouteParam  获取导游行程失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:getGuideRouteParam  获取导游行程失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
