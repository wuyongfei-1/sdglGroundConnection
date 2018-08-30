package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Tourguide;

/**
 * 导游带团日志 业务层接口
 */
public interface TourguideService {

    /**
     * 根据导游带团日志编号查询导游带团日志信息 （wangtao）
     * @param tourguideId 导游带团日志编号
     * @return 返回导游带团日志对象
     */
    Tourguide getTourguideInfoByTourguideId(Integer tourguideId)throws Exception;

    /**
     * 上传导游带团日志信息（dubingkun）
     * @param tourguide
     * @return
     * @throws Exception
     */
    Integer insertTourguide(Tourguide tourguide)throws Exception;
}
