package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "traffic")
public class Traffic {
    @Id
    @Column(name = "trafficId")
    private int trafficId;
    @Column(name = "typeCode")
    private String typeCode;
    @Column(name = "valueId")
    private Integer valueId;
    @Column(name = "departureTime")
    private Date departureTime;
    @Column(name = "arrivalTime")
    private Date arrivalTime;
    @Column(name = "trainNumber")
    private Integer trainNumber;
    private Double costprice;
    private Double offer;
    @Column(name = "whetherDel")
    private Integer whetherDel;
    @Column(name = "createBy")
    private Integer createBy;
    @Column(name = "updateBy")
    private Integer updateBy;
    @Column(name = "updateDate")
    private Date updateDate;
    @Column(name = "createDate")
    private Date createDate;
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "trafficId")
    public int getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(int trafficId) {
        this.trafficId = trafficId;
    }

    @Basic
    @Column(name = "typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Basic
    @Column(name = "valueId")
    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "departureTime")
    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "arrivalTime")
    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "trainNumber")
    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Basic
    @Column(name = "costprice")
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
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
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traffic traffic = (Traffic) o;
        return trafficId == traffic.trafficId &&
                Objects.equals(typeCode, traffic.typeCode) &&
                Objects.equals(valueId, traffic.valueId) &&
                Objects.equals(departureTime, traffic.departureTime) &&
                Objects.equals(arrivalTime, traffic.arrivalTime) &&
                Objects.equals(trainNumber, traffic.trainNumber) &&
                Objects.equals(costprice, traffic.costprice) &&
                Objects.equals(offer, traffic.offer) &&
                Objects.equals(whetherDel, traffic.whetherDel) &&
                Objects.equals(createBy, traffic.createBy) &&
                Objects.equals(updateBy, traffic.updateBy) &&
                Objects.equals(updateDate, traffic.updateDate) &&
                Objects.equals(createDate, traffic.createDate) &&
                Objects.equals(value1, traffic.value1) &&
                Objects.equals(value2, traffic.value2) &&
                Objects.equals(value3, traffic.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(trafficId, typeCode, valueId, departureTime, arrivalTime, trainNumber, costprice, offer, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
