package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.LineTemplateParam;
import com.dyhc.sdglgroundconnection.mapper.LinetemplateMapper;
import com.dyhc.sdglgroundconnection.pojo.Linetemplate;
import com.dyhc.sdglgroundconnection.pojo.LinetemplateExample;
import com.dyhc.sdglgroundconnection.pojo.Linetemplatethird;
import com.dyhc.sdglgroundconnection.pojo.Template;
import com.dyhc.sdglgroundconnection.service.LinetemplateService;
import com.dyhc.sdglgroundconnection.service.LinetemplatethirdService;
import com.dyhc.sdglgroundconnection.service.TemplateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 总线路模板 业务实现
 **/
@Service
public class LinetemplateServiceImpl implements LinetemplateService {

    @Autowired
    private LinetemplateMapper linetemplateMapper;

    @Autowired
    private LinetemplatethirdService linetemplatethirdService;

    @Autowired
    private TemplateService templateService;

    /**
     * 查询所有总线路模板信息  （wangtao）
     * @return 返回总线路模板集合
     */
    @Override
    public List<Linetemplate> listAllLinetemplateInfo() throws Exception {
        return linetemplateMapper.selectAll();
    }

    /**
     * 根据条件查询总线路模板信息并进行分页  （wangtao）
     * @param lineTemplateParam 总线路模板信息参数对象
     * @return 返回总线路模板信息集合
     */
    @Override
    public PageInfo<Linetemplate> listLinetemplateInfoByLinename(LineTemplateParam lineTemplateParam)throws Exception {
        //进行分页
        PageHelper.startPage(lineTemplateParam.getPage(), lineTemplateParam.getLimit(), true);
        LinetemplateExample linetemplateExample=new LinetemplateExample();
        LinetemplateExample.Criteria criteria=linetemplateExample.createCriteria();
        criteria.andLinenameLike("%"+lineTemplateParam.getLinename()+"%");
        List<Linetemplate> linetemplateList=linetemplateMapper.selectByExample(linetemplateExample);
        //循环总线路集合并根据总线路编号查询第三方表获取模板信息编号
        for(Linetemplate linetemplate:linetemplateList){
            List<Linetemplatethird> linetemplatethirdList=linetemplatethirdService.listLinetemplatethirdByLineId(linetemplate.getLineid());
            List<Template> templateList=new ArrayList<Template>();
            //循环第三方表集合根据第三方表的模板编号查询模板信息对象并把对象添加到总线路表中模板集合
            for (Linetemplatethird linetemplatethird:linetemplatethirdList){
                Template template=templateService.getTemplateByTemplateId(linetemplatethird.getTemplateid());
                template.setThirdid(linetemplatethird.getThirdid());
                templateList.add(template);
            }
            linetemplate.setTemplateList(templateList);
        }
        PageInfo<Linetemplate> pageInfo=new PageInfo<>(linetemplateList);
        return pageInfo;
    }

    /**
     * 根据总线路模板编号查询总线路模板信息  （wangtao）
     * @param lineId 总线路模板编号
     * @return 返回总线路模板对象
     */
    @Override
    public Linetemplate getLinetemplateBylineId(Integer lineId) throws Exception {
        Linetemplate linetemplate=linetemplateMapper.selectByPrimaryKey(lineId);
        List<Linetemplatethird> linetemplatethirdList=linetemplatethirdService.listLinetemplatethirdByLineId(linetemplate.getLineid());
        List<Template> templateList=new ArrayList<Template>();
        //循环第三方表集合根据第三方表的模板编号查询模板信息对象并把对象添加到总线路表中模板集合
        for (Linetemplatethird linetemplatethird:linetemplatethirdList){
            Template template=templateService.getTemplateByTemplateId(linetemplatethird.getTemplateid());
            templateList.add(template);
        }
        linetemplate.setTemplateList(templateList);
        return linetemplate;
    }

    /**
     * 新增总线路模板信息  （wangtao）
     * @param linetemplate 总线路模板参数对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "总线路模板信息",desc = "新增一条总线路模板信息")
    public Integer insertLinetemplateInfo(Linetemplate linetemplate) throws Exception {
        linetemplate.setCreateby(1);
        linetemplate.setCreatetime(new Date());
        return linetemplateMapper.insert(linetemplate);
    }

    /**
     * 修改总线路模板信息  （wangtao）
     * @param linetemplate 总线路模板参数对象
     * @return 返回受影响行数
     */
    @Override
    @RecordOperation(type = "总线路模板信息",desc = "修改一条总线路模板信息")
    public Integer updateLinetemplateInfo(Linetemplate linetemplate) throws Exception {
        Linetemplate linetemplate1=getLinetemplateBylineId(linetemplate.getLineid());
        linetemplate.setCreateby(linetemplate1.getCreateby());
        linetemplate.setCreatetime(linetemplate1.getCreatetime());
        linetemplate.setUpdateby(1);
        linetemplate.setUpdatetime(new Date());
        return linetemplateMapper.updateByPrimaryKey(linetemplate);
    }

    /**
     * 根据总线路模板编号删除总线路模板信息  （wangtao）
     * @param lineId 总线路模板编号
     * @return 返回受影响行数
     */
    @Override
    @Transactional
    @RecordOperation(type = "总线路模板信息",desc = "删除一条总线路模板信息")
    public Integer deleteLinetemplateInfoBylineId(Integer lineId) throws Exception {
        linetemplatethirdService.deleteLinetemplatethirdByLineId(lineId);
        Integer result=linetemplateMapper.deleteByPrimaryKey(lineId);
        return result;
    }
}
