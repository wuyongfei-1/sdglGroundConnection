package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据业务接口
 **/
public interface BillService {
    /**
     *  根据调度团id和单据类型id获取单据信息（lixiaojie)
     * @param dispatchId
     * @param billTypeId
     * @return
     */
    Bill selectBillByDispatchIdAndBillTypeId(Integer dispatchId,Integer billTypeId);

    /**
     * 添加上传凭证(yunguohao)
     * @param bill
     * @return
     */
    int insertBill(Bill bill) throws Exception;
    /**
     *调度id查询全部(yunguohao)
     * @param
     * @return
     */
    List<Bill> selectDispatchId(int dispatchId);

    /**
     * 单据表类型id查询(yunguohao)
     * @param
     * @return
     */
    List<Bill> selectbillTypeId(int billTypeId);
    /**
     * id查询(yunguohao)
     * @param billId
     * @return
     */
    Bill selectBillById(int billId);
}
