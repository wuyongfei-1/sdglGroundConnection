package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import com.dyhc.sdglgroundconnection.utils.FileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店 控制层
 **/
@RestController
@RequestMapping("/hotel")
public class HotelController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelService hotelService;
    @Autowired
    private RoomTypeService roomTypeService;


    /**
     * 根据条件分页查询酒店信息（dubingkun）
     * @param pageNo 当前页码
     * @param pageSize 当前显示数
     * @param hotelName 酒店名称
     * @param hotelAddress 酒店地址
     * @param offer 最低报价
     * @param offer2 最高报价
     * @param status 禁用状态
     * @return
     */
    @RequestMapping("/showAllHotels")
    public ReponseResult showHotel(Integer pageNo,Integer pageSize,String hotelName,String hotelAddress,Integer offer,Integer offer2,Integer status) {
        try {
            pageSize = 6;
            PageInfo<Hotel> pageInfo = hotelService.listHotels(pageNo,pageSize,hotelName,hotelAddress,offer,offer2,status);
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
     * 新增酒店房间类型信息（dubingkun）
     * @param roomType
     * @return
     */
    @RequestMapping("/insertHotelRoom")
    public ReponseResult inserHotelRoom(HttpServletRequest request,RoomType roomType){
        roomType.setTypeId(0);
        Staff sf=(Staff) request.getSession().getAttribute("user");
        if(sf!=null){
            roomType.setCreateBy(sf.getStaffId());
        }
        roomType.setWhetherDel(0);
        int result= 0;
        try {
            result = roomTypeService.insertRoomType(roomType);
            ReponseResult<String> date;
            if(result>0){
                date= ReponseResult.ok("增加酒店房间类型成功！");
                logger.info(" method:insertHotel  增加酒店房间类型成功！");
            }else{
                date= ReponseResult.ok("增加酒店房间类型失败！");
                logger.info(" method:insertHotel  增加酒店房间类型失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertHotel  增加酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改酒店房间类型信息（dubingkun）
     * @param roomType
     * @return
     */
    @RequestMapping("/updateHotelRoom")
    public ReponseResult updateHotelRoom(HttpServletRequest request,RoomType roomType){
        Staff sf=(Staff) request.getSession().getAttribute("user");
        if(sf!=null){
            roomType.setCreateBy(sf.getStaffId());
        }
        roomType.setWhetherDel(0);
        int result= 0;
        try {
            result = roomTypeService.updateRoomType(roomType);
            ReponseResult<String> date;
            if(result>0){
                date= ReponseResult.ok("修改酒店房间类型成功！");
                logger.info(" method:insertHotel  修改酒店房间类型成功！");
            }else{
                date= ReponseResult.ok("修改酒店房间类型失败！");
                logger.info(" method:insertHotel  修改酒店房间类型失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertHotel  修改酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 删除酒店房间信息（dubingkun）
     * @param id
     * @return
     */
    @RequestMapping("/deleteHotelRoom")
    public ReponseResult deleteRoomType(Integer id){
        int result= 0;
        try {
            RoomType roomType=roomTypeService.getTypeId(id);
            roomType.setWhetherDel(1);
            result = roomTypeService.updateRoomType(roomType);
            ReponseResult<String> date;
            if(result>0){
                date= ReponseResult.ok("删除酒店房间类型成功！");
                logger.info(" method:insertHotel  删除酒店房间类型成功！");
            }else{
                date= ReponseResult.ok("删除酒店房间类型失败！");
                logger.info(" method:insertHotel  删除酒店房间类型失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertHotel  删除酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 添加酒店信息
     * @param request
     * @param file 图片对象
     * @param savePath 保存路径
     * @return
     */
    @RequestMapping("/insertHotel")
    public ReponseResult insertHotel(HttpServletRequest request,@RequestParam("fileObj") MultipartFile file, @RequestParam("savePath") String savePath){
        String uploadResult = FileUploadUtil.uploadImage(file, savePath, ".jpg");
        String parameter = request.getParameter("form");
        int result= 0;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ReponseResult<String> date=null;
            Hotel hotel = objectMapper.readValue(parameter, Hotel.class);
            hotel.setStatus(1);
            hotel.setWhetherDel(0);
            hotel.setPicturePath(uploadResult);
            Staff sf=(Staff) request.getSession().getAttribute("user");
            if(sf!=null){
                hotel.setCreateBy(sf.getStaffId());
            }
            if (!"".equals(uploadResult)){
                result=hotelService.insertHotel(hotel);
                if(result>0){
                    date= ReponseResult.ok("添加酒店成功！");
                    logger.info(" method:insertHotel  添加酒店成功！");
                }
            }else{
                date= ReponseResult.ok("添加酒店失败！");
                logger.info(" method:insertHotel  添加酒店失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:insertHotel  添加酒店失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改酒店信息（dubingkun）
     * @param request
     * @param file
     * @param savePath
     * @return
     */
    @RequestMapping("/updateHotel")
    public ReponseResult updateHotel(HttpServletRequest request,@RequestParam("fileObj") MultipartFile file, @RequestParam("savePath") String savePath){
        String parameter = request.getParameter("form");//获取作用域中存储的json字符串
        String uploadResult=null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ReponseResult<String> date=null;
            Hotel hotel = objectMapper.readValue(parameter, Hotel.class);
            Staff staff=(Staff) request.getSession().getAttribute("user");
            if(staff!=null){
                hotel.setUpdateBy(staff.getStaffId());
            }
            hotel.setStatus(1);
            hotel.setWhetherDel(0);
            //判断是否重新上传图片
            if(!file.isEmpty() && "a.txt".equals(file.getOriginalFilename())){
                Hotel hotel1=hotelService.selectHotelById(hotel.getHotelId());
                hotel.setPicturePath(hotel1.getPicturePath());
            }else{
                uploadResult= FileUploadUtil.uploadImage(file, savePath, ".jpg");
                hotel.setPicturePath(uploadResult);
            }
            int result=hotelService.updateHotel(hotel);
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
     * 删除酒店信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteHotel")
    public ReponseResult deleteHotelByID(Integer id){
        try {
            int result =hotelService.deleteHotelByID(id);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("删除酒店成功！");
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
