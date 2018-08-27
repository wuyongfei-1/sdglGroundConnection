package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisshoppMapper;
import com.dyhc.sdglgroundconnection.pojo.Disattr;
import com.dyhc.sdglgroundconnection.pojo.DisattrExample;
import com.dyhc.sdglgroundconnection.pojo.Disshopp;
import com.dyhc.sdglgroundconnection.pojo.DisshoppExample;
import com.dyhc.sdglgroundconnection.service.DisshoppService;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度购物业务实现
 **/
@Service
public class DisshoppServiceImpl implements DisshoppService {

    @Autowired
    private DisshoppMapper disshoppMapper;

    @Autowired
    private ShoppingService shoppingService;
    /**
     * 添加一条调度购物信息（wuyongfei）
     *
     * @param disshopp 调度购物对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度购物", desc = "批量添加了多条调度购物信息")
    public Integer saveDisShopInfo(List<Disshopp> disshopp) throws DispatchException {
        return disshoppMapper.insertList(disshopp);
    }

    @Override
    public List<Disshopp> getDisshopp(Integer dispatchId) throws Exception {
        DisshoppExample disshoppExample=new DisshoppExample();
        DisshoppExample.Criteria criteria=disshoppExample.createCriteria();
        criteria.andCreatebyEqualTo(dispatchId);
        List<Disshopp> disshoppList=disshoppMapper.selectByExample(disshoppExample);
        for(Disshopp disshopp:disshoppList){
           disshopp.setShopping(shoppingService.getShoppingById(disshopp.getShoppingId()));
        }
        return disshoppList;
    }
}
