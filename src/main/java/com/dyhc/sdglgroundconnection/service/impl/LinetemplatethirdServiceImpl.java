package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.LinetemplatethirdMapper;
import com.dyhc.sdglgroundconnection.pojo.Linetemplatethird;
import com.dyhc.sdglgroundconnection.pojo.LinetemplatethirdExample;
import com.dyhc.sdglgroundconnection.service.LinetemplatethirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板与线路模板关系 业务实现
 **/
@Service
public class LinetemplatethirdServiceImpl implements LinetemplatethirdService {

    @Autowired
    private LinetemplatethirdMapper linetemplatethirdMapper;

    /**
     * 根据总线路编号查询线路模板关系表信息 （wangtao）
     * @param lineId 总线路编号
     * @return 返回关系表集合
     */
    @Override
    public List<Linetemplatethird> listLinetemplatethirdByLineId(Integer lineId) throws Exception {
        LinetemplatethirdExample linetemplatethirdExample=new LinetemplatethirdExample();
        LinetemplatethirdExample.Criteria criteria=linetemplatethirdExample.createCriteria();
        criteria.andLineidEqualTo(lineId);
        linetemplatethirdExample.setOrderByClause("weight");
        List<Linetemplatethird> linetemplatethirdList=linetemplatethirdMapper.selectByExample(linetemplatethirdExample);
        return linetemplatethirdList;
    }

    /**
     * 根据总线路编号删除线路模板关系表信息 （wangtao）
     * @param lineId 总线路编号
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "模板关系表信息",desc = "删除多条模板关系表信息")
    public Integer deleteLinetemplatethirdByLineId(Integer lineId) throws Exception {
        LinetemplatethirdExample linetemplatethirdExample=new LinetemplatethirdExample();
        LinetemplatethirdExample.Criteria criteria=linetemplatethirdExample.createCriteria();
        criteria.andLineidEqualTo(lineId);
        return linetemplatethirdMapper.deleteByExample(linetemplatethirdExample);
    }

    /**
     * 新增第三方表信息（给总线路模板添加模板） （wangtao）
     * @param linetemplatethird 第三方表信息对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "模板关系表信息",desc = "新增一条模板关系表信息")
    public Integer insertLinetemplatethirdInfo(Linetemplatethird linetemplatethird) throws Exception {
        linetemplatethird.setCreateby(1);
        linetemplatethird.setCreatedate(new Date());
        linetemplatethird.setWeight(getWeight(linetemplatethird.getLineid()));
        return linetemplatethirdMapper.insert(linetemplatethird);
    }


    /**
     * 根据总线路表编号和模板编号删除第三方表信息（给总线路模板删除模板） （wangtao）
     * @param linetemplatethirdId 第三方表信息参数对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "模板关系表信息",desc = "删除一条模板关系表信息")
    public Integer deleteLinetemplatethirdInfo(Integer linetemplatethirdId) throws Exception {
        return linetemplatethirdMapper.deleteByPrimaryKey(linetemplatethirdId);
    }

    /**
     * 根据模板编号删除第三方表信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    public Integer deleteLinetemplatethirdInfoByTemplateId(Integer templateId) throws Exception {
        LinetemplatethirdExample linetemplatethirdExample=new LinetemplatethirdExample();
        LinetemplatethirdExample.Criteria criteria=linetemplatethirdExample.createCriteria();
        criteria.andTemplateidEqualTo(templateId);
        return linetemplatethirdMapper.deleteByExample(linetemplatethirdExample);
    }

    /**
     * 获取当前权重 （wangtao）
     * @param lineId 模板编号
     * @return 返回当前权重
     */
    @Override
    public Integer getWeight(Integer lineId)throws Exception {
        Integer weight=linetemplatethirdMapper.getMaxWeightByLineId(lineId);
        if(weight==null){
            weight=1;
        }else{
            weight=weight+1;
        }
        return weight;
    }


}
