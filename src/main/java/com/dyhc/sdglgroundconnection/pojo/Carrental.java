package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 汽车租赁公司表
 **/
@Table(name = "carrental")
public class Carrental {
    @Id
    @Column(name = "carRentalId")
    private int carRentalId; // 公司编号
    @Column(name = "carRentalName")
    private String carRentalName; // 名称
    private String phone; // 联系电话
    private String contacts; // 联系人
    @Column(name = "companyAddress")
    private String companyAddress; // 公司地址
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @Column(name = "updateDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate; // 修改日期
    @Column(name = "createDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate; // 创建日期
    private String value1;
    private String value2;
    private String value3;
    @Transient
    private List<VehicleType> vehicleTypes=new ArrayList<>();
    @Id
    @Column(name = "carRentalId")
    public int getCarRentalId() {
        return carRentalId;
    }

    public void setCarRentalId(int carRentalId) {
        this.carRentalId = carRentalId;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    @Basic
    @Column(name = "carRentalName")
    public String getCarRentalName() {
        return carRentalName;
    }

    public void setCarRentalName(String carRentalName) {
        this.carRentalName = carRentalName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "contacts")
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
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
    @Column(name = "whetherDel")
    public Integer getWhetherDel() {
        return whetherDel;
    }

    public void setWhetherDel(Integer whetherDel) {
        this.whetherDel = whetherDel;
    }

    @Basic
    @Column(name = "createBy")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "updateBy")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        Carrental carrental = (Carrental) o;
        return carRentalId == carrental.carRentalId &&
                Objects.equals(carRentalName, carrental.carRentalName) &&
                Objects.equals(phone, carrental.phone) &&
                Objects.equals(contacts, carrental.contacts) &&
                Objects.equals(companyAddress, carrental.companyAddress) &&
                Objects.equals(whetherDel, carrental.whetherDel) &&
                Objects.equals(createBy, carrental.createBy) &&
                Objects.equals(updateBy, carrental.updateBy) &&
                Objects.equals(updateDate, carrental.updateDate) &&
                Objects.equals(createDate, carrental.createDate) &&
                Objects.equals(value1, carrental.value1) &&
                Objects.equals(value2, carrental.value2) &&
                Objects.equals(value3, carrental.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carRentalId, carRentalName, phone, contacts, companyAddress, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }
}
