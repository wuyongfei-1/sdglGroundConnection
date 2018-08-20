package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Offercar;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价用车业务接口
 **/
public interface OffercarService {
    /**
     * 根据报价编号查询相应的报价汽车信息（dubingkun）
     * @param offerId 报价编号
     * @return
     * @throws Exception
     */
    List<Offercar> listOffercarByOfferId(Integer offerId)throws Exception;

    /**
     * 添加报价汽车信息（dubingkun）
     * @param offercar
     * @return
     */
    Integer insertOffercar (Offercar offercar)throws  Exception;

    /**
     * 修改报价汽车信息（dubingkun）
     * @param offercar
     * @return
     * @throws Exception
     */
    Integer updateOffercar(Offercar offercar)throws Exception;
}
