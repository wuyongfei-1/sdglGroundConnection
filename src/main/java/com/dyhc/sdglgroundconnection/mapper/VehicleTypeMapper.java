package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 车辆类型
 **/
@Mapper
@Component
public interface VehicleTypeMapper extends CommonMapper<VehicleType> {

    /**
     * 根据用车公司id获取该公司的车辆类型（lixiaojie）
     * @param carRentalId
     * @return
     */
    List<VehicleType> getVehiclesTypeByCarRentalId(@Param("carRentalId") Integer carRentalId);

}
