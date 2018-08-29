package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.TravelMapper;
;
import com.dyhc.sdglgroundconnection.pojo.Travel;
import com.dyhc.sdglgroundconnection.service.TravelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社业务实现
 **/
@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelMapper travelMapper;

    /**
     * 获取所有的旅行社（不分页）（wuyongfei）
     *
     * @return 旅行社列表
     * @throws DispatchException 调度异常
     */
    @Override
    public List<Travel> listAllTravels() throws DispatchException {
        return travelMapper.selectAll();
    }

    /**
     * 组团社名称分页查询（yunguohao）
     *
     * @param pageNo
     * @param PageSize
     * @param travel
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<Travel> listCompany(Integer pageNo, Integer PageSize, Travel travel) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Travel> pageInfo = new PageInfo<>(travelMapper.selectTravelName(travel));
        return pageInfo;
    }

    /**
     * 组团社增加（yunguohao）
     *
     * @param travel
     * @return
     */
    @Override
    @RecordOperation(type = "组团社", desc = "添加了一条组团社信息")
    public int insertTravels(Travel travel) {
        travel.setWhetherDel(0);
        return travelMapper.insert(travel);
    }

    /**
     * 组团社修改（yunguohao）
     *
     * @param travel
     * @return
     */
    @Override
    @RecordOperation(type = "组团社", desc = "修改了一条组团社信息")
    public int updateTravels(Travel travel) {
        Travel offtrave=travelMapper.selectByPrimaryKey(travel.getTravelId());
        travel.setUpdateBy(travel.getUpdateBy());
        travel.setUpdateDate(travel.getUpdateDate());
        travel.setCreateBy(offtrave.getCreateBy());
        travel.setCreateDate(offtrave.getCreateDate());
        travel.setWhetherDel(0);
        return travelMapper.updateByPrimaryKey(travel);
    }

    /**
     * 组团社删除（yunguohao）
     *
     * @param travelid
     * @return
     */
    @Override
    @RecordOperation(type = "组团社", desc = "删除了一条组团社信息")
    public int deleteTravelByIDs(int travelid) throws Exception {
        return travelMapper.deleteTravel(travelid);
    }

    /**
     * 组团社id查询（yunguohao）
     *
     * @param id
     * @return
     */
    @Override
    public Travel selectTravelByIds(int id) {
        return travelMapper.selectByPrimaryKey(id);
    }
}
