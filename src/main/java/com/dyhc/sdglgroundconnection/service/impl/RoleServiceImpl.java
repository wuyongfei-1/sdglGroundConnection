package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.RoleMapper;
import com.dyhc.sdglgroundconnection.pojo.Role;
import com.dyhc.sdglgroundconnection.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 角色业务实现
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 显示角色类型信息（lixiaoeji）
     * @return
     */
    @Override
    public List<Role> showGroupByRolenameRolesInfo() throws Exception {
        return roleMapper.listRolesGroupByRolename();
    }
}
