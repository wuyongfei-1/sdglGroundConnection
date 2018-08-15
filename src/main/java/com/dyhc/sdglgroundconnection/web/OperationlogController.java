package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.dyhc.sdglgroundconnection.service.OperationlogService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志 控制层
 **/
@RestController
public class OperationlogController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(OperationlogController.class);

    @Autowired
    private OperationlogService operationlogService;

   /* *//**
     * 为每角色的每一个操作添加日志记录（wyf）
     *
     * @return
     *//*
    @RequestMapping("/addOperation.html")
    public ReponseResult addOperationLog() {
        Operationlog operationlog = new Operationlog();
        try {
            Integer result = operationlogService.addOperationLog(operationlog);
            ReponseResult<String> reponseResult = ReponseResult.ok("{\"status\":" + result + "}", "添加成功");
            logger.info("method:addOperationLog  添加日志成功！");
            return reponseResult;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("method:addOperationLog  添加日志失败！");
            return ReponseResult.err("系统出现异常！");
        }
    }*/
}
