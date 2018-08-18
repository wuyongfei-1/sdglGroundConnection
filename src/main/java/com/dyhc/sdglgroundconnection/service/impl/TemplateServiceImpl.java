package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.TemplateMapper;
import com.dyhc.sdglgroundconnection.pojo.Template;
import com.dyhc.sdglgroundconnection.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板业务实现
 **/
@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper templateMapper;


    /**
     * 新增模板信息 （wangtao）
     * @param template 模板对象
     * @return 返回模板集合
     */
    @Override
    @RecordOperation(type = "模板信息",desc = "添加一条模板信息")
    public Integer insertTemplateInfo(Template template) {
        return templateMapper.insert(template);
    }

    /**
     * 根据条件查询模板信息并分页 （wangtao）
     * @param template 参数对象
     * @return 返回模板集合
     */
    @Override
    public List<Template> listTemplateByConditions(Template template) {
        return null;
    }


}
