package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.pojo.Disrestaurant;

public class WechatEatAndHotelParam {

    private Dispatchhotel dispatchhotel;  //调度酒店对象
    private Disrestaurant noonDisrestaurant;  //中午调度调度餐厅对象
    private Disrestaurant nightDisrestaurant;  //晚上调度调度餐厅对象
    private Dispatch dispatch;//调度对象

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Dispatchhotel getDispatchhotel() {
        return dispatchhotel;
    }

    public void setDispatchhotel(Dispatchhotel dispatchhotel) {
        this.dispatchhotel = dispatchhotel;
    }

    public Disrestaurant getNoonDisrestaurant() {
        return noonDisrestaurant;
    }

    public void setNoonDisrestaurant(Disrestaurant noonDisrestaurant) {
        this.noonDisrestaurant = noonDisrestaurant;
    }

    public Disrestaurant getNightDisrestaurant() {
        return nightDisrestaurant;
    }

    public void setNightDisrestaurant(Disrestaurant nightDisrestaurant) {
        this.nightDisrestaurant = nightDisrestaurant;
    }
}
