package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度购物表
 **/
@Table(name = "disshopp")
public class Disshopp {
    @Id
    @Column(name = "disShoppId")
    private int disShoppId; // 调度购物id
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId; // 购物编号（外键，与景点表关联）
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与报价信息表关联）
    private Date date; // 日期
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    private Integer updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "upDate")
    private Date upDate; // 修改日期
    private Date upDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "disShoppId")
    public int getDisShoppId() {
        return disShoppId;
    }

    public void setDisShoppId(int disShoppId) {
        this.disShoppId = disShoppId;
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
        Disshopp disshopp = (Disshopp) o;
        return disShoppId == disshopp.disShoppId &&
                Objects.equals(scenicSpotId, disshopp.scenicSpotId) &&
                Objects.equals(offerId, disshopp.offerId) &&
                Objects.equals(date, disshopp.date) &&
                Objects.equals(status, disshopp.status) &&
                Objects.equals(createBy, disshopp.createBy) &&
                Objects.equals(updateBy, disshopp.updateBy) &&
                Objects.equals(upDate, disshopp.upDate) &&
                Objects.equals(createDate, disshopp.createDate) &&
                Objects.equals(value1, disshopp.value1) &&
                Objects.equals(value2, disshopp.value2) &&
                Objects.equals(value3, disshopp.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(disShoppId, scenicSpotId, offerId, date, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
