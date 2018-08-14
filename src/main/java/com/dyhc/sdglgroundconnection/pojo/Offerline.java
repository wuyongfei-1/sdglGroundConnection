package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价线路信息记录表：（打印确认单）
 **/
@Table(name = "offerline")
public class Offerline {
    @Id
    @Column(name = "offerLineRecordId")
    private int offerLineRecordId; // 报价线路信息记录id
    @Column(name = "offerId")
    private Integer offerId; // 报价信息编号（外键，与报价信息表关联）
    @Column(name = "lineArriveName")
    private String lineArriveName; // 线路抵达名称
    @Column(name = "travelContent")
    private String travelContent; // 行程内容
    private Date date; // 日期
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @Column(name = "creationDate")
    private Date creationDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "offerLineRecordId")
    public int getOfferLineRecordId() {
        return offerLineRecordId;
    }

    public void setOfferLineRecordId(int offerLineRecordId) {
        this.offerLineRecordId = offerLineRecordId;
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
    @Column(name = "lineArriveName")
    public String getLineArriveName() {
        return lineArriveName;
    }

    public void setLineArriveName(String lineArriveName) {
        this.lineArriveName = lineArriveName;
    }

    @Basic
    @Column(name = "travelContent")
    public String getTravelContent() {
        return travelContent;
    }

    public void setTravelContent(String travelContent) {
        this.travelContent = travelContent;
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
        Offerline offerline = (Offerline) o;
        return offerLineRecordId == offerline.offerLineRecordId &&
                Objects.equals(offerId, offerline.offerId) &&
                Objects.equals(lineArriveName, offerline.lineArriveName) &&
                Objects.equals(travelContent, offerline.travelContent) &&
                Objects.equals(date, offerline.date) &&
                Objects.equals(whetherDel, offerline.whetherDel) &&
                Objects.equals(creater, offerline.creater) &&
                Objects.equals(modifier, offerline.modifier) &&
                Objects.equals(modifiedData, offerline.modifiedData) &&
                Objects.equals(creationDate, offerline.creationDate) &&
                Objects.equals(value1, offerline.value1) &&
                Objects.equals(value2, offerline.value2) &&
                Objects.equals(value3, offerline.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(offerLineRecordId, offerId, lineArriveName, travelContent, date, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
