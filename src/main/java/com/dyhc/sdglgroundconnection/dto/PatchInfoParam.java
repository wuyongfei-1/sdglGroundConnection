package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度信息参数类（wuyongfei）
 **/
@Component
public class PatchInfoParam {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date travelStartTime;   // 旅行开始时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date travelEndTime; // 旅行结束时间

    private String travelName; // 旅行社名称

    private Integer num; // 人数

    private String beginAddress; // 接团地点

    private String endAddress; // 送团地点

    private String carNum; // 抵达航班/车次号

    private String concat; // 团队联系人

    private String concatPhone; // 联系电话

    private Double fare; // 车费

    private Double wineFee; // 酒水费

    private String remarks; // 备注

    private String reception; // 接待标准

    private String supervision; // 团体监督

    private Double loan; // 导游借款

    private Double otherCostPrice; // 其他的成本价

    private Double otherOffer; // 其他的报价

    private String tourist; // 客源地


    public Double getOtherCostPrice() {
        return otherCostPrice;
    }

    public void setOtherCostPrice(Double otherCostPrice) {
        this.otherCostPrice = otherCostPrice;
    }

    public Double getOtherOffer() {
        return otherOffer;
    }

    public void setOtherOffer(Double otherOffer) {
        this.otherOffer = otherOffer;
    }

    public String getBeginAddress() {
        return beginAddress;
    }

    public void setBeginAddress(String beginAddress) {
        this.beginAddress = beginAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat;
    }

    public String getConcatPhone() {
        return concatPhone;
    }

    public void setConcatPhone(String concatPhone) {
        this.concatPhone = concatPhone;
    }

    public Date getTravelStartTime() {
        return travelStartTime;
    }

    public void setTravelStartTime(Date travelStartTime) {
        this.travelStartTime = travelStartTime;
    }

    public Date getTravelEndTime() {
        return travelEndTime;
    }

    public void setTravelEndTime(Date travelEndTime) {
        this.travelEndTime = travelEndTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Double getWineFee() {
        return wineFee;
    }

    public void setWineFee(Double wineFee) {
        this.wineFee = wineFee;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public String getSupervision() {
        return supervision;
    }

    public void setSupervision(String supervision) {
        this.supervision = supervision;
    }

    public Double getLoan() {
        return loan;
    }

    public void setLoan(Double loan) {
        this.loan = loan;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getTourist() {
        return tourist;
    }

    public void setTourist(String tourist) {
        this.tourist = tourist;
    }
}
