package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Reportaccommodation;
import com.dyhc.sdglgroundconnection.pojo.Reportrestaurant;

public class WechatReportdetailEatAndHotelParam {

    private Reportaccommodation reportaccommodation;//当日住宿信息

    private Reportrestaurant reportrestaurant;//当日用餐信息


    public Reportaccommodation getReportaccommodation() {
        return reportaccommodation;
    }

    public void setReportaccommodation(Reportaccommodation reportaccommodation) {
        this.reportaccommodation = reportaccommodation;
    }

    public Reportrestaurant getReportrestaurant() {
        return reportrestaurant;
    }

    public void setReportrestaurant(Reportrestaurant reportrestaurant) {
        this.reportrestaurant = reportrestaurant;
    }
}
