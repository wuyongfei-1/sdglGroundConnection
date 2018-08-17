package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典
 **/
@Mapper
@Component
public interface DictionariesMapper extends CommonMapper<Dictionaries>{
    /**
     * 查询所有景点类型字典信息 wangtao
     * @param typeCode 类型编码
     * @return 返回字典集合
     */
    List<Dictionaries> ListDictionariesByScenicspot(@Param("typeCode") String typeCode) throws Exception;


    /**
     *  根据typeCode查询所有字典表类型    （lixiaojie) 可共用
     */
    List<Dictionaries> listDictionariesByTypeCode(@Param("typeCode") String typeCode) throws Exception;
}
