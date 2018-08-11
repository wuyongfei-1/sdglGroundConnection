package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "travel")
public class Travel {
    @Id
    @Column(name = "travelId")
    private int travelId;
    @Column(name = "travelName")
    private String travelName;
    @Column(name = "personName")
    private String personName;
    @Column(name = "personPost")
    private String personPost;
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
