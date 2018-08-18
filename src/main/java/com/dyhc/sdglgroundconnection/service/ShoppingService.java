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
    /**
     * 分页查询购物信息   （lixiaojie)
     * @param pageNo    当前页
     * @param pageSize  每页大小
     * @param shoppingSite 购物地点
     * @return
     */
    PageInfo<Shopping> listPageShoppingByShoppingSite(Integer pageNo, Integer pageSize, String shoppingSite);

    /**
     * 获取所有景点信息 （lixiaojie)
     * @return
     */
    List<Scenicspot> listScenicspotAll();

    /**
     * 新增购物信息 （lixiaojie)
     * @param shopping
     * @return
     */
    Integer saveShoppingInfo(Shopping shopping);
    /**
     * 根据id获取购物信息 （lixiaojie)
     * @param shoppingId
     * @return
     */
    Shopping  getShoppingInfoByShoppingId(Integer shoppingId);
    /**
     * 修改购物信息 （lixiaojie)
     * @param shopping
     * @return
     */
    Integer updateShoppingInfo(Shopping shopping);
    /**
     * 根据id删除购物信息 （lixiaojie)
     * @param shoppingId
     * @return
     */
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
