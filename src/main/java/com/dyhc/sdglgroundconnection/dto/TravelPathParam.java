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
    private List<Disattr> disattrList; // 调度景点集合
    private List<Disline> dislineList; // 调度线路集合
    private List<Disshopp> disshoppList; // 调度购物集合
    private List<Disrestaurant> disrestaurantList; // 调度餐厅集合
    private List<Dispatchhotel> dispatchhotelList; // 调度酒店集合

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

    public List<Disattr> getDisattrList() {
        return disattrList;
    }

    public void setDisattrList(List<Disattr> disattrList) {
        this.disattrList = disattrList;
    }

    public List<Disline> getDislineList() {
        return dislineList;
    }

    public void setDislineList(List<Disline> dislineList) {
        this.dislineList = dislineList;
    }

    public List<Disshopp> getDisshoppList() {
        return disshoppList;
    }

    public void setDisshoppList(List<Disshopp> disshoppList) {
        this.disshoppList = disshoppList;
    }

    public List<Disrestaurant> getDisrestaurantList() {
        return disrestaurantList;
    }

    public void setDisrestaurantList(List<Disrestaurant> disrestaurantList) {
        this.disrestaurantList = disrestaurantList;
    }

    public List<Dispatchhotel> getDispatchhotelList() {
        return dispatchhotelList;
    }

    public void setDispatchhotelList(List<Dispatchhotel> dispatchhotelList) {
        this.dispatchhotelList = dispatchhotelList;
    }
}
