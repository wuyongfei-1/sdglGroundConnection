package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.Tourguide;
import com.dyhc.sdglgroundconnection.service.TourguideService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游上传凭证交互接口
 **/
@RequestMapping("/bill")
@RestController
public class GuideUploadBillController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideUploadBillController.class);
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
