package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.dto.LineTemplateParam;
import com.dyhc.sdglgroundconnection.pojo.Linetemplate;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.LinetemplateService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板 控制层
 **/
@RestController
@RequestMapping("/linetemplate")
public class LinetemplateController {

    @Autowired
    private LinetemplateService linetemplateService;

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ScenicspotController.class);

    /**
     * 分页条件查总线路模板信息 （wangtao）
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/listLinetemplateInfoByLinename")
    public ReponseResult listLinetemplateInfoByLinename(@RequestParam("page")Integer page,@RequestParam("limit")Integer limit,@RequestParam("lineName")String lineName){
        try {
            LineTemplateParam lineTemplateParam=new LineTemplateParam();
            //一、分页条件查总线路模板信息
            if(lineName==null){
                lineTemplateParam.setLinename("");
            }else{
                lineTemplateParam.setLinename(lineName);
            }
            lineTemplateParam.setPage(page);
            lineTemplateParam.setLimit(limit);
            PageInfo<Linetemplate> pageInfo = linetemplateService.listLinetemplateInfoByLinename(lineTemplateParam);
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取线路模板成功！");
            //三、录入日志并返回
            logger.info(" method:listLinetemplateInfoByLinename  分页获取线路模板成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listLinetemplateInfoByLinename  分页获取线路模板失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 新增线路模板信息 （wangtao）
     * @param linename 线路模板名称
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertLineTemplateInfo")
    public ReponseResult insertLineTemplateInfo(@RequestParam("linename")String linename, HttpServletRequest request){
        try {
            Linetemplate linetemplate=new Linetemplate();
            linetemplate.setLinename(linename);
            Staff staff = (Staff) request.getSession().getAttribute("user");
            linetemplate.setCreateby(staff == null ? 1 : staff.getStaffId());
            Integer result =linetemplateService.insertLinetemplateInfo(linetemplate);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增线路模板成功！");
                logger.info(" method:insertLineTemplateInfo  新增线路模板成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增线路模板失败！");
                logger.info(" method:insertLineTemplateInfo  新增线路模板失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:insertLineTemplateInfo  新增线路模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据线路模板编号查询线路模板信息 （wangtao）
     * @param lineTemplateId 线路模板编号
     * @return 返回受影响行数
     */
    @RequestMapping("/getLineTemplateByLineTemplateId")
    public ReponseResult getLineTemplateByLineTemplateId(@RequestParam("lineTemplateId") Integer lineTemplateId){
        try {
            //一、根据线路模板编号查询线路模板信息
            Linetemplate linetemplate = linetemplateService.getLinetemplateBylineId(lineTemplateId);
            //二、返回ReponseResult对象
            ReponseResult<Linetemplate> data = ReponseResult.ok(linetemplate, "获取线路模板信息成功！");
            //三、录入日志并返回
            logger.info(" method:getLineTemplateByLineTemplateId  获取线路模板信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getLineTemplateByLineTemplateId  获取线路模板信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改线路模板信息 （wangtao）
     * @param linetemplate 线路模板信息编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/updateLineTemplate")
    public ReponseResult updateLineTemplate(Linetemplate linetemplate,HttpServletRequest request){
        try {
            Staff staff = (Staff) request.getSession().getAttribute("user");
            linetemplate.setUpdateby(staff == null ? 1 : staff.getStaffId());
            Integer result =linetemplateService.updateLinetemplateInfo(linetemplate);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改线路模板成功！");
                logger.info(" method:updateLineTemplate  修改线路模板成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改线路模板失败！");
                logger.info(" method:updateLineTemplate  修改线路模板失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:updateLineTemplate  修改线路模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据线路模板编号删除线路模板信息 （wangtao）
     * @param lineTemplateId 线路模板编号
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/deleteLineTemplateInfo")
    public ReponseResult deleteLineTemplateInfo(@RequestParam("lineTemplateId")Integer lineTemplateId){
        try {
            Integer result =linetemplateService.deleteLinetemplateInfoBylineId(lineTemplateId);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除线路模板成功！");
                logger.info(" method:deleteLineTemplateInfo  删除线路模板成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除线路模板失败！");
                logger.info(" method:deleteLineTemplateInfo  删除线路模板失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteLineTemplateInfo  删除线路模板数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
