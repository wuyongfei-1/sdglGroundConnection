package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "offerscenic")
public class Offerscenic {
    @Id
    @Column(name = "offerScenicId")
    private int offerScenicId;
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId;
    @Column(name = "offerId")
    private Integer offerId;
    @Column(name = "costPrice")
    private Double costPrice;
    private Double offer;
    @Column(name = "whetherDel")
    private Integer whetherDel;
    private Integer creater;
    private Integer modifier;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modifiedData")
    private Timestamp modifiedData;
    @Column(name = "creationDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp creationDate;
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "offerScenicId")
    public int getOfferScenicId() {
        return offerScenicId;
    }

    public void setOfferScenicId(int offerScenicId) {
        this.offerScenicId = offerScenicId;
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
        Offerscenic that = (Offerscenic) o;
        return offerScenicId == that.offerScenicId &&
                Objects.equals(scenicSpotId, that.scenicSpotId) &&
                Objects.equals(offerId, that.offerId) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(offer, that.offer) &&
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

        return Objects.hash(offerScenicId, scenicSpotId, offerId, costPrice, offer, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
