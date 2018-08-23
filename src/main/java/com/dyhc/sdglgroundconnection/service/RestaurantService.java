package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 餐馆业务接口
 **/
public interface RestaurantService {

    /**
     * 查询所有的餐馆信息（不分页）（wuyongfei）
     *
     * @return 餐馆列表
     * @throws DispatchException 调度异常
     */
    List<Restaurant> listAllRestaurants() throws DispatchException;


    /**
     * 分页查询符合条件的餐馆列表（wuyongfei）
     *
     * @param conditions 条件
     * @return 分页后的数据
     * @throws Exception 全局异常
     */
    PageInfo<Restaurant> listRestaurantsAndMealTypesByConditions(Map<String, Object> conditions) throws Exception;

    /**
     * 通过餐馆编号获取餐馆对象（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 餐馆对象
     * @throws Exception 全局异常
     */
    Restaurant getRestaurantById(Integer restaurantId) throws Exception;


    /**
     * 通过饮食类型编号获取饮食类型对象（wuyongfei）
     *
     * @param mealTypeId 饮食类型编号
     * @return 饮食类型对象
     * @throws Exception 全局异常
     */
    MealType getMealTypeById(Integer mealTypeId) throws Exception;

    /**
     * 添加一条餐馆信息（wuyongfei）
     *
     * @param restaurant 餐馆实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer saveRestaurantInfo(Restaurant restaurant) throws Exception;

    /**
     * 修改餐馆信息通过主键（wuyongfei）
     *
     * @param restaurant 餐馆实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer updateRestaurantInfoById(Restaurant restaurant) throws Exception;

    /**
     * 根据编号删除餐馆信息（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer removeRestaurantInfoById(Integer restaurantId) throws Exception;

    /**
     * 添加饮食类型（wuyongfei）
     *
     * @param mealType 饮食类型实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer saveMealTypeInfoByRestaurantId(MealType mealType) throws Exception;

    /**
     * 根据饮食类型编号修改饮食类型信息（wuyongfie）
     *
     * @param mealType 餐馆实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer updateMealTypeByRestaurantId(MealType mealType) throws Exception;

    /**
     * 根据饮食类型编号（wuyongfei）
     *
     * @param MealTypeId 餐馆编号
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    Integer removeMealTypeById(Integer MealTypeId) throws Exception;
}
