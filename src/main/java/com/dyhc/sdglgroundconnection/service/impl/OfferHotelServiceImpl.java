package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.OfferHotelMapper;
import com.dyhc.sdglgroundconnection.pojo.OfferHotel;
import com.dyhc.sdglgroundconnection.pojo.OfferhotelExample;
import com.dyhc.sdglgroundconnection.service.OfferHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价酒店业务实现
 **/
@Service
public class OfferHotelServiceImpl implements OfferHotelService {

    @Autowired
    private OfferHotelMapper offerHotelMapper;

    @Override
    public List<OfferHotel> listOfferHotelByOfferId(Integer offerId) throws Exception {
        OfferhotelExample offerhotelExample=new OfferhotelExample();
        OfferhotelExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<OfferHotel> list=offerHotelMapper.selectByExample(criteria);
        return list;
    }

    @Override
    public Integer insertOfferHotel(OfferHotel offerHotel) throws Exception {
        return offerHotelMapper.insert(offerHotel);
    }

    @Override
    public Integer updateOfferHotel(OfferHotel offerHotel) throws Exception {
        return offerHotelMapper.updateByPrimaryKey(offerHotel);
    }
}
