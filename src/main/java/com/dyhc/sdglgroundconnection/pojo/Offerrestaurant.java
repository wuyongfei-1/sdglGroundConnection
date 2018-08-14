package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价餐厅表
 **/
@Table(name = "offerrestaurant")
public class Offerrestaurant {
    @Id
    @Column(name = "offerRestaurantId")
    private int offerRestaurantId; // 主键编号
    @Column(name = "offerId")
    private Integer offerId; // 报价信息编号（外键，与报价信息表关联）
    @Column(name = "typeCode")
    private Integer typeCode; // 编码（外键，与字典表关联）
    @Column(name = "dictionariesId")
    private Integer dictionariesId; // 编号（外键，与字典表关联）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    private Double offer; // 报价
    private Timestamp date; // 日期
    private Timestamp havemealsdate; // 用餐时间（早、中、晚）
    @Column(name = "whetherDel")
    private Integer whetherDel;
    private Integer creater;
    private Integer modifier;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @Column(name = "modifiedData")
    private Timestamp modifiedData;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp modifiedData; // 修改日期
    @Column(name = "creationDate")
    private Timestamp creationDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "offerRestaurantId")
    public int getOfferRestaurantId() {
        return offerRestaurantId;
    }

    public void setOfferRestaurantId(int offerRestaurantId) {
        this.offerRestaurantId = offerRestaurantId;
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
    @Column(name = "typeCode")
    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    @Basic
    @Column(name = "dictionariesId")
    public Integer getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(Integer dictionariesId) {
        this.dictionariesId = dictionariesId;
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
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "havemealsdate")
    public Timestamp getHavemealsdate() {
        return havemealsdate;
    }

    public void setHavemealsdate(Timestamp havemealsdate) {
        this.havemealsdate = havemealsdate;
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
    public Timestamp getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Timestamp modifiedData) {
        this.modifiedData = modifiedData;
    }

    @Basic
    @Column(name = "creationDate")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
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
        Offerrestaurant that = (Offerrestaurant) o;
        return offerRestaurantId == that.offerRestaurantId &&
                Objects.equals(offerId, that.offerId) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(dictionariesId, that.dictionariesId) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(offer, that.offer) &&
                Objects.equals(date, that.date) &&
                Objects.equals(havemealsdate, that.havemealsdate) &&
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

        return Objects.hash(offerRestaurantId, offerId, typeCode, dictionariesId, costPrice, offer, date, havemealsdate, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
