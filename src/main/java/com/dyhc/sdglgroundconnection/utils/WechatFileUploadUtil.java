package com.dyhc.sdglgroundconnection.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Vector;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 微信文件上传工具包（wuyongfei）
 **/
@Component
public class WechatFileUploadUtil {

    // 日志实例
    private static Logger logger = LoggerFactory.getLogger(WechatFileUploadUtil.class);

    /**
     * 微信小程序上传图片（wuyongfei）
     * Vector 线程安全
     *
     * @param request        请求对象
     * @param suffixNameList 可上传的图片类型（后缀 .jpg/.png等）可传入多个
     *                       <如果不传入任何值，则默认可允许上传任何文件>
     * @return 文件名称 <返回数据不为空字符串（“”）说明上传成功，否则上传失败>
     * synchronized  微信多文件上传，同时发送多个线程，为了解决抢占资源对公共资源的获取出现出入，所以使用线程锁
     */
    public synchronized static String uploadImage(HttpServletRequest request, String... suffixNameList) {
        StandardMultipartHttpServletRequest req = (StandardMultipartHttpServletRequest) request;
        //获取上传的图片
        Iterator<String> iterator = req.getFileNames();
        MultipartFile file = req.getFile(iterator.next());
        // 执行上传操作
        String uploadResult = ClientFileUploadUtil.uploadImage(file, suffixNameList);
        if (ConditionValidation.validation(uploadResult)) {
            // 上传成功
            logger.info("method:uploadImage " + DateTimeUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss") + " 上传图片成功");
            return uploadResult;
        } else {
            // 出现异常
            logger.info("method:uploadImage " + DateTimeUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss") + " 上传图片失败");
            return "";
        }
    }
}
