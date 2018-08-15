package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Company;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公司信息业务接口
 **/
public interface CompanyService {
    PageInfo<Company> listCompany(Integer pageNo, Integer PageSize) throws Exception;
}
