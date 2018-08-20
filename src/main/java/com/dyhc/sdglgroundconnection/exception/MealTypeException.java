package com.dyhc.sdglgroundconnection.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 饮食类型异常类（wuyongfei）
 **/
public class MealTypeException extends RuntimeException {

    private Logger logger = LoggerFactory.getLogger(MealTypeException.class); // 日志对象

    /**
     * 异常提示（wuyongfei）
     *
     * @param msg
     */
    public MealTypeException(String msg) {
        super(msg);
        logger.error("饮食类型异常："+msg);
    }
}
