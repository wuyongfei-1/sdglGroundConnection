package com.dyhc.sdglgroundconnection.pojo;

import java.util.Date;

public class Tourguide {
    private Integer tourguideid;

    private Integer guideid;

    private Integer offid;

    private String logcontent;

    private String housestandard;

    private String foodstandard;

    private Date createdate;

    private String value1;

    private String value2;

    private String value3;

    public Integer getTourguideid() {
        return tourguideid;
    }

    public void setTourguideid(Integer tourguideid) {
        this.tourguideid = tourguideid;
    }

    public Integer getGuideid() {
        return guideid;
    }

    public void setGuideid(Integer guideid) {
        this.guideid = guideid;
    }

    public Integer getOffid() {
        return offid;
    }

    public void setOffid(Integer offid) {
        this.offid = offid;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
    }

    public String getHousestandard() {
        return housestandard;
    }

    public void setHousestandard(String housestandard) {
        this.housestandard = housestandard == null ? null : housestandard.trim();
    }

    public String getFoodstandard() {
        return foodstandard;
    }

    public void setFoodstandard(String foodstandard) {
        this.foodstandard = foodstandard == null ? null : foodstandard.trim();
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