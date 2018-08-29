package com.dyhc.sdglgroundconnection.dto;

import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度饮食类型参数类（wuyongfei）
 **/
@Component
public class PatchMealTypeParam {
    private Integer typeId; // 饮食类型编号

    private Double costprice; // 饮食类型成本价

    private Double offer; // 饮食类型报价

    private Integer dinDate; // 饮食时间（2代表午餐 3代表晚餐）

    private Integer weight; // 权重（每天）

    private String payment; // 付款方式

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public Integer getDinDate() {
        return dinDate;
    }

    public void setDinDate(Integer dinDate) {
        this.dinDate = dinDate;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
