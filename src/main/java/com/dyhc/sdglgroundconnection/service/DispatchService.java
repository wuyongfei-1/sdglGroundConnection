package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.DispatchParam;
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
     * 根据调度编号查询调度信息 （wangtao）
     * @param dispatchId 调度编号
     * @return 返回调度表信息对象
     */
    Dispatch getDispatchInfoByDispatchInfoId(Integer dispatchId)throws Exception;

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

    /** 总控审核通过（lixiaojie)
     * @return
     */
    Integer onCheckDispatchInfo(Integer dispatchId) throws ParseException;

    /**
     * 总控审核不通过(lixiaojie)
     * @return
     */
    Integer noCheckDispatchInfo(Integer dispatchId);

}
