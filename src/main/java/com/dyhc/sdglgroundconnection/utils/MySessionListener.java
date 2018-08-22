package com.dyhc.sdglgroundconnection.utils;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * session监听器（wuyongfei）
 **/
public class MySessionListener implements HttpSessionListener {

    /**
     * session被创建（wuyongfei）
     *
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        MySessionContext.addSession(httpSessionEvent.getSession());
    }

    /**
     * session被销毁或过期（wuyongfei）
     *
     * @param httpSessionEvent
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        MySessionContext.delSession(httpSessionEvent.getSession());
    }
}
