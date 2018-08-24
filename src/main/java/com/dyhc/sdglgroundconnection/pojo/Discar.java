package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车表
 **/
@Table(name = "discar")
public class Discar {
    @Id
    @Column(name = "disCarId")
    private int disCarId; // 调度用车id
    @Column(name = "typeId")
    private Integer typeId; // 用车类型编号（外键，与用车类型表关联）
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与调度信息表关联）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    @Column(name = "quotePrice")
    private Double quotePrice; // 报价
    private Integer number; // 数量
    @Column(name = "`status`")
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "`upDate`")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1; // 团队用车车牌号
    private String value2; // 驾驶员姓名
    private String value3; // 驾驶员联系电话

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Transient
    private VehicleType vehicleType; // 车辆类型表

    @Id
    @Column(name = "disCarId")
    public int getDisCarId() {
        return disCarId;
    }

    public void setDisCarId(int disCarId) {
        this.disCarId = disCarId;
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
    @Column(name = "offerId")
    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    @Basic
    @Column(name = "costPrice")
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    @Basic
    @Column(name = "quotePrice")
    public Double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(Double quotePrice) {
        this.quotePrice = quotePrice;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        Discar discar = (Discar) o;
        return disCarId == discar.disCarId &&
                Objects.equals(typeId, discar.typeId) &&
                Objects.equals(offerId, discar.offerId) &&
                Objects.equals(costPrice, discar.costPrice) &&
                Objects.equals(quotePrice, discar.quotePrice) &&
                Objects.equals(number, discar.number) &&
                Objects.equals(status, discar.status) &&
                Objects.equals(createBy, discar.createBy) &&
                Objects.equals(updateBy, discar.updateBy) &&
                Objects.equals(upDate, discar.upDate) &&
                Objects.equals(createDate, discar.createDate) &&
                Objects.equals(value1, discar.value1) &&
                Objects.equals(value2, discar.value2) &&
                Objects.equals(value3, discar.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(disCarId, typeId, offerId, costPrice, quotePrice, number, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
