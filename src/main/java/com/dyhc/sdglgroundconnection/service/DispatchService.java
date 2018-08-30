package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.*;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.github.pagehelper.PageInfo;

import java.text.ParseException;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度业务接口
 **/
public interface DispatchService {

    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     * @param dispathId 调度编号
     * @return
     */
    TravelPathParam getTravelPathParam(Integer dispathId) throws  Exception;

    /**
     * 微信根据导游id查询行程的信息（yunguohao）
     * @param guideId 导游id
     * @return
     * @throws Exception
     */
    GuideRouteParam getGuideRouteParam(Integer guideId) throws Exception;
    /**
     * 获取派团单信息根据调度编号 （wangtao）
     * @param dispatchId 调度编号
     * @return 返回派团单参数对象
     * @throws Exception
     */
    MissionParam getMissionParam(Integer dispatchId)throws Exception;

    /**
     * 根据调度编号查询调度信息 （wangtao）
     *
     * @param dispatchId 调度编号
     * @return 返回调度表信息对象
     */
    Dispatch getDispatchInfoByDispatchInfoId(Integer dispatchId) throws Exception;

    /**
     * 添加一条调度信息（wuyongfei）
     *
     * @param disParam 调度参数对象
     * @return 受影响行数
     * @throws DispatchException 调度信息异常
     */
    Integer saveDispatchInfo(DispatchParam disParam) throws DispatchException;

    /**
     * 查询所有未审核且删除状态为1的调度信息 (lixiaojie)
     * 1表示未审核
     *
     * @return
     */
    PageInfo<Dispatch> selectDispatchs(Integer pageNo, Integer pageSize);

    /**
     * 总控审核通过（lixiaojie)
     *
     * @return
     */
    Integer onCheckDispatchInfo(Integer dispatchId,int staffId) throws ParseException;

    /**
     * 总控审核不通过(lixiaojie)
     *
     * @return
     */
    Integer noCheckDispatchInfo(Integer dispatchId);

}
