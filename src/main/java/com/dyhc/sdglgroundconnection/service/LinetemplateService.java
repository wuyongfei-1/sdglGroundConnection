package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.LineTemplateParam;
import com.dyhc.sdglgroundconnection.pojo.Linetemplate;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板业务接口
 **/
public interface LinetemplateService {

    /**
     * 查询所有总线路模板信息 （wangtao）
     * @return 返回总线路模板集合
     */
    List<Linetemplate> listAllLinetemplateInfo() throws Exception;

    /**
     * 根据条件查询总线路模板信息并进行分页 （wangtao）
     * @param lineTemplateParam 总线路模板信息参数对象
     * @return 返回总线路模板信息集合
     */
    PageInfo<Linetemplate> listLinetemplateInfoByLinename(LineTemplateParam lineTemplateParam)throws Exception;

    /**
     * 根据总线路模板编号查询总线路模板信息 （wangtao）
     * @param lineId 总线路模板编号
     * @return 返回总线路模板对象
     */
    Linetemplate getLinetemplateBylineId(Integer lineId) throws Exception;

    /**
     * 新增总线路模板信息 （wangtao）
     * @param linetemplate 总线路模板参数对象
     * @return 返回受影响行数
     */
    Integer insertLinetemplateInfo(Linetemplate linetemplate) throws Exception;

    /**
     * 修改总线路模板信息 （wangtao）
     * @param linetemplate 总线路模板参数对象
     * @return 返回受影响行数
     */
    Integer updateLinetemplateInfo(Linetemplate linetemplate) throws Exception;

    /**
     * 根据总线路模板编号删除总线路模板信息 （wangtao）
     * @param lineId 总线路模板编号
     * @return 返回受影响行数
     */
    Integer deleteLinetemplateInfoBylineId(Integer lineId) throws Exception;
}
