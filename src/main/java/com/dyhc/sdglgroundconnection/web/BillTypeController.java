package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Bill;
import com.dyhc.sdglgroundconnection.pojo.BillType;
import com.dyhc.sdglgroundconnection.service.BillTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据类型 控制层
 **/
@RestController
@RequestMapping("/billType")
public class BillTypeController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(BillTypeController.class);

    @Autowired
    private BillTypeService billTypeService;

    /**
     * 查询所有单据类型(lixiaojie)
     * @return
     */
    @RequestMapping("/selectAllBillType")
    public ReponseResult selectAllBillType(){
        try {
            List<BillType> result=billTypeService.selectAllBillType();
            ReponseResult<List> date;
            if (result!=null){
                date= ReponseResult.ok(result,"查询所有单据类型成功");
                logger.info(" method:selectBillByDispatchIdAndBillTypeId  查询所有单据类型成功！");

            }else{
                date= ReponseResult.ok("根据调度团id和单据类型id获取单据信息失败！");
                logger.info(" method:selectBillByDispatchIdAndBillTypeId  查询所有单据类型失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectBillByDispatchIdAndBillTypeId  查询所有单据类型失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
