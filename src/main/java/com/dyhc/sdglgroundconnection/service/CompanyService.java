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

    /**
     * 公司名字查询（yunguohao）
     * @param pageNo
     * @param PageSize
     * @return
     * @throws Exception
     */
    PageInfo<Company> listCompany(Integer pageNo, Integer PageSize,Company company) throws Exception;

    /**
     * 增加（yunguohao）
     */
    int insertCompanys(Company Company);
    /**
     * 修改（yunguohao）
     */
    int updateCompanys(Company Company);
    /**
     * 删除（yunguohao）
     */
    int deleteCompanyByIDs(int id);

    /**
     * id查询（yunguohao）
     * @param id
     * @return
     */
    Company selectCompanyByIds(int id);
}
