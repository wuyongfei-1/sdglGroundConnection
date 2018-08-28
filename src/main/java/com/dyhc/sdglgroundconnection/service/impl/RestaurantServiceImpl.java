package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.exception.MealTypeException;
import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.mapper.MealTypeMapper;
import com.dyhc.sdglgroundconnection.mapper.RestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    @Autowired
    private DictionariesMapper dictionariesMapper; // 字典持久化

    @Autowired
    private DictionariesService dictionariesService; // 字典业务

    /**
     * 获取所有的餐馆信息（不分页）（wuyongfei）
     *
     * @return 餐馆列表
     * @throws DispatchException 调度异常
     */
    @Override
    public List<Restaurant> listAllRestaurants() throws DispatchException {
        return restaurantMapper.selectAll();
    }

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
        Integer mealType = (Integer) conditions.get("mealType"); // 饮食类型
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
        Restaurant[] restaurantIds = new Restaurant[restaurants.size()]; // 存放没有相关饮食类型的餐馆
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
            if (ConditionValidation.validation(mealType) && mealType > 0) {
                criteria1.andValueIdEqualTo(mealType);
            }
            criteria1.andRestaurantidEqualTo(restaurant.getRestaurantId());
            // 查询该餐馆下的所有饮食类型
            List<MealType> mealTypes = mealTypeMapper.selectByExample(mealtypeExample);
            // 查询餐馆名称
            for (MealType type : mealTypes) {
                // 拼接条件，获取字典中的饮食类型名称
                DictionariesExample dictionariesExample = new DictionariesExample();
                DictionariesExample.Criteria criteria2 = dictionariesExample.createCriteria();
                criteria2.andTypecodeEqualTo((type.getTypeCode() == null || "".equals(type.getTypeCode())) ? "DIET" : type.getTypeCode());
                criteria2.andValueidEqualTo(Integer.parseInt(type.getValueId()) == 0 ? 1 : Integer.parseInt(type.getValueId()));
                // 获取完成
                List<Dictionaries> dictionaries = dictionariesMapper.selectByExample(dictionariesExample);
                // 将名称填充到饮食类型对象中
                type.setMealTypeName(dictionaries.size() > 0 ? dictionaries.get(0).getValueContent1() : "");
            }
            restaurant.setMealTypes(mealTypes);
            // 记录没有相关饮食类型的餐馆
            if (ConditionValidation.validation(minPrice) || ConditionValidation.validation(maxPrice)
                    || (ConditionValidation.validation(mealType) && mealType > 0)) {
                if (mealTypes.size() == 0) {
                    for (int i = 0; i < restaurantIds.length; i++) {
                        if (restaurantIds[i] == null) {
                            restaurantIds[i] = restaurant;
                            break;
                        }
                    }
                }
            }
        }
        // 过滤没有相关饮食类型的餐馆
        for (int i = 0; i < restaurantIds.length; i++) {
            if (restaurantIds[i] != null) {
                // 过滤掉该餐馆
                restaurants.remove(restaurantIds[i]);
            }
        }
        PageInfo<Restaurant> pageInfo = new PageInfo<>(restaurants);
        return pageInfo;
    }

    /**
     * 根据编号获取餐馆对象（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 餐馆对象
     * @throws Exception 全局异常
     */
    @Override
    public Restaurant getRestaurantById(Integer restaurantId) throws Exception {
        return restaurantMapper.selectByPrimaryKey(restaurantId);
    }

    /**
     * 根据饮食类型编号获取饮食类型对象（wuyongfei）
     *
     * @param mealTypeId 饮食类型编号
     * @return 饮食类型对象
     * @throws Exception 全局异常
     */
    @Override
    public MealType getMealTypeById(Integer mealTypeId) throws Exception {
        // 获取到饮食类型信息
        MealType mealType = mealTypeMapper.selectByPrimaryKey(mealTypeId);
        // 拼接条件，获取字典中的饮食类型名称
        DictionariesExample dictionariesExample = new DictionariesExample();
        DictionariesExample.Criteria criteria = dictionariesExample.createCriteria();
        criteria.andTypecodeEqualTo((mealType.getTypeCode() == null || mealType.getTypeCode() == "") ? "DIET" : mealType.getTypeCode());
        criteria.andValueidEqualTo(Integer.parseInt(mealType.getValueId()) == 0 ? 1 : Integer.parseInt(mealType.getValueId()));
        // 获取完成
        List<Dictionaries> dictionaries = dictionariesMapper.selectByExample(dictionariesExample);
        // 将名称填充到饮食类型对象中
        mealType.setMealTypeName(dictionaries.size() > 0 ? dictionaries.get(0).getValueContent1() : "");
        return mealType;
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
        restaurant.setWhetherDel(0);
        restaurant.setCreateDate(new Date());
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
        // 判断文件是否修改
        if ("".equals(restaurant.getPicturePath())) {
            // 未修改文件
            Restaurant restaurant1 = restaurantMapper.selectByPrimaryKey(restaurant);
            restaurant.setPicturePath(restaurant1.getPicturePath());
            restaurant.setCreateDate(restaurant1.getCreateDate());
            restaurant.setCreateBy(restaurant1.getCreateBy());
        }
        restaurant.setWhetherDel(0);
        restaurant.setUpdateDate(new Date());
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
    @Transactional
    @RecordOperation(type = "饮食类型", desc = "新增了一条饮食类型信息")
    public Integer saveMealTypeInfoByRestaurantId(MealType mealType) throws Exception {
        mealType.setCreateDate(new Date());
        mealType.setWhetherDel(0);
        // 判断字典表中是否存在该饮食类型
        List<Dictionaries> mealTypes = dictionariesService.listDictionaries("DIET");
        int valueId = 0;
        for (Dictionaries type : mealTypes) {
            if (type.getValueContent1() != null && !"".equals(type.getValueContent1())) {
                if (type.getValueContent1().equals(mealType.getMealTypeName())) {
                    mealType.setValueId(Integer.toString(type.getValueId()));
                }
                if (type.getValueId() != null && !"".equals(type.getValueId())) {
                    valueId = type.getValueId().intValue();
                } else {
                    throw new MealTypeException("错误，饮食类型的值为空，请先完善数据！");
                }
            }
        }
        if ("".equals(mealType.getValueId())) {  // 字典表中没有该饮食类型
            Dictionaries dictionaries = new Dictionaries();
            dictionaries.setCreateBy(mealType.getCreateBy());
            dictionaries.setCreateDate(new Date());
            dictionaries.setTypeCode("DIET");
            dictionaries.setTypeName("饮食类型");
            dictionaries.setValueId(++valueId);
            dictionaries.setValueContent1(mealType.getMealTypeName());
            dictionaries.setValueContent2(mealType.getCostprice().toString());
            dictionaries.setValueContent3(mealType.getOffer().toString());
            dictionaries.setWhetherDel(0);
            // 添加该饮食类型添加到字典表中
            dictionariesMapper.insert(dictionaries);
            // 将添加后的valueId返回给饮食类型对象
            mealType.setValueId(dictionaries.getValueId().toString());
        }
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
        // 查询未修改的信息
        MealType mealType1 = mealTypeMapper.selectByPrimaryKey(mealType.getTypeId());
        mealType.setCreateBy(mealType1.getCreateBy());
        mealType.setCreateDate(mealType1.getCreateDate());
        mealType.setWhetherDel(0);
        mealType.setUpdateDate(new Date());
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
