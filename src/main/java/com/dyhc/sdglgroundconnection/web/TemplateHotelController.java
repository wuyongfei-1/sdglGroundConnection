package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.TemplateHotelService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板酒店 控制层
 **/
@RestController
@RequestMapping("/templateHotel")
public class TemplateHotelController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(TemplateHotelController.class);

    @Autowired
    private TemplateHotelService templateHotelService;

    /**
     * 根据模板酒店编号删除模板酒店信息
     * @param templateHotelId 返回模板酒店编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/deleteTemplateHotelById")
    public ReponseResult deleteTemplateHotelById(@RequestParam("templateHotelId")Integer templateHotelId){
        try {
            ReponseResult<Integer> data=null;
            //一、修改模板信息
            Integer result = templateHotelService.deleteTemplateHotelByTemplateHotelId(templateHotelId);
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板酒店信息成功！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateHotelById  删除模板酒店信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板酒店信息失败！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateHotelById  删除模板酒店信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteTemplateHotelById  删除模板酒店信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
