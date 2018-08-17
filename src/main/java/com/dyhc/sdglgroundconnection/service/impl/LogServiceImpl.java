package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.LogMapper;
import com.dyhc.sdglgroundconnection.pojo.Log;
import com.dyhc.sdglgroundconnection.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 带团日志业务实现
 **/
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    /**
     * 查询所有日志信息 （wangtao）
     * @return 返回日志集合
     * @throws Exception
     */
    @Override
    public List<Log> ListAllLog() throws Exception {
        return logMapper.selectAll();
    }

    /**
     * 根据日志编号查询日志信息 （wangtao）
     * @return 返回日志信息对象
     * @throws Exception
     */
    @Override
    public Log getLogById(Integer id) throws Exception {
        return logMapper.selectByPrimaryKey(id);
    }


    /**
     * 修改日志信息根据日志编号 （wangtao）
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "日志信息",desc = "修改一条日志信息")
    public Integer updateLogById(Log log) throws Exception {
        return logMapper.updateByPrimaryKey(log);
    }

    /**
     * 新增日志信息 （wangtao）
     * @param log 参数日志对象
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "日志信息",desc = "新增一条日志信息")
    public Integer insertLog(Log log) throws Exception {
        return logMapper.insert(log);
    }

    /**
     * 删除日志信息根据日志编号 （wangtao）
     * @param id 日志编号
     * @return 返回受影响行数
     * @throws Exception
     */
    @Override
    @RecordOperation(type = "日志信息",desc = "删除一条日志信息")
    public Integer deleteLogById(Integer id) throws Exception {
        return logMapper.deleteByPrimaryKey(id);
    }


}
