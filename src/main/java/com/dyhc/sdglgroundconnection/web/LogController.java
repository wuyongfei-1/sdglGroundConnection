package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Log;
import com.dyhc.sdglgroundconnection.service.LogService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 日志 控制层
 **/
@RestController
@RequestMapping("/log")
public class LogController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private LogService logService;

    /**
     * 查询所有日志信息 （wangtao）
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/listAllLog")
    public ReponseResult listAllLog(){
        try {
            ReponseResult<List> reponseResult=ReponseResult.ok(logService.ListAllLog(),"查询所有日志信息成功！");
            logger.info(" method:listAllLog  查询全部日志成功！");
            return reponseResult;
        } catch (Exception e) {
            ReponseResult reponseResult=ReponseResult.err("系统出现异常！");
            logger.info(" method:listAllLog  查询全部日志成功！");
            e.printStackTrace();
            return reponseResult;
        }
    }

    /**
     * 新增日志信息 （wangtao）
     * @param log
     * @return
     */
    @RequestMapping("/insertLog")
    public ReponseResult insertLog(Log log){
        try {
            log.setCreater(1);
            log.setCreationDate(new Date());
            log.setWhetherDel(0);
            int result=logService.insertLog(log);
            ReponseResult<Integer> date;
            if (result>0){
                date= ReponseResult.ok(result,"新增日志成功！");
                logger.info(" method:insertLog  新增日志成功！");

            }else{
                date= ReponseResult.ok("新增日志失败！");
                logger.info(" method:insertLog  新增日志失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertLog  新增日志数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改日志信息根据日志编号 （wangtao）
     * @param log 参数日志对象
     * @return 返回ReponseResult对象
     */
    @RequestMapping("/updateLogById")
    public ReponseResult updateLogById(Log log){
        try {
            Log Log1=logService.getLogById(log.getLogId());
            log.setCreater(Log1.getCreater());
            log.setCreationDate(Log1.getCreationDate());
            log.setWhetherDel(Log1.getWhetherDel());
            log.setModifier(1);
            log.setModifiedData(new Date());
            int result=logService.updateLogById(log);
            ReponseResult<Integer> date;
            if (result>0){
                date= ReponseResult.ok(result,"修改日志成功！");
                logger.info(" method:updateLogById  修改日志成功！");

            }else{
                date= ReponseResult.ok("修改日志失败！");
                logger.info(" method:updateLogById  修改日志失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateLogById  修改日志数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     *  删除日志信息根据日志编号 （wangtao）
     * @param id 日志编号
     * @return 返回ReponseResult
     */
    @RequestMapping("/deleteLogById")
    public ReponseResult deleteLogById(Integer id){
        try {
            int result=logService.deleteLogById(id);
            ReponseResult<Integer> date;
            if (result>0){
                date= ReponseResult.ok(result,"删除日志成功！");
                logger.info(" method:deleteLogById  删除日志成功！");

            }else{
                date= ReponseResult.ok("删除日志失败！");
                logger.info(" method:deleteLogById  删除日志失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteLogById  删除日志数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
