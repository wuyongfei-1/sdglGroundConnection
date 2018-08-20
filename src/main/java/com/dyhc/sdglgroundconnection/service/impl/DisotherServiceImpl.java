package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisotherMapper;
import com.dyhc.sdglgroundconnection.pojo.Disother;
import com.dyhc.sdglgroundconnection.service.DisotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度其他业务实现
 **/
@Service
public class DisotherServiceImpl implements DisotherService {

    @Autowired
    private DisotherMapper disotherMapper;

    /**
     * 添加调度的其他信息
     *
     * @param disother 调度其他信息对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度其他", desc = "添加了一条调度其他的信息")
    public Integer saveDisotherInfo(Disother disother) throws DispatchException {
        return disotherMapper.insert(disother);
    }
}
