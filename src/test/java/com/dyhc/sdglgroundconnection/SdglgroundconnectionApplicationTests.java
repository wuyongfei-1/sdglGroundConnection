package com.dyhc.sdglgroundconnection;


import com.dyhc.sdglgroundconnection.jms.ActiveMQUtil;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SdglgroundconnectionApplicationTests {
    @Autowired
    private ActiveMQUtil producer;

    public static void main(String[] args){
        ArrayList list=new ArrayList();
        int i = 0;
        while(true)

        {
            System.out.println(++i);
            list.add(new SdglgroundconnectionApplicationTests());

        }
    }

}
