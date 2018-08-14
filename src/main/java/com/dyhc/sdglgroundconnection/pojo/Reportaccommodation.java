package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "reportaccommodation")
public class Reportaccommodation {
    @Id
    @Column(name = "reportAccommodationId")
    private int reportAccommodationId;
    @Column(name = "liveDate")
    private Date liveDate;
    @Column(name = "hotelName")
    private String hotelName;
    @Column(name = "typeId")
    private Integer typeId;
    @Column(name = "housePrice")
    private Double housePrice;
    @Column(name = "roomNum")
    private Integer roomNum;
    @Column(name = "accompanyingBed")
    private Integer accompanyingBed;
    @Column(name = "accompanyingPrice")
    private Double accompanyingPrice;
    private Double subtotal;
    @Column(name = "payMethods")
    private String payMethods;
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
    @Column(name = "reportAccommodationId")
    public int getReportAccommodationId() {
        return reportAccommodationId;
    }

    public void setReportAccommodationId(int reportAccommodationId) {
        this.reportAccommodationId = reportAccommodationId;
    }

    @Basic
    @Column(name = "liveDate")
    public Date getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(Date liveDate) {
        this.liveDate = liveDate;
    }

    @Basic
    @Column(name = "hotelName")
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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
    @Column(name = "housePrice")
    public Double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Double housePrice) {
        this.housePrice = housePrice;
    }

    @Basic
    @Column(name = "roomNum")
    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    @Basic
    @Column(name = "accompanyingBed")
    public Integer getAccompanyingBed() {
        return accompanyingBed;
    }

    public void setAccompanyingBed(Integer accompanyingBed) {
        this.accompanyingBed = accompanyingBed;
    }

    @Basic
    @Column(name = "accompanyingPrice")
    public Double getAccompanyingPrice() {
        return accompanyingPrice;
    }

    public void setAccompanyingPrice(Double accompanyingPrice) {
        this.accompanyingPrice = accompanyingPrice;
    }

    @Basic
    @Column(name = "subtotal")
    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
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
        Reportaccommodation that = (Reportaccommodation) o;
        return reportAccommodationId == that.reportAccommodationId &&
                Objects.equals(liveDate, that.liveDate) &&
                Objects.equals(hotelName, that.hotelName) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(housePrice, that.housePrice) &&
                Objects.equals(roomNum, that.roomNum) &&
                Objects.equals(accompanyingBed, that.accompanyingBed) &&
                Objects.equals(accompanyingPrice, that.accompanyingPrice) &&
                Objects.equals(subtotal, that.subtotal) &&
                Objects.equals(payMethods, that.payMethods) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(upDate, that.upDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(reportAccommodationId, liveDate, hotelName, typeId, housePrice, roomNum, accompanyingBed, accompanyingPrice, subtotal, payMethods, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
