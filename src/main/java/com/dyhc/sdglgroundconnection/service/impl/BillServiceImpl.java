package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.BillMapper;
import com.dyhc.sdglgroundconnection.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据业务实现
 **/
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

}
