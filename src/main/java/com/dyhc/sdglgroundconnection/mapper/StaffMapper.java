package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员
 **/
@Mapper
@Component
public interface StaffMapper extends CommonMapper<Staff>{


    /**
     * 根据 staffname createDate roleId 查询人员信息(lixiaojie)
     * @return
     */
    List<Staff> listGetStaffsByNameAndCreateDateAndRoleId(@Param("staffname") String staffname, @Param("firstDate")  String firstDate, @Param("lastDate")  String lastDate, @Param("roleId")  Integer roleId);
}
