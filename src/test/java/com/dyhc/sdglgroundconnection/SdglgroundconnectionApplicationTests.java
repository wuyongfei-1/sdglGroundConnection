package com.dyhc.sdglgroundconnection;


import com.dyhc.sdglgroundconnection.jms.ActiveMQUtil;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SdglgroundconnectionApplicationTests {
    @Autowired
    private ActiveMQUtil producer;

    @Test
    public void contextLoads() {
        Destination destination = new ActiveMQQueue("mytest.queue");
        for(int i=0; i<100; i++){
            producer.sendMessage(destination, "myname is chhliu!!!");
        }
    }
}
