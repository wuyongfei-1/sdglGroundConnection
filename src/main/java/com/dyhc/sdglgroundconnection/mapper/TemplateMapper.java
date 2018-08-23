package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Template;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板
 **/
@Mapper
@Component
public interface TemplateMapper  extends CommonMapper<Template>{

    /**
     * 查询当前最大编号 （wangtao）
     * @return
     */
    Integer selectMaxId() throws Exception;
}
