package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Template;
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
    Integer insertTemplateInfo(Template template);


    /**
     * 根据条件查询模板信息并分页 （wangtao）
     * @param template 参数对象
     * @return 返回模板集合
     */
    List<Template> listTemplateByConditions(Template template);

}
