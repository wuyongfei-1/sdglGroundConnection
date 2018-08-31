package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度餐厅表
 **/
@Table(name = "disrestaurant")
public class Disrestaurant {
    @Id
    @Column(name = "disRestaurantId")
    private int disRestaurantId; // 调度餐厅id
    @Column(name = "typeId")
    private Integer typeId; // 餐馆类型编号（外键，与餐馆类型表关联）
    @Column(name = "offerId")
    private Integer offerId; // 调度信息编号（外键，与调度信息表关联）
    @Column(name = "weight")
    private Integer weight;//权重（天数）
    private String payment; // 付款方式
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    @Column(name = "quotePrice")
    private Double quotePrice; // 报价
    @Column(name = "dinDate")
    private Integer dinDate; // 用餐时间（早、中、晚）
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "`upDate`")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;
    @Transient
    private Restaurant restaurant;
    @Transient
    private MealType mealType; // 餐馆类型对象

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    @Id
    @Column(name = "disRestaurantId")
    public int getDisRestaurantId() {
        return disRestaurantId;
    }

    public void setDisRestaurantId(int disRestaurantId) {
        this.disRestaurantId = disRestaurantId;
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
    @Column(name = "offerId")
    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    @Basic
    @Column(name = "costPrice")
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    @Basic
    @Column(name = "quotePrice")
    public Double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(Double quotePrice) {
        this.quotePrice = quotePrice;
    }



    @Basic
    @Column(name = "dinDate")
    public Integer getDinDate() {
        return dinDate;
    }

    public void setDinDate(Integer dinDate) {
        this.dinDate = dinDate;
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


    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
