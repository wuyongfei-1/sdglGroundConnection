package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RestController
@RequestMapping("/staff")
public class StaffController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;
    /**
     * 登录验证（dubingkun）
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/loginCheck")
    public ReponseResult loginCheck(HttpServletRequest httpServletRequest, String username, String password){
        ReponseResult<Integer> success;
        Staff sf=null;
        try {
            sf=staffService.loginCheck(username);
            logger.info(" method:loginCheck  获取对应用户信息成功！");
            if(sf==null){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            if(!sf.getPassword().equals(EncryUtil.encrypt(password))){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            httpServletRequest.getSession().setAttribute("user",sf);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(" method:loginCheck  获取对应用户信息失败，系统出现异常！");
            success= ReponseResult.ok(-1,password);
        }
        success= ReponseResult.ok(sf.getRoleId(),"验证成功！");
        return success;
    }
}
