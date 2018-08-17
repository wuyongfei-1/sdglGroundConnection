package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ScenicspotMapper;
import com.dyhc.sdglgroundconnection.mapper.ShoppingMapper;
<<<<<<< HEAD
import com.dyhc.sdglgroundconnection.pojo.HotelExample;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
=======
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
>>>>>>> 56d89aea00fa34027c84a431f1364c58d197ee4f
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.ShoppingExample;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import javax.persistence.criteria.CriteriaBuilder;
>>>>>>> 56d89aea00fa34027c84a431f1364c58d197ee4f
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物业务实现
 **/
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

<<<<<<< HEAD
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


=======
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

    /**
     * 修改购物信息 （wangtao）
     * @param shopping 参数购物对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    public Integer updateShopping(Shopping shopping) throws Exception {
        return shoppingMapper.updateByPrimaryKey(shopping);
    }
>>>>>>> 56d89aea00fa34027c84a431f1364c58d197ee4f
}
