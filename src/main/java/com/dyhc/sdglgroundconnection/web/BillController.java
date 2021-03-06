package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Bill;
import com.dyhc.sdglgroundconnection.service.BillService;
import com.dyhc.sdglgroundconnection.utils.ClientFileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 单据 控制层
 **/
@RestController
@RequestMapping("/bill")
public class BillController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(BillController.class);

    @Autowired
    private BillService billService;

    /**
     *  根据调度团id和单据类型id获取单据信息（lixiaojie)
     * @param dispatchId
     * @param billTypeId
     * @return
     */
    @RequestMapping("/selectBillByDispatchIdAndBillTypeId")
    public ReponseResult selectBillByDispatchIdAndBillTypeId(Integer dispatchId, Integer billTypeId){
        try {
            List<Bill> result=billService.selectBillByDispatchIdAndBillTypeId(dispatchId,billTypeId);
            ReponseResult<List> date;
            if (result!=null){
                date= ReponseResult.ok(result,"根据调度团id和单据类型id获取单据信息成功");
                logger.info(" method:selectBillByDispatchIdAndBillTypeId  根据调度团id和单据类4型id获取单据信息成功！");

            }else{
                date= ReponseResult.ok("根据调度团id和单据类型id获取单据信息失败！");
                logger.info(" method:selectBillByDispatchIdAndBillTypeId  根据调度团id和单据类型id获取单据信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectBillByDispatchIdAndBillTypeId  根据调度团id和单据类型id获取单据信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }



    /**
     * 上传凭证
     * @param request
     * @param multipartFile
     * @param savePath
     * @return
     */
    @PostMapping("/insertBill")
    public ReponseResult insertRestaurant(HttpServletRequest request, @RequestParam("multipartFile") MultipartFile multipartFile, @RequestParam("savePath") String savePath) {
        try {
            String pzBill = request.getParameter("picturePath");
            // 将json串转换为javaType
            ObjectMapper objectMapper = new ObjectMapper();
            Bill bill=objectMapper.readValue(pzBill,Bill.class);
            String uploadResult = ClientFileUploadUtil.uploadImage(multipartFile, savePath, ".jpg");
            bill.setPicturePath(savePath+uploadResult);
            Integer saveResult = billService.insertBill(bill);
            if (saveResult > 0) {
                logger.info(" method: insertBill  添加凭证信息成功");
                return ReponseResult.ok("添加凭证信息成功！");
            } else {
                logger.info(" method: insertBill  添加凭证信息失败");
                return ReponseResult.err("添加凭证信息失败！");
            }
        } catch (Exception e) {
            logger.error(" method:insertBill  保存凭证失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("保存失败！");
            return err;
        }
    }


    /**
     * 按调度编号查询单据(yunguohao)
     * @param
     * @return
     */
    @RequestMapping("/selectdispatchId")
    public ReponseResult dispatchIdList(int dispatchId){
        try {
            List<Bill> list=billService.selectDispatchId(dispatchId);
            ReponseResult<List> data = ReponseResult.ok( list,"调度编号查询成功！");
            logger.info(" method:selectdispatchId  调度编号查询成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectdispatchId  调度编号查询数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 单据类型查询单据(yunguohao)
     * @param
     * @return
     */
    @RequestMapping("/selectbillTypeId")
    public ReponseResult billTypeIdList(int billTypeId){
        try {
            List<Bill> list=billService.selectbillTypeId(billTypeId);
            ReponseResult<List> data = ReponseResult.ok( list,"单据类型查询成功！");
            logger.info(" method:selectbillTypeId  单据类型查询成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectbillTypeId  单据类型查询数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * id查询
     */
    @RequestMapping("/selectBillById")
    public ReponseResult selectHotelById(int billId){
        try {
            Bill result=billService.selectBillById(billId);
            ReponseResult<Bill> date;
            if (result!=null){
                date= ReponseResult.ok(result,"id查询成功");
                logger.info(" method:selectBillById  id查询成功！");

            }else{
                date= ReponseResult.ok("查询单据失败！");
                logger.info(" method:selectBillById  查询单据失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectBillById  查询单据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
