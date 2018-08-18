package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.TemplateHotelMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.TemplateHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板酒店业务实现
 **/
@Service
public class TemplateHotelServiceImpl implements TemplateHotelService {

    @Autowired
    private TemplateHotelMapper templateHotelMapper;

    /**
     * 新增模板酒店表信息 （wangtao）
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板酒店信息",desc = "新增一条模板酒店信息")
    public Integer insertTemplateHotelInfo(TemplateHotel templateHotel) throws Exception {
        return templateHotelMapper.insert(templateHotel);
    }

    /**
     * 根据模板编号查询模板酒店信息 （wangtao）
     * @param TemaplateId 模板编号
     * @return 返回模板酒店对象
     */
    @Override
    public TemplateHotel getTemplateHotelInfoByTemplateId(Integer TemaplateId) throws Exception {
        List<TemplateHotel> templateHotelList=null;
        TemplateHotel templateHotel=null;
        TemplatehotelExample templatehotelExample=new TemplatehotelExample();
        TemplatehotelExample.Criteria criteria=templatehotelExample.createCriteria();
        criteria.andTemplateidEqualTo(TemaplateId);
        templateHotelList=templateHotelMapper.selectByExample(templatehotelExample);
        if(templateHotelList.size()>0){
            templateHotel=templateHotelList.get(0);
        }
        return templateHotel;
    }

    /**
     * 修改模板酒店信息 （wangtao）
     * @param templateHotel 模板对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板酒店",desc = "修改了一条模板酒店信息")
    public Integer updateTemplateHotel(TemplateHotel templateHotel) throws Exception {
        return templateHotelMapper.updateByPrimaryKey(templateHotel);
    }

    /**
     * 根据模板酒店编号查询模板酒店信息
     * @param TemplateHotelId 模板酒店编号
     * @return 返回模板酒店对象
     */
    @Override
    public TemplateHotel getTemplateHotelInfoByTemplateHotelId(Integer TemplateHotelId) throws Exception {
        return templateHotelMapper.selectByPrimaryKey(TemplateHotelId);
    }

    /**
     * 根据模板编号删除模板酒店表信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板酒店",desc = "删除了一条模板酒店信息")
    public Integer deleteTemplateHotelByTemplateId(Integer templateId) throws Exception {
        TemplatehotelExample templatehotelExample=new TemplatehotelExample();
        // 拼接条件
        TemplatehotelExample.Criteria criteria = templatehotelExample.createCriteria();
        criteria.andTemplateidEqualTo(templateId);
        // 删除该模板下的模板酒店信息
        Integer result=templateHotelMapper.deleteByExample(templatehotelExample);
        return result;
    }

    /**
     * 根据模板酒店编号删除模板酒店信息
     * @param templateHotelId 模板酒店编号
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板酒店",desc = "删除了一条模板酒店信息")
    public Integer deleteTemplateHotelByTemplateHotelId(Integer templateHotelId) throws Exception {
        return templateHotelMapper.deleteByPrimaryKey(templateHotelId);
    }


}
