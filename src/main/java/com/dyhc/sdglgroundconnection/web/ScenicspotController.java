package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.service.ScenicspotService;
import com.dyhc.sdglgroundconnection.utils.FileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 景点 控制层
 **/
@RestController
@RequestMapping("/scenicspot")
public class ScenicspotController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ScenicspotController.class);

    @Autowired
    private ScenicspotService scenicspotService;

    /**
     * 查询景点信息 （wangtao）
     *
     * @param pageNo     当前页
     * @param pageSize   每页显示数量
     * @param scenicspot 参数对象
     * @return ReponseResult对象
     */
    @RequestMapping("/ListScenicspot")
    public ReponseResult ListScenicspot(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize, Scenicspot scenicspot) {
        try {
            //一、查询所有的景点信息
            PageInfo<Scenicspot> pageInfo = scenicspotService.listScenicspot(pageNo, pageSize, scenicspot);
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取景点成功！");
            //三、录入日志并返回
            logger.info(" method:ListScenicspot  分页获取景点成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:ListScenicspot  获取景点数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 新增景点信息  （wangtao）
     *
     * @param scenicspot 参数对象
     * @return ReponseResult对象
     */
    @RequestMapping("/insertScenicspot")
    public ReponseResult insertScenicspot(Scenicspot scenicspot, @RequestParam("multipartFile") MultipartFile multipartFile,
                                          @RequestParam("savePath") String savePath) {
        try {
            // 上传图片操作
            String uploadResult = FileUploadUtil.uploadImage(multipartFile, ".jpg");
            if (!"".equals(uploadResult)) {
                scenicspot.setPicturePath(uploadResult);
                logger.info(" method:insertScenicspot  上传图片成功！");
            } else {
                logger.info(" method:insertScenicspot  上传图片失败！");
            }
            //设置默认参数
            scenicspot.setCreateBy(1);
            scenicspot.setCreateDate(new Date());
            scenicspot.setWhetherDel(0);
            scenicspot.setDescribe("景点");
            scenicspot.setTypeCode("ATTRACTIONS");
            //一、新增景点信息
            Integer result = scenicspotService.insertScenicspot(scenicspot);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增景点成功！");
                logger.info(" method:insertScenicspot  新增景点成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增景点失败！");
                logger.info(" method:insertScenicspot  新增景点失败！");
            }
            //返回ReponseResult对象
            return data;
        } catch (Exception e) {
            logger.error(" method:insertScenicspot  新增景点数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 查询所有是父景点的信息  （wangtao）
     *
     * @return 返回父景点集合
     */
    @RequestMapping("/ListScenicspotByParentId")
    public ReponseResult ListScenicspotByParentId() {
        try {
            //一、查询所有的景点信息
            PageInfo<Scenicspot> pageInfo = scenicspotService.ListScenicspotByParentId();
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "获取所有父景点成功！");
            //三、录入日志并返回
            logger.info(" method:ListScenicspotByParentId  获取所有父景点成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:ListScenicspotByParentId  获取所有父景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据id获取信息 （wangtao）
     *
     * @param scenicSpotId id
     * @return 景点对象
     */
    @RequestMapping("/getInfoById")
    public ReponseResult getInfoById(@RequestParam("scenicSpotId") Integer scenicSpotId) {
        try {
            //一、根据编号查询景点信息
            Scenicspot scenicspot = scenicspotService.getScenicspotById(scenicSpotId);
            //二、返回ReponseResult对象
            ReponseResult<Scenicspot> data = ReponseResult.ok(scenicspot, "获取景点成功！");
            //三、录入日志并返回
            logger.info(" method:getInfoById  获取景点成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getInfoById  获取景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据id修改信息 （wangtao）
     *
     * @param scenicspot 景点对象
     * @return 返回受影响行数
     */
    @RequestMapping("/updateInfoById")
    public ReponseResult updateInfoById(Scenicspot scenicspot, @RequestParam("multipartFile") MultipartFile multipartFile,
                                        @RequestParam("savePath") String savePath) {
        try {
            //判断是否有上传图片 判断multipartFile和savePath是否为null
            if (!multipartFile.isEmpty() && "a.txt".equals(multipartFile.getOriginalFilename())) {
                //如果为空则根据编号查询信息把用户之前的图片地址赋值给要修改的对象
                Scenicspot scenicspot1 = scenicspotService.getScenicspotById(scenicspot.getScenicSpotId());
                scenicspot.setPicturePath(scenicspot1.getPicturePath());
            } else {
                //如果不为空则执行上传图片和修改方法
                // 上传图片操作
                String uploadResult = FileUploadUtil.uploadImage(multipartFile, ".jpg");
                if (!"".equals(uploadResult)) {
                    scenicspot.setPicturePath(uploadResult);
                    logger.info(" method:insertScenicspot  上传图片成功！");
                } else {
                    logger.info(" method:insertScenicspot  上传图片失败！");
                }
            }
            scenicspot.setUpdateBy(1);
            scenicspot.setUpdateDate(new Date());
            //一、修改景点信息
            Integer result = scenicspotService.updateScenicspot(scenicspot);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改景点成功！");
                logger.info(" method:updateInfoById  修改景点成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改景点失败！");
                logger.info(" method:updateInfoById  修改景点失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:updateInfoById  修改景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据id删除信息
     *
     * @param id id
     * @return 返回受影响行数
     */
    @RequestMapping("/deleteInfoById")
    public ReponseResult deleteInfoById(@RequestParam("id") Integer id) {
        try {
            //一、删除景点信息
            Integer result = scenicspotService.deleteScenicspotById(id);
            ReponseResult<Integer> data = null;
            //二、判断是否成功
            if (result > 0) {
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除景点成功！");
                logger.info(" method:updateInfoById  删除景点成功！");
            } else {
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除景点失败！");
                logger.info(" method:updateInfoById  删除景点失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteInfoById  删除景点失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


}
