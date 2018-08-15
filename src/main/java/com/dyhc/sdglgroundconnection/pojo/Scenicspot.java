package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 景点表
 **/
@Table(name = "scenicspot")
public class Scenicspot {
    @Id
    @Column(name = "scenicSpotId")
    private int scenicSpotId; // 景点编号
    @Column(name = "parentId")
    private Integer parentId; // 父景点编号
    @Column(name = "scenicSpotName")
    private String scenicSpotName; // 名称
    @Column(name = "scenicSpotAddress")
    private String scenicSpotAddress; // 地点
    private Integer costprice; // 成本价
    private Integer offer; // 报价
    @Column(name = "typeCode")
    private String typeCode; // 编码（【景点等级】外键，与字典表关联）
    @Column(name = "typeId")
    private Integer typeId; // 景点等级编号
    @Column(name = "picturePath")
    private String picturePath; // 景区图片地址
    private String describe; // 描述
    private String remarks; // 备注
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "scenicSpotId")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "scenicSpotId")
    public int getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(int scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
    }

    @Basic
    @Column(name = "parentId")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "scenicSpotName")
    public String getScenicSpotName() {
        return scenicSpotName;
    }

    public void setScenicSpotName(String scenicSpotName) {
        this.scenicSpotName = scenicSpotName;
    }

    @Basic
    @Column(name = "scenicSpotAddress")
    public String getScenicSpotAddress() {
        return scenicSpotAddress;
    }

    public void setScenicSpotAddress(String scenicSpotAddress) {
        this.scenicSpotAddress = scenicSpotAddress;
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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
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
    @Column(name = "picturePath")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Basic
    @Column(name = "describe")
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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
        Scenicspot that = (Scenicspot) o;
        return scenicSpotId == that.scenicSpotId &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(scenicSpotName, that.scenicSpotName) &&
                Objects.equals(scenicSpotAddress, that.scenicSpotAddress) &&
                Objects.equals(costprice, that.costprice) &&
                Objects.equals(offer, that.offer) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(picturePath, that.picturePath) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(whetherDel, that.whetherDel) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(scenicSpotId, parentId, scenicSpotName, scenicSpotAddress, costprice, offer, typeCode, typeId, picturePath, describe, remarks, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
