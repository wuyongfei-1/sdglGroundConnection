package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DispatchhotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.pojo.DispatchhotelExample;
import com.dyhc.sdglgroundconnection.service.DispatchhotelService;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.dyhc.sdglgroundconnection.service.RoomTypeService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店业务实现
 **/
@Service
public class DispatchhotelServiceImpl implements DispatchhotelService {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private DispatchhotelMapper dispatchhotelMapper;

    @Autowired
    private RoomTypeService roomTypeService;

    /**
     * 根据调度表编号查询调度酒店信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度酒店对象
     */
    @Override
    public List<Dispatchhotel> getDispatchhotelInfoByDispatchId(Integer dispatchId) throws Exception {
        List<Dispatchhotel> dispatchhotelList=null;
        if(ConditionValidation.validation(dispatchId)==true){
            DispatchhotelExample dispatchhotelExample=new DispatchhotelExample();
            DispatchhotelExample.Criteria criteria=dispatchhotelExample.createCriteria();
            criteria.andOfferidEqualTo(dispatchId);
            dispatchhotelExample.setOrderByClause("weight asc");
            dispatchhotelList=dispatchhotelMapper.selectByExample(dispatchhotelExample);
            for (Dispatchhotel dispatchhote1: dispatchhotelList) {
                dispatchhote1.setHotel(hotelService.selectHotelById(dispatchhote1.getHotelId()));
                dispatchhote1.setRoomType(roomTypeService.getTypeId(Integer.parseInt(dispatchhote1.getValue1())));
            }
        }

        return dispatchhotelList;
    }

    /**
     * 批量添加多条调度酒店信息（wuyongfei）
     *
     * @param dispatchhotelList 调度酒店列表
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    @Override
    @RecordOperation(type = "调度酒店", desc = "添加了一条酒店信息")
    public Integer saveDispatchhotelInfo(List<Dispatchhotel> dispatchhotelList) throws DispatchException {
        return dispatchhotelMapper.insertList(dispatchhotelList);
    }

    /**
     * 新增调度酒店信息 （wangtao）
     * @param dispatchhotel 调度酒店对象
     * @return 受影响行数
     * @throws DispatchException
     */
    @Override
    public Integer insertDispatchhotelInfo(Dispatchhotel dispatchhotel) throws DispatchException {
        dispatchhotel.setWhetherDel(0);
        dispatchhotel.setCreationDate(new Date());
        return dispatchhotelMapper.insert(dispatchhotel);
    }
}
