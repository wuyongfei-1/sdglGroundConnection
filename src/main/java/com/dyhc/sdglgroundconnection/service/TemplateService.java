package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.TemplateParam;
import com.dyhc.sdglgroundconnection.pojo.Template;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板业务接口
 **/
public interface TemplateService {

    /**
     * 新增模板信息 （wangtao）
     * @param template 模板对象
     * @return 返回受影响行数
     */
    Integer insertTemplateInfo(Template template) throws Exception;

    /**
     * 查询所有模板信息 （wangtao）
     * @return 返回模板集合
     * @throws Exception
     */
    List<Template> listAllTemplate() throws Exception;

    /**
     * 根据条件查询模板信息并分页 （wangtao）
     * @param templateParam 参数对象
     * @return 返回模板集合
     */
    PageInfo<Template> listTemplateByConditions(TemplateParam templateParam) throws Exception;
    /**
     * 根据模板id查询模板信息 （dubingkun）
     * @param templateId 模板id
     * @return 返回模板集合
     */
    Template listTemplateByTemplateId(Integer templateId) throws Exception;

    /**
     * 根据模板编号查询模板信息 （wangtao）
     * @param templateId 模板编号
     * @return 返回模板对象
     */
    Template getTemplateByTemplateId(Integer templateId) throws Exception;

    /**
     * 修改模板信息并修改相应模板下的模板酒店和模板景点信息 （wangtao）
     * @param template 参数模板对象
     * @return 返回受影响行数
     */
    Integer updateTemplateInfo(Template template) throws Exception;

    /**
     * 根据模板编号删除模板并删除模板相关的模板酒店、景点信息
     * @param templateId 模板编号
     * @return 受影响行数
     * @throws Exception
     */
    Integer deleteTemplateInfo(Integer templateId) throws Exception;

}
