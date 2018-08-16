package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RestController
@RequestMapping("/staff")
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

    /**
     * 登录验证（dubingkun）
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/loginCheck")
    public ReponseResult loginCheck(HttpServletRequest httpServletRequest, String username, String password){
        ReponseResult<Integer> success;
        Staff sf=null;
        try {
            sf=staffService.loginCheck(username);
            logger.info(" method:loginCheck  获取对应用户信息成功！");
            if(sf==null){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            if(!sf.getPassword().equals(EncryUtil.encrypt(password))){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            httpServletRequest.getSession().setAttribute("user",sf);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(" method:loginCheck  获取对应用户信息失败，系统出现异常！");
            success= ReponseResult.ok(-1,password);
        }
        success= ReponseResult.ok(sf.getRoleId(),"验证成功！");
        return success;
    }
}
