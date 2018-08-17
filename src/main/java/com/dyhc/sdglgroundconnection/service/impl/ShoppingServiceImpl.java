package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ScenicspotMapper;
import com.dyhc.sdglgroundconnection.mapper.ShoppingMapper;
import com.dyhc.sdglgroundconnection.pojo.HotelExample;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.ShoppingExample;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物业务实现
 **/
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Autowired
    private ScenicspotMapper scenicspotMapper;

    @Override
    public PageInfo<Shopping> listPageShoppingByShoppingSite(Integer pageNo, Integer pageSize, String shoppingSite) {
        PageHelper.startPage(pageNo, pageSize, true);
        ShoppingExample shoppingExample =new ShoppingExample();
        ShoppingExample.Criteria criteria=shoppingExample.createCriteria();
        criteria.andShoppingsiteLike("%"+shoppingSite+"%");
        criteria.andWhetherdelEqualTo(0);
        List<Shopping> shoppingList =shoppingMapper.selectByExample(shoppingExample);
        for (Shopping shopping: shoppingList) {
            shopping.setScenicspot(scenicspotMapper.selectByPrimaryKey(shopping.getScenicSpotId()));
        }
        PageInfo<Shopping> pageInfo =new PageInfo<>(shoppingList);

        return pageInfo;
    }

    @Override
    public List<Scenicspot> listScenicspotAll() {

        return scenicspotMapper.selectAll();
    }

    @Override
    public Integer saveShoppingInfo(Shopping shopping) {
        shopping.setWhetherDel(0);
        return shoppingMapper.insert(shopping);
    }

    @Override
    public Shopping getShoppingInfoByShoppingId(Integer shoppingId) {
        return shoppingMapper.selectByPrimaryKey(shoppingId);
    }

    @Override
    public Integer updateShoppingInfo(Shopping shopping) {
        return shoppingMapper.updateByPrimaryKey(shopping);
    }

    @Override
    public Integer deleteShoppingByShoppingId(Integer shoppingId) throws Exception {
        return shoppingMapper.deleteShoppingByShoppingId(shoppingId);
    }


}
