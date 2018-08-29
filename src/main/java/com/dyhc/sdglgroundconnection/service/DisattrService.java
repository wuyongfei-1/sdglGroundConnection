package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disattr;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点业务接口
 **/
public interface DisattrService {

    /**
     * 根据调度编号查询调度景点信息
     * @param offerId 调度编号
     * @return 调度景点集合
     */
    List<Disattr> listDisattrByOffId(Integer offerId)throws Exception;

    /**
     * 根据调度编号查询调度景点信息
     * @param dispathId 调度编号
     * @return 调度景点集合
     */
    List<Disattr> listDisattrBydispathId(Integer dispathId)throws Exception;

    /**
     * 批量添加调度景点列表（wuyongfei）
     *
     * @param disattrList 调度景点列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisattrInfoes(List<Disattr> disattrList) throws DispatchException;
}
