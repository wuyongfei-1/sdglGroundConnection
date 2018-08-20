package com.dyhc.sdglgroundconnection.service;

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
     * 根据报价编号查询餐厅报价信息（dubingkun）
     * @param offerId
     * @return
     */
    List<Offerscenic> listOfferscenicByOfferId(Integer offerId) throws Exception;

    /**
     * 添加餐厅报价信息（dubingkun）
     * @param offerscenic
     * @return
     */
    Integer insertOfferscenic (Offerscenic offerscenic)throws  Exception;

    /**
     * 修改餐厅报价信息（dubingkun）
     * @param offerscenic
     * @return
     * @throws Exception
     */
    Integer updateOfferscenic(Offerscenic offerscenic)throws Exception;
}
   
