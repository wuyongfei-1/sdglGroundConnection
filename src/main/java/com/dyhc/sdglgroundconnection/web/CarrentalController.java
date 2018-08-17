package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Carrental;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.service.CarrentalService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 汽车租赁公司 控制层
 **/
@RestController
@RequestMapping("/carrental")
public class CarrentalController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(CarrentalController.class);

    @Autowired
    private CarrentalService carrentalService;

    /**
     *  新增车辆公司信息 （lixiaojie)
     * @param carRentalName
     * @param companyAddress
     * @param contacts
     * @param phone
     * @param vehicleTypes
     * @return
     */
    @RequestMapping(value = "/saveCarrentalInfo",method = RequestMethod.POST )
    public ReponseResult saveCarrentalInfo(String carRentalName ,String companyAddress  ,String contacts  ,String phone ,String vehicleTypes){
        try {
            Carrental carrental =new Carrental();
            carrental.setCarRentalName(carRentalName);
            carrental.setCompanyAddress(companyAddress);
            carrental.setContacts(contacts);
            carrental.setPhone(phone);
            int result=carrentalService.saveCarrentalInfo(carrental,vehicleTypes);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","新增车辆公司信息成功！");
                logger.info(" method:carrentalService  新增车辆公司信息成功！");

            }else{
                date= ReponseResult.ok("0","新增车辆公司信息失败！");
                logger.info(" method:carrentalService  新增车辆公司信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:carrentalService  新增车辆公司信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 分页查询车辆公司信息   （lixiaojie)
     * @param pageNo    当前页
     * @param pageSize  每页大小
     * @param carRentalName 车辆公司名称
     * @return
     */
    @RequestMapping(value = "/listPageInfoByCarRentalName",method = RequestMethod.POST)
    public ReponseResult listPageInfoByCarRentalName(Integer pageNo, Integer pageSize, String carRentalName) {
        try {
            pageSize = 6;
            PageInfo<Carrental> pageInfo = carrentalService.listPageInfoByCarRentalName( pageNo,  pageSize, carRentalName);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取车辆公司信息成功！");

            logger.info(" method:listPageInfoByCarRentalName  分页获取车辆公司信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listPageInfoByCarRentalName  分页获取车辆公司信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 获取所有公司车辆类型信息 （lixiaojie)
     * @return
     */
    @RequestMapping(value = "/listDictionariesInfoByVEHICLE",method = RequestMethod.POST)
    public ReponseResult listDictionariesInfoByVEHICLE() {
        try {
            ReponseResult<List> data = ReponseResult.ok(carrentalService.listDictionariesInfoByVEHICLE(), "获取所有公司车辆类型信息成功！");

            logger.info(" method:listDictionariesInfoByVEHICLE  获取所有公司车辆类型信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listDictionariesInfoByVEHICLE  获取所有公司车辆类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
