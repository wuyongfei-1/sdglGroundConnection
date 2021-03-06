package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Disguide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游
 **/
@Mapper
@Component
public interface DisguideMapper extends CommonMapper<Disguide>{

    /**
     * 根据导游编号查询(yunguoaho)
     * @param disGuideId
     * @return
     */
    List<Disguide> selectdisGuideId(int disGuideId);
}
