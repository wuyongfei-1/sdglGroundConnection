package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Tourguide;
import com.dyhc.sdglgroundconnection.service.TourguideService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 导游带团日志 控制层 wangtao
 */
@RestController
@RequestMapping("/tourguide")
public class TourguideController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(TourguideController.class);
    @Autowired
    private TourguideService tourguideService;

    /**
     * 根据导游带团日志编号查询导游带团日志信息 （wangtao）
     * @param tourguideId 导游带团日志编号
     * @return 返回导游带团日志对象
     */
    @RequestMapping(value = "getTourguideInfoByTourguideId")
    public ReponseResult getTourguideInfoByTourguideId(@RequestParam("tourguideId") Integer tourguideId) {
        try {
            //一、根据导游带团日志编号查询导游带团日志信息
            Tourguide tourguide = tourguideService.getTourguideInfoByTourguideId(tourguideId);
            //二、返回ReponseResult对象
            ReponseResult<Tourguide> data = ReponseResult.ok(tourguide, "获取导游带团日志成功！");
            //三、录入日志并返回
            logger.info(" method:getTourguideInfoByTourguideId  获取导游带团日志成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getTourguideInfoByTourguideId  获取导游带团日志数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

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
