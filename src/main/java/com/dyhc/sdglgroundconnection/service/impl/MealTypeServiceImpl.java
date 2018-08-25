package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.MealTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.service.MealTypeService;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型业务实现
 **/
@Service
public class MealTypeServiceImpl implements MealTypeService {

    @Autowired
    private MealTypeMapper mealTypeMapper;

    @Autowired
    private RestaurantService restaurantService;

    /**
     * 根据类型编号查询类型信息
     * @param typeId 类型编号
     * @return 类型信息对象
     */
    @Override
    public MealType getMealTypeById(Integer typeId) throws Exception {
        MealType mealType=mealTypeMapper.selectByPrimaryKey(typeId);
        mealType.setRestaurant(restaurantService.getRestaurantById(mealType.getRestaurantId()));
        return mealType;
    }
}
