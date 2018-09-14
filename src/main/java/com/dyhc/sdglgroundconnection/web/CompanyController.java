package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Company;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.CompanyService;
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
 * 公司信息 控制层
 **/
@RestController
@RequestMapping("/company")
public class CompanyController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    private CompanyService companyService;

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param company
     * @return
     */
    @RequestMapping("/showAllCompany")
    public ReponseResult showHotel(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize,Company company) {
        try {
            pageSize = 6;
            PageInfo<Company> pageInfo = companyService.listCompany(pageNo,pageSize,company);
            System.out.println("********************"+company);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取公司成功！");
            logger.info(" method:showAllCompany  分页获取公司成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showAllCompany  获取公司数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/getCompany")
    public ReponseResult getcompany() {
        try {
            Company company = companyService.getcompany();
            ReponseResult<Company> data = ReponseResult.ok(company, "获取公司成功！");
            logger.info(" method:showAllCompany  获取公司成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:showAllCompany  获取数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 增加
     */
    @RequestMapping("/insertCompany")
    public ReponseResult insertCompany(Company company,HttpServletRequest request){
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            company.setCreater(sessionstaff!=null?sessionstaff.getStaffId():1);
            company.setCreationDate(new Date());
            int result=companyService.insertCompanys(company);
            System.out.println(result);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","增加公司成功！");
                System.out.println(date);
                logger.info(" method:insertCompany  增加公司成功！");

            }else{
                date= ReponseResult.ok("0","增加公司失败！");
                logger.info(" method:insertCompany  增加公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:insertCompany  增加公司数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改
     */
    @RequestMapping("/updateCompany")
    public ReponseResult updateCompany(Company company,HttpServletRequest request){
        try {
            Staff sessionstaff= (Staff) request.getSession().getAttribute("user");
            company.setModifier(sessionstaff!=null?sessionstaff.getStaffId():1);
            company.setModifiedData(new Date());
            int result=companyService.updateCompanys(company);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改公司成功！");
                logger.info("method:updateCompany  修改公司成功！");

            }else{
                date= ReponseResult.ok("0","修改公司失败！");
                logger.info(" method:updateCompany  修改公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateCompany  修改公司失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping("/deleteCompanyByID")
    public ReponseResult deleteHotelByID(int companyid){
        try {
            int result=companyService.deleteCompanyByIDs(companyid);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除公司成功！");
                logger.info(" method:deleteCompanyByID  删除公司成功！");

            }else{
                date= ReponseResult.ok("0","删除公司失败！");
                logger.info(" method:deleteCompanyByID  删除公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteCompanyByID  删除公司失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * id查询
     */
    @RequestMapping("/selectCompanyById")
    public ReponseResult selectHotelById(int id){
        try {
            Company result=companyService.selectCompanyByIds(id);
            System.out.println(result.getCompanyName());
            ReponseResult<Company> date;
            if (result!=null){
                date= ReponseResult.ok(result,"id查询成功");
                logger.info(" method:selectCompanyById  id查询成功！");

            }else{
                date= ReponseResult.ok("id查询公司失败！");
                logger.info(" method:selectCompanyById  id查询公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:selectCompanyById  id查询公司失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
