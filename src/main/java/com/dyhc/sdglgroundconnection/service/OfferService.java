package com.dyhc.sdglgroundconnection.service;


import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.Offer;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息业务接口
 **/
public interface OfferService {
    /**
     * 根据报价编号查询报价信息（dubingkun）
     *
     * @param offerId
     * @return
     */
    Offer getOfferByOfferId(Integer offerId) throws OfferException, Exception;

    /**
     * 添加报价信息（dubingkun）
     *
     * @param offerParam
     * @return
     */
    Integer insertOffer(Staff staff, OfferParam offerParam) throws OfferException;

    /**
     * 修改报价信息（dubingkun）
     *
     * @param offer
     * @return
     * @throws Exception
     */
    Integer updateOffer(Offer offer) throws OfferException;
    /**
     * 查询最大的offerId（dubingkun）
     */
    Integer getIntegerByOfferId();

    /**
     * 分页获取所有报价信息以及线路详情（dubingkun）
     * @return
     */
    PageInfo<Offer> listOffer(Integer pageNo, Integer PageSize)throws Exception;

    /**
     * 根据id删除报价信息（dubingkun）
     * @param id
     * @return
     * @throws Exception
     */
    Integer deleteOffer(Integer id)throws Exception;

    /**
     * 根据id修改报价单状态（dubingkun）
     * @param id
     * @param value1
     * @return
     * @throws Exception
     */
    Integer updateOfferValue1(Integer id,String value1)throws Exception;
}
