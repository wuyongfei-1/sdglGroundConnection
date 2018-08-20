package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Offerline;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价线路信息记录业务接口
 **/
public interface OfferlineService {
    /**
     * 根据报价编号查询线路报价信息（dubingkun）
     * @param offerId
     * @return
     */
    List<Offerline> listOfferlineByOfferId(Integer offerId) throws Exception;

    /**
     * 添加报价线路信息（dubingkun）
     * @param offerline
     * @return
     */
    Integer insertOfferline (Offerline offerline)throws  Exception;

    /**
     * 修改报价线路信息（dubingkun）
     * @param offerline
     * @return
     * @throws Exception
     */
    Integer updateOfferline(Offerline offerline)throws Exception;
}
