package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Disline;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路业务接口
 **/
public interface DislineService {

    /**调度编号查询线路信息
     * 根据
     * @param dispathId
     * @return
     */
    List<Disline> dislineList(Integer dispathId) throws  Exception;
}
