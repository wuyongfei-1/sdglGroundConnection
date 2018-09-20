package com.dyhc.sdglgroundconnection.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 调度路线信息表
 */
@Table(name = "disline")
public class Disline implements Serializable {
    @Id
    @Column(name = "dislineId")
    private Integer dislineId;  // 调度线路编号

    @Column(name = "offerId")
    private Integer offerId;    // 调度信息编号（外键，和调度信息表关联）

    @Column(name = "lineName")
    private String lineName;    // 线路名称

    @Column(name = "lineContent")
    private String lineContent; // 线路行程内容

    private Integer weight; // 权重（每一天）

    @Column(name = "travelTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd")
    private Date travelTime;    // 旅行时间

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createTime")
    private Date createTime;    // 创建时间

    @Column(name = "createUser")
    private Integer createUser; // 创建人

    private String value1;  // 预留列一

    private String value2;  // 预留列二

    private String value3;  // 预留列三

    public Integer getDislineId() {
        return dislineId;
    }

    public void setDislineId(Integer dislineId) {
        this.dislineId = dislineId;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineContent() {
        return lineContent;
    }

    public void setLineContent(String lineContent) {
        this.lineContent = lineContent;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Date travelTime) {
        this.travelTime = travelTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }
}