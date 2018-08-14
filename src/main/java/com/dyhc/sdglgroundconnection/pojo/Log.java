package com.dyhc.sdglgroundconnection.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 带团日志表
 **/
@Table(name = "log")
public class Log {
    @Id
    @Column(name = "logId")
    private int logId; // 日志编号
    @Column(name = "guideId")
    private Integer guideId; // 导游id
    @Column(name = "dispatchId")
    private Integer dispatchId; // 调度表编号（外键，与调度表关联）
    private String content; // 内容
    private String remarks; // 备注
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @Column(name = "creationDate")
    private Date creationDate; // 创建日期
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "logId")
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "guideId")
    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    @Basic
    @Column(name = "dispatchId")
    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return logId == log.logId &&
                Objects.equals(guideId, log.guideId) &&
                Objects.equals(dispatchId, log.dispatchId) &&
                Objects.equals(content, log.content) &&
                Objects.equals(remarks, log.remarks) &&
                Objects.equals(whetherDel, log.whetherDel) &&
                Objects.equals(creater, log.creater) &&
                Objects.equals(modifier, log.modifier) &&
                Objects.equals(modifiedData, log.modifiedData) &&
                Objects.equals(creationDate, log.creationDate) &&
                Objects.equals(value1, log.value1) &&
                Objects.equals(value2, log.value2) &&
                Objects.equals(value3, log.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(logId, guideId, dispatchId, content, remarks, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
