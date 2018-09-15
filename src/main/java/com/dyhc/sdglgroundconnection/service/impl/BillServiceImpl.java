package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.BillMapper;
import com.dyhc.sdglgroundconnection.pojo.Bill;
import com.dyhc.sdglgroundconnection.pojo.BillExample;
import com.dyhc.sdglgroundconnection.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据业务实现
 **/
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;
    /**
     *  根据调度团id和单据类型id获取单据信息（lixiaojie)
     * @param dispatchId
     * @param billTypeId
     * @return
     */
    @Override
    public List<Bill> selectBillByDispatchIdAndBillTypeId(Integer dispatchId, Integer billTypeId)throws Exception  {
        BillExample billExample=new BillExample();
        Bill bill=null;
        BillExample.Criteria billExampleCriteria=billExample.createCriteria();
        billExampleCriteria.andDispatchidEqualTo(dispatchId);
        billExampleCriteria.andBilltypeidEqualTo(billTypeId);
        List<Bill> bills=billMapper.selectByExample(billExample);//按条件查询票据表


        return bills;
    }

    /**
     * 上传凭证（yunguohao）
     * @param bill
     * @return
     */
    @Override
    public int insertBill(Bill bill) {
        return billMapper.insert(bill);
    }

    /**
     *调度id查询全部(yunguohao)
     * @param
     * @return
     */
    @Override
    public List<Bill> selectDispatchId(int dispatchId) {
        return billMapper.selectDispatchId(dispatchId);
    }

    /**
     * 单据表类型id查询(yunguohao)
     * @param
     * @return
     */
    @Override
    public List<Bill> selectbillTypeId(int billTypeId) {
        return billMapper.selectbillTypeId(billTypeId);
    }
    /**
     * id查询(yunguohao)
     * @param billId
     * @return
     */
    @Override
    public Bill selectBillById(int billId) {
        return billMapper.selectByPrimaryKey(billId);
    }


}
