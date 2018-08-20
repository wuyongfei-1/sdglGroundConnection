package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisattrMapper;
import com.dyhc.sdglgroundconnection.pojo.Disattr;
import com.dyhc.sdglgroundconnection.service.DisattrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点业务实现
 **/
@Service
public class DisattrServiceImpl implements DisattrService {

    @Autowired
    private DisattrMapper disattrMapper;

    /**
     * 批量添加调度景点列表（wuyongfei）
     *
     * @param disattrList 调度景点列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    public Integer saveDisattrInfoes(List<Disattr> disattrList) throws DispatchException {
        return disattrMapper.insertList(disattrList);
    }
}
