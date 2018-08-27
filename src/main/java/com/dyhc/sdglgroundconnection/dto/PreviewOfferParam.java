package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Offer;
import com.dyhc.sdglgroundconnection.pojo.Travel;

import java.util.List;

public class PreviewOfferParam {
    private Offer offer;//报价
    private List<OfferTravelParam> list;//行程
    private String str11;//收件人公司
    private String str12;//收件人负责人
    private String str13;//收件人职位
    private String str21;//发件人
    private String str22;//发件人联系电话

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public List<OfferTravelParam> getList() {
        return list;
    }

    public void setList(List<OfferTravelParam> list) {
        this.list = list;
    }

    public String getStr13() {
        return str13;
    }

    public void setStr13(String str13) {
        this.str13 = str13;
    }

    public String getStr11() {

        return str11;
    }

    public void setStr11(String str11) {
        this.str11 = str11;
    }

    public String getStr12() {
        return str12;
    }

    public void setStr12(String str12) {
        this.str12 = str12;
    }

    public String getStr21() {
        return str21;
    }

    public void setStr21(String str21) {
        this.str21 = str21;
    }

    public String getStr22() {
        return str22;
    }

    public void setStr22(String str22) {
        this.str22 = str22;
    }
}
