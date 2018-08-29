package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.mapper.OffercarMapper;
import com.dyhc.sdglgroundconnection.pojo.Offercar;
import com.dyhc.sdglgroundconnection.pojo.OffercarExample;
import com.dyhc.sdglgroundconnection.service.OffercarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价用车业务实现
 **/
@Service
public class OffercarServiceImpl implements OffercarService {

    @Autowired
    private OffercarMapper offercarMapper;

    @Override
    public List<Offercar> listOffercarByOfferId(Integer offerId) throws OfferException {
        OffercarExample offercarExample=new OffercarExample();
        OffercarExample.Criteria criteria=offercarExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offercar> list=offercarMapper.selectByExample(offercarExample);
        return list;
    }

    @Override
    @RecordOperation(type = "用车报价", desc = "添加了一条用车报价信息")
    public Integer insertOffercar(Offercar offercar) throws OfferException {
        return offercarMapper.insert(offercar);
    }

    @Override
    @RecordOperation(type = "用车报价", desc = "修改了一条用车报价信息")
    public Integer updateOffercar(Offercar offercar) throws OfferException {
        return offercarMapper.updateByPrimaryKey(offercar);
    }

    @Override
    public Integer deleteOffercar(Integer id) throws OfferException {
        OffercarExample offercarExample=new OffercarExample();
        OffercarExample.Criteria criteria=offercarExample.createCriteria();
        criteria.andOfferidEqualTo(id);
        return offercarMapper.deleteByExample(offercarExample);
    }
}
