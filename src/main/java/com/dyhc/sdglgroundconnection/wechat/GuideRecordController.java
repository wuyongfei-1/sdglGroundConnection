package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.service.DisguideService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游带团记录交互接口
 **/
@RequestMapping("/record")
@RestController
public class GuideRecordController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideRecordController.class);

    @Autowired
    private DisguideService disguideService;

    /**
     * 根据导游编号查询该导游带团记录 小程序方法 （wangtao）
     * @param guideId 导游编号
     * @return 返回调度信息集合
     */
    @RequestMapping("/listDispatchGuideByGuideId")
    public ReponseResult listDispatchGuideByGuideId(@RequestParam("guideId") Integer guideId){
        try {
            List<Dispatch> dispatchList=disguideService.listDispatchGuideByGuideId(guideId);
            ReponseResult<List> date;
            if (dispatchList!=null&&dispatchList.size()!=0) {
                date = ReponseResult.ok(dispatchList, "获取导游带团记录成功！");
                logger.info("method:listDispatchGuideByGuideId  获取导游带团记录成功！");

            } else {
                date = ReponseResult.ok(dispatchList, "获取导游带团记录失败！");
                logger.info(" method:listDispatchGuideByGuideId  获取导游带团记录失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:listDispatchGuideByGuideId  获取导游带团记录失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
