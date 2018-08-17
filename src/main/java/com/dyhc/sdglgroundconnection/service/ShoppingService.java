package com.dyhc.sdglgroundconnection.service;


import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.PageInfo;

import com.dyhc.sdglgroundconnection.pojo.Shopping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物业务接口
 **/
public interface ShoppingService {

    PageInfo<Shopping> listPageShoppingByShoppingSite(Integer pageNo, Integer pageSize, String shoppingSite);

    List<Scenicspot> listScenicspotAll();

    Integer saveShoppingInfo(Shopping shopping);

    Shopping  getShoppingInfoByShoppingId(Integer shoppingId);

    Integer updateShoppingInfo(Shopping shopping);

    Integer deleteShoppingByShoppingId( Integer shoppingId)throws Exception;

    /**
     * 新增购物信息 （wangtao）
     * @param shopping 参数商品信息
     * @return 返回受影响行数
     */
    Integer insertInfo(Shopping shopping) throws Exception;

    /**
     *  根据景点编号查询所有购物点信息 （wangtao）
     * @param scenicSpotId 景点编号
     * @return 返回购物点集合
     */
    List<Shopping> ListShoppingByScenicSpotId(Integer scenicSpotId) throws Exception;

    /**
     * 根据id查询购物点信息
     * @return 返回购物点对象
     * @throws Exception
     */
    Shopping getShoppingById(Integer id)throws Exception;

    /**
     * 根据购物编号删除购物点信息 （wangtao）
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer deleteShoppingById(Integer shoppingId)throws Exception;

    /**
     * 修改购物信息 （wangtao）
     * @param shopping 参数购物对象
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer updateShopping(Shopping shopping)throws Exception;

}
