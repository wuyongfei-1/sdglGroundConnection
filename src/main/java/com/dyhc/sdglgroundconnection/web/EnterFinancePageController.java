package com.dyhc.sdglgroundconnection.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/finance")
public class EnterFinancePageController {





    /**
     * 退出功能
     * @return 返回到登录页面
     */
    @RequestMapping("/updatePassword-info.html")
    public String updatePasswordInfo(){
        return "finance/index/updatePassword-info.html";
    }

    /**
     * 进入管理员修改个人信息页面
     * @param userId
     * @param request
     * @return
     */
    @RequestMapping("/admin-update.html")
    public String adminUpdate(String userId, HttpServletRequest request) {
        request.setAttribute("userId", userId);
        return "finance/index/admin-update";
    }

    /**
     * 进入admin-info页面
     * @return
     */
    @RequestMapping("/admin-info.html")
    public String adminInfo() {
        return "finance/index/admin-info";
    }
    /**
     * 进入计调首页
     * @return
     */
    @RequestMapping("/finance-Index.html")
    public String  financeIndex() {
        return "finance/index/finance-Index";
    }

    /**
     * 进入addQuotationInfo-add页面
     * @return
     */
    @RequestMapping("/addQuotationInfo-add.html")
    public String  addQuotationInfoAdd() {
        return "finance/index/addQuotationInfo-add";
    }

    /**
     * 进入showQuotationInfo页面
     * @return
     */
    @RequestMapping("/showQuotationInfo.html")
    public String  showQuotationInfo() {
        return "finance/index/showQuotationInfo";
    }

    /**
     * 进入showQuotationInfo页面
     * @return
     */
    @RequestMapping("/welcome.html")
    public String  Enterwelcome() {
        return "finance/index/welcome";
    }

    /**
     * 进入article-list.html页面
     * @return
     */
    @RequestMapping("/article-list.html")
    public String  articleList() {
        return "finance/index/article-list";
    }

    /**
     * 进入article-list.html页面
     * @return
     */
    @RequestMapping("/detail.html")
    public String  showQuotationdetail(Integer reportDetailId, HttpServletRequest request) {
        request.setAttribute("reportDetailId",reportDetailId);
        return "finance/index/detail";
    }

    /**
     * 进入预览图片界面
     * @return
     */
    @RequestMapping("/viewPictures.html")
    public String EnterViewPictures(HttpServletRequest request,Integer dispatchId,Integer billTypeId){
        request.setAttribute("dispatchId",dispatchId);
        request.setAttribute("billTypeId",billTypeId);
        return "finance/index/viewPictures";
    }
}
