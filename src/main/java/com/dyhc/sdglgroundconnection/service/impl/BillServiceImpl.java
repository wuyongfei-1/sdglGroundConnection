package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.BillMapper;
import com.dyhc.sdglgroundconnection.pojo.Bill;
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
