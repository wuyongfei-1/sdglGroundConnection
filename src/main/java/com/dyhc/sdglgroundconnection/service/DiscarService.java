package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Discar;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车业务接口
 **/
public interface DiscarService {

    /**
     * 根据调度编号获取调度用车信息
     * @param offId 调度编号
     * @return 返回调度用车对象
     */
    Discar getDiscarByOffId(Integer offId) throws Exception;

    /**
     * 添加调度用车信息（wuyongfei）
     *
     * @param discar 调度用车对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDiscarInfo(Discar discar) throws DispatchException;
}
