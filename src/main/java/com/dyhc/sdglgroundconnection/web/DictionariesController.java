package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典 控制层
 **/
@RestController
@RequestMapping("/dictionaries")
public class DictionariesController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(DictionariesController.class);

    @Autowired
    private DictionariesService dictionariesService;


    /**
     * 根据类型编码获取所有的字典信息（wuyongfei）
     *
     * @param typeCode 类型编码
     * @return 响应结果
     */
    @GetMapping(value = "/dictionaries/all")
    public ReponseResult showAllMealTypes(@RequestParam("typeCode") String typeCode) {
        try {
            List<Dictionaries> dictionaries = dictionariesService.listDictionaries(typeCode);
            logger.info(" method:showAllMealTypes  获取对应的所有字典成功！");
            return ReponseResult.ok(dictionaries, "获取对应的所有字典成功！");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(" method:showAllMealTypes  获取对应的所有字典失败！");
            return ReponseResult.err("获取对应的所有字典成功，系统出现异常！");
        }
    }


    /**
     * 获取所有和景点相关的字典信息  （wangtao）（获取分页后的数据）
     *
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/ListDictionariesByScenicspot")
    public ReponseResult ListDictionariesByScenicspot() {
        try {
            //一、查询所有的景点相关字典信息
            PageInfo<Dictionaries> pageInfo = dictionariesService.ListDictionariesByScenicepot("ATTRACTIONS");
            //二、返回ReponseResult对象
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取字典信息成功！");
            //三、录入日志并返回
            logger.info(" method:showHotel  分页获取字典成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showHotel  获取字典数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
