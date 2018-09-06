package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 景点
 **/
@Mapper
@Component
public interface ScenicspotMapper extends CommonMapper<Scenicspot>{

    /**
     * 根据条件分页查询信息  （wangtao）
     * @param scenicspot 参数信息对象
     * @return 返回信息集合
     * @throws Exception
     */
    List<Scenicspot> ListScenicspots(Scenicspot scenicspot) throws Exception;

    /**
     * 新增信息  （wangtao）
     * @param scenicspot 参数信息对象
     * @return 返回受影响行数
     */
    int saveScenicspotInfo(Scenicspot scenicspot) throws Exception;

    /**
     *  根据编号修改景点信息 （wangtao）
     * @return
     * @throws Exception
     */
    int updateScenicspotInfoByParentId(Scenicspot scenicspot) throws Exception;
}
