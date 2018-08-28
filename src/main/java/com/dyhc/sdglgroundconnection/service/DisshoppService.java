package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disshopp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度购物业务接口
 **/
public interface DisshoppService {
    /**
     * 批量添加多条调度购物信息（wuyongfei）
     *
     * @param disshopp 调度购物列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisShopInfo(List<Disshopp> disshopp) throws DispatchException;
    /**
     * 根据调度表编号查询购物信息 （yunguohao）
     * @param dispatchId 调度表编号
     * @return 返回调度酒店对象
     */
    List<Disshopp> getDisshopp(Integer dispatchId) throws Exception;
}
