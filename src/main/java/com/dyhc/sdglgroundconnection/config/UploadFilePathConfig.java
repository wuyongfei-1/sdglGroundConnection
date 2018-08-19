package com.dyhc.sdglgroundconnection.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 上传文件路径配置类（wuyongfei）
 **/
@Configuration
@SuppressWarnings("all")
public class UploadFilePathConfig extends WebMvcConfigurerAdapter {

    @Value("${file.staticAccessPath}")
    private String staticAccessPath;  // 对外暴露静态资源的访问路径

    @Value("${file.windowsUploadFolder}")
    private String windowsUploadFolder; // windows上传文件目录

    @Value("${file.linuxUploadFolder}")
    private String linuxUploadFolder; // linux上传文件目录

    // 配置图片的访问策略
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + windowsUploadFolder, "file:" + linuxUploadFolder);
    }
}
