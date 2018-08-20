package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息表
 **/
@Table(name = "offer")
public class Offer {
    @Id
    @Column(name = "offerId")
    private int offerId; // 主键编号
    @Column(name = "travelId")
    private Integer travelId; // 组团社编号（外键，与组团社关联）
    @Column(name = "travelStartTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date travelStartTime; // 旅行开始时间
    @Column(name = "travelEndTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date travelEndTime; // 旅行结束时间
    private Integer number; // 人数
    private String tourist; // 客源地
    private String trip; // 行程
    private Double offer; // 报价(按人数算)
    @Column(name = "aVariance")
    private Double aVariance; // 单间房差
    private String shopping; // 购物
    private String not; // 不含
    private String remarks; // 备注
    private String supervision; // 团体监督
    private String reception; // 接待标准
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
    @Column(name = "offerId")
    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    @Basic
    @Column(name = "travelId")
    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    @Basic
    @Column(name = "travelStartTime")
    public Date getTravelStartTime() {
        return travelStartTime;
    }

    public void setTravelStartTime(Date travelStartTime) {
        this.travelStartTime = travelStartTime;
    }

    @Basic
    @Column(name = "travelEndTime")
    public Date getTravelEndTime() {
        return travelEndTime;
    }

    public void setTravelEndTime(Date travelEndTime) {
        this.travelEndTime = travelEndTime;
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
    @Column(name = "tourist")
    public String getTourist() {
        return tourist;
    }

    public void setTourist(String tourist) {
        this.tourist = tourist;
    }

    @Basic
    @Column(name = "trip")
    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
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
    @Column(name = "aVariance")
    public Double getaVariance() {
        return aVariance;
    }

    public void setaVariance(Double aVariance) {
        this.aVariance = aVariance;
    }

    @Basic
    @Column(name = "shopping")
    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    @Basic
    @Column(name = "not")
    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
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
    @Column(name = "supervision")
    public String getSupervision() {
        return supervision;
    }

    public void setSupervision(String supervision) {
        this.supervision = supervision;
    }

    @Basic
    @Column(name = "reception")
    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
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


}
