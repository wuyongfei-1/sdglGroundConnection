package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游业务接口
 **/
public interface GuideService {

    /**
     * 获取所有的导游信息（不分页）（wuyongfei）
     *
     * @return 导游列表
     * @throws DispatchException 调度异常
     */
    List<Guide> listAllGuides() throws DispatchException;

    /**
     * 导游登陆（wuyongfei）
     *
     * @param username 用户名
     * @return 导游对象
     * @throws Exception 全局异常
     */
    Guide login(String username) throws Exception;

    /**
     * 导游名字查询（yunguohao）
     *
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
     *
     * @param id
     * @return
     */
    Guide selectGuideByIds(int id);

    /**
     *  获取所有导游  和导游的日程 （lixiaojie)
     * @return
     */
    List<Guide> selectGuideInfoAndGuideSchedule()throws Exception;

    /**
     * 查询所有导游信息(lixiaojie)
     * @return
     */
    List<Guide> selectAllGuideInfo()throws Exception;

}
