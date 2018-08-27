package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.MealType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型业务接口
 **/
public interface MealTypeService {
    /**
     * 通过餐馆编号查询饮食类型列表（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 饮食类型列表
     * @throws Exception 全局异常
     */
    List<MealType> listMealTypesByRestaurantId(Integer restaurantId) throws Exception;
}
