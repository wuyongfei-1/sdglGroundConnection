package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Discar;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.pojo.Staff;

public class WechatInformationParam {
    private Integer wechatInformationParamId;//微信基本信息参数表id
    private Guide guide;//导游对象
    private Discar discar;//团用车信息
    private Staff staff; //根据创建人  查询 调度信息
    private Dispatch dispatch;//查询 调度信息


    public Integer getWechatInformationParamId() {
        return wechatInformationParamId;
    }

    public void setWechatInformationParamId(Integer wechatInformationParamId) {
        this.wechatInformationParamId = wechatInformationParamId;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    public Discar getDiscar() {
        return discar;
    }

    public void setDiscar(Discar discar) {
        this.discar = discar;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }
}
