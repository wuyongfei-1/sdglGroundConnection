package com.dyhc.sdglgroundconnection.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dyhc.sdglgroundconnection.dto.TemplateParam;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.Template;
import com.dyhc.sdglgroundconnection.service.TemplateHotelService;
import com.dyhc.sdglgroundconnection.service.TemplateScenicspotService;
import com.dyhc.sdglgroundconnection.service.TemplateService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private TemplateHotelService templateHotelService;

    @Autowired
    private TemplateScenicspotService templateScenicspotService;

    /**
     * 查询所有模板信息 （wangtao）
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/listAllInfo")
    public ReponseResult listAllInfo(){
        try {
            //一、查询所有的景点信息
            List<Template> templateList = templateService.listAllTemplate();
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(templateList, "获取模板成功！");
            //三、录入日志并返回
            logger.info(" method:listAllInfo  获取模板成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listAllInfo  获取模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 添加模板信息 （wangtao）
     * @param template 模板信息参数对象
     * @return ReponseResult对象
     */
    @RequestMapping("/insertTemplateInfo")
    public ReponseResult insertTemplateInfo(@RequestBody JSONObject template, HttpServletRequest request){
        try {
            String jsonStr = JSON.toJSONString(template);
            ObjectMapper objectMapper = new ObjectMapper();
            Template template2 = objectMapper.readValue(jsonStr, Template.class);
            Staff staff = (Staff) request.getSession().getAttribute("user");
            template2.setCreater(staff == null ? 1 : staff.getStaffId());
            //创建返回的ReponseResult对象
            ReponseResult<Integer> data=null;
            //一、新增模板信息
            Integer result = templateService.insertTemplateInfo(template2);
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
            logger.error(" method:insertTemplateInfo  获取所有景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     *  分页进行条件查询模板信息 （wangtao）
     * @param templateParam 模板信息参数类
     * @return 返回模板集合
     */
    @RequestMapping("/listTemplateByConditions")
    public ReponseResult listTemplateByConditions(TemplateParam templateParam){
        try {
            //一、查询所有的景点信息
            PageInfo<Template> pageInfo = templateService.listTemplateByConditions(templateParam);
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取模板成功！");
            //三、录入日志并返回
            logger.info(" method:listTemplateByConditions  分页获取模板成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listTemplateByConditions  获取模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据模板编号查询模板信息 （wangtao）
     * @param templateId 模板编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/getTemplateByTemplateId")
    public ReponseResult getTemplateByTemplateId(@RequestParam("templateId")Integer templateId){
        try {
            //一、查询所有的景点信息
            Template template = templateService.getTemplateByTemplateId(templateId);
            //二、返回ReponseResult对象
            ReponseResult<Template> data = ReponseResult.ok(template, "根据模板编号获取模板成功！");
            //三、录入日志并返回
            logger.info(" method:getTemplateByTemplateId  根据模板编号获取模板成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getTemplateByTemplateId  根据模板编号获取模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     *  根据模板编号修改模板信息 （wangtao）
     * @param template 模板编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/updateTemplateByTemplateId")
    public ReponseResult updateTemplateByTemplateId(@RequestBody JSONObject template,HttpServletRequest request){
        try {
            ReponseResult<Integer> data=null;
            String jsonStr = JSON.toJSONString(template);
            ObjectMapper objectMapper = new ObjectMapper();
            Template template2 = objectMapper.readValue(jsonStr, Template.class);
            Staff staff = (Staff) request.getSession().getAttribute("user");
            template2.setModifier(staff == null ? 1 : staff.getStaffId());
            //一、修改模板信息
            Integer result = templateService.updateTemplateInfo(template2);
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "修改模板成功！");
                //三、录入日志并返回
                logger.info(" method:updateTemplateByTemplateId  修改模板成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "修改模板失败！");
                //三、录入日志并返回
                logger.info(" method:updateTemplateByTemplateId  修改模板失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:updateTemplateByTemplateId  修改所有景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 根据模板编号删除模板 （wangtao）
     * @param templateId 模板编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/deleteTemplateByTemplateId")
    public ReponseResult deleteTemplateByTemplateId(@RequestParam("templateId") Integer templateId){
        try {
            ReponseResult<Integer> data=null;
            //一、修改模板信息
            Integer result = templateService.deleteTemplateInfo(templateId);
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板成功！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateByTemplateId  删除模板成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "删除模板失败！");
                //三、录入日志并返回
                logger.info(" method:deleteTemplateByTemplateId  删除模板失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteTemplateByTemplateId  删除所有景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
