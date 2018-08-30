package com.dyhc.sdglgroundconnection.wechat;

import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private ReportrestaurantService reportrestaurantService;

    @Autowired
    private ReportticketService reportticketService;

    @Autowired
    private ReportfareService reportfareService;

    @Autowired
    private ReportqutsubsidyService reportqutsubsidyService;

    @Autowired
    private ReportingotherexpensesService reportingotherexpensesService;

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
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportaccommodationInfo")
    public ReponseResult insertReportaccommodationInfo(@RequestBody Reportaccommodation reportaccommodation){
        try {
            Integer result = reportaccommodationService.insertReportaccommodation(reportaccommodation);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账酒店信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportaccommodationInfo  新增报账酒店信息成功！");
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


    /**
     * 新增报账餐馆信息
     * @param reportrestaurant 报账餐馆对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportrestaurantInfo")
    public ReponseResult insertReportrestaurantInfo(@RequestBody Reportrestaurant reportrestaurant){
        try {
            Integer result = reportrestaurantService.insertReportrestaurant(reportrestaurant);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账餐馆信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportrestaurantInfo  新增报账餐馆信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账餐馆信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportrestaurantInfo  新增报账餐馆信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportrestaurantInfo  新增报账餐馆数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 新增报账门票信息
     * @param reportticket 报账门票对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportticketInfo")
    public ReponseResult insertReportticketInfo(@RequestBody Reportticket reportticket){
        try {
            Integer result = reportticketService.insertReportticketInfo(reportticket);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账门票信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportticketInfo  新增报账门票信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账门票信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportticketInfo  新增报账门票信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportticketInfo  新增报账门票数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 添加出团补助信息
     * @param reportqutsubsidy 出团补助对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportqutsubsidyInfo")
    public ReponseResult insertReportqutsubsidyInfo(@RequestBody Reportqutsubsidy reportqutsubsidy){
        try {
            Integer result = reportqutsubsidyService.insertReportqutsubsidyInfo(reportqutsubsidy);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增出团补助信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportqutsubsidyInfo  新增出团补助信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增出团补助信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportqutsubsidyInfo  新增出团补助信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportqutsubsidyInfo  新增出团补助数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 新增报账车票信息
     * @param reportfare 报账车票对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportfareInfo")
    public ReponseResult insertReportfareInfo(@RequestBody Reportfare reportfare){
        try {
            Integer result = reportfareService.insertReportfareInfo(reportfare);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账车票信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportfareInfo  新增报账车票信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账车票信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportfareInfo  新增报账车票信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportfareInfo  新增报账车票数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 添加报账其他支出信息
     * @param reportingotherexpenses 报账其他支出对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/insertReportingotherexpensesInfo")
    public ReponseResult insertReportingotherexpensesInfo(@RequestBody Reportingotherexpenses reportingotherexpenses){
        try {
            Integer result = reportingotherexpensesService.insertReportingotherexpensesInfo(reportingotherexpenses);
            ReponseResult<Integer> data = null;
            if(result>0){
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账其他支出信息成功！");
                //三、录入日志并返回
                logger.info(" method:insertReportingotherexpensesInfo  新增报账其他支出信息成功！");
            }else{
                //二、返回ReponseResult对象
                data = ReponseResult.ok(result , "新增报账其他支出信息失败！");
                //三、录入日志并返回
                logger.info(" method:insertReportingotherexpensesInfo  新增报账其他支出信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:insertReportingotherexpensesInfo  新增报账其他支出数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

}
