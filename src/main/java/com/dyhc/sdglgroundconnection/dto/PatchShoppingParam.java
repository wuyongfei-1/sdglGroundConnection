package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度购物地点参数类（wuyongfei）
 **/
@Component
public class PatchShoppingParam {
    private Integer shoppingId; // 购物地点编号

    private Integer weight; // 权重（每一天）

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date; // 购买时间

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
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
