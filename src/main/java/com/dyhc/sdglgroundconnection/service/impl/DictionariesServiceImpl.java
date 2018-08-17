package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典业务实现
 **/
@Service
public class DictionariesServiceImpl implements DictionariesService {

    @Autowired
    private DictionariesMapper dictionariesMapper;

    /**
     * 查询所有景点相关字典信息 （wangtao）
     * @param typeCode 类型编码
     * @return 返回字典信息集合
     */
    @Override
    public PageInfo<Dictionaries> ListDictionariesByScenicepot(String typeCode) throws Exception {
        List<Dictionaries> dictionariesList=dictionariesMapper.ListDictionariesByScenicspot(typeCode);
        PageInfo<Dictionaries> pageInfo=new PageInfo<>(dictionariesList);
        return pageInfo;
    }






}
