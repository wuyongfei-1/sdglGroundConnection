package com.dyhc.sdglgroundconnection.utils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * session会话机制
 **/
public class MySessionContext {

    private static HashMap sessionContext = new HashMap(); // session会话内容

    /**
     * 添加session（wuyongfei）
     *
     * @param session session对象
     */
    public static synchronized void addSession(HttpSession session) {
        //session.setMaxInactiveInterval(30*60); // 会话有效时间为30秒
        if (session != null) {
            sessionContext.put(session.getId(), session);
        }
    }

    /**
     * 删除session（wuyongfei）
     *
     * @param session session对象
     */
    public static synchronized void delSession(HttpSession session) {
        if (session != null) {
            sessionContext.remove(session.getId());
        }
    }

    /**
     * 根据sessionId获取session对象（wuyongfei）
     *
     * @param sessionId session编号
     * @return 当前session
     */
    public static synchronized HttpSession getSession(String sessionId) {
        if (ConditionValidation.validation(sessionId)) {
            HttpSession currentSession = (HttpSession) sessionContext.get(sessionId);
            return currentSession;
        } else {
            return null;
        }
    }
}
