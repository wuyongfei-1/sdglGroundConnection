package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Table(name = "dispatch")
public class Dispatch {
    @Id
    @Column(name = "dispatchId")
    private int dispatchId;
    @Column(name = "groundConnectionNumber")
    private String groundConnectionNumber;
    @Column(name = "groupNumber")
    private String groupNumber;
    @Column(name = "sendLine")
    private String sendLine;
    @Column(name = "travelStartTime")
    private Date travelStartTime;
    @Column(name = "travelEndTime")
    private Date travelEndTime;
    private Integer num;
    private String tourist;
    private String trip;
    private Double offer;
    @Column(name = "aVariance")
    private Double aVariance;
    private Double fare;
    @Column(name = "wineFee")
    private Double wineFee;
    private String not;
    private String remarks;
    private String supervision;
    private String reception;
    private Double total;
    private Double loan;
    private Integer state;
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
    @Column(name = "dispatchId")
    public int getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(int dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "groundConnectionNumber")
    public String getGroundConnectionNumber() {
        return groundConnectionNumber;
    }

    public void setGroundConnectionNumber(String groundConnectionNumber) {
        this.groundConnectionNumber = groundConnectionNumber;
    }

    @Basic
    @Column(name = "groupNumber")
    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Basic
    @Column(name = "sendLine")
    public String getSendLine() {
        return sendLine;
    }

    public void setSendLine(String sendLine) {
        this.sendLine = sendLine;
    }

    @Basic
    @Column(name = "travelStartTime")
    public Date getTravelStartTime() {
        return travelStartTime;
    }

    public void setTravelStartTime(Date travelStartTime) {
        this.travelStartTime = travelStartTime;
    }

    @Basic
    @Column(name = "travelEndTime")
    public Date getTravelEndTime() {
        return travelEndTime;
    }

    public void setTravelEndTime(Date travelEndTime) {
        this.travelEndTime = travelEndTime;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "tourist")
    public String getTourist() {
        return tourist;
    }

    public void setTourist(String tourist) {
        this.tourist = tourist;
    }

    @Basic
    @Column(name = "trip")
    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
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
    @Column(name = "aVariance")
    public Double getaVariance() {
        return aVariance;
    }

    public void setaVariance(Double aVariance) {
        this.aVariance = aVariance;
    }

    @Basic
    @Column(name = "fare")
    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    @Basic
    @Column(name = "wineFee")
    public Double getWineFee() {
        return wineFee;
    }

    public void setWineFee(Double wineFee) {
        this.wineFee = wineFee;
    }

    @Basic
    @Column(name = "not")
    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "supervision")
    public String getSupervision() {
        return supervision;
    }

    public void setSupervision(String supervision) {
        this.supervision = supervision;
    }

    @Basic
    @Column(name = "reception")
    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    @Basic
    @Column(name = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Basic
    @Column(name = "loan")
    public Double getLoan() {
        return loan;
    }

    public void setLoan(Double loan) {
        this.loan = loan;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        Dispatch dispatch = (Dispatch) o;
        return dispatchId == dispatch.dispatchId &&
                Objects.equals(groundConnectionNumber, dispatch.groundConnectionNumber) &&
                Objects.equals(groupNumber, dispatch.groupNumber) &&
                Objects.equals(sendLine, dispatch.sendLine) &&
                Objects.equals(travelStartTime, dispatch.travelStartTime) &&
                Objects.equals(travelEndTime, dispatch.travelEndTime) &&
                Objects.equals(num, dispatch.num) &&
                Objects.equals(tourist, dispatch.tourist) &&
                Objects.equals(trip, dispatch.trip) &&
                Objects.equals(offer, dispatch.offer) &&
                Objects.equals(aVariance, dispatch.aVariance) &&
                Objects.equals(fare, dispatch.fare) &&
                Objects.equals(wineFee, dispatch.wineFee) &&
                Objects.equals(not, dispatch.not) &&
                Objects.equals(remarks, dispatch.remarks) &&
                Objects.equals(supervision, dispatch.supervision) &&
                Objects.equals(reception, dispatch.reception) &&
                Objects.equals(total, dispatch.total) &&
                Objects.equals(loan, dispatch.loan) &&
                Objects.equals(state, dispatch.state) &&
                Objects.equals(whetherDel, dispatch.whetherDel) &&
                Objects.equals(creater, dispatch.creater) &&
                Objects.equals(modifier, dispatch.modifier) &&
                Objects.equals(modifiedData, dispatch.modifiedData) &&
                Objects.equals(creationDate, dispatch.creationDate) &&
                Objects.equals(value1, dispatch.value1) &&
                Objects.equals(value2, dispatch.value2) &&
                Objects.equals(value3, dispatch.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dispatchId, groundConnectionNumber, groupNumber, sendLine, travelStartTime, travelEndTime, num, tourist, trip, offer, aVariance, fare, wineFee, not, remarks, supervision, reception, total, loan, state, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
