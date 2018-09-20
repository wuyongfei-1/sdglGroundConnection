package com.dyhc.sdglgroundconnection.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * redisCURD工具辅助类（wuyongfei）
 **/
@Component
public class RedisUtil {

    private static RedisTemplate template;

    @Autowired
    public void setTemplate(RedisTemplate redisTemplate) {
        RedisUtil.template = redisTemplate;
    }

    /**
     * 设置值
     *
     * @param key
     * @param value
     * @return
     */
    public static boolean set(byte[] key, Object value) {
        try {
            if ((key != null && key.length > 0) && (value != null)) {
                ValueOperations operations = template.opsForValue();
                operations.set(key, value);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    public static Object get(byte[] key) {
        try {
            if (key != null && key.length > 0) {
                ValueOperations operations = template.opsForValue();
                Object obj = operations.get(key);
                return obj;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据key删除该键值对
     *
     * @param key
     * @return
     */
    public static boolean del(byte[] key) {
        try {
            if (key != null && key.length > 0) {
                ValueOperations operations = template.opsForValue();
                operations.getOperations().delete(key);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
