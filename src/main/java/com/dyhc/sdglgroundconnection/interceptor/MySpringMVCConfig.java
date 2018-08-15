package com.dyhc.sdglgroundconnection.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    final String[] notLoginInterceptPaths ={"/admin/login.html","/loginCheck"};
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //拦截管理除登录页面以外的所有页面
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(notLoginInterceptPaths);
    }
}
