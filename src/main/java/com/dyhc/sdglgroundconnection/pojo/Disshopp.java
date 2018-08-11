package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "disshopp")
public class Disshopp {
    @Id
    @Column(name = "disShoppId")
    private int disShoppId;
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId;
    @Column(name = "offerId")
    private Integer offerId;
    private Date date;
    private Integer status;
    @Column(name = "createBy")
    private Integer createBy;
    @Column(name = "updateBy")
    private Integer updateBy;
    @Column(name = "upDate")
    private Date upDate;
    @Column(name = "createDate")
    private Date createDate;
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
