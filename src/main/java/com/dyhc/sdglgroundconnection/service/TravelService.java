package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Travel;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社业务接口
 **/
public interface TravelService {
    /**
     * 组团社名字查询（yunguohao）
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
    int deleteTravelByIDs(int travelid) throws  Exception;

    /**
     * 组团社id查询（yunguohao）
     * @param id
     * @return
     */
    Travel selectTravelByIds(int id);
}
