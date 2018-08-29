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
     * 导游登陆接口（wuyongfei）
     *
     * @param userName 用户名
     * @param password 密码
     * @param request  请求对象
     * @return 响应结果 <前端只需判断该接口返回的json对象中的status为1则校验成功，否则登陆失败>
     */
    @GetMapping("/login.do")
    public ReponseResult login(@RequestParam(value = "userName", required = true) String userName,
                               @RequestParam(value = "password", required = true) String password,
                               HttpServletRequest request) {
        try {
            // 验证用户名和密码
            if (ConditionValidation.validation(userName) && ConditionValidation.validation(password)) {
                // 请求数据
                Guide guide = guideService.login(userName);
                if (guide != null) {
                    // 校验密码
                    if (guide.getPassword().equals(EncryUtil.encrypt(password))) {
                        // 保存信息到session中
                        request.getSession().setAttribute("guide", guide);
                        logger.info(userName + " " + DateTimeUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss") + " 登陆成功！");
                        // 登陆成功
                        return ReponseResult.ok(guide, "登陆成功");
                    } else {
                        // 用户名正确，密码错误
                        return ReponseResult.ok("{\"status\";0}", "用户名和密码不匹配！");
                    }
                } else {
                    // 用户名不存在
                    return ReponseResult.ok("{\"status\";0}", "用户名和密码不匹配！");
                }
            }
            return ReponseResult.ok("{\"status\";0}", "用户名或密码不能为空！");
        } catch (Exception e) {
            logger.error(" method:login  导游登陆出现异常，登陆失败！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("系统出现异常，登陆失败！");
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

    /**
     * id查询(yunguohao)
     */
    @RequestMapping("/selectGuideById")
    public ReponseResult selectHotelById(int id) {
        try {
            Guide result = guideService.selectGuideByIds(id);
            System.out.println(result.getGuideName());
            ReponseResult<Guide> date;
            if (result != null) {
                date = ReponseResult.ok(result, "id查询成功");
                logger.info(" method:selectGuideById  id查询成功！");

            } else {
                date = ReponseResult.ok("id查询导游失败！");
                logger.info(" method:selectGuideById  id查询导游失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:selectGuideById  id查询导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
