package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.*;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度参数类（wuyongfei）
 **/
public class DisParam {

    private Dispatch dispatch; // 调度信息

    private Disattr disattr; // 调度景点

    private Discar discar; // 调度用车

    private Disguide disguide; // 调度导游

    private Disother disother; // 调度其他

    private Dispatchhotel dispatchhotel; // 调度酒店

    private Disrestaurant disrestaurant; // 调度餐厅

    private Disshopp disshopp; // 调度购物

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Disattr getDisattr() {
        return disattr;
    }

    public void setDisattr(Disattr disattr) {
        this.disattr = disattr;
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

    public Dispatchhotel getDispatchhotel() {
        return dispatchhotel;
    }

    public void setDispatchhotel(Dispatchhotel dispatchhotel) {
        this.dispatchhotel = dispatchhotel;
    }

    public Disrestaurant getDisrestaurant() {
        return disrestaurant;
    }

    public void setDisrestaurant(Disrestaurant disrestaurant) {
        this.disrestaurant = disrestaurant;
    }

    public Disshopp getDisshopp() {
        return disshopp;
    }

    public void setDisshopp(Disshopp disshopp) {
        this.disshopp = disshopp;
    }
}
