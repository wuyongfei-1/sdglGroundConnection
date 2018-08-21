package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Disguide;
import com.dyhc.sdglgroundconnection.service.DisguideService;
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
