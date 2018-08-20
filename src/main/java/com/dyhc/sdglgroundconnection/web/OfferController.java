package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.OfferService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价酒店 控制层
 **/
@RestController
@RequestMapping("/offer")
public class OfferController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(OfferController.class);

    @Autowired
    private OfferService offerService;



    @RequestMapping("/insertOffer")
    public ReponseResult insertOffer(@RequestBody OfferParam offerParam){

        try {
            ReponseResult<String> date=null;
            int result =offerService.insertOffer(offerParam);
            if (result>0){
                date= ReponseResult.ok("添加报价成功！");
                logger.info(" method:updateHotel  添加报价成功！");
            }else{
                date= ReponseResult.ok("添加报价失败！");
                logger.info(" method:updateHotel  添加报价失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateHotel  添加报价失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
