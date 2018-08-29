package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Disline;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路业务接口
 **/
public interface DislineService {
    /**
     * 批量添加多条调度线路信息（wuyongfei）
     *
     * @param dislines 调度信息列表
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer saveDisLineInfo(List<Disline> dislines) throws Exception;
}
