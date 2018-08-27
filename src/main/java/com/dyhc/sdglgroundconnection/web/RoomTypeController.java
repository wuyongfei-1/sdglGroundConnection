package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店类型 控制层
 **/
@RestController
@RequestMapping("/roomType")
public class RoomTypeController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(RoomTypeController.class);

    @Autowired
    private RoomTypeService roomTypeService;

    /**
     * 通过酒店编号查询所属的房间类型列表（wuyongfei）
     *
     * @param hotelId 酒店编号
     * @return 响应结果
     */
    @GetMapping("/roomType/details/{hotelId}.html")
    public ReponseResult showAllRoomTypeByHotelId(@PathVariable Integer hotelId) {
        try {
            List<RoomType> roomTypes = roomTypeService.listRoomTypesByHotelId(hotelId);
            logger.info("method: showAllRoomTypeByHotelId  查询所属的房间类型成功！");
            return ReponseResult.ok(roomTypes, "查询所属的房间类型成功！");
        } catch (Exception e) {
            logger.error("method: showAllRoomTypeByHotelId  查询所属的房间类型失败，出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("查询所属的房间类型失败，出现异常！");
        }
    }


    /**
     * 通过房间类型编号查询指定的房间类型（wuyongfei）
     *
     * @param roomTypeId 房间类型编号
     * @return 响应结果
     */
    @GetMapping("/roomType/detail/{roomTypeId}.html")
    public ReponseResult showRoomTypeByRoomTypeId(@PathVariable Integer roomTypeId) {
        try {
            RoomType roomType = roomTypeService.getTypeId(roomTypeId);
            logger.info("method: showRoomTypeByRoomTypeId  查询指定的房间类型成功！");
            return ReponseResult.ok(roomType, "查询指定的房间类型成功！");
        } catch (Exception e) {
            logger.error("method: showRoomTypeByRoomTypeId  查询指定的房间类型失败，出现异常！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("查询指定的房间类型失败，出现异常！");
        }
    }
}
