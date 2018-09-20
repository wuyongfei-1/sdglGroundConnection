package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * 带团日志表 （wangtao）
 */
@Table(name="tourguide")
public class Tourguide implements Serializable {

    @Id
    @Column(name = "tourguideId")
    private Integer tourguideid;

    @Column(name = "guideId")
    private Integer guideid;

    @Column(name = "offId")
    private Integer offid;

    @Column(name = "logContent")
    private String logcontent;

    @Column(name = "houseStandard")
    private String housestandard;

    @Column(name = "foodStandard")
    private String foodstandard;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createdate;

    @Column(name = "value1")
    private String value1;

    @Column(name = "value2")
    private String value2;

    @Column(name = "value3")
    private String value3;

    @Transient
    private Guide guide; // 导游对象

    @Transient
    private Dispatch dispatch; // 调度信息对象

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

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