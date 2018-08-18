package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.pojo.Template;
import com.dyhc.sdglgroundconnection.service.TemplateService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板 控制层
 **/
@RestController
@RequestMapping("/template")
public class TemplateController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(TemplateController.class);

    @Autowired
    private TemplateService templateService;

    /**
     * 添加模板信息 （wangtao）
     * @param template 模板信息参数对象
     * @return ReponseResult对象
     */
    @RequestMapping("/insertTemplateInfo")
    public ReponseResult insertTemplateInfo(Template template){
        try {
            template.setCreater(1);
            template.setCreationDate(new Date());
            template.setWhetherDel(0);
            ReponseResult<Integer> data=null;
            //一、查询所有的景点信息
            Integer result = templateService.insertTemplateInfo(template);
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增模板成功！");
                //三、录入日志并返回
                logger.info(" method:insertTemplateInfo  新增模板成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增模板失败！");
                //三、录入日志并返回
                logger.info(" method:insertTemplateInfo  新增模板失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:ListScenicspotByParentId  获取所有景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
