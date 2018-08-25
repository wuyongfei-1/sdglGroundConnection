package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Tourguide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游带团日志信息表
 **/
@Component
@Mapper
public interface TourguideMapper extends CommonMapper<Tourguide> {
}
