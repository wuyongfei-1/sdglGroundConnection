package com.dyhc.sdglgroundconnection.pojo;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公司信息表
 **/
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "companyId")
    private int companyId; // 编号
    @Column(name = "companyName")
    private String companyName; // 公司名称
    @Column(name = "companyAddress")
    private String companyAddress; // 地址
    @Column(name = "companyPhone")
    private Integer companyPhone; // 电话
    private String fax; // 传真
    @Column(name = "zipCode")
    private String zipCode; // 邮编
    @Column(name = "businessLicense")
    private String businessLicense; // 经营许可证（L-SX-CJ00026）
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    private Integer creater; // 创建人 （外键，与人员表关联）
    private Integer modifier; // 修改人（外键，与人员表关联）
    @Column(name = "modifiedData")
    private Date modifiedData; // 修改日期
    @Column(name = "creationDate")
    private Date creationDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "companyId")
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "companyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "companyAddress")
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "companyPhone")
    public Integer getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(Integer companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "zipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "businessLicense")
    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
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
        Company company = (Company) o;
        return companyId == company.companyId &&
                Objects.equals(companyName, company.companyName) &&
                Objects.equals(companyAddress, company.companyAddress) &&
                Objects.equals(companyPhone, company.companyPhone) &&
                Objects.equals(fax, company.fax) &&
                Objects.equals(zipCode, company.zipCode) &&
                Objects.equals(businessLicense, company.businessLicense) &&
                Objects.equals(whetherDel, company.whetherDel) &&
                Objects.equals(creater, company.creater) &&
                Objects.equals(modifier, company.modifier) &&
                Objects.equals(modifiedData, company.modifiedData) &&
                Objects.equals(creationDate, company.creationDate) &&
                Objects.equals(value1, company.value1) &&
                Objects.equals(value2, company.value2) &&
                Objects.equals(value3, company.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(companyId, companyName, companyAddress, companyPhone, fax, zipCode, businessLicense, whetherDel, creater, modifier, modifiedData, creationDate, value1, value2, value3);
    }
}
