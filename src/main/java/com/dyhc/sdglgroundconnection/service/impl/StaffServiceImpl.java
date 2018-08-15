package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.StaffMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务实现
 **/
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    /**
     * 根据 staffname createDate roleId  分页查询人员信息(lixiaojie)
     * @return
     */
    @Override
    public PageInfo<Staff> listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate,String lastDate, Integer roleId) {
        PageHelper.startPage(pageNo, pageSize, true);
        PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffMapper.listGetStaffsByNameAndCreateDateAndRoleId(staffname, firstDate, lastDate,roleId));
        return pageInfo;
    }

    @Override
    public Integer saveStaffInfo(Staff staff) {

        return staffMapper.insert(staff);
    }


}
