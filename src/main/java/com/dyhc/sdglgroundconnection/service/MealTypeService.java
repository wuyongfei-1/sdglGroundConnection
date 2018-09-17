package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.MealType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import com.dyhc.sdglgroundconnection.pojo.MealType;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型业务接口
 **/
public interface MealTypeService {

    /**
     * 通过饮食类型的编号查询所属的餐馆
     * @return
     * @throws Exception
     */
    List<MealType> getRestaurantAndDictionaries(Integer valueId) throws Exception;

    /**
     * 根据类型编号查询类型信息
     * @param typeId 类型编号
     * @return 类型信息对象
     */
    MealType getMealTypeById(Integer typeId) throws Exception;
    /**
     * 通过餐馆编号查询饮食类型列表（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 饮食类型列表
     * @throws Exception 全局异常
     */
    List<MealType> listMealTypesByRestaurantId(Integer restaurantId) throws Exception;

    /**
     * 通过饮食类型编号查询所有的餐馆信息
     * @param valueId   饮食类型编号
     * @return
     */
    List<MealType> getRestaurantsByMealTypeId (Integer valueId) throws Exception;
}
