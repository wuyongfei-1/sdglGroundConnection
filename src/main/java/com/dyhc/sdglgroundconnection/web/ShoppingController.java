package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 购物 控制层
 **/
@RestController
@RequestMapping("/shopping")
public class ShoppingController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ShoppingController.class);

    @Autowired
    private ShoppingService shoppingService;



    /**
     * 添加购物信息 （wangtao）
     * @param shopping 参数对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertInfo")
    public ReponseResult insertInfo(Shopping shopping){
        try {
            //一、修改景点信息
            shopping.setCreater(1);
            shopping.setCreationDate(new Date());
            shopping.setWhetherDel(0);
            Integer result =shoppingService.insertInfo(shopping);
            ReponseResult<Integer> data=null;
            //二、判断是否成功
            if(result>0){
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增购物成功！");
                logger.info(" method:insertInfo  新增购物成功！");
            }else{
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "新增购物失败！");
                logger.info(" method:insertInfo  新增购物失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertInfo  新增购物失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据编号查询购物点信息 （wangtao）
     * @param shoppingId shoppingId
     * @return 返回购物点对象
     */
    @RequestMapping("/getShoppingById")
    public ReponseResult getShoppingById(@RequestParam("shoppingId")Integer shoppingId){
        try {
            //一、删除景点信息
            Shopping result =shoppingService.getShoppingById(shoppingId);
            ReponseResult<Shopping> data=null;
            //二、判断是否成功
            if(result!=null){
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "获取购物信息成功！");
                logger.info(" method:getShoppingById  获取购物信息成功！");
            }else{
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "获取购物信息失败！");
                logger.info(" method:getShoppingById  获取购物信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:getShoppingById  获取购物信息，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    @RequestMapping("/deleteInfoById")
    public ReponseResult deleteInfoById(@RequestParam("id")Integer id){
        try {
            //一、删除景点信息
            Integer result =shoppingService.deleteShoppingById(id);
            ReponseResult<Integer> data=null;
            //二、判断是否成功
            if(result>0){
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除购物成功！");
                logger.info(" method:deleteInfoById  删除购物成功！");
            }else{
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "删除购物失败！");
                logger.info(" method:deleteInfoById  删除购物失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteInfoById  删除购物失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
