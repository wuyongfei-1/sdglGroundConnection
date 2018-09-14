package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.AccountType;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户类型业务接口
 **/
public interface AccountTypeService {

    /**
     * 公司名字查询（yunguohao）
     * @param pageNo
     * @param PageSize
     * @return
     * @throws Exception
     */
    PageInfo<AccountType> listAccountType(Integer pageNo, Integer PageSize, AccountType accountType) throws Exception;
    /**
     * 增加（yunguohao）
     */
    int insertaccountType(AccountType accountType);
    /**
     * 修改（yunguohao）
     */
    int updateAccountType(AccountType accountType);
    /**
     * 删除（yunguohao）
     */
    int deleteAccountTypeByIDs(int accountTypeId);

    /**
     * id查询（yunguohao）
     * @param id
     * @return
     */
    AccountType selectAccountTypeByIds(int id);
}
