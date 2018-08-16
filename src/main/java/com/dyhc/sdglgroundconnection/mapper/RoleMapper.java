package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 角色
 **/
@Mapper
@Component
public interface RoleMapper extends CommonMapper<Role>{
    /**
     * 查询role表 并按照rolename分组    (lixiaojie)
     * @return
     */
    List<Role> listRolesGroupByRolename() throws  Exception;
}
