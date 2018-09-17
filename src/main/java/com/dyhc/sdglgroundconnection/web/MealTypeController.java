package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.service.MealTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型 控制层
 **/
@RestController
@RequestMapping("/mealType")
public class MealTypeController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(MealTypeController.class);

    @Autowired
    private MealTypeService mealTypeService;


    /**
     * 根据餐馆编号查询饮食类型列表（wuyongfei）
     *
     * @param restaurantId 餐馆编号
     * @return 响应结果
     */
    @GetMapping("/mealType/detail/{restaurantId}.html")
    public ReponseResult getMealTypeByRestaurant(@PathVariable Integer restaurantId) {
        try {
            List<MealType> mealTypes = mealTypeService.listMealTypesByRestaurantId(restaurantId);
            logger.info("method:getMealTypeByRestaurantBy  根据餐馆编号查询饮食类型列表成功！");
            return ReponseResult.ok(mealTypes, "根据餐馆编号查询饮食类型列表成功！");
        } catch (Exception e) {
            logger.error("method:getMealTypeByRestaurantBy  根据餐馆编号查询饮食类型列表失败，系统出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("根据餐馆编号查询饮食类型列表失败，系统出现异常！");
        }
    }

    /**
     * 通过饮食类型编号对应的字典表查询所属的餐馆
     *
     * @param valueId 饮食类型（字典表中的饮食类型对应的valueId）
     * @return
     */
    @GetMapping("/mealType/restaurantAndDictionsries/{valueId}.html")
    public ReponseResult getMealTypeByRestaurantAndDictionsries(@PathVariable Integer valueId) {
        try {
            List<MealType> mealTypes = mealTypeService.getRestaurantAndDictionaries(valueId);
            logger.info("method:getMealTypeByRestaurantAndDictionsries  根据字典表饮食类型编号查询饮食类型列表成功！");
            return ReponseResult.ok(mealTypes, "根据字典表饮食类型编号查询饮食类型列表成功！");
        } catch (Exception e) {
            logger.error("method:getMealTypeByRestaurantAndDictionsries  根据字典表饮食类型编号查询饮食类型列表失败，系统出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("根据字典表饮食类型编号查询饮食类型列表失败，系统出现异常！");
        }
    }

    /**
     * 通过饮食类型编号获取包含该饮食类型的所有餐馆（wuyongfei）
     *
     * @param mealTypeId 饮食类型编号
     * @return 响应对象
     */
    @GetMapping("/mealType/restaurants/{mealTypeId}.html")
    public ReponseResult getRestaurantsByMealTypeId(@PathVariable Integer mealTypeId) {
        try {
            List<MealType> mealTypes = mealTypeService.getRestaurantsByMealTypeId(mealTypeId);
            logger.info("method:getRestaurantsByMealTypeId  根据饮食类型编号查询餐馆列表成功！");
            return ReponseResult.ok(mealTypes, "根据饮食类型编号查询餐馆列表成功！");
        } catch (Exception e) {
            logger.error("method:getRestaurantsByMealTypeId  根据饮食类型编号查询餐馆列表失败，系统出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("根据饮食类型编号查询餐馆列表失败，系统出现异常！");
        }
    }
}
