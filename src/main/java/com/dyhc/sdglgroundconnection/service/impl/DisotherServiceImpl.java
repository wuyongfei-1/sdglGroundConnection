package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DisotherMapper;
import com.dyhc.sdglgroundconnection.pojo.Disother;
import com.dyhc.sdglgroundconnection.pojo.Disshopp;
import com.dyhc.sdglgroundconnection.pojo.DisshoppExample;
import com.dyhc.sdglgroundconnection.service.DisotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度其他业务实现
 **/
@Service
public class DisotherServiceImpl implements DisotherService {

    @Autowired
    private DisotherMapper disotherMapper;

    /**
     * 添加调度的其他信息
     *
     * @param disother 调度其他信息对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度其他", desc = "添加了一条调度其他的信息")
    public Integer saveDisotherInfo(Disother disother) throws DispatchException {
        return disotherMapper.insert(disother);
    }

    /**
     * 根据调度信息编号查询调度其他信息（wuyongfei）
     *
     * @param dispatchId 调度编号
     * @return
     * @throws Exception
     */
    @Override
    public Disother listDisshippingByDisId(Integer dispatchId) throws Exception {
        DisshoppExample disshoppExample = new DisshoppExample();
        DisshoppExample.Criteria criteria = disshoppExample.createCriteria();
        criteria.andOfferidEqualTo(dispatchId);
        List<Disother> disothers = disotherMapper.selectByExample(disshoppExample);
        return disothers != null && disothers.size() > 0 ? disothers.get(0) : null;
    }
}
