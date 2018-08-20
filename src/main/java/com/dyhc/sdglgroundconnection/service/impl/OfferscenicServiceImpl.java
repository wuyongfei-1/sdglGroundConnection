package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.OfferException;
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
    public List<Offerscenic> listOfferscenicByOfferId(Integer offerId) throws OfferException {
        OfferscenicExample offerhotelExample=new OfferscenicExample();
        OfferscenicExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerscenic> list=offerscenicMapper.selectByExample(criteria);
        return list;
    }

    @Override
    @RecordOperation(type = "景点报价", desc = "添加了一条景点报价信息")
    public Integer insertOfferscenic(Offerscenic offerscenic) throws OfferException {
        return offerscenicMapper.insert(offerscenic);
    }

    @Override
    @RecordOperation(type = "景点报价", desc = "修改了一条景点报价信息")
    public Integer updateOfferscenic(Offerscenic offerscenic) throws OfferException {
        return offerscenicMapper.updateByPrimaryKey(offerscenic);
    }
}
