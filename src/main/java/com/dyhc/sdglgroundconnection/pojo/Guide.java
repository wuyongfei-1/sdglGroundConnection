package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游表
 **/
@Table(name = "guide")
public class Guide {
    @Id
    @Column(name = "guideId")
    private int guideId; // 导游编号
    private String certificate; // 导游证件号
    @Column(name = "guideName")
    private String guideName; // 导游姓名
    private String username; // 用户名
    private String password; // 密码
    private String telephone; // 联系电话
    private Integer age; // 年龄
    private Integer sex; // 性别
    private Integer state; // 状态（1、请假 2、已占用 3、空闲中）
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联)
    private Integer modifier; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "creationDate")
    private Date creationDate; // 创建日期
    private String value1;
    private String value2;
    private String value3;
    public List<GuideSchedule> getGuideScheduleList() {
        return guideScheduleList;
    }

    public void setGuideScheduleList(List<GuideSchedule> guideScheduleList) {
        this.guideScheduleList = guideScheduleList;
    }

    @Transient

    private List<GuideSchedule> guideScheduleList;

    @Id
    @Column(name = "guideId")
    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }

    @Basic
    @Column(name = "certificate")
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @Basic
    @Column(name = "guideName")
    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
    @Column(name = "creater")
    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    @Basic
    @Column(name = "modifier")
    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "modifiedData")
    public Date getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Date modifiedData) {
        this.modifiedData = modifiedData;
    }

    @Basic
    @Column(name = "creationDate")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
        Guide guide = (Guide) o;
        return guideId == guide.guideId &&
                Objects.equals(certificate, guide.certificate) &&
                Objects.equals(guideName, guide.guideName) &&
                Objects.equals(username, guide.username) &&
                Objects.equals(password, guide.password) &&
                Objects.equals(telephone, guide.telephone) &&
                Objects.equals(age, guide.age) &&
                Objects.equals(sex, guide.sex) &&
                Objects.equals(state, guide.state) &&
                Objects.equals(whetherDel, guide.whetherDel) &&
                Objects.equals(creater, guide.creater) &&
                Objects.equals(modifier, guide.modifier) &&
                Objects.equals(modifiedData, guide.modifiedData) &&
                Objects.equals(creationDate, guide.creationDate) &&
                Objects.equals(value1, guide.value1) &&
                Objects.equals(value2, guide.value2) &&
                Objects.equals(value3, guide.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(guideId, certificate, guideName, username, password, telephone, age, sex, state, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
