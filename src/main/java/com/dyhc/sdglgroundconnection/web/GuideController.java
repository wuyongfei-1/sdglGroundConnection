package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游 控制层
 **/
@RestController
@RequestMapping("/guide")
public class GuideController{

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideController.class);

    @Autowired
    private GuideService guideService;
    /**
     * 导游分页查询
     * @param pageNo
     * @param pageSize
     * @param guide
     * @return
     */
    @RequestMapping("/showAllGuide")
    public ReponseResult showHotel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize, Guide guide) {
        try {
            pageSize = 6;
            PageInfo<Guide> pageInfo = guideService.listGuide(pageNo,pageSize,guide);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取导游成功！");
            logger.info(" method:showAllCompany  分页获取导游成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showAllCompany  获取导游数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 增加
     */
    @RequestMapping("/insertGuide")
    public ReponseResult insertCompany(Guide guide){
        try {
            int result=guideService.insertGuide(guide);
            System.out.println(result);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","增加导游成功！");
                System.out.println(date);
                logger.info(" method:insertCompany  增加导游成功！");

            }else{
                date= ReponseResult.ok("0","增加导游失败！");
                logger.info(" method:insertCompany  增加导游失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertCompany  增加导游数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改
     */
    @RequestMapping("/updateCompany")
    public ReponseResult updateCompany(Guide guide){
        try {
            int result=guideService.updateGuide(guide);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改导游成功！");
                logger.info("method:updateCompany  修改导游成功！");

            }else{
                date= ReponseResult.ok("0","修改导游失败！");
                logger.info(" method:updateCompany  修改导游失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateCompany  修改导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping("/deleteCompanyByID")
    public ReponseResult deleteHotelByID(int guideid){
        try {
            int result=guideService.deleteGuideByIDs(guideid);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除导游成功！");
                logger.info(" method:deleteCompanyByID  删除导游成功！");

            }else{
                date= ReponseResult.ok("0","删除导游失败！");
                logger.info(" method:deleteCompanyByID  删除导游失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteCompanyByID  删除导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * id查询
     */
    @RequestMapping("/selectCompanyById")
    public ReponseResult selectHotelById(int id){
        try {
            Guide result=guideService.selectGuideByIds(id);
            System.out.println(result.getGuideName());
            ReponseResult<Guide> date;
            if (result!=null){
                date= ReponseResult.ok(result,"id查询成功");
                logger.info(" method:selectCompanyById  id查询成功！");

            }else{
                date= ReponseResult.ok("id查询导游失败！");
                logger.info(" method:selectCompanyById  id查询导游失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectCompanyById  id查询导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
