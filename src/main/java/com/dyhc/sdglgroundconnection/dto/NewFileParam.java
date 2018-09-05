package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.*;

public class NewFileParam {
    private Reportdetail reportdetail;//报账详情
    private Travel travel;  //组团社

    private Company company; //地接社

    private Dispatch dispatch;//调度信息

    public Reportdetail getReportdetail() {
        return reportdetail;
    }

    public void setReportdetail(Reportdetail reportdetail) {
        this.reportdetail = reportdetail;
    }

    private AccountType acCountType;//公司开户信息

    private Staff staff;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public AccountType getAcCountType() {
        return acCountType;
    }

    public void setAcCountType(AccountType acCountType) {
        this.acCountType = acCountType;
    }
}
