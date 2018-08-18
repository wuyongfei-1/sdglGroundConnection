package com.dyhc.sdglgroundconnection.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;
import java.io.File;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 上传文件配置
 **/
@Configuration
public class UploadFileConfig {

    private Logger logger = LoggerFactory.getLogger(UploadFileConfig.class); // 日志对象

    @Value("${file.windowsUploadFolder}")
    private String windowsUploadFolder; // windows上传文件目录

    @Value("${file.linuxUploadFolder}")
    private String linuxUploadFolder; // linux上传文件目录

    @Bean
    MultipartConfigElement multipartConfigElement() {
        // 获取当前系统信息
        String osName = System.getProperty("os.name");
        String uploadFolder = "";  // 上传目录
        File file = null;
        if (osName != null && osName.startsWith("Windows")) {  // windows系统
            uploadFolder = windowsUploadFolder.replace("/", File.separator);
            file = new File(windowsUploadFolder.replace("/", File.separator));
        } else { // linux系统
            uploadFolder = linuxUploadFolder.replace("/", File.separator);
            file = new File(linuxUploadFolder.replace("/", File.separator));
        }
        // 创建相应的目录
        if (!file.exists()) {
            file.mkdirs();
            logger.info("程序启动成功，图片存放目录 "+file.getAbsolutePath()+" 创建成功！");
        }
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation(uploadFolder);
        //文件最大
        factory.setMaxFileSize("100MB");
        // 设置总上传数据总大小
        factory.setMaxRequestSize("100MB");
        return factory.createMultipartConfig();
    }
}
