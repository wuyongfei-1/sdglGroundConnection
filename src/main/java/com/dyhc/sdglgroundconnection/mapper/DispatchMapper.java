package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Dispatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度
 **/
@Mapper
@Component
public interface DispatchMapper extends CommonMapper<Dispatch> {

    /**
     * 添加调度信息（wuyongfei）
     *
     * @param dispatch 调度实例对象
     * @return 自增编号
     * @throws Exception 全局异常
     */
    Integer saveDispatchInfo(Dispatch dispatch) throws Exception;
}
