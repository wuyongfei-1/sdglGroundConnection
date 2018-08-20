package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisrestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Disrestaurant;
import com.dyhc.sdglgroundconnection.service.DisrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度餐厅业务实现
 **/
@Service
public class DisrestaurantServiceImpl implements DisrestaurantService {

    @Autowired
    private DisrestaurantMapper disrestaurantMapper;

    /**
     * 批量添加多条调度餐馆对象信息（wuyongfei）
     *
     * @param disrestaurantList 餐馆列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度餐馆", desc = "批量添加了多条餐馆信息")
    public Integer saveDisrestaurantInfo(List<Disrestaurant> disrestaurantList) throws DispatchException {
        return disrestaurantMapper.insertList(disrestaurantList);
    }
}
