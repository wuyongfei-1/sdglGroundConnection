package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "shopping")
public class Shopping {
    @Id
    @Column(name = "shoppingId")
    private int shoppingId;
    @Column(name = "shoppingSite")
    private String shoppingSite;
    @Column(name = "scenicSpotId")
    private Integer scenicSpotId;
    @Column(name = "whetherDel")
    private Integer whetherDel;
    private Integer creater;
    private Integer modifier;
    @Column(name = "modifiedData")
    private Date modifiedData;
    @Column(name = "creationDate")
    private Date creationDate;
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "shoppingId")
    public int getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(int shoppingId) {
        this.shoppingId = shoppingId;
    }

    @Basic
    @Column(name = "shoppingSite")
    public String getShoppingSite() {
        return shoppingSite;
    }

    public void setShoppingSite(String shoppingSite) {
        this.shoppingSite = shoppingSite;
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
        Shopping shopping = (Shopping) o;
        return shoppingId == shopping.shoppingId &&
                Objects.equals(shoppingSite, shopping.shoppingSite) &&
                Objects.equals(scenicSpotId, shopping.scenicSpotId) &&
                Objects.equals(whetherDel, shopping.whetherDel) &&
                Objects.equals(creater, shopping.creater) &&
                Objects.equals(modifier, shopping.modifier) &&
                Objects.equals(modifiedData, shopping.modifiedData) &&
                Objects.equals(creationDate, shopping.creationDate) &&
                Objects.equals(value1, shopping.value1) &&
                Objects.equals(value2, shopping.value2) &&
                Objects.equals(value3, shopping.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shoppingId, shoppingSite, scenicSpotId, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
