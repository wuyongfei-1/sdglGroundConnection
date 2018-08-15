package com.dyhc.sdglgroundconnection.interceptor;


import com.dyhc.sdglgroundconnection.pojo.Staff;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 登陆拦截器
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        Staff sf=(Staff) request.getSession().getAttribute("user");
        if (sf==null){
            response.sendRedirect("/admin/login.html");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws  Exception {

    }
}
