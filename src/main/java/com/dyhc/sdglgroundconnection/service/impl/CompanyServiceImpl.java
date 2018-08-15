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

    @Override
    public PageInfo<Company> listCompany(Integer pageNo, Integer PageSize) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Company> pageInfo = new PageInfo<>(companyMapper.selectAll());
        return pageInfo;
    }
}
