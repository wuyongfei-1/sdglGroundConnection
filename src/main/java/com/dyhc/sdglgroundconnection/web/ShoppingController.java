package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 根据用户id查询用户信息
     * @param shoppingId
     * @return
     */
    @RequestMapping(value = "/getShoppingInfoByShoppingId",method = RequestMethod.POST)
    public ReponseResult getShoppingInfoByShoppingId(Integer shoppingId ) {

        ReponseResult<Shopping> data;
        try {

            Shopping shopping=shoppingService.getShoppingInfoByShoppingId(shoppingId);


            data = ReponseResult.ok(shopping, "根据用户id获取购物信息成功！");

            logger.info(" method:getStaffInfoByStaffId  根据用户id获取购物信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getStaffInfoByStaffId  根据用户id获取购物信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    @RequestMapping(value = "/listPageShoppingByShoppingSite",method = RequestMethod.POST)
    public ReponseResult listPageShoppingByShoppingSite(Integer pageNo, Integer pageSize, String shoppingSite) {
        try {
            pageSize = 6;
            PageInfo<Shopping> pageInfo = shoppingService.listPageShoppingByShoppingSite( pageNo,  pageSize, shoppingSite);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取购物信息成功！");

            logger.info(" method:listPageShoppingByShoppingSite  分页获取购物信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listPageShoppingByShoppingSite  分页获取购物信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    @RequestMapping(value = "/listScenicspotAll",method = RequestMethod.POST)
    public ReponseResult listScenicspotAll() {
        try {
            ReponseResult<List> data = ReponseResult.ok(shoppingService.listScenicspotAll(), "获取所有景点信息成功！");

            logger.info(" method:listScenicspotAll  获取所有景点信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listScenicspotAll  获取所有景点信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改
     */
    @RequestMapping(value = "/updateShoppingInfo",method = RequestMethod.POST )
    public ReponseResult updateShoppingInfo(Shopping shopping){
        try {
            int result=shoppingService.updateShoppingInfo(shopping);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改购物信息成功！");
                logger.info(" method:updateShoppingInfo  修改购物信息成功！");

            }else{
                date= ReponseResult.ok("0","修改购物信息失败！");
                logger.info(" method:updateShoppingInfo  修改购物信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateShoppingInfo  修改购物信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping(value = "/deleteShoppingByShoppingId",method = RequestMethod.POST )
    public ReponseResult deleteShoppingByShoppingId(Integer shoppingId){
        try {
            int result=shoppingService.deleteShoppingByShoppingId(shoppingId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除购物信息成功！");
                logger.info(" method:deleteShoppingByShoppingId  删除购物信息成功！");

            }else{
                date= ReponseResult.ok("0","删除购物信息失败！");
                logger.info(" method:deleteShoppingByShoppingId  删除购物信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteShoppingByShoppingId  删除购物信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 增加
     */
    @RequestMapping(value = "/saveShoppingInfo",method = RequestMethod.POST )
    public ReponseResult saveShoppingInfo(Shopping shopping){
        try {
            int result=shoppingService.saveShoppingInfo(shopping);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","新增购物信息成功！");
                logger.info(" method:saveShoppingInfo  新增购物信息成功！");

            }else{
                date= ReponseResult.ok("0","新增购物信息失败！");
                logger.info(" method:saveShoppingInfo  新增购物信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:saveShoppingInfo  新增购物信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
