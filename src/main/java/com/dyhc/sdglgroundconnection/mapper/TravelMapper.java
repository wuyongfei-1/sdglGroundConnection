package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Travel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社
 **/
@Mapper
@Component
public interface TravelMapper extends CommonMapper<Travel> {
    /**
     * 组团社按名字查询(yunguohao)
     * @param travel
     * @return
     */
    List<Travel> selectTravelName(Travel travel) throws Exception;
    /**
     * 组团社删除（yunguohao）
     * @param travelId
     * @return
     */
    int deleteTravel(int travelId) throws  Exception;
}
