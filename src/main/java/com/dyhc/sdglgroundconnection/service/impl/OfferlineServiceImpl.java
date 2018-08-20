package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferlineMapper;
import com.dyhc.sdglgroundconnection.pojo.Offerline;
import com.dyhc.sdglgroundconnection.pojo.OfferlineExample;
import com.dyhc.sdglgroundconnection.service.OfferlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价线路信息记录业务实现
 **/
@Service
public class OfferlineServiceImpl implements OfferlineService {

    @Autowired
    private OfferlineMapper offerlineMapper;

    @Override
    public List<Offerline> listOfferlineByOfferId(Integer offerId) throws Exception {
        OfferlineExample offerhotelExample=new OfferlineExample();
        OfferlineExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerline> list=offerlineMapper.selectByExample(criteria);
        return list;
    }

    @Override
    public Integer insertOfferline(Offerline offerline) throws Exception {
        return offerlineMapper.insert(offerline);
    }

    @Override
    public Integer updateOfferline(Offerline offerline) throws Exception {
        return offerlineMapper.updateByPrimaryKey(offerline);
    }
}
