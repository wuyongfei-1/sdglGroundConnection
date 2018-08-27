package com.dyhc.sdglgroundconnection.dto;

/**
 * 报价行程参数类（dubingkun）
 */
public class OfferTravelParam {
    private String day;//天数
    private String dl;//抵达，离开
    private String xc;//行程内容
    private String cs;//餐食
    private String zs;//住宿
    private String zsdh;//住宿电话

    public String getZsdh() {
        return zsdh;
    }

    public void setZsdh(String zsdh) {
        this.zsdh = zsdh;
    }

    public String getDay() {

        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public String getXc() {
        return xc;
    }

    public void setXc(String xc) {
        this.xc = xc;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }
}
