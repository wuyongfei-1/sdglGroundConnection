package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.dto.WechatInformationParam;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disother;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度其他业务接口
 **/
public interface DisotherService {

    /**
     * 添加调度其他的信息（wuyongfei）
     *
     * @param disother 调度其他信息对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisotherInfo(Disother disother) throws DispatchException;



}
