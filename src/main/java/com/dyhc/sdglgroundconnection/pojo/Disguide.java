package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "disguide")
public class Disguide {
    @Id
    @Column(name = "disGuideId")
    private int disGuideId;
    @Column(name = "guideId")
    private Integer guideId;
    @Column(name = "offerId")
    private Integer offerId;
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
    private String value;

    @Id
    @Column(name = "disGuideId")
    public int getDisGuideId() {
        return disGuideId;
    }

    public void setDisGuideId(int disGuideId) {
        this.disGuideId = disGuideId;
    }

    @Basic
    @Column(name = "guideId")
    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
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
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disguide disguide = (Disguide) o;
        return disGuideId == disguide.disGuideId &&
                Objects.equals(guideId, disguide.guideId) &&
                Objects.equals(offerId, disguide.offerId) &&
                Objects.equals(status, disguide.status) &&
                Objects.equals(createBy, disguide.createBy) &&
                Objects.equals(updateBy, disguide.updateBy) &&
                Objects.equals(upDate, disguide.upDate) &&
                Objects.equals(createDate, disguide.createDate) &&
                Objects.equals(value1, disguide.value1) &&
                Objects.equals(value2, disguide.value2) &&
                Objects.equals(value, disguide.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(disGuideId, guideId, offerId, status, createBy, updateBy, upDate, createDate, value1, value2, value);
    }
}
