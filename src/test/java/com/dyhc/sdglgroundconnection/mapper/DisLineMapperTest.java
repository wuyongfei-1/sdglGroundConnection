package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Disline;
import com.dyhc.sdglgroundconnection.service.DislineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度线路mapper单元测试类
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DisLineMapperTest {

    @Autowired
    private DislineMapper dislineMapper;

    @Test
    public void testListDislines(){
        List<Disline> dislines = dislineMapper.selectAll();
        for (Disline disline : dislines) {
            System.out.println(disline.getCreateTime());
        }
    }
}
