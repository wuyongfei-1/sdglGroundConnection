package com.dyhc.sdglgroundconnection.exception;

import com.dyhc.sdglgroundconnection.pojo.MealtypeExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度信息异常类（wuyongfei）
 **/
public class DispatchException extends RuntimeException {

    private Logger logger = LoggerFactory.getLogger(MealtypeExample.class); // 日志对象

    /**
     * 异常提示
     *
     * @param msg
     */
    public DispatchException(String msg) {
        super(msg);
        logger.error("调度时出现异常："+msg);
    }
}
