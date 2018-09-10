package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.AccountType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户类型
 **/
@Mapper
@Component
public interface AccountTypeMapper extends CommonMapper<AccountType>{

    /**
     * 公司按名字查询(yunguohao)
     * @param accountType
     * @return
     */
    List<AccountType> selectAccountTypeName(AccountType accountType) throws Exception;

    /**
     * 公司删除（yunguohao）
     * @param accountTypeId
     * @return
     */
    int deleteAccountType(int accountTypeId);

}
