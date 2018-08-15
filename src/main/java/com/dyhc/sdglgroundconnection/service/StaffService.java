package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务接口
 **/
public interface StaffService {
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
}
