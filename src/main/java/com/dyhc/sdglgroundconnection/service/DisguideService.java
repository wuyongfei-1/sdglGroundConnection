package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disguide;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游业务接口
 **/
public interface DisguideService {
    /**
     * 根据导游id  和调度id获取  调度导游信息(lixiaojie)
     * @param guideId   导游id
     * @param offerId   调度id
     * @return
     */
    Disguide getDisGuideByOfferIdAndGuideId(Integer guideId,Integer offerId);

    /**
     * 根据调度表编号查询调度导游表信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度导游表对象
     */
    Disguide getDisguideByDispatchId(Integer dispatchId);

    /**
     * 添加调度导游信息（wuyongfei）
     *
     * @param disguide 调度导游对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisguideInfo(Disguide disguide) throws DispatchException;
    /**
     * 根据导游编号查询(yunguoaho)
     * @param disGuideId
     * @return
     */
    List<Disguide> selectdisGuideId(int disGuideId);


}
