package com.dyhc.sdglgroundconnection.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 进入页面-控制器
 **/
@Controller
@RequestMapping("/countAdjust")
public class EnterCountAdjustPageController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(EnterGeneralControlPageController.class);
    
    /**
     * 进入计调首页
     * @return
     */
    @RequestMapping("/count-Adjust-Index.html")
    public String  countAdjustIndex() {
        return "countAdjust/index/count-Adjust-Index";
    }
    /**
     * 进入管理信息
     * @return
     */
    @RequestMapping("/admin-info.html")
    public String  admininfo() {
        return "countAdjust/index/admin-info";
    }
    /**
     * 进入article-add页
     * @return
     */
    @RequestMapping("/article-add.html")
    public String  articleadd() {
        return "countAdjust/index/article-add";
    }
    /**
     * 进入article-detail页
     * @return
     */
    @RequestMapping("/article-detail.html")
    public String  articledetail() {
        return "countAdjust/index/article-detail";
    }
    /**
     * 进入article-detail页
     * @return
     */
    @RequestMapping("/article-list.html")
    public String  articlelist() {
        return "countAdjust/index/article-list";
    }
    /**
     * 进入article-detail页
     * @return
     */
    @RequestMapping("/article-list1.html")
    public String  articlelist1() {
        return "countAdjust/index/article-list1";
    }
    /**
     * 进入用車页
     * @return
     */
    @RequestMapping("/carRental_add.html")
    public String  carRentaladd() {
        return "countAdjust/index/carRental_add";
    }
    /**
     * 进入用車页
     * @return
     */
    @RequestMapping("/carRental_list.html")
    public String  carRentallist() {
        return "countAdjust/index/carRental_list";
    }
    /**
     * 进入column-danye-detail页
     * @return
     */
    @RequestMapping("/column-danye-detail.html")
    public String  columndanyedetail() {
        return "countAdjust/index/column-danye-detail";
    }
    /**
     * 进入danye-detail页
     * @return
     */
    @RequestMapping("/danye-detail.html")
    public String  danyedetail() {
        return "countAdjust/index/danye-detail";
    }
    /**
     * 进入danye-list页
     * @return
     */
    @RequestMapping("/danye-list.html")
    public String  danyelisthtml() {
        return "countAdjust/index/danye-list";
    }
    /**
     * 进入email页
     * @return
     */
    @RequestMapping("/email.html")
    public String  email() {
        return "countAdjust/index/email";
    }
    /**
     * 进入email-write页
     * @return
     */
    @RequestMapping("/email-write.html")
    public String  emailwrite() {
        return "countAdjust/index/email-write";
    }
    /**
     * 进入email-write页
     * @return
     */
    @RequestMapping("/hotel-add.html")
    public String  hoteladd() {
        return "countAdjust/index/hotel-add";
    }
    /**
     * 进入email-write页
     * @return
     */
    @RequestMapping("/hotel-list.html")
    public String  hotellist() {
        return "countAdjust/index/hotel-list";
    }
    /**
     * 进入email-write页
     * @return
     */
    @RequestMapping("/hotelroom-add.html")
    public String  hotelroomadd(HttpServletRequest request,Integer id) {
        request.setAttribute("id",id);
        return "countAdjust/index/hotelroom-add";
    }
    /**
     * 进入login页
     * @return
     */
    @RequestMapping("/login.html")
    public String  login() {
        return "countAdjust/index/login";
    }
    /**
     * 进入menu1页
     * @return
     */
    @RequestMapping("/menu1.html")
    public String  menu1() {
        return "countAdjust/index/menu1";
    }
    /**
     * 进入menu2页
     * @return
     */
    @RequestMapping("/menu2.html")
    public String  menu2() {
        return "countAdjust/index/menu2";
    }
    /**
     * 进入menu-add页
     * @return
     */
    @RequestMapping("/menu-add.html")
    public String  menuadd() {
        return "countAdjust/index/menu-add";
    }
    /**
     * 进入menu-add2页
     * @return
     */
    @RequestMapping("/menu-add2.html")
    public String  menuadd2() {
        return "countAdjust/index/menu-add2";
    }
    /**
     * 进入rbac-admin页
     * @return
     */
    @RequestMapping("/rbac-admin.html")
    public String  rbacadmin() {
        return "countAdjust/index/rbac-admin";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/rbac-user-list.html")
    public String  rbacuserlist() {
        return "countAdjust/index/rbac-user-list";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/Restaurant-add.html")
    public String  Restaurantadd() {
        return "countAdjust/index/Restaurant-add";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/Restaurant-list.html")
    public String  Restaurantlist() {
        return "countAdjust/index/Restaurant-list";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/Restaurantroom-add.html")
    public String  Restaurantroomadd() {
        return "countAdjust/index/Restaurantroom-add.html";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/shopping-list.html")
    public String  shoppinglist() {
        return "countAdjust/index/shopping-list";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/spot-add.html")
    public String  spotadd() {
        return "countAdjust/index/spot-add";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/spot-list.html")
    public String  spotlist() {
        return "countAdjust/index/spot-list";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/spotshopping-add.html")
    public String  spotshoppingadd() {
        return "countAdjust/index/spotshopping-add";
    }

    /**
     * 进入system页
     * @return
     */
    @RequestMapping("/system.html")
    public String  system() {
        return "countAdjust/index/system";
    }
    /**
     * 进入system页
     * @return
     */
    @RequestMapping("/traffic_add.html")
    public String  trafficadd() {
        return "countAdjust/index/traffic_add";
    }
    /**
     * 进入system页
     * @return
     */
    @RequestMapping("/traffic_list.html")
    public String  trafficlist() {
        return "countAdjust/index/traffic_list";
    }

    /**
     * 进入system页
     * @return
     */
    @RequestMapping("/vehicleType_add.html")
    public String  vehicleType_add() {
        return "countAdjust/index/vehicleType_add";
    }
    /**
     * 进入welcome页
     * @return
     */
    @RequestMapping("/welcome.html")
    public String  welcome() {
        return "countAdjust/index/welcome";
    }

    /**
     * 进入allScheduling页
     * @return
     */
    @RequestMapping("/allScheduling.html")
    public String  allScheduling() {
        return "countAdjust/index/allScheduling";
    }

    /**
     * 进入Quotation页
     * @return
     */
    @RequestMapping("/Quotation.html")
    public String  EnterQuotation() {
        return "countAdjust/index/Quotation";
    }

    /**
     * 进入Scheduling-detail页
     * @return
     */
    @RequestMapping("/Scheduling-detail.html")
    public String  SchedulingDetail() {
        return "countAdjust/index/Scheduling-detail";
    }

    /**
     * 进入Quotation-detail.html页
     * @return
     */
    @RequestMapping("/Quotation-detail.html")
    public String  QuotationDetail() {
        return "countAdjust/index/Quotation-detail";
    }


}
