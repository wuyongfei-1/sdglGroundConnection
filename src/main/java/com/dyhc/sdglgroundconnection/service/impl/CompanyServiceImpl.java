package com.dyhc.sdglgroundconnection.service.impl;

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

    /**
     * 公司增加（yunguohao）
     * @param company
     * @return
     */
    @Override
    public int insertCompanys(Company company) {
        return companyMapper.insert(company);
    }

    /**
     * 公司修改（yunguohao）
     * @param company
     * @return
     */
    @Override
    public int updateCompanys(Company company) {
        return companyMapper.updateByPrimaryKey(company);
    }

    /**
     * 删除（yunguohao）
     * @param id
     * @return
     */
    @Override
    public int deleteCompanyByIDs(int id) {
        return companyMapper.deleteByPrimaryKey(id);
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
