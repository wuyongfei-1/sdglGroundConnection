package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.pojo.Shopping;
import com.dyhc.sdglgroundconnection.service.ShoppingService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 根据id获取购物信息 （lixiaojie)
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
    /**
     * 分页查询购物信息   （lixiaojie)
     * @param pageNo    当前页
     * @param pageSize  每页大小
     * @param shoppingSite 购物地点
     * @return
     */
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
    /**
     * 获取所有景点信息 （lixiaojie)
     * @return
     */
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
     * 修改购物信息 （lixiaojie)
     * @param shopping
     * @return
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
     * 根据id删除购物信息 （lixiaojie)
     * @param shoppingId
     * @return
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
     * 新增购物信息 （lixiaojie)
     * @param shopping
     * @return
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
     *  根据购物点信息编号修改购物点信息 （wangtao）
     * @param shopping 购物点信息参数对象
     * @return 返回受影响行数
     */
    @RequestMapping("/updateShoppingById")
    public ReponseResult updateShoppingById(Shopping shopping){
        try {
            //根据编号查询Shoping对象获取创建时间创建人等信息给修改对象
            Shopping shopping1=shoppingService.getShoppingById(shopping.getShoppingId());
            shopping.setCreater(shopping1.getCreater());
            shopping.setCreationDate(shopping1.getCreationDate());
            shopping.setWhetherDel(shopping1.getWhetherDel());
            shopping.setModifier(1);
            shopping.setModifiedData(new Date());
            shopping.setScenicSpotId(shopping1.getScenicSpotId());
            //一、删除景点信息
            Integer result =shoppingService.updateShopping(shopping);
            ReponseResult<Integer> data=null;
            //二、判断是否成功
            if(result>0){
                //成功则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改购物成功！");
                logger.info(" method:updateShoppingById  修改购物成功！");
            }else{
                //失败则给ReponseResult对象赋值并日志记录
                data = ReponseResult.ok(result, "修改购物失败！");
                logger.info(" method:updateShoppingById  修改购物失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:updateShoppingById  修改购物失败，系统出现异常！");
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
