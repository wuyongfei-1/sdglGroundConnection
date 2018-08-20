package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Disguide;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.pojo.Disguide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度导游业务接口
 **/
public interface DisguideService {
    /**
     * 根据导游编号查询(yunguoaho)
     * @param disGuideId
     * @return
     */
    List<Disguide> selectdisGuideId(int disGuideId);

    /**
     * 添加调度导游信息（wuyongfei）
     *
     * @param disguide 调度导游对象
     * @return 受影响行数
     * @throws DispatchException 调度异常
     */
    Integer saveDisguideInfo(Disguide disguide) throws DispatchException;
}
