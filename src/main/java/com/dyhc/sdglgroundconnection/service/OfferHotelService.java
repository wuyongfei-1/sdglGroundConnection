package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Offer;
import com.dyhc.sdglgroundconnection.pojo.OfferHotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价酒店业务接口
 **/
public interface OfferHotelService {
    /**
     * 根据报价编号查询酒店报价信息（dubingkun）
     * @param offerId
     * @return
     * @throws Exception
     */
    List<OfferHotel> listOfferHotelByOfferId(Integer offerId)throws Exception;

    /**
     * 新增酒店报价信息（dubingkun）
     * @param offerHotel
     * @return
     * @throws Exception
     */
    Integer insertOfferHotel(OfferHotel offerHotel)throws Exception;

    /**
     * 修改酒店报价信息（dubingkun）
     * @param offerHotel
     * @return
     * @throws Exception
     */
    Integer updateOfferHotel(OfferHotel offerHotel)throws Exception;
}
