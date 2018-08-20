package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.OfferException;
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
    public List<OfferHotel> listOfferHotelByOfferId(Integer offerId) throws OfferException {
        OfferhotelExample offerhotelExample=new OfferhotelExample();
        OfferhotelExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<OfferHotel> list=offerHotelMapper.selectByExample(offerhotelExample);
        return list;
    }

    @Override
    @RecordOperation(type = "酒店报价", desc = "添加了一条酒店报价信息")
    public Integer insertOfferHotel(List<OfferHotel> list) throws OfferException {
        return offerHotelMapper.insertList(list);
    }

    @Override
    @RecordOperation(type = "酒店报价", desc = "修改了一条酒店报价信息")
    public Integer updateOfferHotel(OfferHotel offerHotel) throws OfferException {
        return offerHotelMapper.updateByPrimaryKey(offerHotel);
    }
}
