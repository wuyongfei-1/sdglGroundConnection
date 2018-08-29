package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路参数类（wuyongfei）
 **/
@Component
public class PatchLineParam {
    private String lineName; // 线路名称

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date travelTime; // 旅行时间

    private String desc; // 行程内容

    private Integer weight; // 权重（每一天）

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Date getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Date travelTime) {
        this.travelTime = travelTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
