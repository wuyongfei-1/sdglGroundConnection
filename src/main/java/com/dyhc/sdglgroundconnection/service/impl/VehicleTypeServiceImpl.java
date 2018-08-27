package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.VehicleTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import com.dyhc.sdglgroundconnection.pojo.VehicletypeExample;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 车辆类型业务实现
 **/
@Service
public class VehicleTypeServiceImpl implements VehicleTypeService {

    @Autowired
    private VehicleTypeMapper vehicleTypeMapper;

    @Autowired
    private DictionariesService dictionariesService;

    /**
     * 根据公司编号获取车辆类型列表信息（wuyongfei）
     *
     * @param rentalId 公司编号
     * @return 车辆类型列表
     * @throws Exception 全局异常
     */
    @Override
    public List<VehicleType> listVehicleTypesByRentalId(Integer rentalId) throws Exception {
        VehicletypeExample vehicletypeExample = new VehicletypeExample();
        VehicletypeExample.Criteria criteria = vehicletypeExample.createCriteria();
        // 拼接条件
        criteria.andCarrentalidEqualTo(rentalId);
        // 开始查询
        List<VehicleType> vehicleTypes = vehicleTypeMapper.selectByExample(vehicletypeExample);
        for (VehicleType vehicleType : vehicleTypes) {
            // 查询车辆类型名称
            Dictionaries vehicle = dictionariesService.getDictionariesByTypeCodeAndValueId("VEHICLE",
                    rentalId != null ? rentalId : 1);
            // 完善（填充）对象
            vehicleType.setVehicleTypeName(vehicle.getValueContent1());
        }
        return vehicleTypes;
    }

    /**
     * 根据汽车公司类型id删除公司汽车(lixiaojie)
     *
     * @param VehicleTypeId
     * @return
     */
    @Override
    @RecordOperation(type = "车辆类型", desc = "删除了一条车辆类型信息")
    public Integer deleteVehicleTypeByVehicleTypeId(Integer VehicleTypeId) {
        VehicleType vehicleType = vehicleTypeMapper.selectByPrimaryKey(VehicleTypeId);
        vehicleType.setWhetherDel(0);
        return vehicleTypeMapper.updateByPrimaryKey(vehicleType);
    }

    /**
     * 添加车辆类型信息(lixiaojie)
     *
     * @param vehicleType
     * @return
     */
    @Override
    @RecordOperation(type = "车辆类型", desc = "新增了一条车辆类型信息")
    public Integer saveVehicleTypeInfo(VehicleType vehicleType) {
        vehicleType.setWhetherDel(0);
        return vehicleTypeMapper.insert(vehicleType);
    }

    /**
     * 根据车辆类型id查询车辆类型信息(lixiaojie)
     *
     * @return
     */
    @Override
    public VehicleType getVehicleTypeInfoByTypeId(Integer TypeId) {
        return vehicleTypeMapper.selectByPrimaryKey(TypeId);
    }

    /**
     * 修改车辆类型信息(lixiaojie)
     *
     * @param vehicleType
     * @return
     */
    @Override
    @RecordOperation(type = "车辆类型", desc = "修改了一条车辆类型信息")
    public Integer updateVehicleTypesInfo(VehicleType vehicleType) {
        vehicleType.setWhetherDel(0);
        return vehicleTypeMapper.updateByPrimaryKey(vehicleType);
    }
}
