package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.TemplateScenicspot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
    Integer insertTemplateScenicspit(TemplateScenicspot templateScenicspot);
}
