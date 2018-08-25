package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账出团补助表
 **/
@Table(name = "reportqutsubsidy")
public class Reportqutsubsidy {
    @Id
    @Column(name = "reportQutSubsidyId")
    private int reportQutSubsidyId; // 导游报账出团补助表编号
    @Column(name = "dailyCost")
    private Double dailyCost; // 日花费
    private Integer nums; // 天数
    @Column(name = "guideNum")
    private Integer guideNum; // 导游数
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "upDate")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1; // 导游报账明细表编号
    private String value2;
    private String value3;

    @Id
    @Column(name = "reportQutSubsidyId")
    public int getReportQutSubsidyId() {
        return reportQutSubsidyId;
    }

    public void setReportQutSubsidyId(int reportQutSubsidyId) {
        this.reportQutSubsidyId = reportQutSubsidyId;
    }

    @Basic
    @Column(name = "dailyCost")
    public Double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(Double dailyCost) {
        this.dailyCost = dailyCost;
    }

    @Basic
    @Column(name = "nums")
    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Basic
    @Column(name = "guideNum")
    public Integer getGuideNum() {
        return guideNum;
    }

    public void setGuideNum(Integer guideNum) {
        this.guideNum = guideNum;
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
        Reportqutsubsidy that = (Reportqutsubsidy) o;
        return reportQutSubsidyId == that.reportQutSubsidyId &&
                Objects.equals(dailyCost, that.dailyCost) &&
                Objects.equals(nums, that.nums) &&
                Objects.equals(guideNum, that.guideNum) &&
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

        return Objects.hash(reportQutSubsidyId, dailyCost, nums, guideNum, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
