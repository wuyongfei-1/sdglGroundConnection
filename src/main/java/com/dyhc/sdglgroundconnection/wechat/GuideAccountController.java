package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.dyhc.sdglgroundconnection.utils.DateTimeUtil;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游账户交互接口
 **/
@RequestMapping("/account")
@RestController
public class GuideAccountController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideAccountController.class);

    @Autowired
    private GuideService guideService;
    @Autowired
    private DispatchService dispatchService;


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
                        return ReponseResult.ok("{\"status\":" + (guide.getGuideId()) + "}", "登陆成功");
                    } else {
                        // 用户名正确，密码错误
                        return ReponseResult.ok("{\"status\":0}", "用户名和密码不匹配！");
                    }
                } else {
                    // 用户名不存在
                    return ReponseResult.ok("{\"status\":0}", "用户名和密码不匹配！");
                }
            }
            return ReponseResult.ok("{\"status\":0}", "用户名或密码不能为空！");
        } catch (Exception e) {
            logger.error(" method:login  导游登陆出现异常，登陆失败！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("系统出现异常，登陆失败！");
        }
    }
    /**
     * 根据导游id获取调度信息id  没有则返回null(lixiaojie)
     * @param guideId
     * @return
     */
    @RequestMapping("/selectDisGuideInfoByguideId")
    public ReponseResult selectDisGuideInfoByguideId(Integer guideId) {
        try {
            Integer result = dispatchService.selectDisGuideInfoByguideId(guideId);
            ReponseResult<Integer> date;
                date = ReponseResult.ok(result, "根据导游id获取调度id成功");
                logger.info(" method:selectDisGuideInfoByguideId  根据导游id获取调度id成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:selectDisGuideInfoByguideId  根据导游id获取调度id失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据导游编号查询导游的个人信息(yunguohao)
     */
    @RequestMapping("/selectGuideById")
    public ReponseResult selectHotelById(int id) {
        try {
            Guide result = guideService.selectGuideByIds(id);
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
