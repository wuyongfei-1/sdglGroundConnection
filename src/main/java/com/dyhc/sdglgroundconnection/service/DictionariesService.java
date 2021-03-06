package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典业务接口
 **/
public interface DictionariesService {

    /**
     * 通过编码和编号查询字典的饮食类型信息（wuyongfei）
     *
     * @param typeCode 编码
     * @param valueId   值编号
     * @return 字典对象
     * @throws Exception 全局异常
     */
    Dictionaries getDictionariesByTypeCodeAndValueId(String typeCode, Integer valueId) throws Exception;

    /**
     * 查询所有景点相关字典信息 （wangtao）（分页）
     *
     * @param typeCode 类型编码
     * @return 返回字典信息集合
     */
    PageInfo<Dictionaries> ListDictionariesByScenicepot(String typeCode) throws Exception;

    /**
     * 根据类型编码获取所有的字典信息（wuyongfei）（不分页，所有）
     *
     * @param typeCode 类型编码
     * @return 所有的字典信息
     * @throws Exception 全局异常
     */
    List<Dictionaries> listDictionaries(String typeCode) throws Exception;

    /**
     * 根据类型编码和内容编号获取所有的字典信息（yunguohao）
     * @param typeCode 类型编码
     * @param valueid 内容编号
     * @return
     */
    String listDictionaries1(String typeCode,Integer valueid);
}
