package com.dyhc.sdglgroundconnection.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 文件上传工具类
 **/
@Component
public class FileUploadUtil {

    // 日志实例
    private static Logger logger = LoggerFactory.getLogger(FileUploadUtil.class);

    // 真实绝对路径
    private static String uploadFolder;

    @Value("${file.uploadFolder}")
    public void setUploadFolder(String uploadFolder) {
        this.uploadFolder = uploadFolder;
    }

    /**
     * 上传图片至服务器（wuyongfei）
     * 返回""则上传失败，否则成功
     *
     * @param multipartFile  文件实例
     * @param suffixNameList 可允许上传的文件前缀
     * @return 文件名称
     */
    public static String uploadImage(MultipartFile multipartFile,String... suffixNameList) {
        if (multipartFile != null && !multipartFile.isEmpty()) { // 判断文件是否存在
            // 获取后缀名
            String originalFilename = multipartFile.getOriginalFilename();
            String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
            boolean breakCondition = false;
            // 判断图片后缀名
            if (suffixNameList.length > 0) {
                for (String suffix : suffixNameList) {
                    if (suffixName.equals(suffix)) {
                        breakCondition = true;
                    }
                }
            } else {
                breakCondition = true;
            }
            if (!breakCondition) {
                logger.error(" method:uploadImage 上传的文件类型不符合，请重新上传！");
                return "";
            }
            // 生成唯一文件名
            // 当前时间戳
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String currentTimeLong = sdf.format(new Date());
            // 随机数
            Random random = new Random();
            int randomNumber = random.nextInt(1000) + 1;
            int floorNum = (int) Math.floor(randomNumber);
            // 新文件名
            String newFileName = currentTimeLong + floorNum + suffixName;
            // 生成文件对象
            if (uploadFolder == null || "".equals(uploadFolder)) {
                uploadFolder = "D://uploadFiles/";  // 异常防止
            }
            File file = new File(uploadFolder);
            // 判断文件是否存在
            if (!file.exists()) {
                file.mkdirs(); // 递归创建
            }
            file = new File(uploadFolder + "/" + newFileName);
            try {
                multipartFile.transferTo(file); // copy file
                logger.info(" method:uploadImage 文件上传成功!");
                return newFileName;
            } catch (IOException e) {
                logger.error(" method:uploadImage 文件上传出现错误!");
                e.printStackTrace(); // appear error
                return "";
            }
        } else {
            logger.error(" method:uploadImage 文件不存在!");
            return "";
        }
    }
}
