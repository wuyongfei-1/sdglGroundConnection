package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Disattr;
import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;

public class WechatTicketbudgetParam {
    private Disattr disattr;//调度景点表
    private Dispatch dispatch;//调度表
    private Scenicspot scenicspot;//景点

    public Disattr getDisattr() {
        return disattr;
    }

    public void setDisattr(Disattr disattr) {
        this.disattr = disattr;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Scenicspot getScenicspot() {
        return scenicspot;
    }

    public void setScenicspot(Scenicspot scenicspot) {
        this.scenicspot = scenicspot;
    }
}
