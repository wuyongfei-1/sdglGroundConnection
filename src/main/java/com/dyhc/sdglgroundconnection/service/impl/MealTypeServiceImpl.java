package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.mapper.MealTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.service.MealTypeService;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private DictionariesMapper dictionariesMapper;

    /**
     * 通过饮食类型编号查询所有的餐馆信息
     * @param mealTypeId   饮食类型编号
     * @return
     */
    @Override
    public List<MealType> getRestaurantsByMealTypeId (Integer mealTypeId) throws Exception {
        MealType mealType1 = mealTypeMapper.selectByPrimaryKey(mealTypeId);
        if (mealType1 == null) {
            return null;
        }
        MealtypeExample mealtypeExample = new MealtypeExample();
        MealtypeExample.Criteria criteria = mealtypeExample.createCriteria();
        criteria.andValueIdEqualTo(Integer.parseInt(mealType1.getValueId()));
        List<MealType> mealTypes = mealTypeMapper.selectByExample(mealtypeExample);
        for (MealType mealType : mealTypes) {
            Restaurant restaurant = restaurantService.getRestaurantById(mealType.getRestaurantId());
            mealType.setRestaurant(restaurant);
        }
        return mealTypes;
    }

    @Override
    public List<MealType> getRestaurantAndDictionaries(Integer valueId) throws Exception {
        MealtypeExample mealtypeExample = new MealtypeExample();
        MealtypeExample.Criteria criteria = mealtypeExample.createCriteria();
        criteria.andValueIdEqualTo(valueId);
        List<MealType> mealTypes = mealTypeMapper.selectByExample(mealtypeExample);
        for (MealType mealType : mealTypes) {
            Restaurant restaurant = restaurantService.getRestaurantById(mealType.getRestaurantId());
            mealType.setRestaurant(restaurant);
        }
        return mealTypes;
    }

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

    /**
     * 根据餐馆编号查询饮食类型列表（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 饮食类型列表
     * @throws Exception 全局异常
     */
    @Override
    public List<MealType> listMealTypesByRestaurantId(Integer restaurantId) throws Exception {
        MealtypeExample mealtypeExample = new MealtypeExample();
        MealtypeExample.Criteria criteria = mealtypeExample.createCriteria();
        // 拼接条件
        criteria.andRestaurantidEqualTo(restaurantId != null ? restaurantId : 1);
        // 开始查询
        List<MealType> mealTypes = mealTypeMapper.selectByExample(mealtypeExample);
        for (MealType mealType : mealTypes) {
            // 根据饮食类型编号查询所有饮食类型的名称
            DictionariesExample dictionariesExample = new DictionariesExample();
            DictionariesExample.Criteria criteria1 = dictionariesExample.createCriteria();
            criteria1.andTypecodeEqualTo("DIET");
            criteria1.andValueidEqualTo(Integer.parseInt(mealType.getValueId()));
            List<Dictionaries> dictionaries = dictionariesMapper.selectByExample(dictionariesExample);
            // 完善饮食类型对象
            mealType.setMealTypeName((dictionaries != null && dictionaries.size() > 0) ? dictionaries.get(0).getValueContent1() : null);
        }
        return mealTypes;
    }
}
