package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.pojo.Carrental;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.Staff;
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

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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
     * 根据公司id删除公司信息 （lixiaojie)
     * @param carrentalId
     * @return
     */

    @RequestMapping(value = "/deleteCarrentalInfoByCarrentalId",method = RequestMethod.POST )
    public ReponseResult deleteCarrentalInfoByCarrentalId(Integer carrentalId){
        try {
            int result=carrentalService.deleteCarrentalInfoByCarrentalId(carrentalId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除公司信息成功！");
                logger.info(" method:deleteCarrentalInfoByCarrentalId  删除公司信息成功！");

            }else{
                date= ReponseResult.ok("0","删除公司信息失败！");
                logger.info(" method:deleteCarrentalInfoByCarrentalId  删除公司信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteCarrentalInfoByCarrentalId  删除公司信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 根据用车公司id查询用车公司信息
     * @param carrentalId
     * @return
     */
    @RequestMapping(value = "/getCarrentalInfoByCarrentalId",method = RequestMethod.POST)
    public ReponseResult getCarrentalInfoByCarrentalId(Integer carrentalId ) {

        ReponseResult<Carrental> data;
        try {

            Carrental carrental=carrentalService.getCarrentalInfoByCarrentalId(carrentalId);


            data = ReponseResult.ok(carrental, "根据用车公司id查询用车公司信息成功！");

            logger.info(" method:getCarrentalInfoByCarrentalId  根据用车公司id查询用车公司信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getCarrentalInfoByCarrentalId  根据用车公司id查询用车公司信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改公司信息 (lixiaojie)
     */

    @RequestMapping(value = "/updateCarrentalInfo",method = RequestMethod.POST )
    public ReponseResult updateCarrentalInfo(Carrental carrental, HttpServletRequest request){
        try {
            Staff staff= (Staff) request.getSession().getAttribute("user");
            carrental.setUpdateBy(staff!=null?staff.getStaffId():1);
            carrental.setUpdateDate(new Date());
            int result=carrentalService.updateCarrentalInfo(carrental);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改车辆公司信息成功！");
                logger.info(" method:updateCarrentalInfo  修改车辆公司信息成功！");

            }else{
                date= ReponseResult.ok("0","修改车辆公司信息失败！");
                logger.info(" method:updateCarrentalInfo  修改车辆公司信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateCarrentalInfo  修改车辆公司信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     *  新增车辆公司信息 （lixiaojie)
     * @param carrental
     * @return
     */

    @RequestMapping(value = "/saveCarrentalInfo",method = RequestMethod.POST )
    public ReponseResult saveCarrentalInfo(Carrental carrental,HttpServletRequest request){
        try {
            Staff staff= (Staff) request.getSession().getAttribute("user");
            carrental.setCreateBy(staff!=null?staff.getStaffId():1);
            carrental.setCreateDate(new Date());
            int result=carrentalService.saveCarrentalInfo(carrental);
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
