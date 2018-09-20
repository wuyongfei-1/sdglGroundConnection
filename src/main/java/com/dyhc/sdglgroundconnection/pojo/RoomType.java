package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 房间类型表
 **/
@Table(name = "roomtype")
public class RoomType implements Serializable {
    @Id
    @Column(name = "typeId")
    private int typeId; // 类型编号
    @Column(name = "hotelId")
    private Integer hotelId; // 酒店编号（外键，与酒店表关联）
    @Column(name = "typeName")
    private String typeName; // 类型名称
    @Column(name = "costprice")
    private Double costprice; // 成本价
    private Double offer; // 报价
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建日期
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "typeId")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
    @Column(name = "typeName")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "costprice")
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
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
        RoomType roomtype = (RoomType) o;
        return typeId == roomtype.typeId &&
                Objects.equals(hotelId, roomtype.hotelId) &&
                Objects.equals(typeName, roomtype.typeName) &&
                Objects.equals(costprice, roomtype.costprice) &&
                Objects.equals(offer, roomtype.offer) &&
                Objects.equals(whetherDel, roomtype.whetherDel) &&
                Objects.equals(createBy, roomtype.createBy) &&
                Objects.equals(updateBy, roomtype.updateBy) &&
                Objects.equals(updateDate, roomtype.updateDate) &&
                Objects.equals(createDate, roomtype.createDate) &&
                Objects.equals(value1, roomtype.value1) &&
                Objects.equals(value2, roomtype.value2) &&
                Objects.equals(value3, roomtype.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeId, hotelId, typeName, costprice, offer, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
