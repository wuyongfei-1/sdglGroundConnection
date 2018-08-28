package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.HotelExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店mapper单元测试类
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelMapperTest {

    @Resource
    private HotelMapper hotelMapper;

    @Test
    public void testListHotelsByHotelName(){
        System.out.println("222");
        HotelExample hotelExample = new HotelExample();
        HotelExample.Criteria criteria = hotelExample.createCriteria();
        criteria.andHotelnameLike("%二%");
        List<Hotel> hotels = hotelMapper.selectByExample(hotelExample);
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getHotelName());
        }
    }
}
