package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.StaffService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.dyhc.sdglgroundconnection.utils.ClientFileUploadUtil;
import com.dyhc.sdglgroundconnection.utils.RandomValidateCodeUtil;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RestController
@RequestMapping("/staff")
public class StaffController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;

    /**
     * 根据用户id查询用户信息(lixiaojie)
     *
     * @param staffId
     * @return
     */
    @RequestMapping(value = "/getStaffInfoByStaffId", method = RequestMethod.POST)
    public ReponseResult getStaffInfoByStaffId(Integer staffId) {

        ReponseResult<Staff> data;
        try {

            Staff staff = staffService.getStaffInfoByStaffId(staffId);


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


    /**
     * 修改密码时从session中获取用户id(lixiaojie)
     *
     * @return
     */
    @RequestMapping(value = "/updateStaffInfoGetSessionInfo", produces = {"application/json"})
    public ReponseResult updateStaffInfoGetSessionInfo(HttpServletRequest request) {
        Staff oldStaff = (Staff) request.getSession().getAttribute("user");
        ReponseResult<Staff> data;
        try {
            Staff staff = staffService.getStaffInfoByStaffId(oldStaff != null ? oldStaff.getStaffId() : 1);
            data = ReponseResult.ok(staff, "从session中获取用户id成功！");
            logger.info(" method:updateStaffInfoGetSessionInfo  修改密码时从session中获取用户id成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:updateStaffInfoGetSessionInfo  修改密码时从session中获取用户id失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 从session中获取用户id(lixiaojie)
     *
     * @return
     */
    @RequestMapping(value = "/getStaffIdBySession", produces = {"application/json"})
    public ReponseResult getStaffIdBySession(HttpServletRequest request) {
        Staff oldStaff = (Staff) request.getSession().getAttribute("user");
        ReponseResult<Staff> data;
        try {
            Staff staff = staffService.getStaffInfoByStaffId(oldStaff != null ? oldStaff.getStaffId() : 1);
            data = ReponseResult.ok(staff, "从session中获取用户id成功！");
            logger.info(" method:getStaffIdBySession  从session中获取用户id成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getStaffIdBySession  从session中获取用户id失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 分页获取用户信息(lixiaojie)
     *
     * @param pageNo    当前页
     * @param pageSize  每页大小
     * @param staffname 姓名
     * @param firstDate 开始时间
     * @param lastDate  结束时间
     * @param roleId    职务
     * @return
     */
    @RequestMapping(value = "/listPageGetStaffByNameAndCreateDateAndRoleId", method = RequestMethod.POST)
    public ReponseResult listPageGetStaffByNameAndCreateDateAndRoleId(Integer pageNo, Integer pageSize, String staffname, String firstDate, String lastDate, Integer roleId) {
        try {
            PageInfo<Staff> pageInfo = staffService.listPageGetStaffByNameAndCreateDateAndRoleId(pageNo, pageSize, staffname, firstDate, lastDate, roleId);
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
     * 删除用户(lixiaojie)
     */
    @RequestMapping(value = "/deleteStaffBystaffId", method = RequestMethod.POST)
    public ReponseResult deleteStaffBystaffId(Integer staffId) {
        try {
            int result = staffService.deleteStaffBystaffId(staffId);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "删除用户信息成功！");
                logger.info(" method:deleteStaffBystaffId  删除用户信息成功！");

            } else {
                date = ReponseResult.ok("0", "删除用户信息失败！");
                logger.info(" method:deleteStaffBystaffId  删除用户信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:deleteStaffBystaffId  删除用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 增加
     */
    @RequestMapping(value = "/saveStaffInfo", method = RequestMethod.POST)
    public ReponseResult saveStaffInfo(Staff staff, HttpServletRequest request) {
        try {
            Staff sessionstaff = (Staff) request.getSession().getAttribute("user");
            staff.setCreateBy(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setCreateDate(new Date());
            int result = staffService.saveStaffInfo(staff);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "增加用户信息成功！");
                logger.info(" method:saveStaffInfo  增加用户信息成功！");

            } else {
                date = ReponseResult.ok("0", "增加用户信息失败！");
                logger.info(" method:saveStaffInfo  增加用户信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:saveStaffInfo  增加用户信息失败，系统出现异常！");
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            e.printStackTrace();
            return err;
        }
    }
    /**
     * 生成验证码
     */
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            logger.error("获取验证码失败>>>> ", e);
        }
    }
    /**
     * 修改删除状态(lixiaojie)
     */
    @RequestMapping(value = "/updateStaffWhetherDel", method = RequestMethod.POST)
    public ReponseResult updateStaffWhetherDel(Integer staffId, HttpServletRequest request) {
        try {

            int result = staffService.updateStaffWhetherDel(staffId);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改用户删除状态成功！");
                logger.info(" method:updateStaffWhetherDel  修改用户删除状态成功！");

            } else {
                date = ReponseResult.ok("0", "修改用户删除状态失败！");
                logger.info(" method:updateStaffWhetherDel  修改用户删除状态失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateStaffWhetherDel  修改用户删除状态失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改用户信息(lixiaojie)
     */
    @RequestMapping(value = "/updateStaffInfo", method = RequestMethod.POST)
    public ReponseResult updateStaffInfo(Staff staff, HttpServletRequest request) {
        try {
            Staff sessionstaff = (Staff) request.getSession().getAttribute("user");
            staff.setUpdateBy(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setUpdateDate(new Date());
            int result = staffService.updateStaffInfo(staff);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改用户信息成功！");
                logger.info(" method:updateStaffInfo  修改用户信息成功！");

            } else {
                date = ReponseResult.ok("0", "修改用户信息失败！");
                logger.info(" method:updateStaffInfo  修改用户信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateStaffInfo  修改用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改用户信息并且修改图片上传（yunguohao）(lixiaojie)
     *
     * @param multipartFile 文件对象
     * @param
     * @return 保存结果updateStaff
     */
    @RequestMapping("/updateUserInfo")
    public ReponseResult updateUserInfo(Staff staff, @RequestParam("fileObj") MultipartFile multipartFile, HttpServletRequest request) {
        try {
            Staff sessionstaff = (Staff) request.getSession().getAttribute("user");
            Staff oldStaff = staffService.getStaffInfoByStaffId(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setUpdateBy(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setUpdateDate(new Date());
            staff.setStaffId(oldStaff.getStaffId());
            //判断是否有上传图片 判断multipartFile和savePath是否为null
            if (!multipartFile.isEmpty() && "a.txt".equals(multipartFile.getOriginalFilename())) {
                //如果为空则根据编号查询信息把用户之前的图片地址赋值给要修改的对象
                staff.setHeadPortraitPath(oldStaff.getHeadPortraitPath());
            } else {
                // 上传图片操作
                String uploadResult = ClientFileUploadUtil.uploadImage(multipartFile, ".jpg", ".png", ".JPG", ".PNG",".gif",".GIF");
                if (!"".equals(uploadResult)) {
                    staff.setHeadPortraitPath(uploadResult);
                    logger.info(" method:updateUserInfo  上传图片成功！");
                } else {
                    logger.info(" method:updateUserInfo  上传图片失败！");
                }
            }
            staff.setTheUserName(oldStaff.getTheUserName());
            staff.setRoleId(oldStaff.getRoleId());
            staff.setPassword(oldStaff.getPassword());
            int result = staffService.updateStaffs(staff);
            ReponseResult<String> date;
            if (result > 0) {
                date = ReponseResult.ok("1", "修改用户信息成功！");
                logger.info(" method:updateUserInfo  修改用户信息成功！");
            } else {
                date = ReponseResult.ok("0", "修改用户信息失败！");
                logger.info(" method:updateUserInfo  修改用户信息失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateUserInfo  修改用户信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 用户修改密码(lixiaojie)
     */
    @RequestMapping("/updateStaff1")
    public ReponseResult updateStaff1(Staff staff,String imgVerify,String oldPassword, HttpServletRequest request,HttpSession session) {
        ReponseResult<String> date;
        try {
            Staff sessionstaff = (Staff) request.getSession().getAttribute("user");
            staff.setStaffId(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setUpdateBy(sessionstaff != null ? sessionstaff.getStaffId() : 1);
            staff.setUpdateDate(new Date());
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random==null){
                date = ReponseResult.ok("3", "找不到验证码！");
                logger.info("method:updateStaff1  用户修改密码失败！");
                return date;
            }if (!random.equals(imgVerify)){
                date = ReponseResult.ok("3", "验证码错误！");
                logger.info("method:updateStaff1  用户修改密码失败！");
                return date;
            }
            int result = staffService.updateStaffpas(staff,oldPassword);
            if (result == 1) {
                date = ReponseResult.ok("1", "用户修改密码成功！");
                logger.info("method:updateStaff1  用户修改密码成功！");
            } else if (result == 2) {
                date = ReponseResult.ok("2", "！");
                logger.info(" method:updateStaff1  原密码错误！");
            } else {

                date = ReponseResult.ok("0", "用户修改密码失败！");
                logger.info(" method:updateStaff1  用户修改密码失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateStaff1  用户修改密码失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 登录验证（dubingkun）
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/loginCheck")
    public ReponseResult loginCheck(HttpServletRequest httpServletRequest, String username, String password) {
        ReponseResult<Integer> success;
        Staff sf = null;
        try {
            sf = staffService.loginCheck(username);
            logger.info(" method:loginCheck  获取对应用户信息成功！");
            if (sf == null) {
                success = ReponseResult.ok(-1, "用户名或密码不匹配！");
                return success;
            }
            if (!sf.getPassword().equals(EncryUtil.encrypt(password))) {
                success = ReponseResult.ok(-1, "用户名或密码不匹配！");
                return success;
            }
            httpServletRequest.getSession().setAttribute("user", sf);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(" method:loginCheck  获取对应用户信息失败，系统出现异常！");
            success = ReponseResult.ok(-1, password);
        }
        success = ReponseResult.ok(sf.getRoleId(), "验证成功！");
        return success;
    }
}
