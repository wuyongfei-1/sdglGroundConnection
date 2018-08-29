package com.dyhc.sdglgroundconnection.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GuidescheduleParam {
    //导游行程编号
    private Integer guidescheduleid;

    private String guideName; // 导游姓名

    private String certificate; // 导游证件号

    private Integer schedulestate;//导游日程状态

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date schedulebegintime; //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date scheduleendtime;//


    public Integer getGuidescheduleid() {
        return guidescheduleid;
    }

    public void setGuidescheduleid(Integer guidescheduleid) {
        this.guidescheduleid = guidescheduleid;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Integer getSchedulestate() {
        return schedulestate;
    }

    public void setSchedulestate(Integer schedulestate) {
        this.schedulestate = schedulestate;
    }

    public Date getSchedulebegintime() {
        return schedulebegintime;
    }

    public void setSchedulebegintime(Date schedulebegintime) {
        this.schedulebegintime = schedulebegintime;
    }

    public Date getScheduleendtime() {
        return scheduleendtime;
    }

    public void setScheduleendtime(Date scheduleendtime) {
        this.scheduleendtime = scheduleendtime;
    }
}
