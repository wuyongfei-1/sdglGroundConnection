package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.CarrentalMapper;
import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.mapper.VehicleTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.CarrentalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 汽车租赁公司业务实现
 **/
@Service
public class CarrentalServiceImpl implements CarrentalService {

    @Autowired
    private CarrentalMapper carrentalMapper;

    @Autowired
    private VehicleTypeMapper vehicleTypeMapper;
    @Autowired
    private DictionariesMapper dictionariesMapper;

    /**
     * 从字典表查出车辆公司信息(ixiaojie)
     * @return
     * @throws Exception
     */
    @Override
    public List<Dictionaries> listDictionariesInfoByVEHICLE() throws Exception {
        return dictionariesMapper.listDictionariesByTypeCode("VEHICLE");
    }

    /**
     * 添加车辆公司信息（lixiaojie)
     * @param carrental
     * @return
     */
    @Override
    public Integer saveCarrentalInfo(Carrental carrental, String vehicleTypes) {

        Integer result=carrentalMapper.insertUseGeneratedKeys(carrental);
        if (result!=0 && !"".equals(vehicleTypes)){

            String[] arr = vehicleTypes.split(","); // 用,分割
            int[] types = new int[arr.length];
            for(int i=0; i<types.length; i++){
                types[i] = Integer.parseInt(arr[i]);
            }
            Dictionaries dictionaries=new Dictionaries();
            for(int i=0; i<types.length; i++){
                dictionaries=  dictionariesMapper.selectByPrimaryKey(types[i]);
                VehicleType vehicleType=new VehicleType();
                vehicleType.setCarRentalId(result);
                vehicleType.setTypeName(dictionaries.getValueContent1());
            }



        }
        return result;
    }

    /**
     * 分页查询用车信息   （lixiaojie)
     * @param pageNo    当前页
     * @param pageSize  每页大小
     * @param carRentalName 购物地点
     * @return
     */
    @Override
    public PageInfo<Carrental> listPageInfoByCarRentalName(Integer pageNo, Integer pageSize, String carRentalName) {
        PageHelper.startPage(pageNo, pageSize, true);
        CarrentalExample carrentalExample=new CarrentalExample();
        CarrentalExample.Criteria criteria=carrentalExample.createCriteria();
        criteria.andCarrentalnameLike("%"+carRentalName+"%");

        criteria.andWhetherdelEqualTo(0);
        List<Carrental> carrentalList =carrentalMapper.selectByExample(carrentalExample);

        for (Carrental carrental: carrentalList) {
            carrental.setVehicleTypes(vehicleTypeMapper.getVehiclesTypeByCarRentalId(carrental.getCarRentalId()));
        }
        PageInfo<Carrental> pageInfo =new PageInfo<>(carrentalList);

        return pageInfo;
    }


}
