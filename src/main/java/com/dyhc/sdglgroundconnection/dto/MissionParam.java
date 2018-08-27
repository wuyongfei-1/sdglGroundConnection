package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Disattr;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.pojo.Disrestaurant;

import java.util.List;

/**
 * 派团单参数类 wangtao
 */
public class MissionParam {

    //午餐集合
    private List<Disrestaurant> zdisrestaurantList;
    //晚餐集合
    private List<Disrestaurant> wdisrestaurantList;
    //住宿集合
    private List<Dispatchhotel> dispatchhotelList;
    //景点集合
    private List<Disattr> disattrList;
    //调度表对象
    private Dispatch dispatch;

    public List<Disrestaurant> getZdisrestaurantList() {
        return zdisrestaurantList;
    }

    public void setZdisrestaurantList(List<Disrestaurant> zdisrestaurantList) {
        this.zdisrestaurantList = zdisrestaurantList;
    }

    public List<Disrestaurant> getWdisrestaurantList() {
        return wdisrestaurantList;
    }

    public void setWdisrestaurantList(List<Disrestaurant> wdisrestaurantList) {
        this.wdisrestaurantList = wdisrestaurantList;
    }

    public List<Dispatchhotel> getDispatchhotelList() {
        return dispatchhotelList;
    }

    public void setDispatchhotelList(List<Dispatchhotel> dispatchhotelList) {
        this.dispatchhotelList = dispatchhotelList;
    }

    public List<Disattr> getDisattrList() {
        return disattrList;
    }

    public void setDisattrList(List<Disattr> disattrList) {
        this.disattrList = disattrList;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }
}
