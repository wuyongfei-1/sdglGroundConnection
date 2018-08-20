package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferotherMapper;
import com.dyhc.sdglgroundconnection.pojo.Offerother;
import com.dyhc.sdglgroundconnection.pojo.OfferotherExample;
import com.dyhc.sdglgroundconnection.service.OfferotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价其他业务实现
 **/
@Service
public class OfferotherServiceImpl implements OfferotherService {

    @Autowired
    private OfferotherMapper offerotherMapper;

    @Override
    public List<Offerother> listOfferotherByOfferId(Integer offerId) throws Exception {
        OfferotherExample offerhotelExample=new OfferotherExample();
        OfferotherExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerother> list=offerotherMapper.selectByExample(criteria);
        return list;
    }

    @Override
    public Integer insertOfferother(Offerother offerother) throws Exception {
        return offerotherMapper.insert(offerother);
    }

    @Override
    public Integer updateOfferother(Offerother offerother) throws Exception {
        return offerotherMapper.updateByPrimaryKey(offerother);
    }
}
