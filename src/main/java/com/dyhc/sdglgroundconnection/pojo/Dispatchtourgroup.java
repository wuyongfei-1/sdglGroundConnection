package com.dyhc.sdglgroundconnection.pojo;

import java.util.Date;

public class Dispatchtourgroup {
    private Integer dispatchtourgroupid;

    private Integer offerid;

    private Date clustertime;

    private String clusteraddress;

    private String flightid;

    private String teamcontactsname;

    private String contactnumber;

    private Integer updateby;

    private Date update;

    private Date createdate;

    private String value1;

    private String value2;

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