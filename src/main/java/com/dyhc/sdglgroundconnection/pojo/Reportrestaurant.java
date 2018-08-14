package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账餐厅表
 **/
@Table(name = "reportrestaurant")
public class Reportrestaurant {
    @Id
    @Column(name = "reportRestaurantId")
    private Integer reportRestaurantId; // 导游报账餐厅表编号
    @Column(name = "lunchDate")
    private Date lunchDate; // 午餐日期
    @Column(name = "luncheonName")
    private String luncheonName; // 午餐馆名称
    @Column(name = "lunchMeal")
    private Double lunchMeal; // 午餐餐标
    @Column(name = "lunchEatNum")
    private Integer lunchEatNum; // 进餐人数
    private Double lunchother; // 午餐其他
    @Column(name = "lunchPayMethods")
    private String lunchPayMethods; // 午餐支付方式
    @Column(name = "dinnerDate")
    private Date dinnerDate; // 晚餐日期
    @Column(name = "dinnerName")
    private String dinnerName; // 晚餐馆名称
    @Column(name = "dinnerMeal")
    private Double dinnerMeal; // 晚餐餐标
    @Column(name = "dinnerEatNum")
    private Integer dinnerEatNum; // 进餐人数
    private Double dinnerother; // 晚餐其他
    @Column(name = "dinnerPayMethods")
    private String dinnerPayMethods; // 晚餐支付方式
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
    private String value1;
    private String value2;
    private String value3;

    @Basic
    @Column(name = "reportRestaurantId")
    public Integer getReportRestaurantId() {
        return reportRestaurantId;
    }

    public void setReportRestaurantId(Integer reportRestaurantId) {
        this.reportRestaurantId = reportRestaurantId;
    }

    @Basic
    @Column(name = "lunchDate")
    public Date getLunchDate() {
        return lunchDate;
    }

    public void setLunchDate(Date lunchDate) {
        this.lunchDate = lunchDate;
    }

    @Basic
    @Column(name = "LuncheonName")
    public String getLuncheonName() {
        return luncheonName;
    }

    public void setLuncheonName(String luncheonName) {
        this.luncheonName = luncheonName;
    }

    @Basic
    @Column(name = "lunchMeal")
    public Double getLunchMeal() {
        return lunchMeal;
    }

    public void setLunchMeal(Double lunchMeal) {
        this.lunchMeal = lunchMeal;
    }

    @Basic
    @Column(name = "lunchEatNum")
    public Integer getLunchEatNum() {
        return lunchEatNum;
    }

    public void setLunchEatNum(Integer lunchEatNum) {
        this.lunchEatNum = lunchEatNum;
    }

    @Basic
    @Column(name = "lunchother")
    public Double getLunchother() {
        return lunchother;
    }

    public void setLunchother(Double lunchother) {
        this.lunchother = lunchother;
    }

    @Basic
    @Column(name = "lunchPayMethods")
    public String getLunchPayMethods() {
        return lunchPayMethods;
    }

    public void setLunchPayMethods(String lunchPayMethods) {
        this.lunchPayMethods = lunchPayMethods;
    }

    @Basic
    @Column(name = "dinnerDate")
    public Date getDinnerDate() {
        return dinnerDate;
    }

    public void setDinnerDate(Date dinnerDate) {
        this.dinnerDate = dinnerDate;
    }

    @Basic
    @Column(name = "dinnerName")
    public String getDinnerName() {
        return dinnerName;
    }

    public void setDinnerName(String dinnerName) {
        this.dinnerName = dinnerName;
    }

    @Basic
    @Column(name = "dinnerMeal")
    public Double getDinnerMeal() {
        return dinnerMeal;
    }

    public void setDinnerMeal(Double dinnerMeal) {
        this.dinnerMeal = dinnerMeal;
    }

    @Basic
    @Column(name = "dinnerEatNum")
    public Integer getDinnerEatNum() {
        return dinnerEatNum;
    }

    public void setDinnerEatNum(Integer dinnerEatNum) {
        this.dinnerEatNum = dinnerEatNum;
    }

    @Basic
    @Column(name = "dinnerother")
    public Double getDinnerother() {
        return dinnerother;
    }

    public void setDinnerother(Double dinnerother) {
        this.dinnerother = dinnerother;
    }

    @Basic
    @Column(name = "dinnerPayMethods")
    public String getDinnerPayMethods() {
        return dinnerPayMethods;
    }

    public void setDinnerPayMethods(String dinnerPayMethods) {
        this.dinnerPayMethods = dinnerPayMethods;
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
        Reportrestaurant that = (Reportrestaurant) o;
        return Objects.equals(reportRestaurantId, that.reportRestaurantId) &&
                Objects.equals(lunchDate, that.lunchDate) &&
                Objects.equals(luncheonName, that.luncheonName) &&
                Objects.equals(lunchMeal, that.lunchMeal) &&
                Objects.equals(lunchEatNum, that.lunchEatNum) &&
                Objects.equals(lunchother, that.lunchother) &&
                Objects.equals(lunchPayMethods, that.lunchPayMethods) &&
                Objects.equals(dinnerDate, that.dinnerDate) &&
                Objects.equals(dinnerName, that.dinnerName) &&
                Objects.equals(dinnerMeal, that.dinnerMeal) &&
                Objects.equals(dinnerEatNum, that.dinnerEatNum) &&
                Objects.equals(dinnerother, that.dinnerother) &&
                Objects.equals(dinnerPayMethods, that.dinnerPayMethods) &&
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

        return Objects.hash(reportRestaurantId, lunchDate, luncheonName, lunchMeal, lunchEatNum, lunchother, lunchPayMethods, dinnerDate, dinnerName, dinnerMeal, dinnerEatNum, dinnerother, dinnerPayMethods, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
