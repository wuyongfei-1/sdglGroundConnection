package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.DispatchtourgroupMapper;
import com.dyhc.sdglgroundconnection.pojo.Dispatchtourgroup;
import com.dyhc.sdglgroundconnection.pojo.DispatchtourgroupExample;
import com.dyhc.sdglgroundconnection.service.DispatchtourgroupServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 调度旅行团信息表
 */

@Service
public class DispatchtourgroupServerImpl implements DispatchtourgroupServer {

    @Autowired
    private DispatchtourgroupMapper dispatchtourgroupMapper;

    /**
     * 根据调度编号查询调度旅行团信息
     *
     * @param offId 调度编号
     * @return 返回调度表对象
     */
    @Override
    public Dispatchtourgroup getDispatchtourgroupByOffId(Integer offId) {
        DispatchtourgroupExample dispatchtourgroupExample = new DispatchtourgroupExample();
        DispatchtourgroupExample.Criteria criteria = dispatchtourgroupExample.createCriteria();
        criteria.andOfferidEqualTo(offId);
        List<Dispatchtourgroup> dispatchtourgroupList = dispatchtourgroupMapper.selectByExample(dispatchtourgroupExample);
        Dispatchtourgroup dispatchtourgroup = null;
        if (dispatchtourgroupList != null && dispatchtourgroupList.size() != 0) {
            dispatchtourgroup = dispatchtourgroupList.get(0);
        }
        return dispatchtourgroup;
    }

    /**
     * 添加一条调度旅行社信息（wuyongfei）
     *
     * @param dispatchtourgroup 调度旅行社对象
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "调度旅行社", desc = "添加了一条调度线路信息")
    public Integer saveDispatchtourgroupInfo(Dispatchtourgroup dispatchtourgroup) throws Exception {
        return dispatchtourgroupMapper.insert(dispatchtourgroup);
    }
}
