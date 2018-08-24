package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *  调度旅行团表
 */
@Table(name = "dispatchtourgroup")
public class Dispatchtourgroup {

    @Id
    @Column(name = "dispatchtourgroupId")
    private Integer dispatchtourgroupid; // 编号

    @Column(name="offerId")
    private Integer offerid; // 调度信息编号（外键与调度表关联）

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="clusterTime")
    private Date clustertime; // 接团时间

    @Column(name="clusterAddress")
    private String clusteraddress; // 接团地点

    @Column(name="flightId")
    private String flightid; // 团队抵达航班/车次号

    @Column(name="teamContactsName")
    private String teamcontactsname; // 团队联系人

    @Column(name="contactNumber")
    private String contactnumber; // 联系电话

    @Column(name="updateBy")
    private Integer updateby; // 修改人

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="`upDate`")
    private Date update; // 修改时间

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="createDate")
    private Date createdate; // 创建时间

    @Column(name="value1")
    private String value1;

    @Column(name="value2")
    private String value2;

    @Column(name="value3")
    private String value3;

    public Integer getDispatchtourgroupid() {
        return dispatchtourgroupid;
    }

    public void setDispatchtourgroupid(Integer dispatchtourgroupid) {
        this.dispatchtourgroupid = dispatchtourgroupid;
    }

    public Integer getOfferid() {
        return offerid;
    }

    public void setOfferid(Integer offerid) {
        this.offerid = offerid;
    }

    public Date getClustertime() {
        return clustertime;
    }

    public void setClustertime(Date clustertime) {
        this.clustertime = clustertime;
    }

    public String getClusteraddress() {
        return clusteraddress;
    }

    public void setClusteraddress(String clusteraddress) {
        this.clusteraddress = clusteraddress == null ? null : clusteraddress.trim();
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getTeamcontactsname() {
        return teamcontactsname;
    }

    public void setTeamcontactsname(String teamcontactsname) {
        this.teamcontactsname = teamcontactsname == null ? null : teamcontactsname.trim();
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber == null ? null : contactnumber.trim();
    }

    public Integer getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Integer updateby) {
        this.updateby = updateby;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1 == null ? null : value1.trim();
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2 == null ? null : value2.trim();
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3 == null ? null : value3.trim();
    }
}