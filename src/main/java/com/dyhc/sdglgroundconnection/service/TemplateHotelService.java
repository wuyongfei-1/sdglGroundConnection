package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.TemplateHotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板酒店业务接口
 **/
public interface TemplateHotelService {

    /**
     * 新增模板酒店表信息 （wangtao）
     * @return 返回受影响行数
     */
    Integer insertTemplateHotelInfo(TemplateHotel templateHotel);
}
