package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.TemplateScenicspotMapper;
import com.dyhc.sdglgroundconnection.pojo.TemplateScenicspot;
import com.dyhc.sdglgroundconnection.service.TemplateScenicspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Integer insertTemplateScenicspit(TemplateScenicspot templateScenicspot) {
        return templateScenicspotMapper.insert(templateScenicspot);
    }
}
