package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.DispatchParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DispatchMapper;
import com.dyhc.sdglgroundconnection.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度业务实现
 **/
@Service
@Transactional
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    private DispatchMapper dispatchMapper;  // 调度持久化

    @Autowired
    private DisshoppService disshoppService; // 调度购物业务

    @Autowired
    private DisrestaurantService disrestaurantService; // 调度餐馆业务

    @Autowired
    private DispatchhotelService dispatchhotelService; // 调度酒店业务

    @Autowired
    private DisotherService disotherService; // 调度其他业务

    @Autowired
    private DisguideService disguideService; // 调度导游业务

    @Autowired
    private DiscarService discarService; // 调度用车业务

    @Autowired
    private DisattrService disattrService; // 调度景点业务


    /**
     * 保存一条调度信息（wuyongfei）
     * （保存该调度下的购物、餐馆、酒店、导游、用车、景点、调度、其他）
     *
     * @param disParam 调度信息参数对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @Transactional
    @RecordOperation(type = "调度信息", desc = "添加了一条调度信息")
    public Integer saveDispatchInfo(DispatchParam disParam) throws DispatchException {
        // 添加购物信息
        disshoppService.saveDisShopInfo(disParam.getDisshoppList());
        // 添加餐馆信息
        disrestaurantService.saveDisrestaurantInfo(disParam.getDisrestaurantList());
        // 添加酒店信息
        dispatchhotelService.saveDispatchhotelInfo(disParam.getDispatchhotelList());
        // 添加导游信息
        disguideService.saveDisguideInfo(disParam.getDisguide());
        // 添加用车信息
        discarService.saveDiscarInfo(disParam.getDiscar());
        // 添加景点信息
        disattrService.saveDisattrInfoes(disParam.getDisattrList());
        // 添加其他信息
        disotherService.saveDisotherInfo(disParam.getDisother());
        // 添加调度信息
        return dispatchMapper.insert(disParam.getDispatch());
    }
}
