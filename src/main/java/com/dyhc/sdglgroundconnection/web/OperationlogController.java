package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.dyhc.sdglgroundconnection.service.OperationlogService;
import com.dyhc.sdglgroundconnection.utils.ClientFileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志 控制层
 **/
@RestController
@RequestMapping("/operationlog")
public class OperationlogController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(OperationlogController.class);

    @Autowired
    private OperationlogService operationlogService;

    /**
     * 根据条件获取所有的操作日志信息（wuyongfei）
     *
     * @param pageNo        当前页码
     * @param pageSize      每页总记录数
     * @param operationType 操作类型
     * @param beginTime     开始时间
     * @param endTime       截止时间
     * @return 分页后的数据
     */
    @PostMapping(value = "/operationlogs/all")
    public ReponseResult getAllOperationLogsByConditions(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize,
                                                         String operationType, @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime, @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime) {
        Map<String, Object> conditions = new HashMap<>();
        conditions.put("pageNo", pageNo);
        conditions.put("pageSize", pageSize);
        conditions.put("operationType", operationType);
        conditions.put("beginTime", beginTime);
        conditions.put("endTime", endTime);
        try {
            PageInfo<Operationlog> pageInfo = operationlogService.listOperationLogsByConditions(conditions);
            logger.info(" method:getAllOperationLogsByConditions 获取操作日志成功！");
            ReponseResult<List<Operationlog>> result = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "获取日志成功");
            return result;
        } catch (Exception e) {
            logger.error(" method:getAllOperationLogsByConditions 获取操作日志失败，出现异常！类型：" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("系统出现异常！");
        }
    }

    /**
     * 测试图片上传（wuyongfei）
     *
     * @param multipartFile 文件对象
     * @return 保存结果
     */
    @PostMapping(value = "/images/upload")
    public ReponseResult testUploadImage(@RequestParam("multipartFile") MultipartFile multipartFile) {
        // 上传图片操作
        String uploadResult = ClientFileUploadUtil.uploadImage(multipartFile, ".jpg");
        if (!"".equals(uploadResult)) {
            logger.info(" method:testUploadImage 上传图片成功！");
            return ReponseResult.ok("上传图片成功！");
        } else {
            logger.error(" method:testUploadImage 上传图片失败，请稍后再试！");
            return ReponseResult.err("上传图片失败，请稍后再试！");
        }
    }
}
