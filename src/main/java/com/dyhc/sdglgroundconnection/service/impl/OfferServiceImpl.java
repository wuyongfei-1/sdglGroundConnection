package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.mapper.OfferMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息业务实现
 **/
@Service
@Transactional
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferMapper offerMapper;

    @Autowired
    private OffercarService offercarService;
    @Autowired
    private OfferHotelService offerHotelService;
    @Autowired
    private OfferscenicService offerscenicService;
    @Autowired
    private OfferrestaurantService offerrestaurantService;
    @Autowired
    private OfferotherService offerotherService;
    @Autowired
    private OfferlineService offerlineService;

    @Override
    public Offer getOfferByOfferId(Integer offerId) throws OfferException {
        return offerMapper.selectByPrimaryKey(offerId);
    }

    @Override
    @Transactional
    @RecordOperation(type = "报价", desc = "添加了一条报价信息")
    public Integer insertOffer(OfferParam offerParam) throws OfferException {
        List<Offercar> listOffercar = offerParam.getListOffercar();//用车报价信息
        List<OfferHotel> listOfferHotel = offerParam.getListOfferHotel();//酒店报价信息
        List<Offerscenic> listOfferscenic = offerParam.getListOfferscenic();//景点报价信息
        List<Offerrestaurant> listOfferrestaurant = offerParam.getListOfferrestaurant();//餐厅报价信息
        List<Offerother> listOfferother = offerParam.getListOfferother();//其它报价信息
        List<Offerline> listOfferline = offerParam.getListOfferline();//线路报价信息

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(df.format(day));

        int a = offerMapper.insert(offerParam.getOffer());

        //用车
        if (listOffercar != null) {
            offercarService.insertOffercar(listOffercar);
        }
        //酒店
        if (listOfferHotel != null) {
            offerHotelService.insertOfferHotel(listOfferHotel);
        }
        //景点
        if (listOfferscenic != null) {
            offerscenicService.insertOfferscenic(listOfferscenic);
        }
        //餐馆
        if (listOfferrestaurant != null) {
            offerrestaurantService.insertOfferrestaurant(listOfferrestaurant);
        }
        //其它
        if (listOfferother != null) {
            offerotherService.insertOfferother(listOfferother);
        }
        //线路
        if (listOfferline != null) {
            offerlineService.insertOfferline(listOfferline);
        }


        return a;
    }

    @Override
    @RecordOperation(type = "报价", desc = "修改了一条报价信息")
    public Integer updateOffer(Offer offer) throws OfferException {
        return offerMapper.updateByPrimaryKey(offer);
    }
}
