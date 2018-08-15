package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店 控制层
 **/
@RestController
public class HotelController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelService hotelService;

    @RequestMapping("/showAllHotels")
    public ReponseResult showHotel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize) {
        try {
            pageSize = 2;
            PageInfo<Hotel> pageInfo = hotelService.listHotels(pageNo,pageSize);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取酒店成功！");
            logger.info(" method:showHotel  分页获取酒店成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showHotel  获取酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 查询全部
     */
    @RequestMapping("/ListByHotel")
    public ReponseResult listByHotel(){
        List<Hotel> list=hotelService.listByaHotel();
        ReponseResult<List> date= ReponseResult.ok(list,"查询全部酒店成功！");
        logger.info(" method:ListByHotel  查询全部酒店成功！");
        return date;
    }
    /**
     * 增加
     */
    @RequestMapping("/insertHotel")
    public ReponseResult insertHotel(Hotel hotel){
        try {
            int result=hotelService.insertHotel(hotel);
            ReponseResult<List> date;
            if (result>0){
                date= ReponseResult.ok("增加酒店成功！");
                logger.info(" method:insertHotel  增加酒店成功！");

            }else{
                date= ReponseResult.ok("增加酒店失败！");
                logger.info(" method:insertHotel  增加酒店失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertHotel  增加酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改
     */
    @RequestMapping("/updateHotel")
    public ReponseResult updateHotel(Hotel hotel){
        try {
            int result=hotelService.updateHotel(hotel);
            ReponseResult<List> date;
            if (result>0){
                date= ReponseResult.ok("修改酒店成功！");
                logger.info(" method:updateHotel  修改酒店成功！");

            }else{
                date= ReponseResult.ok("修改酒店失败！");
                logger.info(" method:updateHotel  修改酒店失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateHotel  修改酒店失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping("/deleteHotelByID")
    public ReponseResult deleteHotelByID(int id){
        try {
            int result=hotelService.deleteHotelByID(id);
            ReponseResult<Integer> date;
            if (result>0){
                date= ReponseResult.ok(result,"删除酒店成功！");
                logger.info(" method:deleteHotelByID  删除酒店成功！");

            }else{
                date= ReponseResult.ok("删除酒店失败！");
                logger.info(" method:deleteHotelByID  删除酒店失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteHotelByID  删除酒店失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * id查询
     */
    @RequestMapping("/selectHotelById")
    public ReponseResult selectHotelById(int id){
        try {
            Hotel result=hotelService.selectHotelById(id);
            ReponseResult<Hotel> date;
            if (result!=null){
                date= ReponseResult.ok(result,"id查询成功");
                logger.info(" method:selectHotelById  id查询成功！");

            }else{
                date= ReponseResult.ok("查询酒店失败！");
                logger.info(" method:selectHotelById  查询酒店失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectHotelById  查询酒店失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
