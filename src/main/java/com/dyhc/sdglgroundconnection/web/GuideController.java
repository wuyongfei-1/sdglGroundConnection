package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.dyhc.sdglgroundconnection.utils.DateTimeUtil;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游 控制层
 **/
@RestController
@RequestMapping("/guide")
public class GuideController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideController.class);

    @Autowired
    private GuideService guideService;

    /**
     * 查询所有导游信息(lixiaojie)
     * @return
     */
    @RequestMapping(value = "/selectAllGuideInfo",method = RequestMethod.POST)
    public ReponseResult selectAllGuideInfo() {
        try {
            ReponseResult<List> data = ReponseResult.ok(guideService.selectAllGuideInfo(), "查询所有导游信息成功！");

            logger.info(" method:selectAllGuideInfo   查询所有导游信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectAllGuideInfo  查询所有导游信息失败！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 获取所有导游和导游日程（lixiaojie)
     * @return
     */
    @RequestMapping(value = "/selectGuideInfoAndGuideSchedule",method = RequestMethod.POST)
    public ReponseResult selectGuideInfoAndGuideSchedule() {
        try {
            ReponseResult<List> data = ReponseResult.ok(guideService.selectGuideInfoAndGuideSchedule(), "获取所有导游和导游日程成功！");

            logger.info(" method:selectGuideInfoAndGuideSchedule   获取所有导游和导游日程成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectGuideInfoAndGuideSchedule  获取所有导游和导游日程失败！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 导游分页查询(yunguohao)
     *
     * @param pageNo
     * @param pageSize
     * @param guide
     * @return
     */
    @RequestMapping("/showAllGuide")
    public ReponseResult showHotel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer
            pageSize, Guide guide) {
        try {
            pageSize = 6;
            PageInfo<Guide> pageInfo = guideService.listGuide(pageNo, pageSize, guide);
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
     * 增加(yunguohao)
     */
    @RequestMapping("/insertGuide")
    public ReponseResult insertCompany(Guide guide,HttpServletRequest request) {
        try {
            Staff sessionStaff=(Staff) request.getSession().getAttribute("user");
            guide.setCreater(sessionStaff!=null?sessionStaff.getStaffId():1);
            guide.setCreationDate(new Date());
            int result = guideService.insertGuide(guide);
            System.out.println(result);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "增加导游成功！");
                System.out.println(date);
                logger.info(" method:insertGuide  增加导游成功！");

            } else {
                date = ReponseResult.ok("0", "增加导游失败！");
                logger.info(" method:insertGuide  增加导游失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertGuide  增加导游数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改(yunguohao)
     */
    @RequestMapping("/updateGuide")
    public ReponseResult updateCompany(Guide guide,HttpServletRequest request) {
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            guide.setModifier(sessionstaff!=null?sessionstaff.getStaffId():1);
            guide.setModifiedData(new Date());
            int result = guideService.updateGuide(guide);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改导游成功！");
                logger.info("method:updateGuide  修改导游成功！");

            } else {
                date = ReponseResult.ok("0", "修改导游失败！");
                logger.info(" method:updateGuide  修改导游失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateGuide  修改导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 删除(yunguohao)
     */
    @RequestMapping("/deleteGuideByID")
    public ReponseResult deleteHotelByID(int guideid) {
        try {
            int result = guideService.deleteGuideByIDs(guideid);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "删除导游成功！");
                logger.info(" method:deleteGuideByID  删除导游成功！");

            } else {
                date = ReponseResult.ok("0", "删除导游失败！");
                logger.info(" method:deleteGuideByID  删除导游失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:deleteCompanyByID  删除导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
