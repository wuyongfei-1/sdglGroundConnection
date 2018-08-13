package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "hotelId")
    private int hotelId;
    @Column(name = "hotelName")
    private String hotelName;
    @Column(name = "starHotel")
    private Integer starHotel;
    @Column(name = "hotelAddress")
    private String hotelAddress;
    @Column(name = "picturePath")
    private String picturePath;
    private Integer breakfast;
    private String contacts;
    private Integer phone;
    @Column(name = "hotelDescribe")
    private String hotelDescribe;
    private String remarks;
    private Integer costprice;
    private Integer offer;
    private Integer status;
    @Column(name = "whetherDel")
    private Integer whetherDel;
    @Column(name = "createBy")
    private Integer createBy;
    @Column(name = "updateBy")
    private Integer updateBy;
    @Column(name = "updateDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate;
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "hotelId")
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
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
    @Column(name = "starHotel")
    public Integer getStarHotel() {
        return starHotel;
    }

    public void setStarHotel(Integer starHotel) {
        this.starHotel = starHotel;
    }

    @Basic
    @Column(name = "hotelAddress")
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    @Basic
    @Column(name = "picturePath")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Basic
    @Column(name = "breakfast")
    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    @Basic
    @Column(name = "contacts")
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "hotelDescribe")
    public String getHotelDescribe() {
        return hotelDescribe;
    }

    public void setHotelDescribe(String hotelDescribe) {
        this.hotelDescribe = hotelDescribe;
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
    @Column(name = "costprice")
    public Integer getCostprice() {
        return costprice;
    }

    public void setCostprice(Integer costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "offer")
    public Integer getOffer() {
        return offer;
    }

    public void setOffer(Integer offer) {
        this.offer = offer;
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
    @Column(name = "whetherDel")
    public Integer getWhetherDel() {
        return whetherDel;
    }

    public void setWhetherDel(Integer whetherDel) {
        this.whetherDel = whetherDel;
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
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
        Hotel hotel = (Hotel) o;
        return hotelId == hotel.hotelId &&
                Objects.equals(hotelName, hotel.hotelName) &&
                Objects.equals(starHotel, hotel.starHotel) &&
                Objects.equals(hotelAddress, hotel.hotelAddress) &&
                Objects.equals(picturePath, hotel.picturePath) &&
                Objects.equals(breakfast, hotel.breakfast) &&
                Objects.equals(contacts, hotel.contacts) &&
                Objects.equals(phone, hotel.phone) &&
                Objects.equals(hotelDescribe, hotel.hotelDescribe) &&
                Objects.equals(remarks, hotel.remarks) &&
                Objects.equals(costprice, hotel.costprice) &&
                Objects.equals(offer, hotel.offer) &&
                Objects.equals(status, hotel.status) &&
                Objects.equals(whetherDel, hotel.whetherDel) &&
                Objects.equals(createBy, hotel.createBy) &&
                Objects.equals(updateBy, hotel.updateBy) &&
                Objects.equals(updateDate, hotel.updateDate) &&
                Objects.equals(createDate, hotel.createDate) &&
                Objects.equals(value1, hotel.value1) &&
                Objects.equals(value2, hotel.value2) &&
                Objects.equals(value3, hotel.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hotelId, hotelName, starHotel, hotelAddress, picturePath, breakfast, contacts, phone, hotelDescribe, remarks, costprice, offer, status, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
