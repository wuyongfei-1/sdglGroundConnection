package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 交通表
 **/
@Table(name = "traffic")
public class Traffic {
    @Id
    @Column(name = "trafficId")
    private int trafficId; // 交通编号
    @Column(name = "typeCode")
    private String typeCode; // 编码（【交通名称类型】外键，与字典表关联）
    @Column(name = "valueId")
    private Integer valueId; // 类型编号(与字典表 类型编号进行关联)
    @Column(name = "departureTime")
    private Date departureTime; // 出发时间
    @Column(name = "arrivalTime")
    private Date arrivalTime; // 抵达时间
    @Column(name = "trainNumber")
    private Integer trainNumber; // 车次
    private Double costprice; // 成本价
    private Double offer; // 报价
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate;//修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate;//创建时间
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
