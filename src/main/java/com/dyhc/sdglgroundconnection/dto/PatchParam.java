package com.dyhc.sdglgroundconnection.dto;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度参数主类（wuyongfei）
 **/
@Component
public class PatchParam {

    private PatchInfoParam patchInfo; // 调度基础信息参数

    private PatchCarParam patchCar;    // 调度用车参数

    private PatchGuideParam patchGuide; // 调度导游参数

    private List<PatchLineParam> patchLine; // 调度线路信息参数

    private List<PatchHotelParam> patchHotel; // 调度酒店参数

    private List<PatchScenicspotParam> patchScenicspot; // 调度景点参数

    private List<PatchMealTypeParam> patchMealType; // 调度饮食类型参数

    private List<PatchShoppingParam> patchShopping; // 调度购物地点参数

    public PatchInfoParam getPatchInfo() {
        return patchInfo;
    }

    public void setPatchInfo(PatchInfoParam patchInfo) {
        this.patchInfo = patchInfo;
    }

    public List<PatchHotelParam> getPatchHotel() {
        return patchHotel;
    }

    public void setPatchHotel(List<PatchHotelParam> patchHotel) {
        this.patchHotel = patchHotel;
    }

    public List<PatchLineParam> getPatchLine() {
        return patchLine;
    }

    public void setPatchLine(List<PatchLineParam> patchLine) {
        this.patchLine = patchLine;
    }

    public List<PatchMealTypeParam> getPatchMealType() {
        return patchMealType;
    }

    public void setPatchMealType(List<PatchMealTypeParam> patchMealType) {
        this.patchMealType = patchMealType;
    }

    public List<PatchScenicspotParam> getPatchScenicspot() {
        return patchScenicspot;
    }

    public void setPatchScenicspot(List<PatchScenicspotParam> patchScenicspot) {
        this.patchScenicspot = patchScenicspot;
    }

    public List<PatchShoppingParam> getPatchShopping() {
        return patchShopping;
    }

    public void setPatchShopping(List<PatchShoppingParam> patchShopping) {
        this.patchShopping = patchShopping;
    }

    public PatchCarParam getPatchCar() {
        return patchCar;
    }

    public void setPatchCar(PatchCarParam patchCar) {
        this.patchCar = patchCar;
    }

    public PatchGuideParam getPatchGuide() {
        return patchGuide;
    }

    public void setPatchGuide(PatchGuideParam patchGuide) {
        this.patchGuide = patchGuide;
    }
}
