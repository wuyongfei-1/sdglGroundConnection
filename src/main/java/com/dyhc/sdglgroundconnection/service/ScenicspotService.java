package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.mapper.CommonMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 景点业务接口
 *
 **/
public interface ScenicspotService {

    /**
     * 根据条件查询所有信息分页 （wangtao）
     * @param pageNo
     * @param PageSize
     * @param scenicspot
     * @return
     * @throws Exception
     */
    PageInfo<Scenicspot> listScenicspot(Integer pageNo, Integer PageSize,Scenicspot scenicspot) throws Exception;

    /**
     * 新增信息方法 （wangtao）
     * @param scenicspot 景点信息参数对象
     * @return 受影响行数
     * @throws Exception
     */
    Integer insertScenicspot(Scenicspot scenicspot)throws Exception;

    /**
     * 查询所有父景点 （wangtao）
     * @return 返回父景点对象集合
     * @throws Exception
     */
    PageInfo<Scenicspot> ListScenicspotByParentId()throws Exception;

    /**
     * 根据编号修改景点信息 （wangtao）
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer updateScenicspot(Scenicspot scenicspot)throws Exception;

    /**
     * 根据id查询景点信息 （wangtao）
     * @return
     * @throws Exception
     */
    Scenicspot getScenicspotById(Integer id)throws Exception;

    /**
     * 根据id删除景点信息 （wangtao）
     * @param id id编号
     * @return
     * @throws Exception
     */
    Integer deleteScenicspotById(Integer id)throws Exception;
}
