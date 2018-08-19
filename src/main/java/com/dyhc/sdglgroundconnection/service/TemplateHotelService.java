package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
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
    Integer insertTemplateHotelInfo(TemplateHotel templateHotel) throws Exception;

    /**
     * 根据模板编号查询模板酒店信息 （wangtao）
     * @param TemaplateId 模板编号
     * @return 返回模板酒店对象
     */
    TemplateHotel getTemplateHotelInfoByTemplateId(Integer TemaplateId) throws Exception;

    /**
     * 修改模板信息 （wangtao）
     * @param templateHotel 模板对象
     * @return 返回受影响行数
     */
    Integer updateTemplateHotel(TemplateHotel templateHotel) throws Exception;

    /**
     * 根据模板酒店编号查询模板酒店信息
     * @param TemplateHotelId 模板酒店编号
     * @return 返回模板酒店对象
     */
    TemplateHotel getTemplateHotelInfoByTemplateHotelId(Integer TemplateHotelId) throws Exception;

    /**
     * 根据模板编号删除模板酒店表信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     */
    Integer deleteTemplateHotelByTemplateId(Integer templateId) throws Exception;

    /**
     * 根据模板酒店编号删除模板酒店信息
     * @param templateHotelId 模板酒店编号
     * @return 返回受影响行数
     */
    Integer deleteTemplateHotelByTemplateHotelId(Integer templateHotelId) throws Exception;
}
