package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.AccountTypeMapper;
import com.dyhc.sdglgroundconnection.pojo.AccountType;
import com.dyhc.sdglgroundconnection.service.AccountTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户类型业务实现
 **/
@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    private AccountTypeMapper accountTypeMapper;

    @Override
    public PageInfo<AccountType> listAccountType(Integer pageNo, Integer PageSize, AccountType accountType) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<AccountType> pageInfo = new PageInfo<>(accountTypeMapper.selectAccountTypeName(accountType));
        return pageInfo;
    }

    @Override
    @RecordOperation(type = "公司账户", desc = "添加了一条公司信息")
    public int insertaccountType(AccountType accountType) {
        accountType.setWhetherDel(0);
        return accountTypeMapper.insert(accountType);
    }

    @Override
    @RecordOperation(type = "公司账户", desc = "修改了一条公司信息")
    public int updateAccountType(AccountType accountType) {
        AccountType offcompany=accountTypeMapper.selectByPrimaryKey(accountType.getAccountTypeId());

        return accountTypeMapper.updateByPrimaryKey(accountType);
    }

    @Override
    @RecordOperation(type = "公司账户", desc = "删除了一条公司信息")
    public int deleteAccountTypeByIDs(int accountTypeId) {
        return accountTypeMapper.deleteAccountType(accountTypeId);
    }

    @Override
    public AccountType selectAccountTypeByIds(int id) {
        return accountTypeMapper.selectByPrimaryKey(id);
    }
}
