package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import com.dyhc.sdglgroundconnection.service.ReportdetailService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账明细 控制层
 **/
@RestController
@RequestMapping("/reportdetail")
public class ReportdetailController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ReportdetailController.class);

    @Autowired
    private ReportdetailService reportdetailService;

    /**
     * 按导游报账明细表编号查询查询 (yunguohao)
     */
    @RequestMapping("/selectReportdetailById")
    public ReponseResult selectHotelById(Integer reportDetailId){
        try {
            Reportdetail result=reportdetailService.selectReportdetailById(reportDetailId);
            ReponseResult<Reportdetail> date;
            if (result!=null){
                date= ReponseResult.ok(result,"按导游报账明细表编号查询成功");
                logger.info(" method:selectReportdetailById  按导游报账明细表编号查询成功！");
            }else{
                date= ReponseResult.ok("按导游报账明细表编号查询导游失败！");
                logger.info(" method:selectReportdetailById  按导游报账明细表编号查询导游失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectReportdetailById  按导游报账明细表编号查询导游失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 报账日期区间查询(yunguohao)
     * @param
     * @return
     */
    @RequestMapping("/selectreportDate")
    public ReponseResult reportdetailList(String reportDate1,String reportDate2){
        try {
            List<Reportdetail> list=reportdetailService.selectreportDate(reportDate1,reportDate2);
            ReponseResult<List> data = ReponseResult.ok( list,"获取日期区间成功！");
            logger.info(" method:selectreportDate  获取日期区间成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectreportDate  获取区间数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 按调度编号查询(yunguohao)
     * @param
     * @return
     */
    @RequestMapping("/selectdispatchId")
    public ReponseResult dispatchIdList(int dispatchId){
        try {
            List<Reportdetail> list=reportdetailService.selectDispatchId(dispatchId);
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
     * 增加游报账明细(yunguohao)
     */
    @RequestMapping("/insertReportdetail")
    public ReponseResult insertCompany(Reportdetail reportdetail){
        try {
            int result=reportdetailService.insertReportdetail(reportdetail);
            System.out.println(result);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","增加报账明细成功！");
                System.out.println(date);
                logger.info(" method:insertGuide  增加报账明细成功！");

            }else{
                date= ReponseResult.ok("0","增加报账明细失败！");
                logger.info(" method:insertGuide  增加报账明细失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertGuide  增加报账明细数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据团号获取报账信息（dubingkun）
     * @param groupNumber 团号
     * @return
     */
    @GetMapping("/showInfoAll")
    public ReponseResult showInfoAll(Integer pageNo,Integer pageSize,String groupNumber,Integer states){
        try {
            PageInfo<Reportdetail> pageInfo=reportdetailService.listReportdetail(pageNo,pageSize,groupNumber,states);
            ReponseResult<Object> data = ReponseResult.ok(pageInfo,pageInfo.getTotal(),"分页获取导游报账信息成功！");
            return data;
        }catch (Exception e){
            logger.error(" method:showInfoAll  分页获取导游报账信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
