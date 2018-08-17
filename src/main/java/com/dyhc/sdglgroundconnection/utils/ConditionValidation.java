package com.dyhc.sdglgroundconnection.utils;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 条件验证工具类（wuyongfei）
 **/
public class ConditionValidation {

    /**
     * 验证参数的有效性（wuyongfei）
     *
     * @param obj 需要验证的参数
     * @return true(success)/false(error)
     */
    public static boolean validation(Object obj) {
        if (obj != null && !"".equals(obj)) {
            return true;
        } else {
            return false;
        }
    }
}
