package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 日志业务接口
 **/
public interface LogService {

    /**
     * 查询所有日志信息 （wangtao）
     * @return 返回日志集合
     * @throws Exception
     */
    List<Log> ListAllLog() throws Exception;

    /**
     * 根据日志编号查询日志信息 （wangtao）
     * @return 返回日志信息对象
     * @throws Exception
     */
    Log getLogById(Integer id)throws Exception;

    /**
     * 修改日志信息根据日志编号 （wangtao）
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer updateLogById(Log log) throws Exception;

    /**
     * 新增日志信息 （wangtao）
     * @param log 新增日志参数对象
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer insertLog(Log log)throws Exception;

    /**
     * 删除日志信息根据日志编号 （wangtao）
     * @param id 日志编号
     * @return 返回受影响行数
     * @throws Exception
     */
    Integer deleteLogById(Integer id)throws Exception;
}
