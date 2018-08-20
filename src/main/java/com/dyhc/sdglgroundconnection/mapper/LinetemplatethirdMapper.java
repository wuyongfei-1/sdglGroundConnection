package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.HoteroomType;
import com.dyhc.sdglgroundconnection.pojo.Linetemplate;
import com.dyhc.sdglgroundconnection.pojo.Linetemplatethird;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板与线路模板关系
 **/
@Mapper
@Component
public interface LinetemplatethirdMapper  extends CommonMapper<Linetemplatethird> {

    /**
     * 根据总线路模板编号查询最大权重
     * @param lineId 总线路模板编号
     * @return 返回最大权重
     */
    Integer getMaxWeightByLineId(@Param("lineId") Integer lineId);
}
