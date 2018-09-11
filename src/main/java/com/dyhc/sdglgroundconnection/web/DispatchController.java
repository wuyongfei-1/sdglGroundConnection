package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.dto.*;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.utils.DateTimeUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度 控制层
 **/
@RestController
@RequestMapping("/dispatch")
public class DispatchController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(DispatchController.class);

    @Autowired
    private DispatchService dispatchService;

    /**
     * 分页获取所有的调度信息（wuyongfei）
     *
     * @param page  起始页码
     * @param limit 每页记录数
     * @return 相应对象
     */
    @GetMapping(value = "/dispatch/info/all")
    public ReponseResult listDispatchInfo(@RequestParam(value = "pageNo") Integer page, @RequestParam(value = "pageSize") Integer limit) {
        try {
            PageInfo<Dispatch> pageInfo = dispatchService.listDispatchesInfo(page, limit);
            logger.info(" method:listDispatchInfo  分页获取调度信息成功！");
            return ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页查询调度信息成功！");
        } catch (Exception e) {
            logger.error(" method:listDispatchInfo  分页获取调度信息失败，系统出现异常！");
            e.printStackTrace();
            return ReponseResult.err("分页获取调度信息失败！");
        }
    }

    /**
     * 根据调度编号查询计划信息（yunguohao）
     *
     * @param dispatchId 调度编号
     * @return
     */
    @RequestMapping("/getTravelPathById")
    public ReponseResult getTravelPathById(@RequestParam("dispatchId") Integer dispatchId) {
        try {
            List<TravelPathParam> travelPathParam = dispatchService.getTravelPathParam(dispatchId);
            ReponseResult<List> data = null;
            if (travelPathParam.size() > 0) {
                data = ReponseResult.ok(travelPathParam, "根据调度编号获取计划信息成功！");
                logger.info(" method:selectDispatchs  根据调度编号获取计划信息成功！");
            } else {
                data = ReponseResult.ok(travelPathParam, "没有该计划信息！");
                logger.info(" method:selectDispatchs  没有该计划信息！");
            }

            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchs  根据调度编号获取计划信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据调度编号查询计划信息（yunguohao）
     *
     * @param dispatchId 调度编号
     * @return
     */
    @RequestMapping("/getTravelPathsById")
    public ReponseResult getTravelPathsById(@RequestParam("dispatchId") Integer dispatchId) {
        try {
            TravelPathsParam travelPathsParam = dispatchService.getTravelPathsParam(dispatchId);
            ReponseResult<TravelPathsParam> data = null;
            if (travelPathsParam.getDispatch() != null) {
                data = ReponseResult.ok(travelPathsParam, "根据调度编号获取计划信息成功！");
                logger.info(" method:selectDispatchs  根据调度编号获取计划信息成功！");
            } else {
                data = ReponseResult.ok(travelPathsParam, "没有该计划信息！");
                logger.info(" method:selectDispatchs  没有该计划信息！");
            }

            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchs  根据调度编号获取计划信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 根据调度编号查询派团单信息
     *
     * @param dispatchId 调度编号
     * @return 返回派团单对象
     */
    @RequestMapping("/getMissionInfoByDisId")
    public ReponseResult getMissionInfoByDisId(@RequestParam("dispatchId") Integer dispatchId) {
        try {
            MissionParam missionParam = dispatchService.getMissionParam(dispatchId);
            ReponseResult<MissionParam> data = null;
            if (missionParam.getDispatch() != null) {
                data = ReponseResult.ok(missionParam, "根据调度编号获取派团单信息成功！");
                logger.info(" method:selectDispatchs  根据调度编号获取派团单信息成功！");
            } else {
                data = ReponseResult.ok(missionParam, "没有该调度信息，获取调度信息失败！");
                logger.info(" method:selectDispatchs  没有该调度信息，获取调度信息失败！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchs  根据调度编号获取派团单信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    @Autowired
    private DispatchParam dispatchParam; // 调度参数对象

    /**
     * 保存调度信息（总信息、路线、酒店、景点、购物地、饮食类型、导游、车队、其他）（wuyongfei）
     *
     * @param patchParamObj 调度信息参数json格式对象
     * @return 响应结果
     */
    @PostMapping("/dispatch/save")
    public ReponseResult saveDispatchInfo(@RequestBody PatchParam patchParamObj,@RequestParam(value = "dispatchId", required = false, defaultValue = "0") Integer dispatchIdStatus, HttpServletRequest request) {
        try {
            Staff staff = (Staff) request.getSession().getAttribute("user");
            int userId = staff != null ? staff.getStaffId() : 1;    // 当前session中的用户编号
            // get param start
            // 调度基础信息参数
            PatchInfoParam patchInfo = patchParamObj.getPatchInfo();
            // 调度用车参数
            PatchCarParam patchCar = patchParamObj.getPatchCar();
            // 调度导游参数
            PatchGuideParam patchGuide = patchParamObj.getPatchGuide();
            // 调度线路信息参数列表
            List<PatchLineParam> patchLine = patchParamObj.getPatchLine();
            // 调度酒店参数列表
            List<PatchHotelParam> patchHotel = patchParamObj.getPatchHotel();
            // 调度景点参数列表
            List<PatchScenicspotParam> patchScenicspot = patchParamObj.getPatchScenicspot();
            // 调度饮食类型参数列表
            List<PatchMealTypeParam> patchMealType = patchParamObj.getPatchMealType();
            // 调度购物地点参数列表
            List<PatchShoppingParam> patchShopping = patchParamObj.getPatchShopping();
            // get param end
            // 基础信息
            Dispatch dispatch = new Dispatch();
            dispatch.setGroundConnectionNumber("GG-1651166166-SDGL");
            dispatch.setGroupNumber("JDSK-5656161616-SY");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                dispatch.setTravelStartTime(sdf.parse(patchInfo.getTravelStartTime()));
                dispatch.setTravelEndTime(sdf.parse(patchInfo.getTravelEndTime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dispatch.setNum(patchInfo.getNum());
            dispatch.setFare(patchInfo.getFare());
            dispatch.setWineFee(patchInfo.getWineFee());
            dispatch.setRemarks(patchInfo.getRemarks());
            dispatch.setSupervision(patchInfo.getSupervision());
            dispatch.setReception(patchInfo.getReception());
            dispatch.setLoan(patchInfo.getLoan());
            dispatch.setCreater(userId);
            dispatch.setTourist(patchInfo.getTourist());
            dispatch.setCreationDate(new Date());
            dispatch.setValue1(patchInfo.getConcat());
            dispatch.setValue2(patchInfo.getConcatPhone());
            dispatch.setStatus(2);
            dispatch.setState(2);
            dispatch.setWhetherDel(0);
            dispatchParam.setDispatch(dispatch);
            // 其他信息
            Disother disother = new Disother();
            disother.setCostPrice(patchInfo.getOtherCostPrice());
            disother.setQuotePrice(patchInfo.getOtherOffer());
            disother.setCreateDate(new Date());
            disother.setCreateBy(userId);
            disother.setRemarks(patchInfo.getRemarks());
            disother.setStatus(0);
            dispatchParam.setDisother(disother);
            // 旅行社信息
            Dispatchtourgroup dispatchtourgroup = new Dispatchtourgroup();
            try {
                dispatchtourgroup.setClustertime(sdf.parse(patchInfo.getTravelStartTime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dispatchtourgroup.setClusteraddress(patchInfo.getBeginAddress());
            dispatchtourgroup.setFlightid(patchInfo.getCarNum());
            dispatchtourgroup.setTeamcontactsname(patchInfo.getConcat());
            dispatchtourgroup.setContactnumber(patchInfo.getConcatPhone());
            dispatchtourgroup.setCreatedate(new Date());
            String time = patchInfo.getTravelEndTime();
            dispatchtourgroup.setValue1(time);  // 送团时间
            dispatchtourgroup.setValue2(patchInfo.getEndAddress()); // 送团地点
            dispatchtourgroup.setValue3(patchInfo.getTravelName()); // 旅行社名称
            dispatchParam.setDispatchtourgroup(dispatchtourgroup);
            // 用车信息
            Discar discar = new Discar();
            discar.setTypeId(patchCar.getTypeId());
            discar.setNumber(patchCar.getNumber());
            discar.setCostPrice(patchCar.getCostPrice());
            discar.setQuotePrice(patchCar.getOffer());
            discar.setCreateBy(userId);
            discar.setCreateDate(new Date());
            discar.setStatus(0);
            discar.setValue1(patchCar.getCarNo());
            discar.setValue2(patchCar.getCarPeopleName());
            discar.setValue3(patchCar.getCarPeoplePhone());
            dispatchParam.setDiscar(discar);
            // 景点列表
            List<Disattr> disattrList = new ArrayList<>();
            for (PatchScenicspotParam patchScenicspotParam : patchScenicspot) {
                Disattr disattr = new Disattr();
                disattr.setScenicSpotId(patchScenicspotParam.getScenicSpotId());
                disattr.setCostPrice(patchScenicspotParam.getCostprice());
                disattr.setQuotePrice(patchScenicspotParam.getOffer());
                disattr.setBuynum(patchScenicspotParam.getBuynum());
                disattr.setPayMethods(patchScenicspotParam.getPayment());
                disattr.setWeight(patchScenicspotParam.getWeight());
                disattr.setCreateBy(userId);
                disattr.setCreateDate(new Date());
                disattr.setDate(patchScenicspotParam.getDate());
                disattr.setStatus(0);
                disattrList.add(disattr);
            }
            dispatchParam.setDisattrList(disattrList);
            //  导游
            Disguide disguide = new Disguide();
            disguide.setGuideId(patchGuide.getGuideId());
            disguide.setCreateBy(userId);
            disguide.setCreateDate(new Date());
            disguide.setStatus(0);
            dispatchParam.setDisguide(disguide);
            // 酒店列表
            List<Dispatchhotel> dispatchhotelList = new ArrayList<>();
            for (PatchHotelParam dispatchhotel : patchHotel) {
                Dispatchhotel dispatchhotel1 = new Dispatchhotel();
                dispatchhotel1.setHotelId(dispatchhotel.getHotelId());
                dispatchhotel1.setRoomNumber(dispatchhotel.getHotelNum());
                dispatchhotel1.setValue1(dispatchhotel.getHotelType().toString());
                dispatchhotel1.setCostPrice(dispatchhotel.getHotelCostPrice());
                dispatchhotel1.setOffer(dispatchhotel.getHotelOffer());
                dispatchhotel1.setPayment(dispatchhotel.getPayment());
                dispatchhotel1.setWeight(dispatchhotel.getWeight());
                dispatchhotel1.setCreater(userId);
                dispatchhotel1.setCreationDate(new Date());
                dispatchhotel1.setDate(dispatchhotel.getDate());
                dispatchhotel1.setWhetherDel(0);
                // 司陪
                dispatchhotel1.setCompanyBedNum(dispatchhotel.getCompanyBedNum());
                dispatchhotel1.setCompanyBedoffer(dispatchhotel.getCompanyBedoffer());
                dispatchhotel1.setCompanyPaymeny(dispatchhotel.getCompanyPaymeny());
                dispatchhotelList.add(dispatchhotel1);
            }
            dispatchParam.setDispatchhotelList(dispatchhotelList);
            // 饮食类型列表
            List<Disrestaurant> disrestaurantList = new ArrayList<>();
            for (PatchMealTypeParam patchMealTypeParam : patchMealType) {
                Disrestaurant disrestaurant = new Disrestaurant();
                disrestaurant.setTypeId(patchMealTypeParam.getTypeId());
                disrestaurant.setCostPrice(patchMealTypeParam.getCostprice());
                disrestaurant.setQuotePrice(patchMealTypeParam.getOffer());
                disrestaurant.setDinDate(patchMealTypeParam.getDinDate());
                disrestaurant.setWeight(patchMealTypeParam.getWeight());
                disrestaurant.setPayment(patchMealTypeParam.getPayment());
                disrestaurant.setCreateBy(userId);
                disrestaurant.setCreateDate(new Date());
                disrestaurant.setStatus(0);
                disrestaurantList.add(disrestaurant);
            }
            dispatchParam.setDisrestaurantList(disrestaurantList);
            // 购物地点列表
            List<Disshopp> disshoppList = new ArrayList<>();
            for (PatchShoppingParam patchShoppingParam : patchShopping) {
                Disshopp disshopp = new Disshopp();
                disshopp.setShoppingId(patchShoppingParam.getShoppingId());
                disshopp.setWeight(patchShoppingParam.getWeight());
                disshopp.setCreateBy(userId);
                disshopp.setCreateDate(new Date());
                disshopp.setDate(patchShoppingParam.getDate());
                disshopp.setStatus(0);
                disshoppList.add(disshopp);
            }
            dispatchParam.setDisshoppList(disshoppList);
            // 线路列表
            List<Disline> dislineList = new ArrayList<>();
            for (PatchLineParam patchLineParam : patchLine) {
                Disline disline = new Disline();
                disline.setLineName(patchLineParam.getLineName());
                disline.setTravelTime(patchLineParam.getTravelTime());
                disline.setLineContent(patchLineParam.getDesc());
                disline.setWeight(patchLineParam.getWeight());
                disline.setCreateUser(userId);
                disline.setCreateTime(new Date());
                dislineList.add(disline);
            }
            dispatchParam.setDislineList(dislineList);
            // start save operation
            Integer dispatchId = dispatchService.saveDispatchInfo(dispatchParam,dispatchIdStatus);
            logger.info("method: saveDispatchInfo  保存调度信息成功！");
            return ReponseResult.ok("{\"dispatchId\":" + (dispatchId) + "}", "保存调度信息成功！");
        } catch (DispatchException e) {
            logger.error("method: saveDispatchInfo  保存调度信息失败！" + e.getMessage());
            e.printStackTrace();
            return ReponseResult.err("保存调度信息失败，系统出现异常！");
        }
    }


    /**
     * 根据调度编号查询调度信息 （wangtao）
     *
     * @param dispatchId 调度编号
     * @return 返回调度信息对象
     */
    @RequestMapping("/getDispatchInfoByDispatchId")
    public ReponseResult getDispatchInfoByDispatchId(@RequestParam("dispatchId") Integer dispatchId) {
        try {
            Dispatch dispatch = dispatchService.getDispatchInfoByDispatchInfoId(dispatchId);
            ReponseResult<Dispatch> data = null;
            if (dispatch != null) {
                data = ReponseResult.ok(dispatch, "根据调度编号获取调度表信息成功！");
                logger.info(" method:getDispatchInfoByDispatchId  根据调度编号获取调度表信息成功！");
            } else {
                data = ReponseResult.ok(dispatch, "没有该调度表信息！");
                logger.info(" method:getDispatchInfoByDispatchId  没有该调度表信息！");
            }
            return data;
        } catch (Exception e) {
            logger.error(" method:getDispatchInfoByDispatchId  根据调度编号获取调度表信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 分页获取调度表信息 (lixiaojie)
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/selectDispatchs", method = RequestMethod.POST)
    public ReponseResult selectDispatchs(Integer pageNo, Integer pageSize) {
        try {
            PageInfo<Dispatch> pageInfo = dispatchService.selectDispatchs(pageNo, pageSize);
            ReponseResult<PageInfo> data = ReponseResult.ok(pageInfo, "分页获取调度表信息成功！");
            logger.info(" method:selectDispatchs  分页获取调度表信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchs  分页获取调度表信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 总控审核通过 （lixiaojie)
     *
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/onCheckDispatchInfo", method = RequestMethod.POST)
    public ReponseResult onCheckDispatchInfo(Integer dispatchId, HttpServletRequest request) {
        ReponseResult<String> date = null;
        try {

            Staff sessionstaff = (Staff) request.getSession().getAttribute("user");
            int staffId = sessionstaff != null ? sessionstaff.getStaffId() : 1;

            int result = dispatchService.onCheckDispatchInfo(dispatchId, staffId);

            if (result > 0) {
                date = ReponseResult.ok("1", "总控审核通过成功！");
                logger.info(" method:onCheckDispatchInfo  总控审核通过成功！");
            } else {
                date = ReponseResult.ok("0", "总控审核通过失败！");
                logger.info(" method:onCheckDispatchInfo  总控审核通过失败！");
            }
            return date;
        } catch (NullPointerException e) {
            date = ReponseResult.ok("2", "总控审核冲突！");
            logger.info(" method:onCheckDispatchInfo  总控审核冲突！");
            return date;
        } catch (Exception e) {
            logger.error(" method:onCheckDispatchInfo  总控审核通过失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 总控不审核通过 （lixiaojie)
     *
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/noCheckDispatchInfo", method = RequestMethod.POST)
    public ReponseResult noCheckDispatchInfo(Integer dispatchId) {
        try {
            int result = dispatchService.noCheckDispatchInfo(dispatchId);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "总控不审核通过成功！");
                logger.info(" method:noCheckDispatchInfo  总控不审核通过成功！");
            } else {
                date = ReponseResult.ok("0", "总控不审核通过失败！");
                logger.info(" method:noCheckDispatchInfo  总控不审核通过失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:noCheckDispatchInfo  总控不审核通过失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
