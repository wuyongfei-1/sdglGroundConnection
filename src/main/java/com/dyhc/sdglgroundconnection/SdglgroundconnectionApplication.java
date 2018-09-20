package com.dyhc.sdglgroundconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
/*@MapperScan(basePackages = {"com.dyhc.sdglgroundconnection.mapper"}) // 用于扫描的mapper接口*/
public class SdglgroundconnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdglgroundconnectionApplication.class, args);
    }

}
