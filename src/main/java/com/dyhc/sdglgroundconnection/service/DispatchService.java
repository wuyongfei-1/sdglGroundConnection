package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.*;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.github.pagehelper.PageInfo;

import java.text.ParseException;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度业务接口
 **/
public interface DispatchService {

    /**
     * 分页查询所有的调度信息（wuyongfei）
     *
     * @param pageNo   当前页码
     * @param pageSize 总记录数
     * @return
     * @throws Exception 全局异常
     */
    PageInfo<Dispatch> listDispatchesInfo(Integer pageNo, Integer pageSize) throws Exception;

    /**
     * 根据调度id获取调度信息(lixiaojie)
     *
     * @param dispatchId
     * @return
     */
    Dispatch getDispatchByDispatchId(Integer dispatchId) throws Exception;

    /**
     * 根据调度id查询所有的景点信息(lixiaojie)
     *
     * @param dispatchId
     * @return
     */
    List<WechatTicketbudgetParam> selectDispatchByScenicspotInfo(Integer dispatchId) throws Exception;


    /**
     * 根据调度表id 和权重获取每天的吃饭信息和住宿信息(lixiaojie)
     *
     * @param dispatchId
     * @param weight
     * @return
     */
    WechatEatAndHotelParam selectDispatchInfoByWeightDispatchId(Integer dispatchId, Integer weight) throws Exception;

    /**
     * 根据调度id获取该团的所有天数(lixiaojie)
     *
     * @return
     */
    List<String> selectDispatchDaysByDispatchId(Integer dispatchId) throws ParseException, Exception;


    /**
     * 根据导游id查询调度表 (lixiaojie)
     *
     * @param guideId
     * @return 微信基本信息参数类
     */
    WechatInformationParam selectDispatchInfoByGuideId(Integer guideId) throws Exception;

    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     *
     * @param dispathId 调度编号
     * @return
     */
    List<TravelPathParam> getTravelPathParam(Integer dispathId) throws Exception;

    /**
     * 获取计划表的信息根据调度编号（yunguohao）
     *
     * @param dispathId 调度编号
     * @return
     */
    TravelPathsParam getTravelPathsParam(Integer dispathId) throws Exception;

    /**
     * 微信根据导游id查询行程的信息（yunguohao）
     *
     * @param guideId 导游id
     * @return
     * @throws Exception
     */
    GuideRouteParam getGuideRouteParam(Integer guideId) throws Exception;

    /**
     * 获取派团单信息根据调度编号 （wangtao）
     *
     * @param dispatchId 调度编号
     * @return 返回派团单参数对象
     * @throws Exception
     */
    MissionParam getMissionParam(Integer dispatchId) throws Exception;

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
    Integer saveDispatchInfo(DispatchParam disParam, Integer dispatchIdStatus) throws DispatchException;

    /**
     * 查询所有未审核且删除状态为1的调度信息 (lixiaojie)
     * 1表示未审核
     *
     * @return
     */
    PageInfo<Dispatch> selectDispatchs(Integer pageNo, Integer pageSize) throws Exception;

    /**
     * 总控审核通过（lixiaojie)
     *
     * @return
     */
    Integer onCheckDispatchInfo(Integer dispatchId, int staffId) throws ParseException, Exception;

    /**
     * 总控审核不通过(lixiaojie)
     *
     * @return
     */
    Integer noCheckDispatchInfo(Integer dispatchId) throws Exception;

    /**
     * 根据导游id获取调度信息id  没有则返回null(lixiaojie)
     *
     * @param guideId
     * @return
     */
    Integer selectDisGuideInfoByguideId(Integer guideId) throws Exception;

}
