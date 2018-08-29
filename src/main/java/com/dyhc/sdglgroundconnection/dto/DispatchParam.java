package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度参数类（wuyongfei）
 **/
@Component
public class DispatchParam {

    private Dispatch dispatch; // 调度信息

    private Discar discar; // 调度用车

    private Disguide disguide; // 调度导游

    private Disother disother; // 调度其他

    private Dispatchtourgroup dispatchtourgroup; // 调度旅行社

    private List<Disattr> disattrList; // 调度景点列表

    private List<Dispatchhotel> dispatchhotelList; // 调度酒店列表

    private List<Disrestaurant> disrestaurantList; // 调度餐厅列表

    private List<Disshopp> disshoppList; // 调度购物列表

    private List<Disline> dislineList; // 调度线路信息列表


    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Discar getDiscar() {
        return discar;
    }

    public void setDiscar(Discar discar) {
        this.discar = discar;
    }

    public Disguide getDisguide() {
        return disguide;
    }

    public void setDisguide(Disguide disguide) {
        this.disguide = disguide;
    }

    public Disother getDisother() {
        return disother;
    }

    public void setDisother(Disother disother) {
        this.disother = disother;
    }

    public List<Disattr> getDisattrList() {
        return disattrList;
    }

    public void setDisattrList(List<Disattr> disattrList) {
        this.disattrList = disattrList;
    }

    public List<Dispatchhotel> getDispatchhotelList() {
        return dispatchhotelList;
    }

    public void setDispatchhotelList(List<Dispatchhotel> dispatchhotelList) {
        this.dispatchhotelList = dispatchhotelList;
    }

    public List<Disrestaurant> getDisrestaurantList() {
        return disrestaurantList;
    }

    public void setDisrestaurantList(List<Disrestaurant> disrestaurantList) {
        this.disrestaurantList = disrestaurantList;
    }

    public List<Disshopp> getDisshoppList() {
        return disshoppList;
    }

    public void setDisshoppList(List<Disshopp> disshoppList) {
        this.disshoppList = disshoppList;
    }

    public List<Disline> getDislineList() {
        return dislineList;
    }

    public void setDislineList(List<Disline> dislineList) {
        this.dislineList = dislineList;
    }

    public Dispatchtourgroup getDispatchtourgroup() {
        return dispatchtourgroup;
    }

    public void setDispatchtourgroup(Dispatchtourgroup dispatchtourgroup) {
        this.dispatchtourgroup = dispatchtourgroup;
    }
}
