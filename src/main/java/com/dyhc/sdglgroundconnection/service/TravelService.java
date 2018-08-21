package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Travel;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社业务接口
 **/
public interface TravelService {

    /**
     * 获取所有的旅行社（不分页）（wuyongfei）
     *
     * @return 旅行社列表
     * @throws DispatchException 调度异常
     */
    List<Travel> listAllTravels() throws DispatchException;

    /**
     * 组团社名字查询（yunguohao）
     *
     * @param pageNo
     * @param PageSize
     * @return
     * @throws Exception
     */
    PageInfo<Travel> listCompany(Integer pageNo, Integer PageSize, Travel travel) throws Exception;

    /**
     * 组团社增加（yunguohao）
     */
    int insertTravels(Travel travel);

    /**
     * 组团社修改（yunguohao）
     */
    int updateTravels(Travel travel);

    /**
     * 组团社删除（yunguohao）
     */
    int deleteTravelByIDs(int travelid) throws Exception;

    /**
     * 组团社id查询（yunguohao）
     *
     * @param id
     * @return
     */
    Travel selectTravelByIds(int id);
}
