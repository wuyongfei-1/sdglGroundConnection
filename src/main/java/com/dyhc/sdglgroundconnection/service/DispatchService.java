package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.DisParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度业务接口
 **/
public interface DispatchService {

    /**
     * 添加一条调度信息（wuyongfei）
     *
     * @param disParam 调度参数对象
     * @return 受影响行数
     * @throws DispatchException 调度信息异常
     */
    Integer saveDispatchInfo(DisParam disParam) throws DispatchException;
}
