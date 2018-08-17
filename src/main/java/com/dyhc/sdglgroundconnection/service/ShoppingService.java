package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物业务接口
 **/
public interface ShoppingService {

    PageInfo<Shopping> listPageShoppingByShoppingSite(Integer pageNo, Integer pageSize, String shoppingSite);

    List<Scenicspot> listScenicspotAll();

    Integer saveShoppingInfo(Shopping shopping);

    Shopping  getShoppingInfoByShoppingId(Integer shoppingId);

    Integer updateShoppingInfo(Shopping shopping);

    Integer deleteShoppingByShoppingId( Integer shoppingId)throws Exception;
}
