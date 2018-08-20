package com.dyhc.sdglgroundconnection.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.OfferService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 获取报价详细信息（wuyongfei）
     *
     * @param offerId 报价编号
     * @return 响应结果
     */
    @GetMapping("/offer/detail/{id}.html")
    public ReponseResult getOfferInfoById(@PathVariable("id") Integer offerId) {
        try {
            Offer offer = offerService.getOfferByOfferId(offerId);
            logger.info(" method:getOfferInfoById  根据编号获取报价信息成功！");
            return ReponseResult.ok(offer, "获取报价信息成功！");
        } catch (OfferException e) {
            logger.error(" method:getOfferInfoById  根据编号获取报价信息失败！");
            e.printStackTrace();
            return ReponseResult.err("获取报价信息失败！");
        }
    }


    @RequestMapping("/insertOffer")
    public ReponseResult insertOffer(@RequestBody JSONObject jsonObject){
        try {
            String s = JSON.toJSONString(jsonObject);
            ObjectMapper objectMapper = new ObjectMapper();
            OfferParam offerParam = objectMapper.readValue(s, OfferParam.class);
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
