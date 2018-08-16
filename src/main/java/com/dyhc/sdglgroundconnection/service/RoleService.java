package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 角色业务接口
 **/
public interface RoleService {
    /**
     * 显示角色类型信息（lixiaoeji）
     * @return
     */
    List<Role> showGroupByRolenameRolesInfo() throws Exception;
}
