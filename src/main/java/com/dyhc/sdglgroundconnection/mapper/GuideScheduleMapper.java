package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游日程
 **/
@Mapper
@Component
public interface GuideScheduleMapper extends CommonMapper<GuideSchedule> {
    /**
     * 分组查询所有标志列(lixiaojie)
     * @return
     */
    List<String> selectGroupByGuideScheduleByValue3(@Param("guideName") String guideName, @Param("firstDate") String firstDate,@Param("lastDate") String lastDate);
}
