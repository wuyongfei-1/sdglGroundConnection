package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.AccountType;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.AccountTypeService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户类型 控制层
 **/
@RestController
@RequestMapping("/accountType")
public class AccountTypeController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(AccountTypeController.class);

    @Autowired
    private AccountTypeService accountTypeService;

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param
     * @return
     */
    @RequestMapping("/showAllAccountType")
    public ReponseResult showHotel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize, AccountType accountType) {
        try {
            pageSize = 6;
            PageInfo<AccountType> pageInfo = accountTypeService.listAccountType(pageNo,pageSize,accountType);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取公司账户成功！");
            logger.info(" method:showAllAccountType  分页获取公司账户成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showAllAccountType  获取公司账户数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 增加
     */
    @RequestMapping("/insertaccpountType")
    public ReponseResult insertaccpountType(AccountType accountType,HttpServletRequest request){
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            accountType.setCreateBy(sessionstaff!=null?sessionstaff.getStaffId():1);
            accountType.setCreateDate(new Date());
            int result=accountTypeService.insertaccountType(accountType);
            System.out.println(result);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","增加公司账户成功！");
                System.out.println(date);
                logger.info(" method:insertCompany  增加公司账户成功！");

            }else{
                date= ReponseResult.ok("0","增加公司账户失败！");
                logger.info(" method:insertCompany  增加公司账户失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertCompany  增加公司账户数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改
     */
    @RequestMapping("/updateAccountType")
    public ReponseResult updateAccountType(AccountType accountType,HttpServletRequest request){
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            accountType.setUpdateBy(sessionstaff!=null?sessionstaff.getStaffId():1);
            accountType.setUpDate(new Date());
            int result=accountTypeService.updateAccountType(accountType);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改公司账户成功！");
                logger.info("method:updateAccountType  修改公司账户成功！");

            }else{
                date= ReponseResult.ok("0","修改公司账户失败！");
                logger.info(" method:updateAccountType  修改公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateAccountType  修改公司账户失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping("/deleteaccountTypeByID")
    public ReponseResult deleteaccountTypeByID(int accountTypeId){
        try {
            int result=accountTypeService.deleteAccountTypeByIDs(accountTypeId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除公司账户成功！");
                logger.info(" method:deleteaccountTypeByID  删除公司账户成功！");

            }else{
                date= ReponseResult.ok("0","删除公司账户失败！");
                logger.info(" method:deleteaccountTypeByID  删除公司账户失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteaccountTypeByID  删除公司账户失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * id查询
     */
    @RequestMapping("/selectAccountTypeById")
    public ReponseResult selectHotelById(int id){
        try {
            AccountType result=accountTypeService.selectAccountTypeByIds(id);

            ReponseResult<AccountType> date;
            if (result!=null){
                date= ReponseResult.ok(result,"id查询成功");
                logger.info(" method:selectAccountTypeById  id查询成功！");

            }else{
                date= ReponseResult.ok("id查询公司失败！");
                logger.info(" method:selectAccountTypeById  id查询公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectAccountTypeById  id查询公司失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
