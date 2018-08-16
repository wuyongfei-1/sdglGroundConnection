package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.github.pagehelper.PageInfo;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志业务接口
 **/
public interface OperationlogService {

    /**
     * 为每一个操作添加日志（wuyongfei）
     *
     * @param operationlog 日志对象
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer addOperationLog(Operationlog operationlog) throws Exception;


    /**
     * 根据条件查询操作日志的信息（wuyongfei）
     *
     * @param conditions 条件
     * @return 查询到的日志列表
     * @throws Exception 全局异常
     */
    PageInfo<Operationlog> listOperationLogsByConditions(Map<String, Object> conditions) throws Exception;
}
