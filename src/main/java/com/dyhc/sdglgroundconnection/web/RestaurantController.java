package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.dto.RestaurantParam;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 餐馆 控制层
 **/
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(RestaurantController.class);

    @Autowired
    private RestaurantService restaurantService;


    /**
     * 显示所有的餐馆和饮食类型信息（wuyongfei）
     *
     * @param restaurantParam 餐馆实例
     * @return 查询结果
     */
    @GetMapping(value = "/restaurant/all")
    public ReponseResult showAllRestaurantsAndMealTypes(RestaurantParam restaurantParam) {
        Map<String, Object> paramObj = new HashMap<>();
        paramObj.put("restaurantName", restaurantParam.getRestaurantName());
        paramObj.put("restaurantAddress", restaurantParam.getRestaurantAddress());
        paramObj.put("mealType", restaurantParam.getMealType());
        paramObj.put("maxPrice", restaurantParam.getMaxPrice());
        paramObj.put("minPrice", restaurantParam.getMinPrice());
        paramObj.put("pageNo", restaurantParam.getPage());
        paramObj.put("pageSize", restaurantParam.getLimit());
        try {
            PageInfo<Restaurant> pageInfo = restaurantService.listRestaurantsAndMealTypesByConditions(paramObj);
            logger.info(" method: showAllRestaurantsAndMealTypes  分页查询餐馆信息成功！");
            return ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页查询餐馆信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: showAllRestaurantsAndMealTypes  分页查询餐馆信息失败，系统出现异常！");
            return ReponseResult.err("分页查询餐馆信息失败，系统出现异常！");
        }
    }

    /**
     * 根据餐馆编号添加一条饮食类型信息（wuyongfei）
     *
     * @param mealType 饮食类型对象
     * @return 添加结果
     */
    @PostMapping(value = "/mealType/save")
    public ReponseResult saveMealTypeInfoByRestaurantId(MealType mealType) {
        try {
            Integer saveResult = restaurantService.saveMealTypeInfoByRestaurantId(mealType);
            if (saveResult > 0) {
                logger.info(" method: saveMealTypeInfoByRestaurantId  添加饮食类型成功");
                return ReponseResult.ok("添加饮食类型成功！");
            } else {
                logger.info(" method: saveMealTypeInfoByRestaurantId  添加饮食类型失败");
                return ReponseResult.err("添加饮食类型失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: saveMealTypeInfoByRestaurantId  添加饮食类型失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("添加饮食类型失败，系统出现异常！");
        }
    }

    /**
     * 根据编号删除一条饮食类型信息（wuyongfei）
     *
     * @param mealTypeId 饮食类型编号
     * @return 删除结果
     */
    @PostMapping(value = "/mealType/remove")
    public ReponseResult removeMealTypeById(Integer mealTypeId) {
        try {
            Integer removeResult = restaurantService.removeMealTypeById(mealTypeId);
            if (removeResult > 0) {
                logger.info(" method: removeMealTypeById  删除饮食类型成功");
                return ReponseResult.ok("删除饮食类型成功！");
            } else {
                logger.info(" method: removeMealTypeById  删除饮食类型失败");
                return ReponseResult.err("删除饮食类型失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: removeMealTypeById 删除饮食类型失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("删除饮食类型失败，系统出现异常！");
        }
    }

    /**
     * 根据餐馆编号修改一条饮食类型信息（wuyongfei）
     *
     * @param mealType 饮食类型实例
     * @return 修改结果
     */
    @PostMapping(value = "/mealType/update")
    public ReponseResult updateMealTypeById(MealType mealType) {
        try {
            Integer updateResult = restaurantService.updateMealTypeByRestaurantId(mealType);
            if (updateResult > 0) {
                logger.info(" method: updateMealTypeById  修改饮食类型成功");
                return ReponseResult.ok("修改饮食类型成功！");
            } else {
                logger.info(" method: updateMealTypeById  修改饮食类型失败");
                return ReponseResult.err("修改饮食类型失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: updateMealTypeById 修改饮食类型失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("修改饮食类型失败，系统出现异常！");
        }
    }

    /**
     * 根据餐馆编号修改餐馆信息（wuyongfei）
     *
     * @param restaurant 餐馆对象
     * @return 修改结果
     */
    @PostMapping(value = "/restaurant/update")
    public ReponseResult updateRestaurantsById(Restaurant restaurant) {
        try {
            Integer updateResult = restaurantService.updateRestaurantInfoById(restaurant);
            if (updateResult > 0) {
                logger.info(" method: updateRestaurantsById  修改餐馆信息成功");
                return ReponseResult.ok("修改餐馆信息成功！");
            } else {
                logger.info(" method: updateRestaurantsById  修改餐馆信息失败");
                return ReponseResult.err("修改餐馆信息失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: updateRestaurantsById  修改餐馆信息失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("修改餐馆信息失败，系统出现异常！");
        }
    }

    /**
     * 删除一条餐馆信息（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 删除结果
     */
    @PostMapping(value = "/restaurant/remove")
    public ReponseResult removeRestaurantInfoById(@RequestParam("restaurantId") Integer restaurantId) {
        try {
            Integer removeResult = restaurantService.removeRestaurantInfoById(restaurantId);
            if (removeResult > 0) {
                logger.info(" method: removeRestaurantInfoById  删除餐馆信息成功");
                return ReponseResult.ok("删除餐馆信息成功！");
            } else {
                logger.info(" method: removeRestaurantInfoById  删除餐馆信息失败");
                return ReponseResult.err("删除餐馆信息失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: removeRestaurantInfoById  删除餐馆信息失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("删除餐馆信息失败，系统出现异常！");
        }
    }

    /**
     * 添加一条餐馆信息（wuyongfei）
     *
     * @param restaurant 餐馆实例
     * @return 添加结果
     */
    @PostMapping(value = "/restaurant/save")
    public ReponseResult saveRestaurantInfo(Restaurant restaurant) {
        try {
            Integer saveResult = restaurantService.saveRestaurantInfo(restaurant);
            if (saveResult > 0) {
                logger.info(" method: saveRestaurantInfo  添加餐馆信息成功");
                return ReponseResult.ok("添加餐馆信息成功！");
            } else {
                logger.info(" method: saveRestaurantInfo  添加餐馆信息失败");
                return ReponseResult.err("添加餐馆信息失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method: saveRestaurantInfo  添加餐馆信息失败,系统出现异常！" + e.getMessage());
            return ReponseResult.err("添加餐馆信息失败，系统出现异常！");
        }
    }
}
