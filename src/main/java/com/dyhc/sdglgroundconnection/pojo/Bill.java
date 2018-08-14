package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据表
 **/
@Table(name = "bill")
public class Bill {
    @Id
    @Column(name = "billId")
    private int billId; // 单据编号
    @Column(name = "dispatchId")
    private Integer dispatchId; // 调度id （外键，与调度表关联）
    @Column(name = "billTypeId")
    private Integer billTypeId; // 单据表类型id	（外键，与单据类型表进行关联）
    @Column(name = "picturePath")
    private String picturePath; // 图片路径
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate; // 修改日期
    @Column(name = "createDate")
    private Date createDate; // 创建日期


    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "billId")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "dispatchId")
    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "billTypeId")
    public Integer getBillTypeId() {
        return billTypeId;
    }

    public void setBillTypeId(Integer billTypeId) {
        this.billTypeId = billTypeId;
    }

    @Basic
    @Column(name = "picturePath")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
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
        Bill bill = (Bill) o;
        return billId == bill.billId &&
                Objects.equals(dispatchId, bill.dispatchId) &&
                Objects.equals(billTypeId, bill.billTypeId) &&
                Objects.equals(picturePath, bill.picturePath) &&
                Objects.equals(whetherDel, bill.whetherDel) &&
                Objects.equals(createBy, bill.createBy) &&
                Objects.equals(updateBy, bill.updateBy) &&
                Objects.equals(updateDate, bill.updateDate) &&
                Objects.equals(createDate, bill.createDate) &&
                Objects.equals(value1, bill.value1) &&
                Objects.equals(value2, bill.value2) &&
                Objects.equals(value3, bill.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(billId, dispatchId, billTypeId, picturePath, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
