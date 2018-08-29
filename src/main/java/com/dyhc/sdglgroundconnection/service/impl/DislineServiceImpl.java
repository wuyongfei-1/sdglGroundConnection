package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.DislineMapper;
import com.dyhc.sdglgroundconnection.pojo.Disline;
import com.dyhc.sdglgroundconnection.service.DislineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路信息业务实现
 **/
@Service
public class DislineServiceImpl implements DislineService {

    @Autowired
    private DislineMapper dislineMapper;

    /**
     * 批量添加多条调度线路信息（wuyongfei）
     *
     * @param dislines 调度信息列表
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "调度线路", desc = "批量添加了多条调度线路信息")
    public Integer saveDisLineInfo(List<Disline> dislines) throws Exception {
        return dislineMapper.insertList(dislines);
    }
}
