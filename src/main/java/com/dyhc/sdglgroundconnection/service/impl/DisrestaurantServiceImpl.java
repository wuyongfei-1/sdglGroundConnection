package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisrestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Disrestaurant;
import com.dyhc.sdglgroundconnection.pojo.DisrestaurantExample;
import com.dyhc.sdglgroundconnection.service.DisrestaurantService;
import com.dyhc.sdglgroundconnection.service.MealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度餐厅业务实现
 **/
@Service
public class DisrestaurantServiceImpl implements DisrestaurantService {

    @Autowired
    private DisrestaurantMapper disrestaurantMapper;

    @Autowired
    private MealTypeService mealTypeService;

    /**
     * 根据调度编号和用餐时间进行查询 按权重升序排序
     * @param dispatchId 调度编号
     * @param dinDate 用餐时间
     * @return 返回调度餐厅集合
     */
    @Override
    public List<Disrestaurant> listDisrestaurantByDispatchId(Integer dispatchId, Integer dinDate) throws Exception {
        DisrestaurantExample disrestaurantExample=new DisrestaurantExample();
        DisrestaurantExample.Criteria criteria=disrestaurantExample.createCriteria();
        criteria.andOfferidEqualTo(dispatchId);
        criteria.andDindateEqualTo(dinDate);
        disrestaurantExample.setOrderByClause("weight asc");
        List<Disrestaurant> disrestaurantList=disrestaurantMapper.selectByExample(disrestaurantExample);
        for (Disrestaurant disrestaurant: disrestaurantList) {
            disrestaurant.setMealType(mealTypeService.getMealTypeById(disrestaurant.getTypeId()));
        }
        return disrestaurantList;
    }

    /**
     * 根据调度编号查询调度餐厅信息 （wangtao）
     * @param offId 调度编号
     * @return 调度餐厅集合
     */
    @Override
    public List<Disrestaurant> listDisrestaurantByOffId(Integer offId) throws Exception{
        DisrestaurantExample disrestaurantExample=new DisrestaurantExample();
        DisrestaurantExample.Criteria criteria=disrestaurantExample.createCriteria();
        criteria.andOfferidEqualTo(offId);
        List<Disrestaurant> disrestaurantList=disrestaurantMapper.selectByExample(disrestaurantExample);
        for (Disrestaurant disrestaurant: disrestaurantList) {
            disrestaurant.setMealType(mealTypeService.getMealTypeById(disrestaurant.getTypeId()));
        }
        return disrestaurantList;
    }

    /**
     * 批量添加多条调度餐馆对象信息（wuyongfei）
     *
     * @param disrestaurantList 餐馆列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度餐馆", desc = "批量添加了多条餐馆信息")
    public Integer saveDisrestaurantInfo(List<Disrestaurant> disrestaurantList) throws DispatchException {
        return disrestaurantMapper.insertList(disrestaurantList);
    }
}
