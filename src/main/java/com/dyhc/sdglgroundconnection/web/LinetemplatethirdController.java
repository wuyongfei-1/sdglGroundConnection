package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Linetemplatethird;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.LinetemplatethirdService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板与线路关系 控制层
 **/
@RestController
@RequestMapping("/linetemplatethird")
public class LinetemplatethirdController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ScenicspotController.class);

    @Autowired
    private LinetemplatethirdService linetemplatethirdService;

    /**
     * 新增第三方表信息 （wangtao）
     * @param linetemplatethird 第三方表参数对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertLinetemplatethirdInfo")
    public ReponseResult insertLinetemplatethirdInfo(Linetemplatethird linetemplatethird, @RequestParam("templateId")Integer templateId, HttpServletRequest request){
        try {
            linetemplatethird.setTemplateid(templateId);
            Staff staff = (Staff) request.getSession().getAttribute("user");
            linetemplatethird.setCreateby(staff == null ? 1 : staff.getStaffId());
            Integer result =linetemplatethirdService.insertLinetemplatethirdInfo(linetemplatethird);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增模板到线路模板成功！");
                logger.info(" method:insertLinetemplatethirdInfo  新增模板到线路模板成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增线路模板失败！");
                logger.info(" method:insertLinetemplatethirdInfo  新增模板到线路模板失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:insertLinetemplatethirdInfo  新增模板到线路模板失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 删除第三方表信息根据第三方表编号 （wangtao）
     * @param thirdId 第三方表编号
     * @return
     */
    @RequestMapping("/deleteLinetemplatethirdInfo")
    public ReponseResult deleteLinetemplatethirdInfo(@RequestParam("thirdId")Integer thirdId){
        try {
            Integer result =linetemplatethirdService.deleteLinetemplatethirdInfo(thirdId);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除线路模板下模板成功！");
                logger.info(" method:deleteLinetemplatethirdInfo  删除线路模板下模板成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除线路模板下模板失败！");
                logger.info(" method:deleteLinetemplatethirdInfo  删除线路模板下模板失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteLinetemplatethirdInfo  删除线路模板下模板失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
