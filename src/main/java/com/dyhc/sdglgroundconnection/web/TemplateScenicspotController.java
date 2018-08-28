package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.TemplateScenicspotService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板景点 控制层
 **/
@RestController
@RequestMapping("/templateScenicspot")
public class TemplateScenicspotController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(TemplateScenicspotController.class);

    @Autowired
    private TemplateScenicspotService templateScenicspotService;

    /**
     * 删除模板景点信息根据模板景点编号 （wangtao）
     * @param TemplateScenicspotId 模板景点编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/deleteTemplateScenicspotByTemplateScenicspotId")
    public ReponseResult deleteTemplateScenicspotByTemplateScenicspotId(@RequestParam("TemplateScenicspotId")Integer TemplateScenicspotId){
        try {
            ReponseResult<Integer> data=null;
            //一、修改模板信息
            Integer result = templateScenicspotService.deleteTemplateScenicspotByTemplateScenicspotId(TemplateScenicspotId);
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板景点信息成功！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateHotelById  删除模板景点信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板景点信息失败！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateHotelById  删除模板景点信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteTemplateHotelById  删除模板景点信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
