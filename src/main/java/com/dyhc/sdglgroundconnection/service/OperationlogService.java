package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志业务接口
 **/
public interface OperationlogService {

    /**
     * 为每一个操作添加日志（wuyongfei）
     *
     * @param operationlog
     * @return
     * @throws Exception
     */
    Integer addOperationLog(Operationlog operationlog) throws Exception;
}
