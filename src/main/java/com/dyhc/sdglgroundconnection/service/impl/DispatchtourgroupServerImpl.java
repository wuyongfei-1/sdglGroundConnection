package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DispatchtourgroupMapper;
import com.dyhc.sdglgroundconnection.service.DispatchtourgroupServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 调度旅行团信息表
 */

@Service
public class DispatchtourgroupServerImpl implements DispatchtourgroupServer {

    @Autowired
    private DispatchtourgroupMapper dispatchtourgroupMapper;
}
