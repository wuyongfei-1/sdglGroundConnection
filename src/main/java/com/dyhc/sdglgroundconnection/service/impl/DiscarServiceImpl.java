package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DiscarMapper;
import com.dyhc.sdglgroundconnection.pojo.Discar;
import com.dyhc.sdglgroundconnection.service.DiscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车业务实现
 **/
@Service
public class DiscarServiceImpl implements DiscarService {

    @Autowired
    private DiscarMapper discarMapper;

    /**
     * 添加调度用车信息（wuyongfei）
     *
     * @param discar 调度用车对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    public Integer saveDiscarInfo(Discar discar) throws DispatchException {
        return discarMapper.insert(discar);
    }
}
