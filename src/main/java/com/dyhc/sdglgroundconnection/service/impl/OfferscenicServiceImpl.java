package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferscenicMapper;
import com.dyhc.sdglgroundconnection.pojo.Offerscenic;
import com.dyhc.sdglgroundconnection.pojo.OfferscenicExample;
import com.dyhc.sdglgroundconnection.service.OfferscenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价景点业务实现
 **/
@Service
public class OfferscenicServiceImpl implements OfferscenicService {

    @Autowired
    private OfferscenicMapper offerscenicMapper;

    @Override
    public List<Offerscenic> listOfferscenicByOfferId(Integer offerId) throws Exception {
        OfferscenicExample offerhotelExample=new OfferscenicExample();
        OfferscenicExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerscenic> list=offerscenicMapper.selectByExample(criteria);
        return null;
    }

    @Override
    public Integer insertOfferscenic(Offerscenic offerscenic) throws Exception {
        return offerscenicMapper.insert(offerscenic);
    }

    @Override
    public Integer updateOfferscenic(Offerscenic offerscenic) throws Exception {
        return offerscenicMapper.updateByPrimaryKey(offerscenic);
    }
}
