package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Shopping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物
 **/
@Mapper
@Component
public interface ShoppingMapper extends CommonMapper<Shopping>{

    /**
     * 根据景点编号查询购物信息 （wangtao）
     * @param scenicSpotId 景点编号
     * @return 返回购物信息对象
     */
    List<Shopping> getShoppingByScenicspotId(Integer scenicSpotId) throws Exception;

    /**
     * 根据id删除 购物信息(lixiaojie）
     * @param shoppingId
     * @return
     * @throws Exception
     */
    Integer deleteShoppingByShoppingId(@Param("shoppingId") Integer shoppingId)throws Exception;


}
