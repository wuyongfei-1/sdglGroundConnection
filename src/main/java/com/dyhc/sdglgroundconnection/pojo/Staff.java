package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "staffId")
    private int staffId;
    @Column(name = "roleId")
    private Integer roleId;
    private String staffname;
    @Column(name = "theUserName")
    private String theUserName;
    private Integer sex;
    private String password;
    @Column(name = "cardId")
    private String cardId;
    private Integer qqnumber;
    @Column(name = "headPortraitPath")
    private String headPortraitPath;
    @Column(name = "currentAddress")
    private String currentAddress;
    private Integer phone;
    @Column(name = "whetherDel")
    private Integer whetherDel;
    @Column(name = "createBy")
    private Integer createBy;
    @Column(name = "updateBy")
    private Integer updateBy;
    @Column(name = "updateDate")
    private Date updateDate;
    @Column(name = "createDate")
    private Date createDate;
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "staff\nId")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "roleId")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "staffname")
    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    @Basic
    @Column(name = "theUserName")
    public String getTheUserName() {
        return theUserName;
    }

    public void setTheUserName(String theUserName) {
        this.theUserName = theUserName;
    }

    @Basic
    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "cardId")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "qqnumber")
    public Integer getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(Integer qqnumber) {
        this.qqnumber = qqnumber;
    }

    @Basic
    @Column(name = "headPortraitPath")
    public String getHeadPortraitPath() {
        return headPortraitPath;
    }

    public void setHeadPortraitPath(String headPortraitPath) {
        this.headPortraitPath = headPortraitPath;
    }

    @Basic
    @Column(name = "currentAddress")
    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "whetherDel")
    public Integer getWhetherDel() {
        return whetherDel;
    }

    public void setWhetherDel(Integer whetherDel) {
        this.whetherDel = whetherDel;
    }

    @Basic
    @Column(name = "createBy")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "updateBy")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "value1")
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @Basic
    @Column(name = "value2")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Basic
    @Column(name = "value3")
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId &&
                Objects.equals(roleId, staff.roleId) &&
                Objects.equals(staffname, staff.staffname) &&
                Objects.equals(theUserName, staff.theUserName) &&
                Objects.equals(sex, staff.sex) &&
                Objects.equals(password, staff.password) &&
                Objects.equals(cardId, staff.cardId) &&
                Objects.equals(qqnumber, staff.qqnumber) &&
                Objects.equals(headPortraitPath, staff.headPortraitPath) &&
                Objects.equals(currentAddress, staff.currentAddress) &&
                Objects.equals(phone, staff.phone) &&
                Objects.equals(whetherDel, staff.whetherDel) &&
                Objects.equals(createBy, staff.createBy) &&
                Objects.equals(updateBy, staff.updateBy) &&
                Objects.equals(updateDate, staff.updateDate) &&
                Objects.equals(createDate, staff.createDate) &&
                Objects.equals(value1, staff.value1) &&
                Objects.equals(value2, staff.value2) &&
                Objects.equals(value3, staff.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(staffId, roleId, staffname, theUserName, sex, password, cardId, qqnumber, headPortraitPath, currentAddress, phone, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
