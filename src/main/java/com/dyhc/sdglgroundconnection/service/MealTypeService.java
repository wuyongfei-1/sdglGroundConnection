package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.MealType;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型业务接口
 **/
public interface MealTypeService {

    /**
     * 根据类型编号查询类型信息
     * @param typeId 类型编号
     * @return 类型信息对象
     */
    MealType getMealTypeById(Integer typeId) throws Exception;
}
