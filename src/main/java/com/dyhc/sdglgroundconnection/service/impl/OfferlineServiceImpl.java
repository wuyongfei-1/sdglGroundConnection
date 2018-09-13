package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.mapper.OfferlineMapper;
import com.dyhc.sdglgroundconnection.pojo.Offer;
import com.dyhc.sdglgroundconnection.pojo.Offerline;
import com.dyhc.sdglgroundconnection.pojo.OfferlineExample;
import com.dyhc.sdglgroundconnection.service.OfferlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public List<Offerline> listOfferlineByOfferId(Integer offerId) throws OfferException {
        OfferlineExample offerhotelExample=new OfferlineExample();
        OfferlineExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        List<Offerline> list=offerlineMapper.selectByExample(offerhotelExample);
        return list;
    }

    @Override
    @RecordOperation(type = "线路报价", desc = "添加了一条用线路价信息")
    public Integer insertOfferline(List<Offerline> list) throws OfferException {
        return offerlineMapper.insertList(list);
    }

    @Override
    @RecordOperation(type = "线路报价", desc = "添加了一条线路报价信息")
    public Integer updateOfferline(Offerline offerline) throws OfferException {
        return offerlineMapper.updateByPrimaryKey(offerline);
    }

    @Override
    public Integer deleteOfferline(Integer id) throws OfferException {
        OfferlineExample offerhotelExample=new OfferlineExample();
        OfferlineExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(id);
        return offerlineMapper.deleteByExample(offerhotelExample);
    }

    @Override
    public String getOfferline(Integer id) throws OfferException {
        OfferlineExample offerhotelExample=new OfferlineExample();
        OfferlineExample.Criteria criteria=offerhotelExample.createCriteria();
        criteria.andOfferidEqualTo(id);
        List<Offerline> list=offerlineMapper.selectByExample(offerhotelExample);
        List intlist=new ArrayList();
        for (Offerline item :
                list) {
            intlist.add(item.getWeight());
        }
        Collections.sort(intlist);
        Offerline offerline=null;
        for (Offerline item :
                list) {
            if(item.getWeight()==intlist.get(intlist.size()-1)){
                offerline=item;
            }
        }
        String mudidi="";
        if(offerline!=null){
            mudidi=offerline.getLineArriveName();
            mudidi.substring(mudidi.indexOf("-"));
        }
        return mudidi;
    }
}
