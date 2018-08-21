package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据
 **/
@Mapper
@Component
public interface BillMapper extends CommonMapper<Bill>{

    /**
     *调度id查询全部
     * @param
     * @return
     */
    List<Bill> selectDispatchId(int dispatchId);

    /**
     * 单据表类型id查询
     * @param
     * @return
     */
    List<Bill> selectbillTypeId(int billTypeId);
}
