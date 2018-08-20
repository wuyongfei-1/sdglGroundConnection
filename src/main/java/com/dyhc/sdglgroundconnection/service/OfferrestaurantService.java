package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.Offerrestaurant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价餐厅业务接口
 **/
public interface OfferrestaurantService {
    /**
     * 根据报价编号查询餐厅报价信息（dubingkun）
     * @param offerId
     * @return
     */
    List<Offerrestaurant> listOfferrestaurantByOfferId(Integer offerId) throws OfferException;

    /**
     * 添加餐厅报价信息（dubingkun）
     * @param list
     * @return
     */
    Integer insertOfferrestaurant (List<Offerrestaurant> list)throws  OfferException;

    /**
     * 修改餐厅报价信息（dubingkun）
     * @param offerrestaurant
     * @return
     * @throws Exception
     */
    Integer updateOfferrestaurant(Offerrestaurant offerrestaurant)throws OfferException;
}
