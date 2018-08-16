package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ShoppingMapper;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.ShoppingExample;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物业务实现
 **/
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

    /**
     * 新增购物信息 （wangtao）
     * @param shopping 参数商品信息
     * @return 返回受影响行数
     */
    @Override
    public Integer insertInfo(Shopping shopping) throws Exception {
        return shoppingMapper.insert(shopping);
    }

    /**
     *  根据景点编号查询所有购物点信息 （wangtao）
     * @param scenicSpotId 景点编号
     * @return 返回购物点集合
     */
    @Override
    public List<Shopping> ListShoppingByScenicSpotId(Integer scenicSpotId) throws Exception {
        ShoppingExample shoppingExample=new ShoppingExample();
        ShoppingExample.Criteria criteria=shoppingExample.createCriteria();
        criteria.andScenicspotidEqualTo(scenicSpotId);
        List<Shopping> s=shoppingMapper.selectByExample(shoppingExample);
        return s;
    }

    /**
     * 根据id查询购物点信息
     * @return 返回购物点对象
     * @throws Exception
     */
    @Override
    public Shopping getShoppingById(Integer id) throws Exception {
        return shoppingMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据购编号删除购物点信息 （wangtao）
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    public Integer deleteShoppingById(Integer shoppingId) throws Exception {
        return shoppingMapper.deleteByPrimaryKey(shoppingId);
    }
}
