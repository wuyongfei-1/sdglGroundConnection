package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import com.dyhc.sdglgroundconnection.service.DispatchService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping("/getDispatchInfoByDispatchId")
    public ReponseResult getDispatchInfoByDispatchId(@RequestParam("dispatchId")Integer dispatchId){
        try {
            Dispatch dispatch=dispatchService.getDispatchInfoByDispatchInfoId(dispatchId);
            ReponseResult<Dispatch> data = ReponseResult.ok(dispatch, "根据调度编号获取调度表信息成功！");

            logger.info(" method:selectDispatchs  根据调度编号获取调度表信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:selectDispatchs  根据调度编号获取调度表信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 分页获取调度表信息 (lixiaojie)
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/selectDispatchs",method = RequestMethod.POST)
    public ReponseResult selectDispatchs(Integer pageNo, Integer pageSize) {
        try {
            PageInfo<Dispatch> pageInfo = dispatchService.selectDispatchs( pageNo,  pageSize);
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
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/onCheckDispatchInfo",method = RequestMethod.POST )
    public ReponseResult onCheckDispatchInfo(Integer dispatchId){
        try {
            int result=dispatchService.onCheckDispatchInfo(dispatchId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","总控审核通过成功！");
                logger.info(" method:onCheckDispatchInfo  总控审核通过成功！");

            }else{
                date= ReponseResult.ok("0","总控审核通过失败！");
                logger.info(" method:onCheckDispatchInfo  总控审核通过失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:onCheckDispatchInfo  总控审核通过失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 总控不审核通过 （lixiaojie)
     * @param dispatchId
     * @return
     */
    @RequestMapping(value = "/noCheckDispatchInfo",method = RequestMethod.POST )
    public ReponseResult noCheckDispatchInfo(Integer dispatchId){
        try {
            int result=dispatchService.noCheckDispatchInfo(dispatchId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","总控不审核通过成功！");
                logger.info(" method:noCheckDispatchInfo  总控不审核通过成功！");
            }else{
                date= ReponseResult.ok("0","总控不审核通过失败！");
                logger.info(" method:noCheckDispatchInfo  总控不审核通过失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:noCheckDispatchInfo  总控不审核通过失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
