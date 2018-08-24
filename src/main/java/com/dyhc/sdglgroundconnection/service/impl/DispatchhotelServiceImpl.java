package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.DispatchhotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Dispatchhotel;
import com.dyhc.sdglgroundconnection.pojo.DispatchhotelExample;
import com.dyhc.sdglgroundconnection.service.DispatchhotelService;
import com.dyhc.sdglgroundconnection.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 根据调度表编号查询调度酒店信息 （wangtao）
     * @param dispatchId 调度表编号
     * @return 返回调度酒店对象
     */
    @Override
    public List<Dispatchhotel> getDispatchhotelInfoByDispatchId(Integer dispatchId) {
        DispatchhotelExample dispatchhotelExample=new DispatchhotelExample();
        DispatchhotelExample.Criteria criteria=dispatchhotelExample.createCriteria();
        criteria.andOfferidEqualTo(dispatchId);
        List<Dispatchhotel> dispatchhotelList=dispatchhotelMapper.selectByExample(dispatchhotelExample);
        for (Dispatchhotel dispatchhote1: dispatchhotelList) {
            dispatchhote1.setHotel(hotelService.selectHotelById(dispatchhote1.getHotelId()));
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
}
