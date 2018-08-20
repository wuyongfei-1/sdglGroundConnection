package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店业务接口
 **/
public interface DispatchhotelService {

    /**
     * 批量添加多条调度酒店信息（wuyongfei）
     *
     * @param dispatchhotelList 调度酒店列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDispatchhotelInfo(List<Dispatchhotel> dispatchhotelList) throws DispatchException;
}
