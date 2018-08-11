package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.VehicleTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@RestController
public class VehicleTypeController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(VehicleTypeController.class);

    @Autowired
    private VehicleTypeService vehicleTypeService;
}
