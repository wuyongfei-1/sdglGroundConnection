package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.RoleMapper;
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
    @Autowired
    private RoleMapper roleMapper;
    private int flag;
    /**
     * 根据staffId删除修改状态(lixiaojie)
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "删除了一条用户信息")
    public Integer updateStaffWhetherDel(Integer staffId)throws Exception {
        return staffMapper.updateStaffWhetherDel(staffId);
    }

    /**
     * 修改个人信息（lixiaojie）
     *
     * @param staff
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "修改了一条用户信息")
    public Integer updateStaffInfo(Staff staff) throws Exception {
        Staff oldStaff = staffMapper.selectByPrimaryKey(staff.getStaffId());
        staff.setCreateBy(oldStaff.getCreateBy());
        staff.setCreateDate(oldStaff.getCreateDate());
        staff.setWhetherDel(0);
        return staffMapper.updateStaffInfo(staff);
    }

    /**
     * 修改个人信息（yunguohao）
     *
     * @param staff
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "修改了一条用户信息")
    public int updateStaffs(Staff staff) throws Exception {
        Staff oldStaff = staffMapper.selectByPrimaryKey(staff.getStaffId());
        staff.setCreateBy(oldStaff.getCreateBy());
        staff.setCreateDate(oldStaff.getCreateDate());
        staff.setWhetherDel(0);
        return staffMapper.updateByPrimaryKey(staff);
    }

    /**
     * 修改密码（lixiaojie）
     *
     * @param staff
     * @return
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "用户", desc = "修改了一条用户密码信息")
    public int updateStaffpas(Staff staff,String oldPassword) throws Exception {

        Staff oldStaff=staffMapper.selectByPrimaryKey(staff.getStaffId());

        if (!EncryUtil.encrypt(oldPassword).equals(oldStaff.getPassword())){
            return 2;
        }
        oldStaff.setPassword(EncryUtil.encrypt(staff.getPassword()));
        oldStaff.setUpdateDate(staff.getUpdateDate());
        oldStaff.setUpdateBy(staff.getUpdateBy());
        return staffMapper.updateByPrimaryKey(oldStaff);
    }

    /**
     * 根据id获取用户信息 （lixiaojie)
     *
     * @param staffId
     * @return
     */
    @Override
    public Staff getStaffInfoByStaffId(Integer staffId) throws Exception {

        String Rolename = roleMapper.selectByPrimaryKey(staffMapper.selectByPrimaryKey(staffId).getRoleId()).getRolename();
        Staff staff = staffMapper.selectByPrimaryKey(staffId);
        staff.setRolename(Rolename);
        return staff;
    }

    /**
     * 根据id删除用户信息（lixiaojie）
     *
     * @param id
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "删除了一条用户信息")
    public Integer deleteStaffBystaffId(Integer id) throws Exception {
        return staffMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据 staffname createDate roleId  分页查询人员信息(lixiaojie)
     *
     * @return
     */
    @Override
    public PageInfo<Staff> listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate, String lastDate, Integer roleId) throws Exception {
        PageHelper.startPage(pageNo, pageSize, true);
        PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffMapper.listGetStaffsByNameAndCreateDateAndRoleId(staffname, firstDate, lastDate, roleId));
        return pageInfo;
    }

    /**
     * 新增用戶信息(lixiaojie)
     *
     * @param staff
     * @return
     */
    @Override
    @RecordOperation(type = "用户", desc = "新增了一条用户信息")
    public Integer saveStaffInfo(Staff staff) throws Exception{
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
        staff.setHeadPortraitPath("aasa.jpg");
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
