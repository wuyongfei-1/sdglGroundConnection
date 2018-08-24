package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Dispatchtourgroup;

/**
 *  调度旅行团信息表
 */
public interface DispatchtourgroupServer {

    /**
     * 根据调度编号查询调度旅行团信息
     * @param offId 调度编号
     * @return 返回调度表对象
     */
    Dispatchtourgroup getDispatchtourgroupByOffId(Integer offId);
}
