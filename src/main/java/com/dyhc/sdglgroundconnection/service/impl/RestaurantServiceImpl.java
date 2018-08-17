package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.MealTypeMapper;
import com.dyhc.sdglgroundconnection.mapper.RestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.pojo.MealtypeExample;
import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import com.dyhc.sdglgroundconnection.pojo.RestaurantExample;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 餐馆业务实现
 **/
@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantMapper restaurantMapper;  // 餐馆

    @Autowired
    private MealTypeMapper mealTypeMapper; // 饮食类型

    /**
     * 查询符合条件的餐馆和饮食类型（wuyongfei）
     *
     * @param conditions 条件
     * @return 分页后的数据
     * @throws Exception 全局异常
     */
    @Override
    public PageInfo<Restaurant> listRestaurantsAndMealTypesByConditions(Map<String, Object> conditions) throws Exception {
        Integer pageNo = (Integer) conditions.get("pageNo");
        Integer pageSize = (Integer) conditions.get("pageSize");
        PageHelper.startPage(pageNo, pageSize, true); // 开启分页
        // 获取条件
        String restaurantName = (String) conditions.get("restaurantName"); // 餐馆名称
        String restaurantAddress = (String) conditions.get("restaurantAddress"); // 餐馆地址
        Double minPrice = (Double) conditions.get("minPrice"); // 最低价格
        Double maxPrice = (Double) conditions.get("maxPrice"); // 最高价格
        Integer mealType = (Integer) conditions.get("restaurantType"); // 饮食类型
        // 拼接动态条件
        RestaurantExample restaurantExample = new RestaurantExample();
        // 条件实例
        RestaurantExample.Criteria criteria = restaurantExample.createCriteria();
        if (ConditionValidation.validation(restaurantName)) { // name
            criteria.andRestaurantnameLike("%" + restaurantName + "%");
        }
        if (ConditionValidation.validation(restaurantAddress)) { // address
            criteria.andRestaurantaddressLike("%" + restaurantAddress + "%");
        }
        List<Restaurant> restaurants = restaurantMapper.selectByExample(restaurantExample);
        // 遍历符合条件的餐厅列表
        for (Restaurant restaurant : restaurants) {
            // 根据餐厅查询对应的饮食类型
            MealtypeExample mealtypeExample = new MealtypeExample();
            // 条件实例
            MealtypeExample.Criteria criteria1 = mealtypeExample.createCriteria();
            if (ConditionValidation.validation(minPrice) && !ConditionValidation.validation(maxPrice)) {
                criteria1.andCostpriceGreaterThanOrEqualTo(minPrice);
            }
            if (ConditionValidation.validation(minPrice) && ConditionValidation.validation(maxPrice)) {
                criteria1.andCostpriceBetween(minPrice, maxPrice);
            }
            if (ConditionValidation.validation(mealType)) {
                criteria1.andValueIdEqualTo(mealType);
            }
            criteria1.andRestaurantidEqualTo(restaurant.getRestaurantId());
            // 查询改餐馆下的所有饮食类型
            List<MealType> mealTypes = mealTypeMapper.selectByExample(mealtypeExample);
            restaurant.setMealTypes(mealTypes);
        }
        PageInfo<Restaurant> pageInfo = new PageInfo<>(restaurants);
        return pageInfo;
    }

    /**
     * 添加一条餐厅信息（wuyongfei）
     *
     * @param restaurant 餐馆实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "餐馆", desc = "新增了一条餐馆信息")
    public Integer saveRestaurantInfo(Restaurant restaurant) throws Exception {
        int insertResutlt = restaurantMapper.insert(restaurant);
        return insertResutlt;
    }

    /**
     * 修改一条餐厅信息（wuyongfei）
     *
     * @param restaurant 餐馆实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "餐馆", desc = "修改了一条餐馆信息")
    public Integer updateRestaurantInfoById(Restaurant restaurant) throws Exception {
        return restaurantMapper.updateByPrimaryKey(restaurant);
    }

    /**
     * 删除一条餐馆信息（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @Transactional
    @RecordOperation(type = "餐馆", desc = "删除了一条餐馆信息")
    public Integer removeRestaurantInfoById(Integer restaurantId) throws Exception {
        MealtypeExample mealtypeExample = new MealtypeExample();
        // 拼接条件
        MealtypeExample.Criteria criteria = mealtypeExample.createCriteria();
        criteria.andRestaurantidEqualTo(restaurantId);
        // 删除该餐馆下的所有饮食类型信息
        mealTypeMapper.deleteByExample(mealtypeExample);
        // 删除该餐馆
        return restaurantMapper.deleteByPrimaryKey(restaurantId);
    }

    /**
     * 根据餐馆编号添加一条饮食类型信息（wuyongfei）
     *
     * @param mealType 饮食类型实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "饮食类型", desc = "新增了一条饮食类型信息")
    public Integer saveMealTypeInfoByRestaurantId(MealType mealType) throws Exception {
        return mealTypeMapper.insert(mealType);
    }

    /**
     * 根据餐馆编号修改一条饮食类型信息（wuyongfei）
     *
     * @param mealType 饮食类型实例
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "饮食类型", desc = "新增了一条饮食类型信息")
    public Integer updateMealTypeByRestaurantId(MealType mealType) throws Exception {
        return mealTypeMapper.updateByPrimaryKey(mealType);
    }

    /**
     * 根据编号删除一条饮食类型信息（wuyongfei）
     *
     * @param MealTypeId 餐馆编号
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    @RecordOperation(type = "饮食类型", desc = "删除了一条饮食类型信息")
    public Integer removeMealTypeById(Integer MealTypeId) throws Exception {
        return mealTypeMapper.deleteByPrimaryKey(MealTypeId);
    }
}
