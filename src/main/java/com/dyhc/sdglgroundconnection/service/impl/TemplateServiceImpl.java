package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.dto.TemplateParam;
import com.dyhc.sdglgroundconnection.mapper.TemplateMapper;
import com.dyhc.sdglgroundconnection.pojo.*;
import com.dyhc.sdglgroundconnection.service.*;
import com.dyhc.sdglgroundconnection.utils.ConditionValidation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板业务实现
 **/
@Service
@Transactional
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper templateMapper;

    @Autowired
    private StaffService staffService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private TemplateHotelService templateHotelService;

    @Autowired
    private TemplateScenicspotService templateScenicspotService;

    @Autowired
    private LinetemplatethirdService linetemplatethirdService;


    /**
     * 新增模板信息 （wangtao）
     * @param template 模板对象
     * @return 返回模板集合
     */
    @Override
    @RecordOperation(type = "模板信息",desc = "添加一条模板信息")
    @Transactional
    public Integer insertTemplateInfo(Template template)throws Exception {
        //新增时给一些默认的参数赋值
        template.setCreater(1);
        template.setCreationDate(new Date());
        template.setWhetherDel(0);
        Integer result=templateMapper.insertUseGeneratedKeys(template);
        Integer id=templateMapper.selectMaxId();
        //新增时给模板酒店信息一些默认的参数赋值
        template.getTemplateHotel().setCreater(1);
        template.getTemplateHotel().setCreationDate(new Date());
        template.getTemplateHotel().setWhetherDel(0);
        template.getTemplateHotel().setTemplateId(id);
        //新增时给模板景点信息一些默认的参数赋值
        for (TemplateScenicspot templateScenicspot: template.getTemplateScenicspotList()) {
            templateScenicspot.setCreater(1);
            templateScenicspot.setCreationDate(new Date());
            templateScenicspot.setWhetherDel(0);
            templateScenicspot.setTemplateId(id);
        }
        //新增模板酒店信息
        Integer result1=templateHotelService.insertTemplateHotelInfo(template.getTemplateHotel());
        //新增模板景点信息（有可能传一个List或者多个对象，循环List调用新增方法）
        for (TemplateScenicspot ts: template.getTemplateScenicspotList()) {
            Integer result2=templateScenicspotService.insertTemplateScenicspit(ts);
        }
        return result;
    }

    /**
     * 查询所有模板信息 （wangtao）
     * @return 返回模板集合
     * @throws Exception
     */
    @Override
    public List<Template> listAllTemplate() throws Exception {
        List<Template> templateList=templateMapper.selectAll();
        for (Template t: templateList) {
            //给每个模板的模板景点、模板酒店集合进行赋值
            t.setTemplateHotel(templateHotelService.getTemplateHotelInfoByTemplateId(t.getTemplateId()));
            t.setTemplateScenicspotList(templateScenicspotService.listTemplateScenicspotByTemplateId(t.getTemplateId()));
            t.setStaff(staffService.getStaffInfoByStaffId(t.getCreater()));
        }
        return templateList;
    }

    /**
     * 根据条件查询模板信息并分页 （wangtao）
     * @param templateParam 参数对象
     * @return 返回模板集合
     */
    @Override
    public PageInfo<Template> listTemplateByConditions(TemplateParam templateParam) throws Exception{
        //进行分页
        PageHelper.startPage(templateParam.getPage(), templateParam.getLimit(), true);
        //创建查询条件对象
        TemplateExample templateExample=new TemplateExample();
        TemplateExample.Criteria criteria=templateExample.createCriteria();
        //判断参数是否为空
        if(ConditionValidation.validation(templateParam.getTemplateName())){
            //如果不为空则把参数放入条件对象
            criteria.andTemplatenameLike("%"+templateParam.getTemplateName()+"%");
        }
        //使用mapper控件的查询方法把条件对象放入方法中进行条件查询
        List<Template> templateList=templateMapper.selectByExample(templateExample);
        //循环模板集合获取模板的模板景点信息和模板酒店信息
        for (Template t: templateList) {
            //给每个模板的模板景点、模板酒店集合进行赋值
            t.setTemplateHotel(templateHotelService.getTemplateHotelInfoByTemplateId(t.getTemplateId()));
            t.setTemplateScenicspotList(templateScenicspotService.listTemplateScenicspotByTemplateId(t.getTemplateId()));
            t.setStaff(staffService.getStaffInfoByStaffId(t.getCreater()));
        }
        PageInfo<Template> pageInfo = new PageInfo<>(templateList);
        return pageInfo;
    }

    @Override
    public Template listTemplateByTemplateId(Integer templateId) throws Exception {
        Template template=templateMapper.selectByPrimaryKey(templateId);
        template.setTemplateHotel(templateHotelService.getTemplateHotelInfoByTemplateId(template.getTemplateId()));
        template.setTemplateScenicspotList(templateScenicspotService.listTemplateScenicspotByTemplateId(template.getTemplateId()));
        return template;
    }

    /**
     * 根据模板编号查询模板信息 （wangtao）
     * @param templateId 模板编号
     * @return 返回模板对象
     */
    @Override
    public Template getTemplateByTemplateId(Integer templateId) throws Exception{
        //根据模板编号查询模板信息
        Template template=templateMapper.selectByPrimaryKey(templateId);
        //根据模板编号查询模板酒店信息并赋值
        template.setTemplateHotel(templateHotelService.getTemplateHotelInfoByTemplateId(templateId));
        //根据模板酒店的酒店编号查询酒店信息并赋值
        Hotel hotel=hotelService.selectHotelById(template.getTemplateHotel().getHotelId());
        template.getTemplateHotel().setHotel(hotel);
        //根据模板编号查询模板景点信息并赋值
        template.setTemplateScenicspotList(templateScenicspotService.listTemplateScenicspotByTemplateId(templateId));
        return template;
    }

    /**
     * 修改模板信息并修改相应模板下的模板酒店和模板景点信息 （wangtao）
     * @param template 参数模板对象
     * @return 返回受影响行数
     */
    @Override
    @Transactional
    @RecordOperation(type = "模板信息",desc = "修改了一条模板信息")
    public Integer updateTemplateInfo(Template template) throws Exception{
        //调用templateHotelService的update方法
        template.getTemplateHotel().setModifier(1);
        template.getTemplateHotel().setModifiedData(new Date());
        TemplateHotel templateHotel=templateHotelService.getTemplateHotelInfoByTemplateHotelId(template.getTemplateHotel().getTemplateHotelId());
        template.getTemplateHotel().setCreater(templateHotel.getCreater());
        template.getTemplateHotel().setCreationDate(templateHotel.getCreationDate());
        template.getTemplateHotel().setWhetherDel(templateHotel.getWhetherDel());
        template.getTemplateHotel().setTemplateId(templateHotel.getTemplateId());
        templateHotelService.updateTemplateHotel(template.getTemplateHotel());
        //调用templateScenicspotService的update方法
        //根据模板编号删除景点模板信息
        templateScenicspotService.deleteTemplateScenicspotByTemplateId(template.getTemplateId());
        //循环TemplateScenicspot集合调用新增景点信息
        for (TemplateScenicspot t : template.getTemplateScenicspotList()) {
            t.setCreater(1);
            t.setCreationDate(new Date());
            t.setTemplateId(template.getTemplateId());
            t.setWhetherDel(0);
            templateScenicspotService.insertTemplateScenicspit(t);
        }
        //根据模板编号查询模板信息并给模板对象赋值
        Template template1=templateMapper.selectByPrimaryKey(template.getTemplateId());
        template.setCreater(template1.getCreater());
        template.setCreationDate(template1.getCreationDate());
        template.setWhetherDel(template1.getWhetherDel());
        template.setModifier(1);
        template.setModifiedData(new Date());
        //修改模板
        Integer result=templateMapper.updateByPrimaryKey(template);
        return result;
    }


    /**
     * 根据模板编号删除模板并删除模板相关的模板酒店、景点信息
     * @param templateId 模板编号
     * @return 受影响行数
     * @throws Exception
     */
    @Override
    @Transactional
    @RecordOperation(type = "模板信息",desc = "删除了一条模板信息")
    public Integer deleteTemplateInfo(Integer templateId) throws Exception {
        //删除模板酒店表数据
        templateHotelService.deleteTemplateHotelByTemplateId(templateId);
        //删除模板景点表数据
        templateScenicspotService.deleteTemplateScenicspotByTemplateId(templateId);
        linetemplatethirdService.deleteLinetemplatethirdInfoByTemplateId(templateId);
        //删除模板表数据
        Integer result=templateMapper.deleteByPrimaryKey(templateId);
        return result;
    }


}
