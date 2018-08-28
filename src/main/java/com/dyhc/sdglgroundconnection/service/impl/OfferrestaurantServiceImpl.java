package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.mapper.OfferrestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Offerrestaurant;
import com.dyhc.sdglgroundconnection.pojo.OfferrestaurantExample;
import com.dyhc.sdglgroundconnection.service.OfferrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价餐厅业务实现
 **/
@Service
public class OfferrestaurantServiceImpl implements OfferrestaurantService {

    @Autowired
    private OfferrestaurantMapper offerrestaurantMapper;

    @Override
    public List<Offerrestaurant> listOfferrestaurantByOfferId(Integer offerId) throws OfferException {
        OfferrestaurantExample offerhotelExample=new OfferrestaurantExample();
        OfferrestaurantExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerrestaurant> list=offerrestaurantMapper.selectByExample(offerhotelExample);
        return list;
    }

    @Override
    @RecordOperation(type = "餐馆报价", desc = "添加了一条餐馆报价信息")
    public Integer insertOfferrestaurant(List<Offerrestaurant> list) throws OfferException {
        return offerrestaurantMapper.insertList(list);
    }

    @Override
    @RecordOperation(type = "餐馆报价", desc = "修改了一条餐馆报价信息")
    public Integer updateOfferrestaurant(Offerrestaurant offerrestaurant) throws OfferException {
        return offerrestaurantMapper.updateByPrimaryKey(offerrestaurant);
    }

    @Override
    public Integer deleteOfferrestaurant(Integer id) throws OfferException {
        OfferrestaurantExample offerhotelExample=new OfferrestaurantExample();
        OfferrestaurantExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(id);
        return offerrestaurantMapper.deleteByExample(offerhotelExample);
    }
}
