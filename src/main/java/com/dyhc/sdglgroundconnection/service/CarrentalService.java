package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Carrental;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 汽车租赁公司业务接口
 **/
public interface CarrentalService {

    /**
     * 获取所有的汽车租赁公司信息（不分页）（wuyongfei）
     *
     * @return 汽车租赁列表
     * @throws DispatchException 调度异常
     */
    List<Carrental> listAllCarrentals() throws DispatchException;

    /**
     * 删除汽车公司(lixiaojie)
     *
     * @param carrentalId
     * @return
     */
    Integer deleteCarrentalInfoByCarrentalId(Integer carrentalId) throws Exception;


    /**
     * 更具用车公司id获取用车公司信息(lixiaojie)
     *
     * @param carrentalId
     * @return
     */
    Carrental getCarrentalInfoByCarrentalId(Integer carrentalId)throws Exception;

    /**
     * 修改用车公司信息 (lixiaojie)
     *
     * @param carrental
     * @return
     */
    Integer updateCarrentalInfo(Carrental carrental)throws Exception;

    /**
     * 从字典表获取所有车辆类型(lixiaojie)
     *
     * @return
     */
    List<Dictionaries> listDictionariesInfoByVEHICLE() throws Exception;


    /**
     * 添加用车公司信息（lixiaojie)
     *
     * @param carrental
     * @return
     */
    Integer saveCarrentalInfo(Carrental carrental)throws Exception;

    /**
     * 分页查询用车信息   （lixiaojie)
     *
     * @param pageNo        当前页
     * @param pageSize      每页大小
     * @param carRentalName 购物地点
     * @return
     */
    PageInfo<Carrental> listPageInfoByCarRentalName(Integer pageNo, Integer pageSize, String carRentalName)throws Exception;


}
