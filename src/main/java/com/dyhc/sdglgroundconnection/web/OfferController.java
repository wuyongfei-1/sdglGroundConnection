package com.dyhc.sdglgroundconnection.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.dto.OfferTravelParam;
import com.dyhc.sdglgroundconnection.dto.PreviewOfferParam;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.dyhc.sdglgroundconnection.utils.MySessionContext;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.Line;
import java.util.*;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价酒店 控制层
 **/
@RestController
@RequestMapping("/offer")
public class OfferController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(OfferController.class);

    @Autowired
    private OfferService offerService;
    @Autowired
    private TemplateService templateService;
    @Autowired
    private LinetemplatethirdService linetemplatethirdService;
    @Autowired
    private LinetemplateService linetemplateService;
    @Autowired
    private ScenicspotService scenicspotService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private DictionariesService dictionariesService;
    @Autowired
    private TravelService travelService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private OffercarService offercarService;
    @Autowired
    private OfferHotelService offerHotelService;
    @Autowired
    private OfferscenicService offerscenicService;
    @Autowired
    private OfferotherService offerotherService;
    @Autowired
    private OfferlineService offerlineService;
    @Autowired
    private OfferrestaurantService offerrestaurantService;

    /**
     * 获取报价详细信息（wuyongfei）
     *
     * @param offerId 报价编号
     * @return 响应结果
     */
    @GetMapping("/offer/detail/{id}.html")
    public ReponseResult getOfferInfoById(@PathVariable("id") Integer offerId) {
        try {
            Offer offer = offerService.getOfferByOfferId(offerId);
            logger.info(" method:getOfferInfoById  根据编号获取报价信息成功！");
            return ReponseResult.ok(offer, "获取报价信息成功！");
        } catch (OfferException e) {
            logger.error(" method:getOfferInfoById  根据编号获取报价信息失败！");
            e.printStackTrace();
            return ReponseResult.err("获取报价信息失败！");
        }
    }

    /**
     * 添加报价页面初始化信息（dubingkun）
     *
     * @return
     */
    @GetMapping("/listAllShow")
    public ReponseResult listAllShow() {
        try {
            //查询所有线路名称
            List<Linetemplate> linetemplates = linetemplateService.listAllLinetemplateInfo();
            //查询所有当日行程
            List<Template> templates = templateService.listAllTemplate();
            //查询所有景点
            List<Scenicspot> scenicspotList = scenicspotService.listScenicspot();
            //查询所有酒店
            List<Hotel> hotelList = hotelService.listByaHotel();
            //查询所有饭菜类型
            List<Dictionaries> dictionariesList = dictionariesService.listDictionaries("DIET");
            //查询所有车队类型
            List<Dictionaries> dictionariesList2 = dictionariesService.listDictionaries("VEHICLE");
            //查询组团社信息
            List<Travel> travels = travelService.listAllTravels();
            List list = new ArrayList();
            list.add(linetemplates);
            list.add(templates);
            list.add(scenicspotList);
            list.add(hotelList);
            list.add(dictionariesList);
            list.add(dictionariesList2);
            list.add(travels);
            return ReponseResult.ok(list, "获取报价页面初始信息成功！");
        } catch (Exception e) {
            logger.error(" method:updateHotel  获取线路失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return ReponseResult.err("获取报价页面初始信息失败！");
        }
    }

    /**
     * 根据模板id查询详细信息（dubingkun）
     *
     * @param templateId
     * @return
     */
    @GetMapping("/listAllByTemplateId")
    public ReponseResult listAllByTemplateId(Integer templateId) {
        try {
            Template template = templateService.listTemplateByTemplateId(templateId);
            return ReponseResult.ok(template, "获取当前行程详情成功！");
        } catch (Exception e) {
            logger.error(" method:updateHotel  获取当前行程失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据线路id查询所有信息（dubingkun）
     *
     * @return
     */
    @GetMapping("/listAllByLineId")
    public ReponseResult selectAll(Integer lineId) {
        try {
            //根据选择的线路id查询所有线路相关信息
            List<Linetemplatethird> linetemplatethirds = linetemplatethirdService.listLinetemplatethirdByLineId(lineId);
            //行程单
            Map<Integer, Template> hashMap = new HashMap<Integer, Template>();
            //根据模板编号查询出相关想信息
            for (Linetemplatethird item : linetemplatethirds) {
                //查询详细模板详情
                Template template = templateService.listTemplateByTemplateId(item.getTemplateid());
                hashMap.put(item.getWeight(), template);
            }
            return ReponseResult.ok(hashMap, "查询线路详情成功！");
        } catch (Exception e) {
            logger.error(" method:updateHotel  获取线路失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 存储预览报价信息（dubingkun）
     *
     * @param httpServletRequest
     * @param jsonObject
     * @return
     */
    @RequestMapping("/previewOffer")
    public ReponseResult previewOffer(HttpServletRequest httpServletRequest, @RequestBody JSONObject jsonObject) {
        try {
            ReponseResult<String> date;
            httpServletRequest.getSession().setAttribute("str", jsonObject);
            date = ReponseResult.ok("预览报价成功！");
            logger.info(" method:updateHotel  预览报价成功！");
            return date;
        } catch (Exception e) {
            logger.error(" method:updateHotel  预览报价失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 读取预览报价信息（dubingkun）
     *
     * @param callback
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/previewInfoOffer")
    public ReponseResult previewInfoOffer(String callback, HttpServletRequest httpServletRequest) {
        try {
            httpServletRequest.setAttribute("id", 1);
            JSONObject jsonObject = null;
            jsonObject = (JSONObject) httpServletRequest.getSession().getAttribute("str");
            String s = JSON.toJSONString(jsonObject);
            ObjectMapper objectMapper = new ObjectMapper();
            PreviewOfferParam previewOfferParam = objectMapper.readValue(s, PreviewOfferParam.class);
            for (OfferTravelParam item :
                    previewOfferParam.getList()) {
                Integer id = Integer.parseInt(item.getZsdh());//获取酒店id
                Hotel hotel = hotelService.selectHotelById(id);
                item.setZsdh(hotel.getPhone());
            }
            Staff staff = (Staff) httpServletRequest.getSession().getAttribute("user");
            if (staff != null) {
                //发件人信息
                previewOfferParam.setStr21(staff.getStaffname());//姓名
                previewOfferParam.setStr22(staff.getPhone());//电话
            }
            //收件人信息
            Travel travel = travelService.selectTravelByIds(previewOfferParam.getOffer().getTravelId());
            previewOfferParam.setStr11(travel.getTravelName());//组团社名称
            previewOfferParam.setStr12(travel.getPersonName());//负责人
            previewOfferParam.setStr13(travel.getPersonPost());//职位

            ReponseResult<PreviewOfferParam> ok = ReponseResult.ok(previewOfferParam, "系统出现异常！");
            logger.info(" method:updateHotel  添加报价成功！");
            return ok;
        } catch (Exception e) {
            logger.error(" method:updateHotel  添加报价失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    @RequestMapping("/insertOffer")
    public ReponseResult insertOffer(HttpServletRequest httpServletRequest,@RequestBody JSONObject jsonObject) {
        try {
            String s = JSON.toJSONString(jsonObject);
            ObjectMapper objectMapper = new ObjectMapper();
            OfferParam offerParam = objectMapper.readValue(s, OfferParam.class);
            ReponseResult<String> date = null;
            //创建人
            Staff staff=(Staff) httpServletRequest.getSession().getAttribute("user");
            int result = offerService.insertOffer(staff,offerParam);
            if (result > 0) {
                date = ReponseResult.ok("添加报价成功！");
                logger.info(" method:updateHotel  添加报价成功！");
            } else {
                date = ReponseResult.ok("添加报价失败！");
                logger.info(" method:updateHotel  添加报价失败！");
            }
            return date;
        } catch (Exception e) {
            logger.error(" method:updateHotel  添加报价失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 查询所有报价单及线路详情（dubingkun）
     *
     * @return
     */
    @GetMapping("/listAllOfferInfo")
    public ReponseResult listAllOfferInfo(Integer pageNo, Integer pageSize) {
        try {

            PageInfo<Offer> pageInfo = offerService.listOffer(pageNo, pageSize);
            ReponseResult<List> data = ReponseResult.ok(pageInfo.getList(), pageInfo.getTotal(), "分页获取报价成功！");
            logger.info(" method:listAllOfferInfo  获取报价成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:listAllOfferInfo  获取报价失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据id获取组团社名称
     *
     * @param travelId
     * @return
     */
    @GetMapping("/getTravel")
    public ReponseResult getTravel(Integer travelId) {
        try {
            Travel travel = travelService.selectTravelByIds(travelId);
            ReponseResult<Travel> data = ReponseResult.ok(travel, "获取组团社名称成功！");
            logger.info(" method:getTravel  获取组团社名称成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getTravel  获取组团社名称失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据报价编号查看报价详情（dubingkun）
     * @param offerId
     * @return
     */
    @RequestMapping("/getOfferByOfferId")
    public ReponseResult getOfferByOfferId(Integer offerId) {
        try {
            Offer offer = offerService.getOfferByOfferId(offerId);//获取报价信息
            Map<String,List> map=new HashMap<String,List>();
            Integer day=offer.getOfferlineList().size();
            for (Integer i=1;i<=day;i++){
                List list=new ArrayList();
                Offerline offerline=null;
                for(Offerline item:offer.getOfferlineList()){
                    if(item.getWeight()==i){
                        offerline=item;
                        break;
                    }
                }
                list.add(offerline);
                OfferHotel offerHotel=null;
                for (OfferHotel item :offer.getOfferHotelList()) {
                    if(item.getWeight()==i){
                        //酒店
                        offerHotel=item;
                        break;
                    }
                }
                list.add(offerHotel);
                List list1=new ArrayList();
                for (Offerscenic item : offer.getOfferscenicList()) {
                    if(item.getWeight()==i){
                        //景点
                        list1.add(item);
                    }
                }
                list.add(list1);
                Offerrestaurant offerrestaurant = null;
                Offerrestaurant offerrestaurant1=null;
                for (Offerrestaurant item:offer.getOfferrestaurantList()){
                    if(item.getWeight()==i){
                        if(item.getHavemealsdate()==2){
                            //午餐
                            offerrestaurant=item;
                        }else if(item.getHavemealsdate()==3){
                            //晚餐
                           offerrestaurant1=item;
                        }
                    }
                }
                list.add(offerrestaurant);
                list.add(offerrestaurant1);
                map.put(i.toString(),list);
            }
            //报价用车
            List listcar=new ArrayList();
            listcar.add(offer.getOffercar());
            //报价其它
            List listother=new ArrayList();
            listother.add(offer.getOfferother());
            List list=new ArrayList();
            offer.setOfferlineList(null);
            offer.setOffercar(null);
            offer.setOfferHotelList(null);
            offer.setOfferother(null);
            offer.setOfferrestaurantList(null);
            offer.setOfferscenicList(null);
            list.add(offer);
            map.put("-1",list);
            map.put("-2",listcar);
            map.put("-3",listother);
            ReponseResult<Map<String,List>> data = ReponseResult.ok(map,"获取报价信息成功！");
            logger.info(" method:getOfferByOfferId  获取报价信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:getOfferByOfferId  获取报价信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 删除报价单信息（dubingkun）
     * @param id
     * @return
     */
    @RequestMapping("/deleteOffer")
    public ReponseResult deleteOffer(Integer id){
        try {
            ReponseResult<String> data=null;
            Integer result=offerService.deleteOffer(id);
            if(result>0){
                data = ReponseResult.ok("删除报价信息成功！");
            }else{
                data = ReponseResult.ok("删除报价信息失败！");
            }
            logger.info(" method:deleteOffer  删除报价信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteOffer  删除报价信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 根据id改变报价单状态
     * @param id
     * @param value1
     * @return
     */
    @RequestMapping("/updateOfferValue1")
    public ReponseResult updateOfferValue1(Integer id,String value1){
        try {
            ReponseResult<String> data=null;
            Integer result=offerService.updateOfferValue1(id,value1);
            if(result>0){
                data = ReponseResult.ok("修改报价信息成功！");
            }else{
                data = ReponseResult.ok("修改报价信息失败！");
            }
            logger.info(" method:deleteOffer  修改报价信息成功！");
            return data;
        } catch (Exception e) {
            logger.error(" method:deleteOffer  修改报价信息失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
}
