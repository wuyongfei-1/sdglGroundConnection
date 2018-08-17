package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游业务接口
 **/
public interface GuideService {
    /**
     * 导游名字查询（yunguohao）
     * @param pageNo
     * @param PageSize
     * @return
     * @throws Exception
     */
    PageInfo<Guide> listGuide(Integer pageNo, Integer PageSize, Guide guide) throws Exception;

    /**
     * 增加（yunguohao）
     */
    int insertGuide(Guide guide);
    /**
     * 修改（yunguohao）
     */
    int updateGuide(Guide guide);
    /**
     * 删除（yunguohao）
     */
    int deleteGuideByIDs(int guideid);

    /**
     * id查询（yunguohao）
     * @param id
     * @return
     */
    Guide selectGuideByIds(int id);
}
