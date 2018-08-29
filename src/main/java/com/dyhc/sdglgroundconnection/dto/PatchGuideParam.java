package com.dyhc.sdglgroundconnection.dto;

import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游参数类（wuyongfei）
 **/
@Component
public class PatchGuideParam {
    private Integer guideId; // 导游编号

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }
}
