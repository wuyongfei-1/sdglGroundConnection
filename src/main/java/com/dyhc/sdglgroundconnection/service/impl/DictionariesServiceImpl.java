package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.DictionariesMapper;
import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.DictionariesExample;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
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
     * 通过编码和编号查询字典的饮食类型信息（wuyongfei）
     *
     * @param typeCode 编码
     * @param valueId  值编号
     * @return 字典对象
     * @throws Exception 全局异常
     */
    @Override
    public Dictionaries getDictionariesByTypeCodeAndValueId(String typeCode, Integer valueId) throws Exception {
        DictionariesExample dictionariesExample = new DictionariesExample();
        DictionariesExample.Criteria criteria = dictionariesExample.createCriteria();
        criteria.andTypecodeEqualTo(ConditionValidation.validation(typeCode) ? typeCode : "DIET");
        criteria.andValueidEqualTo(ConditionValidation.validation(valueId) ? valueId : 1);
        List<Dictionaries> dictionaries = dictionariesMapper.selectByExample(dictionariesExample);
        return (dictionaries != null && dictionaries.size() > 0) ? dictionaries.get(0) : null;
    }

    /**
     * 根据类型编号查询相关字典信息 （wangtao）
     *
     * @param typeCode 类型编码
     * @return 返回字典信息集合
     */
    @Override
    public PageInfo<Dictionaries> ListDictionariesByScenicepot(String typeCode) throws Exception {
        List<Dictionaries> dictionariesList = dictionariesMapper.ListDictionariesByScenicspot(typeCode);
        PageInfo<Dictionaries> pageInfo = new PageInfo<>(dictionariesList);
        return pageInfo;
    }

    /**
     * 根据类型编码获取对应的所有字典信息（wuyongfei）（不分页，所有）
     *
     * @param typeCode 类型编码
     * @return 对应的所有字典信息
     * @throws Exception 全局异常
     */
    @Override
    public List<Dictionaries> listDictionaries(String typeCode) throws Exception {
        DictionariesExample dictionariesExample = new DictionariesExample();
        DictionariesExample.Criteria criteria = dictionariesExample.createCriteria();
        criteria.andTypecodeEqualTo(typeCode);
        return dictionariesMapper.selectByExample(dictionariesExample);
    }

    /**
     * 根据类型编码获取对应的所有字典信息（wuyongfei）（不分页，所有）
     *
     * @param typeCode 类型编码
     * @param valueid 内容编号
     * @return 对应的所有字典信息
     */
    @Override
    public String listDictionaries1(String typeCode, Integer valueid) {
        DictionariesExample dictionariesExample=new DictionariesExample();
        DictionariesExample.Criteria criteria=dictionariesExample.createCriteria();
        criteria.andTypecodeEqualTo(typeCode);
        criteria.andValueidEqualTo(valueid);
        List<Dictionaries> dictionariesList=dictionariesMapper.selectByExample(dictionariesExample);
        String typecode="";
        if(dictionariesList!=null){
            typeCode=dictionariesList.get(0).getValueContent1();
        }
        return typeCode;
    }

}
