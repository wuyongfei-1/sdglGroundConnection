package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RequestMapping("/StaffController")
@RestController
public class StaffController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;


    @RequestMapping(value = "/listPageGetStaffByNameAndCreateDateAndRoleId",method = RequestMethod.POST)
    public ReponseResult listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate,String lastDate, Integer roleId) {
        try {
            pageSize = 6;
            PageInfo<Staff> pageInfo = staffService.listPageGetStaffByNameAndCreateDateAndRoleId( pageNo,  pageSize,  staffname,   firstDate, lastDate,  roleId);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取人員信息成功！");

            logger.info(" method:showGroupByRolenameRolesInfo  获取角色类型信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showGroupByRolenameRolesInfo  获取角色类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 增加
     */
    @RequestMapping(value = "/saveStaffInfo",method = RequestMethod.POST )
    public ReponseResult saveStaffInfo(@RequestBody Staff staff){
        try {
            int result=staffService.saveStaffInfo(staff);
            System.out.println(result);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("{\"status\":1}","增加用户信息成功！");
                logger.info(" method:saveStaffInfo  增加用户信息成功！");

            }else{
                date= ReponseResult.ok("{\"status\":0}","增加用户信息失败！");
                logger.info(" method:saveStaffInfo  增加用户信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:saveStaffInfo  增加用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
