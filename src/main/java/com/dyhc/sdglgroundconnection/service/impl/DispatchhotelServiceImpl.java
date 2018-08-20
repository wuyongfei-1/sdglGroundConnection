package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DispatchhotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.service.DispatchhotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店业务实现
 **/
@Service
public class DispatchhotelServiceImpl implements DispatchhotelService {

    @Autowired
    private DispatchhotelMapper dispatchhotelMapper;

    /**
     * 添加调度酒店信息（wuyongfei）
     *
     * @param dispatchhotel 调度酒店对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度酒店", desc = "添加了一条酒店信息")
    public Integer saveDispatchhotelInfo(Dispatchhotel dispatchhotel) throws DispatchException {
        return dispatchhotelMapper.insert(dispatchhotel);
    }
}
