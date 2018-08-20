package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DispatchhotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.service.DispatchhotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店业务实现
 **/
@Service
public class DispatchhotelServiceImpl implements DispatchhotelService {

    @Autowired
    private DispatchhotelMapper dispatchhotelMapper;

    /**
     * 批量添加多条调度酒店信息（wuyongfei）
     *
     * @param dispatchhotelList 调度酒店列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度酒店", desc = "添加了一条酒店信息")
    public Integer saveDispatchhotelInfo(List<Dispatchhotel> dispatchhotelList) throws DispatchException {
        return dispatchhotelMapper.insertList(dispatchhotelList);
    }
}
