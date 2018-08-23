package com.dyhc.sdglgroundconnection.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 队列生产者
 **/
@Service("producer")
public class ActiveMQUtil {

    @Autowired  // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息到目的地（wuyongfei）
     *
     * @param destination 目的地（队列/主题）
     * @param message     消息
     */
    public void sendMessage(String destination, Object message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

}
