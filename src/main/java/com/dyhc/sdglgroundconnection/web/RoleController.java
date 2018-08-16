package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.service.RoleService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 角色 控制层
 **/
@RestController
@RequestMapping("/role")
public class RoleController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/showGroupByRolenameRolesInfo",method = RequestMethod.POST)
    public ReponseResult showGroupByRolenameRolesInfo() {
        try {

            ReponseResult<List> data = ReponseResult.ok(roleService.showGroupByRolenameRolesInfo(), "获取角色类型信息成功！");
            logger.info(" method:showGroupByRolenameRolesInfo  获取角色类型信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showGroupByRolenameRolesInfo  获取角色类型信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
