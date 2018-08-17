package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游
 **/
@Mapper
@Component
public interface GuideMapper extends CommonMapper<Guide>{
    /**
     * 导游按名字查询(yunguohao)
     * @param guide
     * @return
     */
    List<Guide> selectGuideName(Guide guide) throws Exception;

    /**
     * 导游删除（yunguohao）
     * @param guideid
     * @return
     */
    int deleteGuide(int guideid);
}
