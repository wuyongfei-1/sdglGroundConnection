package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度表
 **/
@Table(name = "dispatch")
public class Dispatch {
    @Id
    @Column(name = "dispatchId")
    private int dispatchId; // 调度信息编号
    @Column(name = "groundConnectionNumber")
    private String groundConnectionNumber; // 地接社团号
    @Column(name = "groupNumber")
    private String groupNumber; // 组团社团号
    @Column(name = "sendLine")
    private String sendLine; // 发往线路
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @Column(name = "travelStartTime")
    private Date travelStartTime; // 旅行开始时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @Column(name = "travelEndTime")
    private Date travelEndTime; // 旅行结束时间
    private Integer num; // 人数
    private String tourist; // 客源地
    private String trip; // 行程
    private Double offer; // 报价(按人数算)
    @Transient
    private Guide guide;
    @Column(name = "aVariance")
    private Double aVariance; // 单间房差
    private Double fare; // 车费
    @Column(name = "wineFee")
    private Double wineFee; // 酒水费
    @Column(name = "notContain")
    private String notContain; // 不含
    private String remarks; // 备注
    private String supervision; // 团体监督
    private String reception; // 接待标准
    private Double total; // 总计
    private Double loan; // 导游借款
    @Column(name = "`status`")
    private Integer status; // 审核状态  调度状态（1、已审核  2、未审核）
    private Integer state; // 状态（1、未开始2、进行中3、已结束）
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    @Column(name = "`modifier`")
    private Integer modifier; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "creationDate")
    private Date creationDate; // 创建日期
    private String value1; // 组团社联系人（团控）
    private String value2; // 组团社联系电话
    private String value3;


    @Transient
    private Staff staff; // 计调人员信息对象

    @Transient
    private List<Disrestaurant> disrestaurantList; // 调度餐厅集合

    @Transient
    private Discar discar; // 调度用车对象

    @Transient
    private Dispatchtourgroup dispatchtourgroup; // 调度旅行团对象

    @Transient
    private List<Dispatchhotel> dispatchhotel; // 调度酒店表对象

    @Transient
    private List<Disattr> disattrList; // 调度景点表集合

    @Transient
    private Disguide disguide; // 调度导游表对象

    @Transient
    private Company company; // 本公司对象

    @Transient
    private Bill bill; // 集体照对象

    @Transient
    private List<Disline> dislineList; // 线路集合

    @Transient
    private List<Disshopp> disshoppList; // 购物地集合

    @Transient
    private Disother disother; // 其他对象

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public List<Disrestaurant> getDisrestaurantList() {
        return disrestaurantList;
    }

    public void setDisrestaurantList(List<Disrestaurant> disrestaurantList) {
        this.disrestaurantList = disrestaurantList;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<Disattr> getDisattrList() {
        return disattrList;
    }

    public void setDisattrList(List<Disattr> disattrList) {
        this.disattrList = disattrList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Discar getDiscar() {
        return discar;
    }

    public void setDiscar(Discar discar) {
        this.discar = discar;
    }

    public List<Dispatchhotel> getDispatchhotel() {
        return dispatchhotel;
    }

    public void setDispatchhotel(List<Dispatchhotel> dispatchhotel) {
        this.dispatchhotel = dispatchhotel;
    }

    public Disguide getDisguide() {
        return disguide;
    }

    public void setDisguide(Disguide disguide) {
        this.disguide = disguide;
    }

    public Dispatchtourgroup getDispatchtourgroup() {
        return dispatchtourgroup;
    }

    public void setDispatchtourgroup(Dispatchtourgroup dispatchtourgroup) {
        this.dispatchtourgroup = dispatchtourgroup;
    }

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

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
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

    public String getNotContain() {
        return notContain;
    }

    public void setNotContain(String notContain) {
        this.notContain = notContain;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Disline> getDislineList() {
        return dislineList;
    }

    public void setDislineList(List<Disline> dislineList) {
        this.dislineList = dislineList;
    }

    public List<Disshopp> getDisshoppList() {
        return disshoppList;
    }

    public void setDisshoppList(List<Disshopp> disshoppList) {
        this.disshoppList = disshoppList;
    }

    public Disother getDisother() {
        return disother;
    }

    public void setDisother(Disother disother) {
        this.disother = disother;
    }
}
