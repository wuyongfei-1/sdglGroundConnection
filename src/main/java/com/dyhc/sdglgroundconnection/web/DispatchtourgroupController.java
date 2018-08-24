package com.dyhc.sdglgroundconnection.web;
import com.dyhc.sdglgroundconnection.service.DispatchtourgroupServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispatchtourgroup")
public class DispatchtourgroupController {
    // 日志对象
    private Logger logger = LoggerFactory.getLogger(DispatchtourgroupController.class);

    @Autowired
    private DispatchtourgroupServer dispatchtourgroupServer;
}
