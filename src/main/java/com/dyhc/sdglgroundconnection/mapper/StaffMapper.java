package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员
 **/
@Mapper
@Component
public interface StaffMapper extends CommonMapper<Staff>{
    /**
     * 根据用户名返回用户信息（dubingkun）
     * @param username
     * @return
     */
    Staff getByTheUserName(String username);
}
