package com.dyhc.sdglgroundconnection.interceptor;

import com.dyhc.sdglgroundconnection.utils.MySessionListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfigurer implements WebMvcConfigurer {
    final String[] notLoginInterceptPaths =
            {"/static/**", "/account/**", "/account/**", "/log/**", "/moneyBudget/**"
                    , "/quoteDetails/**", "/record/**", "/route/**", "/bill/**", "/admins/login.html"
                    , "/staff/loginCheck", "/admin/**", "/css/**", "/font/**", "/images/**","/api/image/**"
                    , "/js/**", "/lay/**"};//禁止拦截

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //拦截管理除登录页面以外的所有页面
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(notLoginInterceptPaths);
    }


    /**
     * 注入session监听器（wuyongfei）
     *
     * @return session注册实例
     */
    @Bean
    public ServletListenerRegistrationBean listenerRegist() {
        ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
        srb.setListener(new MySessionListener());
        System.out.println("listener");
        return srb;
    }


}
