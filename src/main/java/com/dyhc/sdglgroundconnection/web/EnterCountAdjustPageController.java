package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.RoomType;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 进入页面-控制器
 **/
@Controller
@RequestMapping("/countAdjust")
public class EnterCountAdjustPageController {
    @Autowired
    private RoomTypeService roomTypeService;
    @Autowired
    private HotelService hotelService;

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(EnterGeneralControlPageController.class);

    /**
     * 进入计调首页
     *
     * @return
     */
    @RequestMapping("/count-Adjust-Index.html")
    public String countAdjustIndex() {
        return "countAdjust/index/count-Adjust-Index";
    }

    /**
     * 进入管理信息
     *
     * @return
     */
    @RequestMapping("/admin-info.html")
    public String admininfo(String staffId, HttpServletRequest request) {
        request.setAttribute("staffId", staffId);
        return "countAdjust/index/admin-info";
    }

    /**
     * 进入article-add页
     *
     * @return
     */
    @RequestMapping("/article-add.html")
    public String articleadd() {
        return "countAdjust/index/article-add";
    }

    /**
     * 进入article-detail页
     *
     * @return
     */
    @RequestMapping("/article-detail.html")
    public String articledetail() {
        return "countAdjust/index/article-detail";
    }

    /**
     * 进入article-detail页
     *
     * @return
     */
    @RequestMapping("/article-list.html")
    public String articlelist() {
        return "countAdjust/index/article-list";
    }

    /**
     * 进入article-detail页
     *
     * @return
     */
    @RequestMapping("/article-list1.html")
    public String articlelist1() {
        return "countAdjust/index/article-list1";
    }

    /**
     * 进入用車页
     *
     * @return
     */
    @RequestMapping("/carrental-add.html")
    public String carRentaladd() {
        return "countAdjust/index/carrental-add";
    }

    /**
     * 进入用車页
     *
     * @return
     */
    @RequestMapping("/carrental-list.html")
    public String carRentallist() {
        return "countAdjust/index/carrental-list";
    }

    /**
     * 进入用車页
     *
     * @return
     */
    @RequestMapping("/carrental-update.html")
    public String carRentalUpdate(String carrentalId, HttpServletRequest request) {
        request.setAttribute("carrentalId", carrentalId);
        return "countAdjust/index/carrental-update";
    }

    /**
     * 进入column-danye-detail页
     *
     * @return
     */
    @RequestMapping("/column-danye-detail.html")
    public String columndanyedetail() {
        return "countAdjust/index/column-danye-detail";
    }

    /**
     * 进入danye-detail页
     *
     * @return
     */
    @RequestMapping("/danye-detail.html")
    public String danyedetail() {
        return "countAdjust/index/danye-detail";
    }

    /**
     * 进入danye-list页
     *
     * @return
     */
    @RequestMapping("/danye-list.html")
    public String danyelisthtml() {
        return "countAdjust/index/danye-list";
    }

    /**
     * 进入email页
     *
     * @return
     */
    @RequestMapping("/email.html")
    public String email() {
        return "countAdjust/index/email";
    }

    /**
     * 进入email-write页
     *
     * @return
     */
    @RequestMapping("/email-write.html")
    public String emailwrite() {
        return "countAdjust/index/email-write";
    }

    /**
     * 进入email-write页
     *
     * @return
     */
    @RequestMapping("/hotel-add.html")
    public String hoteladd(HttpServletRequest request, Integer pan, Integer hotelId) {
        Hotel hotel = null;
        //修改
        if (pan != 0) {
            try {
                hotel = hotelService.selectHotelById(hotelId);
                hotelId = hotel.getHotelId();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("ht", hotel);
        request.setAttribute("pan", pan);
        request.setAttribute("hotelId", hotelId);
        return "countAdjust/index/hotel-add";
    }

    /**
     * 进入email-write页
     *
     * @return
     */
    @RequestMapping("/hotel-list.html")
    public String hotellist() {
        return "countAdjust/index/hotel-list";
    }

    /**
     * 进入email-write页（dubingkun）
     *
     * @return
     */
    @RequestMapping("/hotelroom-add.html")
    public String hotelroomadd(HttpServletRequest request, Integer pan, Integer hotelId, Integer typeId) {
        RoomType roomType = null;
        //修改
        if (pan != 0) {
            try {
                roomType = roomTypeService.getTypeId(typeId);
                hotelId = roomType.getHotelId();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("rt", roomType);
        request.setAttribute("pan", pan);
        request.setAttribute("hotelId", hotelId);
        request.setAttribute("typeId", typeId);
        return "countAdjust/index/hotelroom-add";
    }

    /**
     * 进入login页
     *
     * @return
     */
    @RequestMapping("/login.html")
    public String login() {
        return "countAdjust/index/login";
    }

    /**
     * 进入menu1页
     *
     * @return
     */
    @RequestMapping("/menu1.html")
    public String menu1() {
        return "countAdjust/index/menu1";
    }

    /**
     * 进入menu2页
     *
     * @return
     */
    @RequestMapping("/menu2.html")
    public String menu2() {
        return "countAdjust/index/menu2";
    }

    /**
     * 进入menu-add页
     *
     * @return
     */
    @RequestMapping("/menu-add.html")
    public String menuadd() {
        return "countAdjust/index/menu-add";
    }

    /**
     * 进入menu-add2页
     *
     * @return
     */
    @RequestMapping("/menu-add2.html")
    public String menuadd2() {
        return "countAdjust/index/menu-add2";
    }

    /**
     * 进入rbac-admin页
     *
     * @return
     */
    @RequestMapping("/rbac-admin.html")
    public String rbacadmin() {
        return "countAdjust/index/rbac-admin";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/rbac-user-list.html")
    public String rbacuserlist() {
        return "countAdjust/index/rbac-user-list";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/Restaurant-add.html")
    public String Restaurantadd(Integer type, HttpServletRequest request) {
        // 将类型存放到作用域中
        request.setAttribute("type", type);
        return "countAdjust/index/Restaurant-add";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/Restaurant-list.html")
    public String Restaurantlist() {
        return "countAdjust/index/Restaurant-list";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/Restaurantroom-add.html")
    public String Restaurantroomadd(Integer type, Integer restaurantId, Integer valueId, HttpServletRequest request) {
        request.setAttribute("type", type); // 将类型编号
        request.setAttribute("restaurantId", restaurantId); // 餐馆编号
        request.setAttribute("valueId", valueId);   // 字典编号
        return "countAdjust/index/Restaurantroom-add.html";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/shopping-list.html")
    public String shoppinglist() {
        return "countAdjust/index/shopping-list";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/spot-add.html")
    public String spotadd(@RequestParam("id") String id, HttpServletRequest request) {
        request.setAttribute("id", id);
        return "countAdjust/index/spot-add";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/spot-add1.html")
    public String spotadd1() {
        return "countAdjust/index/spot-add";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/spot-list.html")
    public String spotlist() {
        return "countAdjust/index/spot-list";
    }

    /**
     * 进入rbac-user-list页
     *
     * @return
     */
    @RequestMapping("/spotshopping-add1.html")
    public String spotshoppingadd1(@RequestParam("Spotid") Integer Spotid, HttpServletRequest request) {
        if (Spotid != null && Spotid != 0) {
            request.setAttribute("Spotid", Spotid);
        }
        return "countAdjust/index/spotshopping-add";
    }

    /**
     * 跳转修改购物信息页面  （wangtao）
     *
     * @param shoppingId 购物点编号
     * @param request    request对象
     * @return 返回页面
     */
    @RequestMapping("/spotshopping-add2.html")
    public String spotshoppingadd2(@RequestParam("shoppingId") Integer shoppingId, HttpServletRequest request) {
        request.setAttribute("shoppingId", shoppingId);
        return "countAdjust/index/spotshopping-add";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/system.html")
    public String system() {
        return "countAdjust/index/system";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/traffic_add.html")
    public String trafficadd() {
        return "countAdjust/index/traffic_add";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/traffic_list.html")
    public String trafficlist() {
        return "countAdjust/index/traffic_list";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/vehicletype-add.html")
    public String vehicletypeAdd(String carrentalId, HttpServletRequest request) {
        request.setAttribute("carrentalId", carrentalId);
        return "countAdjust/index/vehicletype-add";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/vehicletype-update.html")
    public String vehicletypeUpdate(String vehicleTypeId, String carRentalId, HttpServletRequest request) {
        request.setAttribute("vehicleTypeId", vehicleTypeId);
        request.setAttribute("carRentalId", carRentalId);
        return "countAdjust/index/vehicletype-update";
    }

    /**
     * 进入welcome页
     *
     * @return
     */
    @RequestMapping("/welcome.html")
    public String welcome() {
        return "countAdjust/index/welcome";
    }

    /**
     * 进入allScheduling页
     *
     * @return
     */
    @RequestMapping("/allScheduling.html")
    public String allScheduling() {
        return "countAdjust/index/allScheduling";
    }

    /**
     * 进入Quotation页
     *
     * @return
     */
    @RequestMapping("/Quotation.html")
    public String EnterQuotation() {
        return "countAdjust/index/Quotation";
    }

    /**
     * 进入Scheduling-detail页
     *
     * @return
     */
    @RequestMapping("/Scheduling-detail.html")
    public String SchedulingDetail() {
        return "countAdjust/index/Scheduling-detail";
    }

    /**
     * 进入Quotation-detail.html页
     *
     * @return
     */
    @RequestMapping("/Quotation-detail.html")
    public String QuotationDetail() {
        return "countAdjust/index/Quotation-detail";
    }

    /**
     * 进入Quotation-detail.html页
     *
     * @return
     */
    @RequestMapping("/shopping-add.html")
    public String shoppingAdd() {
        return "countAdjust/index/shopping-add";
    }

    /**
     * 进入system页
     *
     * @return
     */
    @RequestMapping("/shopping-update.html")
    public String staffUpdate(String shoppingId, HttpServletRequest request) {
        request.setAttribute("shoppingId", shoppingId);
        return "countAdjust/index/shopping-update";
    }

    /**
     * 进入savetemplate.html页面
     * @return
     */
    @RequestMapping("/savetemplate.html")
    public String saveTemplate(){
        return "countAdjust/index/savetemplate";
    }

    /**
     * 进入savetemplate.html页面
     * @return
     */
    @RequestMapping("/savetemplate1.html")
    public String saveTemplate1(@RequestParam("templateId")Integer templateId,HttpServletRequest request){
        request.setAttribute("templateId",templateId);
        return "countAdjust/index/savetemplate";
    }

    /**
     * 进入line-template.html页面
     * @return
     */
    @RequestMapping("/line-template.html")
    public String lineTemplate(){
        return "countAdjust/index/line-template";
    }

    /**
     * 进入总线路模板列表页面 （wangtao）
     * @return
     */
    @RequestMapping("/LineTemplate_list.html")
    public String tolineTemplateList(){
        return  "countAdjust/index/LineTemplate_list";
    }

    /**
     * 进入总线路模板列表页面 （wangtao）
     * @return
     */
    @RequestMapping("/LineTemplate_add.html")
    public String tolineTemplateadd(){
        return  "countAdjust/index/LineTemplate_add";
    }

    /**
     * 进入总线路模板列表页面 （wangtao）
     * @return
     */
    @RequestMapping("/LineTemplate_add1.html")
    public String tolineTemplateadd1(@RequestParam("lineTemplateId")Integer lineTemplateId,HttpServletRequest request){
        request.setAttribute("lineTemplateId",lineTemplateId);
        return  "countAdjust/index/LineTemplate_add";
    }

    @RequestMapping("/template_add.html")
    public String toTemplateadd(@RequestParam("lineid")Integer lineid,HttpServletRequest request){
        request.setAttribute("lineid",lineid);
        return "countAdjust/index/template_add";
    }

    @RequestMapping("/showTemplate.html")
    public String toShowTemplate(@RequestParam("templateid")Integer templateId,HttpServletRequest request){
        request.setAttribute("templateid",templateId);
        return "countAdjust/index/showTemplate";
    }

}
