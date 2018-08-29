package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.BillType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据类型业务接口
 **/
public interface BillTypeService {
    /**
     * 查询所有单据类型(lixiaojie)
     * @return
     */
    List<BillType> selectAllBillType();
}
