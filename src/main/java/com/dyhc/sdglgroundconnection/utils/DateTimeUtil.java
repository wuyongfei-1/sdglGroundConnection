package com.dyhc.sdglgroundconnection.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 日期工具类（wuyongfei）
 **/
public class DateTimeUtil {
    /**
     * 获取当前日期（wuyongfei）
     *
     * @return 格式化后的日期格式（字符串）
     */
    public static String getCurrentDate(String pattern) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
