package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.OperationlogMapper;
import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.dyhc.sdglgroundconnection.service.OperationlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志业务实现
 **/
@Service
public class OperationlogServiceImpl implements OperationlogService {

    @Autowired
    private OperationlogMapper operationlogMapper;

    /**
     * 为每一个操作添加日志（wuyongfei）
     *
     * @param operationlog
     * @return
     * @throws Exception
     */
    @Override
    public Integer addOperationLog(Operationlog operationlog) throws Exception {
        System.out.println("进入了service方法");
        return operationlogMapper.insert(operationlog);
    }
}
