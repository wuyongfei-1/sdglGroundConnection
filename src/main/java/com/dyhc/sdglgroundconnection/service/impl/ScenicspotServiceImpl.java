package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.mapper.ScenicspotMapper;
import com.dyhc.sdglgroundconnection.mapper.ShoppingMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.ScenicspotService;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
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
    private ShoppingService shoppingService;

    @Autowired
    private DictionariesMapper dictionariesMapper;

    @Autowired
    private ShoppingMapper shoppingMapper;

    /**
     * 通过父级编号查询子景点的所有信息（wuyongfei）
     *
     * @param parentId 父级编号
     * @return 景点列表
     * @DispatchException 调度异常
     */
    @Override
    public List<Scenicspot> listScenicspotByParentId(Integer parentId) throws DispatchException {
        // 拼接条件
        ScenicspotExample scenicspotExample = new ScenicspotExample();
        ScenicspotExample.Criteria criteria = scenicspotExample.createCriteria();
        criteria.andParentidEqualTo((parentId != null && parentId > 0) ? parentId : 0);
        // 执行查询
        List<Scenicspot> scenicspots = scenicspotMapper.selectByExample(scenicspotExample);
        return scenicspots;
    }

    /**
     * 条件查询景点信息分页 （wangtao）
     *
     * @param pageNo     当前页面
     * @param PageSize   每页显示数
     * @param scenicspot 参数对象
     * @return 返回pageInfo集合
     * @throws Exception
     */
    @Override
    public PageInfo<Scenicspot> listScenicspot(Integer pageNo, Integer PageSize, Scenicspot scenicspot) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        //一、查询所有景点信息
        List<Scenicspot> scenicspotList = scenicspotMapper.ListScenicspots(scenicspot);
        //二、根据景点编号查询景点下的购物信息给景点对象的购物信息集合赋值
        for (Scenicspot scenicspots : scenicspotList) {
            if (scenicspots.getParentId() == 0) {
                scenicspots.setParentScenicSpotName("无");
            } else {
                Scenicspot s = scenicspotMapper.selectByPrimaryKey(scenicspots.getParentId());
                scenicspots.setParentScenicSpotName(s.getScenicSpotName());
            }
            //给每个景点信息的购物集合赋值
            scenicspots.setScenicspotList(shoppingMapper.getShoppingByScenicspotId(scenicspots.getScenicSpotId()));
            DictionariesExample dictionariesExample = new DictionariesExample();
            DictionariesExample.Criteria criteria = dictionariesExample.createCriteria();
            criteria.andTypecodeEqualTo("ATTRACTIONS");
            criteria.andValueidEqualTo(scenicspots.getTypeId());
            List<Dictionaries> d = dictionariesMapper.selectByExample(dictionariesExample);
            if (d.size() > 0) {
                scenicspots.setTypeName(d.get(0).getValueContent1());
            }
        }
        PageInfo<Scenicspot> pageInfo = new PageInfo<>(scenicspotList);
        return pageInfo;
    }

    /**
     * 新增方法 （wangtao）
     *
     * @param s 景点信息参数对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "景点信息", desc = "增加一条景点信息")
    public Integer insertScenicspot(Scenicspot s) throws Exception {
        Integer result = scenicspotMapper.saveScenicspotInfo(s);
        return result;
    }

    /**
     * 查询所有景点  （wangtao）
     *
     * @return 返回景点对象集合
     * @throws Exception
     */
    @Override
    public PageInfo<Scenicspot> ListScenicspot() throws Exception {
        PageInfo<Scenicspot> pageInfo = new PageInfo<>(scenicspotMapper.ListScenicspot());
        return pageInfo;
    }

    /**
     * 根据编号修改景点信息 （wangtao）
     *
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "景点信息", desc = "修改了一条景点信息")
    public Integer updateScenicspot(Scenicspot scenicspot) throws Exception {
        Integer result = scenicspotMapper.updateScenicspotInfoByParentId(scenicspot);
        return result;
    }

    /**
     * 根据id查询景点信息 （wangtao）
     *
     * @return
     * @throws Exception
     */
    @Override
    public Scenicspot getScenicspotById(Integer id) throws Exception {
        return scenicspotMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据id删除景点信息并删除景点下的购物点信息 （wangtao）
     *
     * @param id id编号
     * @return
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "景点信息", desc = "删除了一条景点信息")
    public Integer deleteScenicspotById(Integer id) throws Exception {
        List<Shopping> shoppingList = shoppingService.ListShoppingByScenicSpotId(id);
        if (shoppingList != null) {
            for (Shopping shopping : shoppingList) {
                Integer result1 = shoppingService.deleteShoppingById(shopping.getShoppingId());
            }
        }
        Integer result = scenicspotMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public List<Scenicspot> listScenicspot() throws Exception {
        return scenicspotMapper.selectAll();
    }


}
