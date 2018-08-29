package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店参数类（wuyongfei）
 **/
@Component
public class PatchHotelParam {
    private Integer hotelType; // 酒店房间类型编号

    private Integer hotelNum; // 房间数量

    private Double hotelCostPrice; // 房间成本价

    private Double hotelOffer; // 房间报价

    private String payment; // 支付方式

    private Integer weight; // 权重（每一天）

    private Integer companyBedNum; // 司陪房间数

    private Double companyBedoffer; // 司陪成本价

    private String companyPaymeny; // 司陪付款方式

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date; // 住宿时间

    public Integer getCompanyBedNum() {
        return companyBedNum;
    }

    public void setCompanyBedNum(Integer companyBedNum) {
        this.companyBedNum = companyBedNum;
    }

    public Double getCompanyBedoffer() {
        return companyBedoffer;
    }

    public void setCompanyBedoffer(Double companyBedoffer) {
        this.companyBedoffer = companyBedoffer;
    }

    public String getCompanyPaymeny() {
        return companyPaymeny;
    }

    public void setCompanyPaymeny(String companyPaymeny) {
        this.companyPaymeny = companyPaymeny;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public Integer getHotelNum() {
        return hotelNum;
    }

    public void setHotelNum(Integer hotelNum) {
        this.hotelNum = hotelNum;
    }

    public Double getHotelCostPrice() {
        return hotelCostPrice;
    }

    public void setHotelCostPrice(Double hotelCostPrice) {
        this.hotelCostPrice = hotelCostPrice;
    }

    public Double getHotelOffer() {
        return hotelOffer;
    }

    public void setHotelOffer(Double hotelOffer) {
        this.hotelOffer = hotelOffer;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
