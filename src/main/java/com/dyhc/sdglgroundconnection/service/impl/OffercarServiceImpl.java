package com.dyhc.sdglgroundconnection.service.impl;

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
    public List<Offercar> listOffercarByOfferId(Integer offerId) throws Exception {
        OffercarExample offercarExample=new OffercarExample();
        OffercarExample.Criteria criteria=offercarExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offercar> list=offercarMapper.selectByExample(offercarExample);
        return list;
    }

    @Override
    public Integer insertOffercar(Offercar offercar) throws Exception {
        return offercarMapper.insert(offercar);
    }

    @Override
    public Integer updateOffercar(Offercar offercar) throws Exception {
        return offercarMapper.updateByPrimaryKey(offercar);
    }
}
