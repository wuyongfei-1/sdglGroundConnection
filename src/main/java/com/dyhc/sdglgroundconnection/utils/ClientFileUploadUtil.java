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
 * 文件上传工具类（wuyongfei）
 **/
@Component
public class ClientFileUploadUtil {

    // 日志实例
    private static Logger logger = LoggerFactory.getLogger(ClientFileUploadUtil.class);

    // windows真实绝对路径
    private static String windowsUploadFolder;

    // linux真实绝对路径
    private static String linuxUploadFolder;

    @Value("${file.linuxUploadFolder}")
    public void setLinuxUploadFolder(String linuxUploadFolder) {
        this.linuxUploadFolder = linuxUploadFolder;
    }

    @Value("${file.windowsUploadFolder}")
    public void setWindowsUploadFolder(String windowsUploadFolder) {
        this.windowsUploadFolder = windowsUploadFolder;
    }

    /**
     * 上传图片至服务器（wuyongfei）
     *
     * @param multipartFile  文件实例
     * @param suffixNameList 可上传的图片类型（后缀 .jpg/.png等）可传入多个
     *                       <如果不传入任何值，则默认可允许上传任何文件>
     * @return 文件名称 <返回数据不为空字符串（“”）说明上传成功，否则上传失败>
     */
    public static String uploadImage(MultipartFile multipartFile, String... suffixNameList) {
        // 获取当前系统信息
        String osName = System.getProperty("os.name");
        String folderName = "";  // 当前系统目录
        if (osName != null && osName.startsWith("Windows")) {  // windows系统
            folderName = windowsUploadFolder;
        } else {    // linux系统
            folderName = linuxUploadFolder;
        }
        File osFile = new File(folderName); // 系统目录
        if (!osFile.exists()) {
            osFile.mkdirs();
        }
        // 替换当前目录的分隔符
        folderName = folderName.replace("/", File.separator);
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
            File file = new File(folderName + File.separator + newFileName);
            try {
                multipartFile.transferTo(file); // copy file
                logger.info(" method:uploadImage  " + DateTimeUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss") + " 文件上传成功!");
                return newFileName;
            } catch (IOException e) {
                e.printStackTrace(); // appear error
                logger.error(" method:uploadImage  " + DateTimeUtil.getCurrentDate("yyyy-MM-dd HH:mm:ss") + " 文件上传出现错误!");
                return "";
            }
        } else {
            logger.error(" method:uploadImage 文件不存在!");
            return "";
        }
    }
}
