package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.StaffMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.crypto.Des;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务实现
 **/
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;
    private int flag;

    @Override
    @RecordOperation(type = "用户", desc = "删除了一条用户信息")
    public Integer updateStaffWhetherDel(Integer staffId) {
        return staffMapper.updateStaffWhetherDel(staffId);
    }

    @Override
    @RecordOperation(type = "用户", desc = "修改了一条用户信息")
    public Integer updateStaffInfo(Staff staff) {
        return staffMapper.updateStaffInfo(staff);
    }

    @Override
    public Staff getStaffInfoByStaffId(Integer staffId) {
        return staffMapper.selectByPrimaryKey(staffId);
    }

    @Override
    public Integer deleteStaffBystaffId(Integer id) {
        return staffMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据 staffname createDate roleId  分页查询人员信息(lixiaojie)
     *
     * @return
     */
    @Override
    public PageInfo<Staff> listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate, String lastDate, Integer roleId) {
        PageHelper.startPage(pageNo, pageSize, true);
        PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffMapper.listGetStaffsByNameAndCreateDateAndRoleId(staffname, firstDate, lastDate, roleId));
        return pageInfo;
    }

    /**
     *  新增用戶信息
     * @param staff
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "新增了一条用户信息")
    public Integer saveStaffInfo(Staff staff) {
        staff.setWhetherDel(0);

        staff.setPassword(EncryUtil.encrypt("123456"));//密码加密
        SimpleDateFormat sdf = new SimpleDateFormat("ss");//获取当前秒
        Date date = new Date();
        String currentDateTime = sdf.format(date);//将秒转成字符串

        int flag = new Random().nextInt(99) + 1000;//生成随机数
        flag = (int) Math.floor(flag);
        if (flag < 1) {
            flag += 1;
        }


        String TheUserName = "SDGL" + currentDateTime + flag;//拼接这些字符
        staff.setTheUserName(TheUserName);
        return staffMapper.insert(staff);
    }


    /**
     * 登录验证（dubingkun）
     *
     * @param username
     * @return
     */
    public Staff loginCheck(String username) {
        return staffMapper.getByTheUserName(username);
    }
}
