package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 导游日程安排表
 */
@Table(name = "guideschedule")
public class GuideSchedule implements Serializable {
    @Id
    @Column(name = "guideScheduleId")
    private Integer guidescheduleid;

    @Column(name = "guideId")
    private Integer guideid;

    @Column(name = "scheduleState")
    private Integer schedulestate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "scheduleBeginTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date schedulebegintime;

    @Transient
    private Guide guide;

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "scheduleEndTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date scheduleendtime;

    private String value1;

    private String value2;

    private String value3;

    public Integer getGuidescheduleid() {
        return guidescheduleid;
    }

    public void setGuidescheduleid(Integer guidescheduleid) {
        this.guidescheduleid = guidescheduleid;
    }

    public Integer getGuideid() {
        return guideid;
    }

    public void setGuideid(Integer guideid) {
        this.guideid = guideid;
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