package com.dyhc.sdglgroundconnection.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfigurer implements WebMvcConfigurer {
    final String[] notLoginInterceptPaths ={"/static/**","/admins/login.html","/staff/loginCheck","/admin/**","/css/**","/font/**","/images/**","/js/**","/lay/**"};//禁止拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //拦截管理除登录页面以外的所有页面
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("").excludePathPatterns(notLoginInterceptPaths);
    }


}
