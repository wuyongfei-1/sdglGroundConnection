package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.FileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RestController
@RequestMapping("/staff")
public class StaffController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;

    /**
     * 根据用户id查询用户信息
     * @param staffId
     * @return
     */
    @RequestMapping(value = "/getStaffInfoByStaffId",method = RequestMethod.POST)
    public ReponseResult getStaffInfoByStaffId(Integer staffId ) {

        ReponseResult<Staff> data;
        try {

            Staff staff=staffService.getStaffInfoByStaffId(staffId);


           data = ReponseResult.ok(staff, "根据用户id获取用户信息成功！");

            logger.info(" method:getStaffInfoByStaffId  根据用户id获取用户信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getStaffInfoByStaffId  根据用户id获取用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    @RequestMapping(value = "/listPageGetStaffByNameAndCreateDateAndRoleId",method = RequestMethod.POST)
    public ReponseResult listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate,String lastDate, Integer roleId) {
        try {
            pageSize = 6;
            PageInfo<Staff> pageInfo = staffService.listPageGetStaffByNameAndCreateDateAndRoleId( pageNo,  pageSize,  staffname,   firstDate, lastDate,  roleId);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取人員信息成功！");

            logger.info(" method:listPageGetStaffByNameAndCreateDateAndRoleId  分页获取人員信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listPageGetStaffByNameAndCreateDateAndRoleId  分页获取人員信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 删除
     */
    @RequestMapping(value = "/deleteStaffBystaffId",method = RequestMethod.POST )
    public ReponseResult deleteStaffBystaffId(Integer staffId){
        try {
            int result=staffService.deleteStaffBystaffId(staffId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","删除用户信息成功！");
                logger.info(" method:deleteStaffBystaffId  删除用户信息成功！");

            }else{
                date= ReponseResult.ok("0","删除用户信息失败！");
                logger.info(" method:deleteStaffBystaffId  删除用户信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:deleteStaffBystaffId  删除用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 增加
     */
    @RequestMapping(value = "/saveStaffInfo",method = RequestMethod.POST )
    public ReponseResult saveStaffInfo(Staff staff){
        try {
            int result=staffService.saveStaffInfo(staff);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","增加用户信息成功！");
                logger.info(" method:saveStaffInfo  增加用户信息成功！");

            }else{
                date= ReponseResult.ok("0","增加用户信息失败！");
                logger.info(" method:saveStaffInfo  增加用户信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:saveStaffInfo  增加用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改删除状态
     */
    @RequestMapping(value = "/updateStaffWhetherDel",method = RequestMethod.POST )
    public ReponseResult updateStaffWhetherDel(Integer staffId){
        try {
            int result=staffService.updateStaffWhetherDel(staffId);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改用户删除状态成功！");
                logger.info(" method:updateStaffWhetherDel  修改用户删除状态成功！");

            }else{
                date= ReponseResult.ok("0","修改用户删除状态失败！");
                logger.info(" method:updateStaffWhetherDel  修改用户删除状态失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateStaffWhetherDel  修改用户删除状态失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 修改
     */
    @RequestMapping(value = "/updateStaffInfo",method = RequestMethod.POST )
    public ReponseResult updateStaffInfo(Staff staff){
        try {
            int result=staffService.updateStaffInfo(staff);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改用户信息成功！");
                logger.info(" method:updateStaffInfo  修改用户信息成功！");

            }else{
                date= ReponseResult.ok("0","修改用户信息失败！");
                logger.info(" method:updateStaffInfo  修改用户信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateStaffInfo  修改用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 图片上传（yunguohao）
     *
     * @param multipartFile 文件对象
     * @param savePath      图片保存路径
     * @return 保存结果updateStaff
     */
    @RequestMapping("/updateStaff")
    public ReponseResult testUploadImage(Staff staff,@RequestParam("multipartFile") MultipartFile multipartFile,
                                         @RequestParam("savePath") String savePath) {
        try {
            //判断是否有上传图片 判断multipartFile和savePath是否为null
            if (!multipartFile.isEmpty() && "a.txt".equals(multipartFile.getOriginalFilename())) {
                System.out.println("上上上");
                //如果为空则根据编号查询信息把用户之前的图片地址赋值给要修改的对象
                Staff staff1 = staffService.getStaffInfoByStaffId(2);
                staff.setHeadPortraitPath(staff1.getHeadPortraitPath());
            } else {
                // 上传图片操作
                String uploadResult = FileUploadUtil.uploadImage(multipartFile, ".jpg");
                if (!"".equals(uploadResult)) {
                    staff.setHeadPortraitPath(uploadResult);
                    logger.info(" method:updateStaff  上传图片成功！");
                } else {
                    logger.info(" method:updateStaff  上传图片失败！");
                }
            }
            int result=staffService.updateStaffs(staff);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改用户信息成功！");
                logger.info(" method:updateStaff  修改用户信息成功！");

            }else{
                date= ReponseResult.ok("0","修改用户信息失败！");
                logger.info(" method:updateStaff  修改用户信息失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateStaffInfo  修改用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 修改
     */
    @RequestMapping("/updateStaff1")
    public ReponseResult updateCompany(Staff staff){
        try {
            int result=staffService.updateStaffpas(staff);
            ReponseResult<String> date;
            if (result>0){
                date= ReponseResult.ok("1","修改公司成功！");
                logger.info("method:updateStaff1  修改公司成功！");

            }else{
                date= ReponseResult.ok("0","修改公司失败！");
                logger.info(" method:updateStaff1  修改公司失败！");
            }
            return date;
        }catch (Exception e){
            logger.error(" method:updateStaff1  修改公司失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }


    /**
     * 登录验证（dubingkun）
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/loginCheck")
    public ReponseResult loginCheck(HttpServletRequest httpServletRequest, String username, String password){
        ReponseResult<Integer> success;
        Staff sf=null;
        try {
            sf=staffService.loginCheck(username);
            logger.info(" method:loginCheck  获取对应用户信息成功！");
            if(sf==null){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            if(!sf.getPassword().equals(EncryUtil.encrypt(password))){
                success= ReponseResult.ok(-1,"用户名或密码不匹配！");
                return success;
            }
            httpServletRequest.getSession().setAttribute("user",sf);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(" method:loginCheck  获取对应用户信息失败，系统出现异常！");
            success= ReponseResult.ok(-1,password);
        }
        success= ReponseResult.ok(sf.getRoleId(),"验证成功！");
        return success;
    }
}
