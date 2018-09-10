package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店业务接口
 **/
public interface DispatchhotelService {

    /**
     * 根据调度表编号查询调度酒店信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度酒店对象
     */
    List<Dispatchhotel> getDispatchhotelInfoByDispatchId(Integer dispatchId)throws Exception;

    /**
     * 批量添加多条调度酒店信息（wuyongfei）
     *
     * @param dispatchhotelList 调度酒店列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDispatchhotelInfo(List<Dispatchhotel> dispatchhotelList) throws DispatchException;

    /**
     * 新增调度酒店信息 （wangtao）
     * @param dispatchhotel 调度酒店对象
     * @return 受影响行数
     * @throws DispatchException
     */
    Integer insertDispatchhotelInfo(Dispatchhotel dispatchhotel) throws DispatchException;
}
