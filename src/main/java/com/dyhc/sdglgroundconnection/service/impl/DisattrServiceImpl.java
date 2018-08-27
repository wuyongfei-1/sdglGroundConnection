package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisattrMapper;
import com.dyhc.sdglgroundconnection.pojo.Disattr;
import com.dyhc.sdglgroundconnection.pojo.DisattrExample;
import com.dyhc.sdglgroundconnection.service.DisattrService;
import com.dyhc.sdglgroundconnection.service.ScenicspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点业务实现
 **/
@Service
public class DisattrServiceImpl implements DisattrService {

    @Autowired
    private DisattrMapper disattrMapper;

    @Autowired
    private ScenicspotService scenicspotService;

    /**
     * 根据调度编号查询调度景点信息
     * @param offerId 调度编号
     * @return 调度景点集合
     */
    @Override
    public List<Disattr> listDisattrByOffId(Integer offerId)throws Exception {
        DisattrExample disattrExample=new DisattrExample();
        DisattrExample.Criteria criteria=disattrExample.createCriteria();
        criteria.andOfferidEqualTo(offerId);
        disattrExample.setOrderByClause("weight asc");
        List<Disattr> disattrList=disattrMapper.selectByExample(disattrExample);
        for (Disattr disattr: disattrList) {
            disattr.setScenicspot(scenicspotService.getScenicspotById(disattr.getScenicSpotId()));
        }
        return disattrList;
    }

    /**
     * 批量添加调度景点列表（wuyongfei）
     *
     * @param disattrList 调度景点列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度景点", desc = "批量添加了多条调度景点信息")
    public Integer saveDisattrInfoes(List<Disattr> disattrList) throws DispatchException {
        return disattrMapper.insertList(disattrList);
    }
}
