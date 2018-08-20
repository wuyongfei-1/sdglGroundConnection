package com.dyhc.sdglgroundconnection.service;


import com.dyhc.sdglgroundconnection.pojo.Offer;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息业务接口
 **/
public interface OfferService {
    /**
     * 根据报价编号查询报价信息（dubingkun）
     * @param offerId
     * @return
     */
    Offer getOfferByOfferId(Integer offerId) throws Exception;

    /**
     * 添加报价信息（dubingkun）
     * @param offer
     * @return
     */
    Integer insertOffer (Offer offer)throws  Exception;

    /**
     * 修改报价信息（dubingkun）
     * @param offer
     * @return
     * @throws Exception
     */
    Integer updateOffer(Offer offer)throws Exception;
}
