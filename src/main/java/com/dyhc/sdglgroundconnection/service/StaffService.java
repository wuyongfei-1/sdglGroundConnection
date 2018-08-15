package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务接口
 **/
public interface StaffService {
    /**
     * 根据用户名返回用户信息（dubingkun）
     * @param username
     * @return
     */
    Staff loginCheck(String username);
}
