package com.dyhc.sdglgroundconnection.dto;


import com.dyhc.sdglgroundconnection.pojo.*;

import java.util.List;

/**
 * 报价信息参数类（dubingkun）
 */
public class OfferParam {
    private Offer offer;//报价信息
    private List<Offercar> listOffercar;//用车报价信息
    private List<OfferHotel> listOfferHotel;//酒店报价信息
    private List<Offerscenic> listOfferscenic;//景点报价信息
    private List<Offerrestaurant> listOfferrestaurant;//餐厅报价信息
    private List<Offerother> listOfferother;//其它报价信息
    private List<Offerline>listOfferline;//线路报价信息


    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public List<Offercar> getListOffercar() {
        return listOffercar;
    }

    public void setListOffercar(List<Offercar> listOffercar) {
        this.listOffercar = listOffercar;
    }

    public List<OfferHotel> getListOfferHotel() {
        return listOfferHotel;
    }

    public void setListOfferHotel(List<OfferHotel> listOfferHotel) {
        this.listOfferHotel = listOfferHotel;
    }

    public List<Offerscenic> getListOfferscenic() {
        return listOfferscenic;
    }

    public void setListOfferscenic(List<Offerscenic> listOfferscenic) {
        this.listOfferscenic = listOfferscenic;
    }

    public List<Offerrestaurant> getListOfferrestaurant() {
        return listOfferrestaurant;
    }

    public void setListOfferrestaurant(List<Offerrestaurant> listOfferrestaurant) {
        this.listOfferrestaurant = listOfferrestaurant;
    }

    public List<Offerother> getListOfferother() {
        return listOfferother;
    }

    public void setListOfferother(List<Offerother> listOfferother) {
        this.listOfferother = listOfferother;
    }

    public List<Offerline> getListOfferline() {
        return listOfferline;
    }

    public void setListOfferline(List<Offerline> listOfferline) {
        this.listOfferline = listOfferline;
    }
}
