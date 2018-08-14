package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "discar")
public class Discar {
    @Id
    @Column(name = "disCarId")
    private int disCarId;
    @Column(name = "typeId")
    private Integer typeId;
    @Column(name = "offerId")
    private Integer offerId;
    @Column(name = "costPrice")
    private Double costPrice;
    @Column(name = "quotePrice")
    private Double quotePrice;
    private Integer number;
    private Integer status;
    @Column(name = "createBy")
    private Integer createBy;
    @Column(name = "updateBy")
    private Integer updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "upDate")
    private Date upDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate;
    private String value1;
    private String value2;
    private String value3;

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
