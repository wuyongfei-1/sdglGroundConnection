package com.dyhc.sdglgroundconnection;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 项目分离内置tomcat的启动类
 **/
public class SdglgroundconnectionStart extends SpringBootServletInitializer {
    /**
     * 指向外置的tomcat为启动类（wuyongfei）
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SdglgroundconnectionApplication.class);
    }

}
