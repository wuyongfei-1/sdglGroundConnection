package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disattr;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点业务接口
 **/
public interface DisattrService {

    /**
     * 批量添加调度景点列表（wuyongfei）
     *
     * @param disattrList 调度景点列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisattrInfoes(List<Disattr> disattrList) throws DispatchException;
}
