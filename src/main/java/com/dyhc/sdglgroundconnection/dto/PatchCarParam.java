package com.dyhc.sdglgroundconnection.dto;

import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车参数类（wuyongfei）
 **/
@Component
public class PatchCarParam {
    private Integer typeId; // 用车类型编号

    private Integer number; // 用车数量

    private Double costPrice; // 用车成本价

    private Double offer; // 用车报价

    private String carNo; // 车牌号

    private String carPeopleName; // 驾驶员姓名

    private String carPeoplePhone; // 驾驶员联系电话

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarPeopleName() {
        return carPeopleName;
    }

    public void setCarPeopleName(String carPeopleName) {
        this.carPeopleName = carPeopleName;
    }

    public String getCarPeoplePhone() {
        return carPeoplePhone;
    }

    public void setCarPeoplePhone(String carPeoplePhone) {
        this.carPeoplePhone = carPeoplePhone;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }
}
