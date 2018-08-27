package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.OfferParam;
import com.dyhc.sdglgroundconnection.exception.OfferException;
import com.dyhc.sdglgroundconnection.mapper.OfferMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 报价信息业务实现
 **/
@Service
@Transactional
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferMapper offerMapper;

    @Autowired
    private OffercarService offercarService;
    @Autowired
    private OfferHotelService offerHotelService;
    @Autowired
    private OfferscenicService offerscenicService;
    @Autowired
    private OfferrestaurantService offerrestaurantService;
    @Autowired
    private OfferotherService offerotherService;
    @Autowired
    private OfferlineService offerlineService;

    @Autowired
    private TravelService travelService;

    @Autowired
    private DictionariesService dictionariesService;

    /**
     * 通过报价编号查询详细的报价信息（wuyongfei）
     *
     * @param offerId 报价编号
     * @return 报价对象
     * @throws OfferException 报价异常
     */
    @Override
    public Offer getOfferByOfferId(Integer offerId) throws OfferException {
        Offer offer = offerMapper.selectByPrimaryKey(offerId);
        // 查询组团社名称
        Travel travel = travelService.selectTravelByIds(offer.getTravelId());
        offer.setTravelName(travel.getTravelName());
        // 查询用车信息
        List<Offercar> offercars = offercarService.listOffercarByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        offer.setOffercar((offercars != null && offercars.size() > 0) ? offercars.get(0) : null);
        // 查询酒店信息
        List<OfferHotel> offerHotels = offerHotelService.listOfferHotelByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        offer.setOfferHotelList(offerHotels);
        // 查询线路信息
        List<Offerline> offerlines = offerlineService.listOfferlineByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        offer.setOfferlineList(offerlines);
        // 查询其他详细信息
        List<Offerother> offerothers = offerotherService.listOfferotherByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        offer.setOfferother((offerothers != null && offerothers.size() > 0)
                ? offerothers.get(0) : null);
        // 查询餐馆信息
        List<Offerrestaurant> offerrestaurants = offerrestaurantService.listOfferrestaurantByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        try {
            for (Offerrestaurant offerrestaurant : offerrestaurants) {
                Integer dictionariesId = offerrestaurant.getDictionariesId();
                Dictionaries diet = dictionariesService.getDictionariesByTypeCodeAndValueId("DIET", dictionariesId);
                offerrestaurant.setDictionaries(diet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        offer.setOfferrestaurantList(offerrestaurants);
        // 查询景点信息
        List<Offerscenic> offerscenics = offerscenicService.listOfferscenicByOfferId((offer != null)
                ? offer.getOfferId() : 1);
        offer.setOfferscenicList(offerscenics);
        return offer;
    }

    @Override
    @Transactional
    @RecordOperation(type = "报价", desc = "添加了一条报价信息")
    public Integer insertOffer(OfferParam offerParam) throws OfferException {
        Offercar offercar = offerParam.getOffercar();//用车报价信息
        List<OfferHotel> listOfferHotel = offerParam.getListOfferHotel();//酒店报价信息
        List<Offerscenic> listOfferscenic = offerParam.getListOfferscenic();//景点报价信息
        List<Offerrestaurant> listOfferrestaurant = offerParam.getListOfferrestaurant();//餐厅报价信息
        Offerother offerother = offerParam.getOfferother();//其它报价信息
        List<Offerline> listOfferline = offerParam.getListOfferline();//线路报价信息
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(df.format(day));
        Offer offer = offerParam.getOffer();
        int a = offerMapper.insert(offer);
        int maxOfferId = offerMapper.getIntegerByOfferId();//获取最新添加的offerid
        //用车
        if (offercar != null) {
            offercar.setOfferId(maxOfferId);
            offercar.setWhetherDel(0);
            offercar.setTypeCode("VEHICLE");
            offercarService.insertOffercar(offercar);
        }
        //酒店
        if (listOfferHotel != null && listOfferHotel.size() > 0) {
            for (OfferHotel item : listOfferHotel) {
                item.setOfferId(maxOfferId);
                item.setWhetherDel(0);
            }
            offerHotelService.insertOfferHotel(listOfferHotel);
        }
        //景点
        if (listOfferscenic != null && listOfferscenic.size() > 0) {
            for (Offerscenic item : listOfferscenic) {
                item.setOfferId(maxOfferId);
                item.setWhetherDel(0);
            }
            offerscenicService.insertOfferscenic(listOfferscenic);
        }
        //餐馆
        if (listOfferrestaurant != null && listOfferrestaurant.size() > 0) {
            for (Offerrestaurant item : listOfferrestaurant) {
                item.setOfferId(maxOfferId);
                item.setTypeCode("DIET");
                item.setWhetherDel(0);
            }
            offerrestaurantService.insertOfferrestaurant(listOfferrestaurant);
        }
        //其它
        if (offerother != null) {
            offerother.setOfferId(maxOfferId);
            offerother.setWhetherDel(0);
            offerotherService.insertOfferother(offerother);
        }
        //线路
        if (listOfferline != null && listOfferline.size() > 0) {
            for (Offerline item : listOfferline) {
                item.setOfferId(maxOfferId);
                item.setWhetherDel(0);
            }
            offerlineService.insertOfferline(listOfferline);
        }


        return a;
    }

    @Override
    @RecordOperation(type = "报价", desc = "修改了一条报价信息")
    public Integer updateOffer(Offer offer) throws OfferException {
        return offerMapper.updateByPrimaryKey(offer);
    }

    @Override
    public Integer getIntegerByOfferId() {
        return offerMapper.getIntegerByOfferId();
    }

    @Override
    public PageInfo<Offer> listOffer(Integer pageNo, Integer PageSize)throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        List<Offer> list=offerMapper.selectAll();
        for (Offer item:list) {
            List<Offerline> offerlines=offerlineService.listOfferlineByOfferId(item.getOfferId());
            item.setOfferlineList(offerlines);
        }
        PageInfo<Offer> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
