package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.TemplateScenicspotMapper;
import com.dyhc.sdglgroundconnection.pojo.TemplateScenicspot;
import com.dyhc.sdglgroundconnection.pojo.TemplatehotelExample;
import com.dyhc.sdglgroundconnection.pojo.TemplatescenicspotExample;
import com.dyhc.sdglgroundconnection.service.TemplateScenicspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板景点业务实现
 **/
@Service
public class TemplateScenicspotServiceImpl implements TemplateScenicspotService {

    @Autowired
    private TemplateScenicspotMapper templateScenicspotMapper;

    /**
     * 新增模板景点信息 （wangtao）
     * @param templateScenicspot 模板景点信息参数
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板景点",desc = "新增一条模板景点信息！")
    public Integer insertTemplateScenicspit(TemplateScenicspot templateScenicspot) throws Exception {
        return templateScenicspotMapper.insert(templateScenicspot);
    }

    /**
     * 根据模板编号查询模板景点信息集合 （wangtao）
     * @param templateId 模板编号
     * @return 返回模板景点信息集合
     */
    @Override
    public List<TemplateScenicspot> listTemplateScenicspotByTemplateId(Integer templateId) throws Exception {
        //创建模板景点集合、条件对象
        List<TemplateScenicspot> templateScenicspotList=null;
        TemplatescenicspotExample templatescenicspotExample=new TemplatescenicspotExample();
        TemplatescenicspotExample.Criteria criteria=templatescenicspotExample.createCriteria();
        //把参数模板编号放入条件对象
        criteria.andTemplateidEqualTo(templateId);
        //使用条件对象进行条件查询并使用模板景点集合接收
        templateScenicspotList=templateScenicspotMapper.selectByExample(templatescenicspotExample);
        return templateScenicspotList;
    }

    /**
     *  根据模板景点编号修改模板景点信息 （wangtao）
     * @param templateScenicspot 模板景点对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板景点",desc = "修改一条模板景点信息")
    public Integer updateTempaletScenicspotInfo(TemplateScenicspot templateScenicspot) throws Exception {
        return templateScenicspotMapper.updateByPrimaryKey(templateScenicspot);
    }

    /**
     * 根据模板景点编号查询模板景点信息
     * @param templateScenicspotId 模板景点信息编号
     * @return 返回模板景点对象
     */
    @Override
    public TemplateScenicspot getTemplateScenicspotInfoById(Integer templateScenicspotId) throws Exception {
        return templateScenicspotMapper.selectByPrimaryKey(templateScenicspotId);
    }

    /**
     * 根据模板编号删除模板景点信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板景点",desc = "删除一条模板景点信息！")
    public Integer deleteTemplateScenicspotByTemplateId(Integer templateId) throws Exception {
        TemplatescenicspotExample templatescenicspotExample=new TemplatescenicspotExample();
        // 拼接条件
        TemplatescenicspotExample.Criteria criteria = templatescenicspotExample.createCriteria();
        criteria.andTemplateidEqualTo(templateId);
        // 删除该模板下的模板景点信息
        Integer result=templateScenicspotMapper.deleteByExample(templatescenicspotExample);
        return result;
    }

    /**
     * 根据模板酒店编号删除模板景点信息
     * @param templateScenicspotId 模板景点编号
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板景点",desc = "删除一条模板景点信息！")
    public Integer deleteTemplateScenicspotByTemplateScenicspotId(Integer templateScenicspotId) throws Exception {
        return templateScenicspotMapper.deleteByPrimaryKey(templateScenicspotId);
    }


}
