package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.CompanyMapper;
import com.dyhc.sdglgroundconnection.pojo.Company;
import com.dyhc.sdglgroundconnection.service.CompanyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公司信息业务实现
 **/
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    /**
     *公司名字查询（yunguohao）
     * @param pageNo
     * @param PageSize
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<Company> listCompany(Integer pageNo, Integer PageSize,Company company) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Company> pageInfo = new PageInfo<>(companyMapper.selectCompanyName(company));
        return pageInfo;
    }

    @Override
    public Company getcompany() {
        return companyMapper.getcompany();
    }


    /**
     * 公司增加（yunguohao）
     * @param company
     * @return
     */
    @Override
    @RecordOperation(type = "公司", desc = "添加了一条公司信息")
    public int insertCompanys(Company company) {
        company.setWhetherDel(0);
        return companyMapper.insert(company);
    }
    /**
     * 公司修改（yunguohao）
     * @param company
     * @return
     */
    @Override
    @RecordOperation(type = "公司", desc = "修改了一条公司信息")
    public int updateCompanys(Company company) {
        Company offcompany=companyMapper.selectByPrimaryKey(company.getCompanyId());
        company.setModifier(company.getModifier());
        company.setModifiedData(company.getModifiedData());
        company.setCreater(offcompany.getCreater());
        company.setCreationDate(offcompany.getCreationDate());
        company.setWhetherDel(0);
        return companyMapper.updateByPrimaryKey(company);
    }

    /**
     * 删除（yunguohao）
     * @param companyid
     * @return
     */
    @Override
    @RecordOperation(type = "公司", desc = "删除了一条公司信息")
    public int deleteCompanyByIDs(int companyid) {
        return companyMapper.deleteCompany(companyid);
    }

    /**
     * id查询（yunguohao）
     * @param id
     * @return
     */
    @Override
    public Company selectCompanyByIds(int id) {
        return companyMapper.selectByPrimaryKey(id);
    }
}
