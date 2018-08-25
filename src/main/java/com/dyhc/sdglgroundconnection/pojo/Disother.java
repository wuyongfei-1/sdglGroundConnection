package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度其他表
 **/
@Table(name = "disother")
public class Disother {
    @Id
    @Column(name = "disOtherId")
    private int disOtherId; // 调度其他id
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与调度信息表关联）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    @Column(name = "quotePrice")
    private Double quotePrice; // 报价
    private String remarks; // 备注
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @Column(name = "upDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "disOtherId")
    public int getDisOtherId() {
        return disOtherId;
    }

    public void setDisOtherId(int disOtherId) {
        this.disOtherId = disOtherId;
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
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        Disother disother = (Disother) o;
        return disOtherId == disother.disOtherId &&
                Objects.equals(offerId, disother.offerId) &&
                Objects.equals(costPrice, disother.costPrice) &&
                Objects.equals(quotePrice, disother.quotePrice) &&
                Objects.equals(remarks, disother.remarks) &&
                Objects.equals(status, disother.status) &&
                Objects.equals(createBy, disother.createBy) &&
                Objects.equals(updateBy, disother.updateBy) &&
                Objects.equals(upDate, disother.upDate) &&
                Objects.equals(createDate, disother.createDate) &&
                Objects.equals(value1, disother.value1) &&
                Objects.equals(value2, disother.value2) &&
                Objects.equals(value3, disother.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(disOtherId, offerId, costPrice, quotePrice, remarks, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
