package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 *  导游报账门票表
 **/
@Table(name = "reportticket")
public class Reportticket {
    @Id
    @Column(name = "reportTicketId")
    private int reportTicketId; //  导游报账门票表编号
    @Column(name = "attrName")
    private String attrName; //  景点名称
    private Double price; //  单价
    private Integer nums; //  人数
    @Column(name = "payMethods")
    private String payMethods; //  支付方式
    private Integer status; //  是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; //  创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; //  修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "`upDate`")
    private Date upDate; //  修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; //  创建时间
    private String value1; // 导游报账明细表编号
    private String value2;
    private String value3;

    @Id
    @Column(name = "reportTicketId")
    public int getReportTicketId() {
        return reportTicketId;
    }

    public void setReportTicketId(int reportTicketId) {
        this.reportTicketId = reportTicketId;
    }

    @Basic
    @Column(name = "attrName")
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        Reportticket that = (Reportticket) o;
        return reportTicketId == that.reportTicketId &&
                Objects.equals(attrName, that.attrName) &&
                Objects.equals(price, that.price) &&
                Objects.equals(nums, that.nums) &&
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

        return Objects.hash(reportTicketId, attrName, price, nums, payMethods, status, createBy, updateBy, upDate, createDate, value1, value2, value3);
    }
}
