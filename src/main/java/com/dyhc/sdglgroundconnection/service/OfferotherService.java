package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.Offerother;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价其他业务接口
 **/
public interface OfferotherService {
    /**
     * 根据报价编号查询其它报价信息（dubingkun）
     * @param offerId
     * @return
     */
    List<Offerother> listOfferotherByOfferId(Integer offerId) throws OfferException;

    /**
     * 添加其它报价信息（dubingkun）
     * @param offerother
     * @return
     */
    Integer insertOfferother (Offerother offerother)throws  OfferException;

    /**
     * 修改其它报价信息（dubingkun）
     * @param offerother
     * @return
     * @throws Exception
     */
    Integer updateOfferother(Offerother offerother)throws OfferException;
}
