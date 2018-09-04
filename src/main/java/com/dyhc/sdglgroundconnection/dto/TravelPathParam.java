package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.*;

import javax.validation.constraints.Max;
import java.security.PrivateKey;
import java.util.List;

/**
 * 调度表
 */
public class TravelPathParam {
    private Dispatch dispatch; // 调度信息
    private Company company; // 本公司对象
    private Disguide disguide; // 调度导游表对象
    private Staff staff; // 计调人员信息对象
    private Discar discar; // 调度用车对象

    private String xcdata; // 行程日期
    private String szaddress; // 所在地区
    private String xctext; // 行程内容
    private String shoppaddress; // 购物地点
    private String eataddress; // 用餐地点
    private String zhuaddress; // 住宿地点

    public String getXcdata() {
        return xcdata;
    }

    public void setXcdata(String xcdata) {
        this.xcdata = xcdata;
    }

    public String getSzaddress() {
        return szaddress;
    }

    public void setSzaddress(String szaddress) {
        this.szaddress = szaddress;
    }

    public String getXctext() {
        return xctext;
    }

    public void setXctext(String xctext) {
        this.xctext = xctext;
    }

    public String getShoppaddress() {
        return shoppaddress;
    }

    public void setShoppaddress(String shoppaddress) {
        this.shoppaddress = shoppaddress;
    }

    public String getEataddress() {
        return eataddress;
    }

    public void setEataddress(String eataddress) {
        this.eataddress = eataddress;
    }

    public String getZhuaddress() {
        return zhuaddress;
    }

    public void setZhuaddress(String zhuaddress) {
        this.zhuaddress = zhuaddress;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Disguide getDisguide() {
        return disguide;
    }

    public void setDisguide(Disguide disguide) {
        this.disguide = disguide;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Discar getDiscar() {
        return discar;
    }

    public void setDiscar(Discar discar) {
        this.discar = discar;
    }

}
