package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度景点参数类（wuyongfei）
 **/
@Component
public class PatchScenicspotParam {
    private Integer scenicSpotId; // 景点编号

    private Double costprice; // 景点成本价

    private Double offer; // 景点报价

    private Integer buynum; // 购买人数

    private String payment; // 付款方式

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date; // 时间

    private Integer weight; // 权重（每一天）

    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
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

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
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
