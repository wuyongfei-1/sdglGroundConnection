package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 组团社表
 **/
@Table(name = "travel")
public class Travel implements Serializable {
    @Id
    @Column(name = "travelId")
    private int travelId; // 组团社编号
    @Column(name = "travelName")
    private String travelName; // 组团社名称
    @Column(name = "personName")
    private String personName; // 负责人名字
    @Column(name = "personPost")
    private String personPost; // 负责人职位
    private String phone; // 联系电话
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建日期
    private String value1; // 预备
    private String value2; // 预备
    private String value3; // 预备

    @Id
    @Column(name = "travel\nId")
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    @Basic
    @Column(name = "travel\nName")
    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    @Basic
    @Column(name = "personName")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "personPost")
    public String getPersonPost() {
        return personPost;
    }

    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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
        Travel travel = (Travel) o;
        return travelId == travel.travelId &&
                Objects.equals(travelName, travel.travelName) &&
                Objects.equals(personName, travel.personName) &&
                Objects.equals(personPost, travel.personPost) &&
                Objects.equals(phone, travel.phone) &&
                Objects.equals(whetherDel, travel.whetherDel) &&
                Objects.equals(createBy, travel.createBy) &&
                Objects.equals(updateBy, travel.updateBy) &&
                Objects.equals(updateDate, travel.updateDate) &&
                Objects.equals(createDate, travel.createDate) &&
                Objects.equals(value1, travel.value1) &&
                Objects.equals(value2, travel.value2) &&
                Objects.equals(value3, travel.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(travelId, travelName, personName, personPost, phone, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
