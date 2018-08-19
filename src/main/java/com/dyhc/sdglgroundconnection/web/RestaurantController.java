package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.dto.RestaurantParam;
import com.dyhc.sdglgroundconnection.pojo.MealType;
import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.dyhc.sdglgroundconnection.utils.FileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
    public ReponseResult saveMealTypeInfoByRestaurantId(MealType mealType, HttpServletRequest request) {
        try {
            Staff staff = (Staff) request.getSession().getAttribute("user");
            mealType.setCreateBy(staff == null ? 1 : staff.getStaffId());
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
    public ReponseResult updateMealTypeById(MealType mealType, HttpServletRequest request) {
        try {
            Staff staff = (Staff) request.getSession().getAttribute("user");
            mealType.setUpdateBy(staff == null ? 1 : staff.getStaffId());
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
     * 通过饮食类型编号获取饮食类型对象
     *
     * @param mealTypeId 饮食类型编号
     * @return
     */
    @GetMapping(value = "/mealType/detail/{id}.html")
    public ReponseResult getMealTypeById(@PathVariable(value = "id") Integer mealTypeId) {
        try {
            MealType mealType = restaurantService.getMealTypeById(mealTypeId);
            logger.info(" method: getMealTypeById  获取饮食类型详细信息成功");
            return ReponseResult.ok(mealType, "获取餐馆信息成功！");
        } catch (Exception e) {
            logger.info(" method: getMealTypeById  获取饮食类型信息失败");
            e.printStackTrace();
            return ReponseResult.err("获取饮食类型信息失败！");
        }
    }

    /**
     * 通过餐馆编号获取餐馆对象
     *
     * @param restaurantId 餐馆编号
     * @return
     */
    @GetMapping(value = "/restaurant/detail/{id}.html")
    public ReponseResult getRestaurantById(@PathVariable(value = "id") Integer restaurantId) {
        try {
            Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
            logger.info(" method: getRestaurantById  获取餐馆详细信息成功");
            return ReponseResult.ok(restaurant, "获取餐馆信息成功！");
        } catch (Exception e) {
            logger.info(" method: getRestaurantById  获取餐馆信息失败");
            e.printStackTrace();
            return ReponseResult.err("获取餐馆信息失败！");
        }
    }

    /**
     * 根据餐馆编号修改餐馆信息（wuyongfei）
     *
     * @param restaurantImg 餐馆门面照
     * @return 修改结果
     */
    @PostMapping(value = "/restaurant/update")
    public ReponseResult updateRestaurantsById(HttpServletRequest request, @RequestParam("restaurantImg") MultipartFile restaurantImg) {
        try {
            String restaurantObj = request.getParameter("restaurantObj");
            // 将json转换为javaType
            ObjectMapper objectMapper = new ObjectMapper();
            Restaurant restaurant = objectMapper.readValue(restaurantObj, Restaurant.class);
            if ("a.txt".equals(restaurantImg.getOriginalFilename())) { // 没有改变文件
                restaurant.setPicturePath("");
            } else { // 改变文件
                // 上传
                String uploadResult = FileUploadUtil.uploadImage(restaurantImg);
                if (ConditionValidation.validation(uploadResult)) {  // 上传成功
                    restaurant.setPicturePath(uploadResult);
                } else {  // 上传失败
                    logger.info(" method: updateRestaurantsById  修改餐馆信息失败");
                    return ReponseResult.err("修改餐馆信息失败！");
                }
            }
            restaurant.setWhetherDel(0);
            Staff user = (Staff) request.getSession().getAttribute("user");
            restaurant.setUpdateBy(user == null ? 1 : user.getStaffId());
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
     * @param restaurantImg 餐馆门面照
     * @return 添加结果
     */
    @PostMapping(value = "/restaurant/save")
    public ReponseResult saveRestaurantInfo(HttpServletRequest request, @RequestParam("restaurantImg") MultipartFile restaurantImg) {
        try {
            String restaurantObj = request.getParameter("restaurantObj");
            // 将json串转换为javaType
            ObjectMapper objectMapper = new ObjectMapper();
            Restaurant restaurant = objectMapper.readValue(restaurantObj, Restaurant.class);
            // 上传图片
            String uploadResult = FileUploadUtil.uploadImage(restaurantImg);
            if (ConditionValidation.validation(uploadResult)) {  // 上传成功
                restaurant.setPicturePath(uploadResult);
                Staff user = (Staff) request.getSession().getAttribute("user");
                if (ConditionValidation.validation(user)) {
                    restaurant.setCreateBy(user.getStaffId());
                } else {
                    restaurant.setCreateBy(1);
                }
                Integer saveResult = restaurantService.saveRestaurantInfo(restaurant);
                if (saveResult > 0) {
                    logger.info(" method: saveRestaurantInfo  添加餐馆信息成功");
                    return ReponseResult.ok("添加餐馆信息成功！");
                } else {
                    logger.info(" method: saveRestaurantInfo  添加餐馆信息失败");
                    return ReponseResult.err("添加餐馆信息失败！");
                }
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
