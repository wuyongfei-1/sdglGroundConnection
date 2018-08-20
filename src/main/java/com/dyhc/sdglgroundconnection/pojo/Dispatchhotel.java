package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店表
 **/
@Table(name = "dispatchhotel")
public class Dispatchhotel {
    @Id
    @Column(name = "dispatchHotelId")
    private int dispatchHotelId; // 调度酒店编号
    @Column(name = "hotelId")
    private Integer hotelId; // 酒店编号（外键，与酒店表关联）
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与报价信息表关联）
    @Column(name = "weight")
    private Integer weight;//权重（天数）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    private Double offer; // 报价
    private Date date; // 日期
    private String payment; // 付款方式
    @Column(name = "companyBedNum")
    private Integer companyBedNum; // 付款方式
    @Column(name = "companyBedoffer")
    private Double companyBedoffer; // 司陪床价
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "creationDate")
    private Date creationDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "dispatchHotelId")
    public int getDispatchHotelId() {
        return dispatchHotelId;
    }

    public void setDispatchHotelId(int dispatchHotelId) {
        this.dispatchHotelId = dispatchHotelId;
    }

    @Basic
    @Column(name = "hotelId")
    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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
    @Column(name = "offer")
    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
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
    @Column(name = "payment")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "companyBedNum")
    public Integer getCompanyBedNum() {
        return companyBedNum;
    }

    public void setCompanyBedNum(Integer companyBedNum) {
        this.companyBedNum = companyBedNum;
    }

    @Basic
    @Column(name = "companyBedoffer")
    public Double getCompanyBedoffer() {
        return companyBedoffer;
    }

    public void setCompanyBedoffer(Double companyBedoffer) {
        this.companyBedoffer = companyBedoffer;
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
        Dispatchhotel that = (Dispatchhotel) o;
        return dispatchHotelId == that.dispatchHotelId &&
                Objects.equals(hotelId, that.hotelId) &&
                Objects.equals(offerId, that.offerId) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(offer, that.offer) &&
                Objects.equals(date, that.date) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(companyBedNum, that.companyBedNum) &&
                Objects.equals(companyBedoffer, that.companyBedoffer) &&
                Objects.equals(whetherDel, that.whetherDel) &&
                Objects.equals(creater, that.creater) &&
                Objects.equals(modifier, that.modifier) &&
                Objects.equals(modifiedData, that.modifiedData) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dispatchHotelId, hotelId, offerId, costPrice, offer, date, payment, companyBedNum, companyBedoffer, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
