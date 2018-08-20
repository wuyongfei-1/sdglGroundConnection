package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Discar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车业务接口
 **/
public interface DiscarService {

    /**
     * 添加调度用车信息（wuyongfei）
     *
     * @param discar 调度用车对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDiscarInfo(Discar discar) throws DispatchException;
}
