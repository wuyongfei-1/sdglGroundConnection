package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.Offerscenic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价景点业务接口
 **/
public interface OfferscenicService {
    /**
     * 根据报价编号查询景点报价信息（dubingkun）
     * @param offerId
     * @return
     */
    List<Offerscenic> listOfferscenicByOfferId(Integer offerId) throws OfferException;

    /**
     * 添加景点报价信息（dubingkun）
     * @param list
     * @return
     */
    Integer insertOfferscenic (List<Offerscenic> list)throws  OfferException;

    /**
     * 修改景点报价信息（dubingkun）
     * @param offerscenic
     * @return
     * @throws Exception
     */
    Integer updateOfferscenic(Offerscenic offerscenic)throws OfferException;
}
   
