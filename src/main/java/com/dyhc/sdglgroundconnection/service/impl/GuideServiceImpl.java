package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游业务实现
 **/
@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;

    /**
     * 导游名称分页查询
     * @param pageNo
     * @param PageSize
     * @param guide
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<Guide> listGuide(Integer pageNo, Integer PageSize, Guide guide) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Guide> pageInfo = new PageInfo<>(guideMapper.selectGuideName(guide));
        return pageInfo;
    }

    /**
     * 导游添加
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "添加了一条导游信息")
    public int insertGuide(Guide guide) {
        guide.setWhetherDel(0);
        guide.setState(3);
        return guideMapper.insert(guide);
    }
    /**
     * 导游修改
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "修改了一条导游信息")
    public int updateGuide(Guide guide) {
        guide.setWhetherDel(0);
        return guideMapper.updateByPrimaryKey(guide);
    }
    /**
     * 导游删除
     * @param guideid
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "删除了一条导游信息")
    public int deleteGuideByIDs(int guideid) {
        return guideMapper.deleteGuide(guideid);
    }
    /**
     * 导游id查询
     * @param id
     * @return
     */
    @Override
    public Guide selectGuideByIds(int id) {
        return guideMapper.selectByPrimaryKey(id);
    }
}
