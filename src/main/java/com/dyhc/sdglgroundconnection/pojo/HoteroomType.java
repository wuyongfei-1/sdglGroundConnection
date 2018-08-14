package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店房间类型表
 **/
@Table(name = "hoteroomtype")
public class HoteroomType {
    @Id
    @Column(name = "hoteroomtId")
    private int hoteroomtId; // 调度酒店房间类型id
    @Column(name = "dispatchHotelId")
    private Integer dispatchHotelId; // 调度酒店编号（外键，与调度酒店表关联）
    @Column(name = "typeId")
    private Integer typeId; // 酒店房间类型编号（外键，与酒店房间类型表关联）
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @Column(name = "upDate")
    private Date upDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date upDate; // 修改日期
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "hoteroomtId")
    public int getHoteroomtId() {
        return hoteroomtId;
    }

    public void setHoteroomtId(int hoteroomtId) {
        this.hoteroomtId = hoteroomtId;
    }

    @Basic
    @Column(name = "dispatchHotelId")
    public Integer getDispatchHotelId() {
        return dispatchHotelId;
    }

    public void setDispatchHotelId(Integer dispatchHotelId) {
        this.dispatchHotelId = dispatchHotelId;
    }

    @Basic
    @Column(name = "typeId")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "upDate")
    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
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
        HoteroomType that = (HoteroomType) o;
        return hoteroomtId == that.hoteroomtId &&
                Objects.equals(dispatchHotelId, that.dispatchHotelId) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(upDate, that.upDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hoteroomtId, dispatchHotelId, typeId, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
