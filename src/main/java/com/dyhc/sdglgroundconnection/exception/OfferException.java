package com.dyhc.sdglgroundconnection.exception;

import com.dyhc.sdglgroundconnection.pojo.MealtypeExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 报价时异常（dubingkun）
 */
public class OfferException extends RuntimeException{
    private Logger logger = LoggerFactory.getLogger(OfferException.class); // 日志对象

    /**
     * 异常提示
     * @param msg
     */
    public OfferException(String msg){
        super(msg);
        logger.error("报价发生异常："+msg);
    }
}
