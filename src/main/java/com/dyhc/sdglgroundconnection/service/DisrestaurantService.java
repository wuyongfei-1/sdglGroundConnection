package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disrestaurant;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度餐厅业务接口
 **/
public interface DisrestaurantService {

    /**
     * 根据调度编号查询调度餐厅信息
     * @param offId 调度编号
     * @return 调度餐厅集合
     */
    List<Disrestaurant> listDisrestaurantByOffId(Integer offId)throws Exception;

    /**
     * 批量添加调度餐厅信息（wuyongfei）
     *
     * @param disrestaurantList 餐馆列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisrestaurantInfo(List<Disrestaurant> disrestaurantList) throws DispatchException;
}
