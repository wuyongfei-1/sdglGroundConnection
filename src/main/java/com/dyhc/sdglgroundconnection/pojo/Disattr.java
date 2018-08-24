package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点表
 **/
@Table(name = "disattr")
public class Disattr {
    @Id
    @Column(name = "disAttrId")
    private int disAttrId; // 调度景点id
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId; // 景点编号（外键，与景点表关联）
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与调度信息表关联）
    private Date date; // 日期
    private Integer buynum; // 购买人数
    @Column(name = "weight")
    private Integer weight;//权重（天数）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    @Column(name = "quotePrice")
    private Double quotePrice; // 报价
    @Column(name = "payMethods")
    private String payMethods; // 付款方式
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "upDate")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Transient
    private Scenicspot scenicspot; // 景点对象

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Scenicspot getScenicspot() {
        return scenicspot;
    }

    public void setScenicspot(Scenicspot scenicspot) {
        this.scenicspot = scenicspot;
    }

    @Id
    @Column(name = "disAttrId")
    public int getDisAttrId() {
        return disAttrId;
    }

    public void setDisAttrId(int disAttrId) {
        this.disAttrId = disAttrId;
    }

    @Basic
    @Column(name = "scenicSpotId")
    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
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
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "buynum")
    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
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
    @Column(name = "payMethods")
    public String getPayMethods() {
        return payMethods;
    }

    public void setPayMethods(String payMethods) {
        this.payMethods = payMethods;
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
        Disattr disattr = (Disattr) o;
        return disAttrId == disattr.disAttrId &&
                Objects.equals(scenicSpotId, disattr.scenicSpotId) &&
                Objects.equals(offerId, disattr.offerId) &&
                Objects.equals(date, disattr.date) &&
                Objects.equals(buynum, disattr.buynum) &&
                Objects.equals(costPrice, disattr.costPrice) &&
                Objects.equals(quotePrice, disattr.quotePrice) &&
                Objects.equals(payMethods, disattr.payMethods) &&
                Objects.equals(status, disattr.status) &&
                Objects.equals(createBy, disattr.createBy) &&
                Objects.equals(updateBy, disattr.updateBy) &&
                Objects.equals(upDate, disattr.upDate) &&
                Objects.equals(createDate, disattr.createDate) &&
                Objects.equals(value1, disattr.value1) &&
                Objects.equals(value2, disattr.value2) &&
                Objects.equals(value3, disattr.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(disAttrId, scenicSpotId, offerId, date, buynum, costPrice, quotePrice, payMethods, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
