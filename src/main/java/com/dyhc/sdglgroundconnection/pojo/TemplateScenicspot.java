package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板景点表
 **/
@Table(name = "templatescenicspot")
public class TemplateScenicspot {
    @Id
    @Column(name = "templateScenicSpotId")
    private int templateScenicSpotId; // 主键编号
    @Column(name = "templateId")
    private Integer templateId; // 模板编号（外键，与模板信息表关联）
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId; // 景点编号（外键，与景点表关联）
    @Column(name = "costPrice")
    private Double costPrice; // 成本价
    private Double offer; // 报价
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "creationDate")
    private Date creationDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Transient
    private Scenicspot scenicspot; // 景点对象

    public Scenicspot getScenicspot() {
        return scenicspot;
    }

    public void setScenicspot(Scenicspot scenicspot) {
        this.scenicspot = scenicspot;
    }

    @Id
    @Column(name = "templateScenicSpotId")
    public int getTemplateScenicSpotId() {
        return templateScenicSpotId;
    }

    public void setTemplateScenicSpotId(int templateScenicSpotId) {
        this.templateScenicSpotId = templateScenicSpotId;
    }

    @Basic
    @Column(name = "templateId")
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "scenicSpotId")
    public Integer getScenicSpotId() {
        return scenicSpotId;
    }

    public void setScenicSpotId(Integer scenicSpotId) {
        this.scenicSpotId = scenicSpotId;
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
    @Column(name = "offer")
    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    @Basic
    @Column(name = "whetherDel")
    public Integer getWhetherDel() {
        return whetherDel;
    }

    public void setWhetherDel(Integer whetherDel) {
        this.whetherDel = whetherDel;
    }

    @Basic
    @Column(name = "creater")
    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    @Basic
    @Column(name = "modifier")
    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "modifiedData")
    public Date getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Date modifiedData) {
        this.modifiedData = modifiedData;
    }

    @Basic
    @Column(name = "creationDate")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
        TemplateScenicspot that = (TemplateScenicspot) o;
        return templateScenicSpotId == that.templateScenicSpotId &&
                Objects.equals(templateId, that.templateId) &&
                Objects.equals(scenicSpotId, that.scenicSpotId) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(offer, that.offer) &&
                Objects.equals(whetherDel, that.whetherDel) &&
                Objects.equals(creater, that.creater) &&
                Objects.equals(modifier, that.modifier) &&
                Objects.equals(modifiedData, that.modifiedData) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(templateScenicSpotId, templateId, scenicSpotId, costPrice, offer, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
