package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Offer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息
 **/
@Mapper
@Component
public interface OfferMapper extends CommonMapper<Offer>{
    /**
     * 查询最大的offerId
     */
    public Integer getIntegerByOfferId();

    /**
     * 根据id修改报价单状态（dubingkun）
     * @param value1
     * @return
     */
    public Integer updateOfferByOfferId(@Param("id") Integer offerId, @Param("value1") String value1);
}
