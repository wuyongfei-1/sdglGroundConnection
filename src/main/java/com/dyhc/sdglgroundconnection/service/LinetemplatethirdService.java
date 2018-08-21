package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Linetemplatethird;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板与线路模板关系业务接口
 **/
public interface LinetemplatethirdService {

    /**
     * 根据总线路编号查询线路模板关系表信息 （wangtao）
     * @param lineId 总线路编号
     * @return 返回关系表集合
     */
    List<Linetemplatethird> listLinetemplatethirdByLineId(Integer lineId) throws Exception;

    /**
     * 根据总线路编号删除线路模板关系表信息 （wangtao）
     * @param lineId 总线路编号
     * @return 返回受影响行数
     */
    Integer deleteLinetemplatethirdByLineId(Integer lineId) throws Exception;

    /**
     * 新增第三方表信息（给总线路模板添加模板） （wangtao）
     * @param linetemplatethird 第三方表信息对象
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer insertLinetemplatethirdInfo(Linetemplatethird linetemplatethird) throws Exception;

    /**
     * 根据第三方表编号删除第三方表信息（给总线路模板删除模板） （wangtao）
     * @param linetemplatethirdId 第三方表信息参数对象
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer deleteLinetemplatethirdInfo(Integer linetemplatethirdId) throws Exception;

    /**
     * 根据模板编号删除第三方表信息
     * @param templateId 模板编号
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer deleteLinetemplatethirdInfoByTemplateId(Integer templateId)throws Exception;

    /**
     * 获取权重 （wangtao）
     * @param lineId 模板编号
     * @return 返回权重
     */
    Integer getWeight(Integer lineId)throws Exception;
}
