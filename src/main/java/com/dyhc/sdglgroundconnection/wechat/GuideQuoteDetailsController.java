package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Reportaccommodation;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.dyhc.sdglgroundconnection.service.ReportaccommodationService;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报价明细交互接口
 **/
@RequestMapping("/quoteDetails")
@RestController
public class GuideQuoteDetailsController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(GuideQuoteDetailsController.class);

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RoomTypeService roomTypeService;

    @Autowired
    private ReportaccommodationService reportaccommodationService;

    /**
     * 根据酒店编号查询酒店类型信息
     * @param hotelId 酒店编号
     * @return 返回酒店类型信息
     */
    @RequestMapping("/listRoomTypeByHotelId")
    public ReponseResult listRoomTypeByHotelId(@RequestParam("hotelId") Integer hotelId){
        try {
            List<RoomType> roomTypeList = roomTypeService.listRoomTypesByHotelId(hotelId);
            ReponseResult<List> data = ReponseResult.ok( roomTypeList,"获取全部酒店类型成功！");
            logger.info(" method:listRoomTypeByHotelId  获取全部酒店类型成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listRoomTypeByHotelId  获取全部酒店类型数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 获取全部酒店信息 （wangtao）
     * @return 返回ReponseResult集合
     */
    @RequestMapping("/listAllHotel")
    public ReponseResult listAllHotel(){
        try {
            List<Hotel> hotelList = hotelService.listByaHotel();
            ReponseResult<List> data = ReponseResult.ok( hotelList,"获取全部酒店成功！");
            logger.info(" method:listAllHotel  获取全部酒店成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listAllHotel  获取全部酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 新增报账酒店信息
     * @param reportaccommodation 报账酒店对象
     * @param request HttpServletRequest对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportaccommodationInfo")
    public ReponseResult insertReportaccommodationInfo(@RequestBody Reportaccommodation reportaccommodation, HttpServletRequest request){
        try {
            Staff staff = (Staff) request.getSession().getAttribute("user");
            reportaccommodation.setCreateBy(staff == null ? 1 : staff.getStaffId());
            Integer result = reportaccommodationService.insertReportaccommodation(reportaccommodation);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账酒店信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportaccommodationInfo  新增调报账酒店信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账酒店信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportaccommodationInfo  新增报账酒店信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportaccommodationInfo  新增报账酒店数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
