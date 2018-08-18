package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 车辆类型业务接口
 **/
public interface VehicleTypeService {
    /**
     * 根据汽车公司类型id删除公司汽车(lixiaojie)
     * @param VehicleTypeId
     * @return
     */
    Integer deleteVehicleTypeByVehicleTypeId(Integer VehicleTypeId);


    /**
     * 添加车辆类型信息(lixiaojie)
     * @param vehicleType
     * @return
     */
    Integer saveVehicleTypeInfo(VehicleType vehicleType);

    /**
     * 根据车辆类型id查询车辆类型信息(lixiaojie)
     * @return
     */
    VehicleType getVehicleTypeInfoByTypeId(Integer TypeId);

    /**
     * 修改车辆类型信息(lixiaojie)
     * @param vehicleType
     * @return
     */
    Integer updateVehicleTypesInfo(VehicleType vehicleType);


}
