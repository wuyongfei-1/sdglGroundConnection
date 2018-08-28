package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.mapper.CarrentalMapper;
import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.mapper.VehicleTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.CarrentalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
     * 获取所有的汽车租赁公司信息（不分页）（wuyongfei）
     *
     * @return 汽车租赁列表
     * @throws DispatchException 调度异常
     */
    @Override
    public List<Carrental> listAllCarrentals() throws DispatchException {
        return carrentalMapper.selectAll();
    }

    /**
     * 根据用车公司id删除 用车信息（lixiaojie)
     *
     * @param carrentalId
     * @return
     */
    @Override
    @RecordOperation(type = "租车公司", desc = "删除了一条租车公司信息")
    public Integer deleteCarrentalInfoByCarrentalId(Integer carrentalId) {
        Carrental carrental = carrentalMapper.selectByPrimaryKey(carrentalId);
        carrental.setWhetherDel(1);
        int result = carrentalMapper.updateByPrimaryKey(carrental);
        List<VehicleType> vehicleTypes = vehicleTypeMapper.getVehiclesTypeByCarRentalId(carrentalId);
        for (VehicleType vehicleType : vehicleTypes) {
            vehicleType.setWhetherDel(1);
            result = vehicleTypeMapper.updateByPrimaryKey(vehicleType);
        }
        return result;
    }

    /**
     * 根据用车公司获取用车公司信息（lixiaojie)
     *
     * @param carrentalId
     * @return
     */
    @Override
    public Carrental getCarrentalInfoByCarrentalId(Integer carrentalId) {
        return carrentalMapper.selectByPrimaryKey(carrentalId);
    }

    /**
     * 修改租车公司信息(lixiaojie)
     *
     * @param carrental
     * @return
     */
    @Override
    @RecordOperation(type = "租车公司", desc = "修改了一条租车公司信息")
    public Integer updateCarrentalInfo(Carrental carrental) {

        Carrental oldCarrental=carrentalMapper.selectByPrimaryKey(carrental.getCarRentalId());
        carrental.setCreateBy(oldCarrental.getCreateBy());
        carrental.setCreateDate(oldCarrental.getCreateDate());
        carrental.setWhetherDel(0);
        return carrentalMapper.updateByPrimaryKey(carrental);
    }

    /**
     * 从字典表查出车辆公司信息(lixiaojie)
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Dictionaries> listDictionariesInfoByVEHICLE() throws Exception {
        return dictionariesMapper.listDictionariesByTypeCode("VEHICLE");
    }

    /**
     * 添加车辆公司信息（lixiaojie)
     *
     * @param carrental
     * @return
     */
    @Override
    @RecordOperation(type = "租车公司", desc = "新增了一条租车公司信息")
    public Integer saveCarrentalInfo(Carrental carrental) {
        carrental.setWhetherDel(0);
        Integer result = carrentalMapper.insert(carrental);
        return result;
    }

    /**
     * 分页查询用车信息   （lixiaojie)
     *
     * @param pageNo        当前页
     * @param pageSize      每页大小
     * @param carRentalName 购物地点
     * @return
     */
    @Override
    public PageInfo<Carrental> listPageInfoByCarRentalName(Integer pageNo, Integer pageSize, String carRentalName) {

        PageHelper.startPage(pageNo, pageSize, true);
        CarrentalExample carrentalExample = new CarrentalExample();
        CarrentalExample.Criteria criteria = carrentalExample.createCriteria();
        criteria.andCarrentalnameLike("%" + carRentalName + "%");
        criteria.andWhetherdelEqualTo(0);
        List<Carrental> carrentalList = carrentalMapper.selectByExample(carrentalExample);

        VehicletypeExample vehicletypeExample=new VehicletypeExample();
        VehicletypeExample.Criteria vehicletypeExampleCriteria=vehicletypeExample.createCriteria();
        vehicletypeExampleCriteria.andWhetherdelEqualTo(0);
        List<VehicleType> list2=vehicleTypeMapper.selectByExample(vehicletypeExample);


        for (Carrental carrental : carrentalList) {

            List<VehicleType> a=new ArrayList<>();
            for (VehicleType v:list2){
                if (v.getCarRentalId()==carrental.getCarRentalId()){
                    DictionariesExample dictionariesExample=new DictionariesExample();
                    DictionariesExample.Criteria dictionariesExampleCriteria=dictionariesExample.createCriteria();
                    dictionariesExampleCriteria.andValueidEqualTo(v.getValueId());
                    dictionariesExampleCriteria.andTypecodeEqualTo("VEHICLE");
                    v.setDictionaries(dictionariesMapper.selectByExample(dictionariesExample).get(0));
                    a.add(v);
                }
            }
            carrental.setVehicleTypes(a);
        }


       /* for (Carrental carrental : carrentalList) {
            carrental.setVehicleTypes(vehicleTypeMapper.getVehiclesTypeByCarRentalId(carrental.getCarRentalId()));
        }*/
        PageInfo<Carrental> pageInfo = new PageInfo<>(carrentalList);

        return pageInfo;
    }


}
