package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公司信息
 **/
@Mapper
@Component
public interface CompanyMapper extends CommonMapper<Company>{
    /**
     * 公司按名字查询(yunguohao)
     * @param company
     * @return
     */
    List<Company> selectCompanyName(Company company) throws Exception;

    /**
     * 公司删除（yunguohao）
     * @param companyid
     * @return
     */
    int deleteCompany(int companyid);
}
