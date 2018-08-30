package com.dyhc.sdglgroundconnection.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 微信行程参数类
 */
public class GuideRouteParam {
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date clusterTime; // 接团时间

    public Date getClusterTime() {
        return clusterTime;
    }

    public void setClusterTime(Date clusterTime) {
        this.clusterTime = clusterTime;
    }

    private String clusterAddress; // 接团地点
    private String flightId; // 团队抵达航班/车次号
    private int num; // 团队人数
    private String discarvalue1; // 团队用车车牌号
    private String discarvalue2; // 驾驶员姓名
    private String discarvalue3; // 驾驶员联系电话
    private String dispatchvalue1; // 团队联系人
    private String dispatchvalue2; // 联系电话


    public String getClusterAddress() {
        return clusterAddress;
    }

    public void setClusterAddress(String clusterAddress) {
        this.clusterAddress = clusterAddress;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDiscarvalue1() {
        return discarvalue1;
    }

    public void setDiscarvalue1(String discarvalue1) {
        this.discarvalue1 = discarvalue1;
    }

    public String getDiscarvalue2() {
        return discarvalue2;
    }

    public void setDiscarvalue2(String discarvalue2) {
        this.discarvalue2 = discarvalue2;
    }

    public String getDiscarvalue3() {
        return discarvalue3;
    }

    public void setDiscarvalue3(String discarvalue3) {
        this.discarvalue3 = discarvalue3;
    }

    public String getDispatchvalue1() {
        return dispatchvalue1;
    }

    public void setDispatchvalue1(String dispatchvalue1) {
        this.dispatchvalue1 = dispatchvalue1;
    }

    public String getDispatchvalue2() {
        return dispatchvalue2;
    }

    public void setDispatchvalue2(String dispatchvalue2) {
        this.dispatchvalue2 = dispatchvalue2;
    }
}
