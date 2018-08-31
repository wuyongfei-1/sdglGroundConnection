package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DiscarMapper;
import com.dyhc.sdglgroundconnection.pojo.Discar;
import com.dyhc.sdglgroundconnection.pojo.DiscarExample;
import com.dyhc.sdglgroundconnection.service.DiscarService;
import com.dyhc.sdglgroundconnection.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车业务实现
 **/
@Service
public class DiscarServiceImpl implements DiscarService {

    @Autowired
    private DiscarMapper discarMapper;

    @Autowired
    private VehicleTypeService vehicleTypeService;

    /**
     * 根据调度编号获取调度用车信息(lixiaojie)
     * @param offId 调度编号
     * @return 返回调度用车对象
     */
    @Override
    public Discar getDiscarByOffId(Integer offId) throws Exception{
        DiscarExample discarExample=new DiscarExample();
        DiscarExample.Criteria criteria=discarExample.createCriteria();
        criteria.andOfferidEqualTo(offId);
        List<Discar> discarList=discarMapper.selectByExample(discarExample);
        Discar discar=null;
        if(discarList!=null){
            discar=discarList.get(0);
        }
        discar.setVehicleType(vehicleTypeService.getVehicleTypeInfoByTypeId(discar.getTypeId()));
        return discar;
    }

    /**
     * 添加调度用车信息（wuyongfei）
     *
     * @param discar 调度用车对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度用车", desc = "添加了一条调度用车信息")
    public Integer saveDiscarInfo(Discar discar) throws DispatchException {
        return discarMapper.insert(discar);
    }
}
