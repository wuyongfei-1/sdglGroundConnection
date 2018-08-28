package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import com.dyhc.sdglgroundconnection.service.VehicleTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 车辆类型 控制层
 **/
@RestController
@RequestMapping("/vehicleType")
public class VehicleTypeController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(VehicleTypeController.class);

    @Autowired
    private VehicleTypeService vehicleTypeService;

    /**
     * 根据公司编号获取所属的所有车辆类型信息（wuyongfei）
     *
     * @param rentalId 公司编号
     * @return 响应结果
     */
    @GetMapping("/vehicleType/details/{rentalId}.html")
    public ReponseResult showAllVehicleTypesInfoByRentalId(@PathVariable Integer rentalId) {
        try {
            List<VehicleType> vehicleTypes = vehicleTypeService.listVehicleTypesByRentalId(rentalId);
            logger.info("method:showAllVehicleTypesInfoByRentalId  根据公司编号获取所属的所有车辆类型信息成功！");
            return ReponseResult.ok(vehicleTypes, "根据公司编号获取所属的所有车辆类型信息成功！");
        } catch (Exception e) {
            logger.error("method:showAllVehicleTypesInfoByRentalId 根据公司编号获取所属的所有车辆类型信息失败，系统出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("根据公司编号获取所属的所有车辆类型信息失败，系统出现异常！");
        }
    }

    /**
     * 根据id删除公司车辆类型信息 （lixiaojie)
     *
     * @param VehicleTypeId
     * @return
     */
    @RequestMapping(value = "/deleteVehicleTypeByVehicleTypeId", method = RequestMethod.POST)
    public ReponseResult deleteVehicleTypeByVehicleTypeId(Integer VehicleTypeId) {
        try {
            int result = vehicleTypeService.deleteVehicleTypeByVehicleTypeId(VehicleTypeId);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "删除公司车辆类型信息成功！");
                logger.info(" method:deleteVehicleTypeByVehicleTypeId  删除公司车辆类型信息成功！");
            } else {
                date = ReponseResult.ok("0", "删除公司车辆类型信息失败！");
                logger.info(" method:deleteVehicleTypeByVehicleTypeId  删除公司车辆类型信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:deleteVehicleTypeByVehicleTypeId  删除公司车辆类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据车辆类型id获取公司车辆类型信息 (lixiaojie)
     *
     * @param VehicleTypeId
     * @return
     */
    @RequestMapping(value = "/getVehicleTypeInfoByTypeId", method = RequestMethod.POST)
    public ReponseResult getVehicleTypeInfoByTypeId(Integer VehicleTypeId) {
        ReponseResult<VehicleType> data;
        try {
            VehicleType vehicleType = vehicleTypeService.getVehicleTypeInfoByTypeId(VehicleTypeId);
            data = ReponseResult.ok(vehicleType, "根据车辆类型id获取公司车辆类型信息成功！");
            logger.info(" method:getVehicleTypeInfoByTypeId  根据车辆类型id获取公司车辆类型信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getVehicleTypeInfoByTypeId  根据车辆类型id获取公司车辆类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改公司车辆类型信息 (lixiaojie)
     */
    @RequestMapping(value = "/updateVehicleTypesInfo", method = RequestMethod.POST)
    public ReponseResult updateVehicleTypesInfo(VehicleType vehicleType,HttpServletRequest request) {
        try {
            Staff staff= (Staff) request.getSession().getAttribute("user");
            vehicleType.setUpdateBy(staff!=null?staff.getStaffId():1);
            vehicleType.setUpdateDate(new Date());
            int result = vehicleTypeService.updateVehicleTypesInfo(vehicleType);

            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改公司车辆类型信息成功！");
                logger.info(" method:updateVehicleTypesInfo  修改公司车辆类型信息成功！");

            } else {
                date = ReponseResult.ok("0", "修改公司车辆类型信息成功失败！");
                logger.info(" method:updateVehicleTypesInfo  修改公司车辆类型信息成功失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateVehicleTypesInfo  修改公司车辆类型信息成功失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 增加车辆类型信息 (lixiaojie)
     */
    @RequestMapping(value = "/saveVehicleTypeInfo", method = RequestMethod.POST)
    public ReponseResult saveVehicleTypeInfo(VehicleType vehicleType, HttpServletRequest request) {
        try {
            Staff staff= (Staff) request.getSession().getAttribute("user");
            vehicleType.setCreateBy(staff!=null?staff.getStaffId():1);
            vehicleType.setCreateDate(new Date());
            vehicleType.setTypeCode("VEHICLE");
            int result = vehicleTypeService.saveVehicleTypeInfo(vehicleType);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "增加车辆类型信息成功！");
                logger.info(" method:saveVehicleTypeInfo  增加车辆类型信息成功！");

            } else {
                date = ReponseResult.ok("0", "增加车辆类型信息失败！");
                logger.info(" method:saveVehicleTypeInfo  增加车辆类型信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:saveVehicleTypeInfo  增加车辆类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
