package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "linetemplatethird")
public class Linetemplatethird implements Serializable {
    @Id
    @Column(name = "thirdId")
    private Integer thirdid;    // 线路模板编号

    @Column(name = "lineId")
    private Integer lineid;  // 线路编号（与线路表关联）

    private Integer weight; // 线路权重

    @Column(name = "templateId")
    private Integer templateid; // 模板编号（与模板表关联）

    @Column(name = "createBy")
    private Integer createby;   // 创建人

    @Column(name = "updateBy")
    private Integer updateby;   // 修改人

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createdate;    // 创建时间

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updatedate;    // 修改时间

    private String value1;

    private String value2;

    private String value3;


    public Integer getThirdid() {
        return thirdid;
    }

    public void setThirdid(Integer thirdid) {
        this.thirdid = thirdid;
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Integer getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Integer updateby) {
        this.updateby = updateby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }
}