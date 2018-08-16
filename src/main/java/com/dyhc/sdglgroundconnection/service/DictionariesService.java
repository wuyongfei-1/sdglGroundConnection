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
     * 查询所有景点相关字典信息 （wangtao）
     * @param typeCode 类型编码
     * @return 返回字典信息集合
     */
    PageInfo<Dictionaries> ListDictionariesByScenicepot(String typeCode) throws Exception;
}
