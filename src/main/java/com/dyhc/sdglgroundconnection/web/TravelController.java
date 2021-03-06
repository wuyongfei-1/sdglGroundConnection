package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.Travel;
import com.dyhc.sdglgroundconnection.service.TravelService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社 控制层
 **/
@RestController
@RequestMapping("/travel")
public class TravelController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(TravelController.class);

    @Autowired
    private TravelService travelService;

    /**
     * 获取所有的旅行社列表（wuyongfei）
     *
     * @return 响应结果
     */
    @GetMapping("/travel/all")
    public ReponseResult getAllTravel() {
        try {
            logger.info(" method:getAllTravel  获取组团社成功！");
            return ReponseResult.ok(travelService.listAllTravels(), "获取组团社成功！");
        } catch (Exception e) {
            logger.error(" method:getAllTravel  获取组团社成功，系统出现异常！");
            e.printStackTrace();
            return ReponseResult.err("系统出现异常！");
        }
    }


    /**
     * 分页查询
     *
     * @param pageNo
     * @param pageSize
     * @param travel
     * @return
     */
    @RequestMapping("/showAllTravel")
    public ReponseResult showTravel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize, Travel travel) {
        try {
            pageSize = 6;
            PageInfo<Travel> pageInfo = travelService.listCompany(pageNo, pageSize, travel);
            System.out.println("********************" + travel.getTravelName());
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取组团社成功！");
            logger.info(" method:showAllCompany  分页获取组团社成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showAllCompany  获取组团社数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 组团社增加（yunguohao）
     */
    @RequestMapping("/insertTravel")
    public ReponseResult insertCompany(Travel travel, HttpServletRequest request) {
        try {
            Staff sessionStaff=(Staff) request.getSession().getAttribute("user");
            travel.setCreateBy(sessionStaff!=null?sessionStaff.getStaffId():1);
            travel.setCreateDate(new Date());
            int result = travelService.insertTravels(travel);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "增加组团社成功！");
                System.out.println(date);
                logger.info(" method:insertCompany  增加组团社成功！");

            } else {
                date = ReponseResult.ok("0", "增加组团社失败！");
                logger.info(" method:insertCompany  增加组团社失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertCompany  增加组团社数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 组团社修改（yunguohao）
     */
    @RequestMapping("/updateTravel")
    public ReponseResult updateCompany(Travel travel,HttpServletRequest request) {
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            travel.setUpdateBy(sessionstaff!=null?sessionstaff.getStaffId():1);
            travel.setUpdateDate(new Date());
            int result = travelService.updateTravels(travel);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改组团社成功！");
                logger.info("method:updateCompany  修改组团社成功！");

            } else {
                date = ReponseResult.ok("0", "修改组团社失败！");
                logger.info(" method:updateCompany  修改组团社失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateCompany  修改组团社失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 组团社修改（yunguohao）
     */
    @RequestMapping("/deleteTravelByID")
    public ReponseResult deleteHotelByID(int travelid) {
        try {
            int result = travelService.deleteTravelByIDs(travelid);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "删除组团社成功！");
                logger.info(" method:deleteCompanyByID  删除组团社成功！");

            } else {
                date = ReponseResult.ok("0", "删除组团社失败！");
                logger.info(" method:deleteCompanyByID  删除组团社失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:deleteCompanyByID  删除组团社失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * id查询
     */
    @RequestMapping("/selectTravelById")
    public ReponseResult selectHotelById(int id) {
        try {
            Travel result = travelService.selectTravelByIds(id);
            System.out.println(result.getTravelName());
            ReponseResult<Travel> date;
            if (result != null) {
                date = ReponseResult.ok(result, "id组团社成功");
                logger.info(" method:selectCompanyById  id查询组团社成功！");

            } else {
                date = ReponseResult.ok("id查询组团社司失败！");
                logger.info(" method:selectCompanyById  id查询组团社失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:selectCompanyById  id查询组团社失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
