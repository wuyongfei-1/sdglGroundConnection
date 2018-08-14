package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.BillTypeMapper;
import com.dyhc.sdglgroundconnection.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据类型业务实现
 **/
@Service
public class BillTypeServiceImpl implements BillTypeService {

    @Autowired
    private BillTypeMapper billTypeMapper;
}
