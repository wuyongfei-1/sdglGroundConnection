package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.TemplateScenicspot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板景点业务接口
 **/
public interface TemplateScenicspotService {

    /**
     * 新增模板景点信息 （wangtao）
     * @param templateScenicspot 模板景点信息参数
     * @return 返回受影响行数
     */
    Integer insertTemplateScenicspit(TemplateScenicspot templateScenicspot) throws Exception;

    /**
     * 根据模板编号查询模板景点信息集合 （wangtao）
     * @param templateId 模板编号
     * @return 返回模板景点信息集合
     */
    List<TemplateScenicspot> listTemplateScenicspotByTemplateId(Integer templateId) throws Exception;

    /**
     *  根据模板景点编号修改模板景点信息 （wangtao）
     * @param templateScenicspot 模板景点对象
     * @return 返回受影响行数
     */
    Integer updateTempaletScenicspotInfo(TemplateScenicspot templateScenicspot) throws Exception;

    /**
     * 根据模板景点编号查询模板景点信息
     * @param templateScenicspotId 模板景点信息编号
     * @return 返回模板景点对象
     */
    TemplateScenicspot getTemplateScenicspotInfoById(Integer templateScenicspotId) throws Exception;

    /**
     * 根据模板编号删除模板景点信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     */
    Integer deleteTemplateScenicspotByTemplateId(Integer templateId) throws Exception;

    /**
     * 根据模板酒店编号删除模板景点信息
     * @param templateScenicspotId 模板景点编号
     * @return 返回受影响行数
     */
    Integer deleteTemplateScenicspotByTemplateScenicspotId(Integer templateScenicspotId) throws Exception;
}
