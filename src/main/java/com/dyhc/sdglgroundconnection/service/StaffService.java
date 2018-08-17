package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.PageInfo;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务接口
 **/
public interface StaffService {

    /**
     * 根据staffId删除修改状态
     * @return
     */
    Integer updateStaffWhetherDel( Integer staffId);
    /**
     * 修改用户信息
     * @param staff
     * @return
     */
    Integer updateStaffInfo(Staff staff);

    /**
     * 修改用户信息（yunguohao）
     */
    int updateStaffs(Staff staff) throws Exception;

    /**
     * 修改密码
     */
    int updateStaffpas(Staff staff)throws Exception;
    /**
     * 根据用户id获取用户信息
     * @param staffId
     * @return
     */
    Staff getStaffInfoByStaffId(Integer staffId);

    /**
     * 根据用户id删除用户信息
     * @param id
     * @return
     */
    Integer deleteStaffBystaffId(Integer id);

    /**
     * 根据 staffname createDate roleId  分页查询人员信息(lixiaojie)
     * @return
     */
    PageInfo<Staff> listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate,String lastDate, Integer roleId);

    /**
     * 添加用户信息(lixiaojie)
     * @param staff
     * @return
     */
    Integer saveStaffInfo(Staff staff);
    /**
     * 根据用户名返回用户信息（dubingkun）
     * @param username
     * @return
     */
    Staff loginCheck(String username);
}
