package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.ScenicspotMapper;
import com.dyhc.sdglgroundconnection.mapper.ShoppingMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.service.ScenicspotService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 景点业务实现
 **/
@Service
public class ScenicspotServiceImpl implements ScenicspotService {

    @Autowired
    private ScenicspotMapper scenicspotMapper;

    @Autowired
    private ShoppingMapper shoppingMapper;

    /**
     * 条件查询景点信息分页 wangtao
     * @param pageNo  当前页面
     * @param PageSize 每页显示数
     * @param scenicspot 参数对象
     * @return 返回pageInfo集合
     * @throws Exception
     */
    @Override
    public PageInfo<Scenicspot> listScenicspot(Integer pageNo, Integer PageSize, Scenicspot scenicspot) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        //一、查询所有景点信息
        List<Scenicspot> scenicspotList=scenicspotMapper.ListScenicspot(scenicspot);
        //二、根据景点编号查询景点下的购物信息给景点对象的购物信息集合赋值
        for (Scenicspot scenicspots: scenicspotList) {
            scenicspots.setScenicspotList(shoppingMapper.getShoppingByScenicspotId(scenicspots.getScenicSpotId()));
        }
        PageInfo<Scenicspot> pageInfo = new PageInfo<>(scenicspotList);
        return pageInfo;
    }

    /**
     *  新增方法 wangtao
     * @param s 景点信息参数对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    public Integer insertScenicspot(Scenicspot s) throws Exception {
        Integer result=scenicspotMapper.saveScenicspotInfo(s);
        return result;
    }

    /**
     * 查询所有父景点  wangtao
     * @return 返回父景点对象集合
     * @throws Exception
     */
    @Override
    public PageInfo<Scenicspot> ListScenicspotByParentId() throws Exception {
        PageInfo<Scenicspot> pageInfo = new PageInfo<>(scenicspotMapper.ListScenicspotByParentId());
        return pageInfo;
    }

    /**
     * 根据编号修改景点信息
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    public Integer updateScenicspot(Scenicspot scenicspot) throws Exception {
        return scenicspotMapper.updateByPrimaryKey(scenicspot);
    }

    /**
     * 根据id查询景点信息
     * @return
     * @throws Exception
     */
    @Override
    public Scenicspot getScenicspotById(Integer id) throws Exception {
        return scenicspotMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据id删除景点信息
     * @param id id编号
     * @return
     * @throws Exception
     */
    @Override
    public Integer deleteScenicspotById(Integer id) throws Exception {
        return scenicspotMapper.deleteByPrimaryKey(id);
    }


}
