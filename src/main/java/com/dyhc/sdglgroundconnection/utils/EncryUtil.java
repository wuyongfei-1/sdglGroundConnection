package com.dyhc.sdglgroundconnection.utils;

import org.junit.Test;

/**
 * 加密解密工具类
 */
public class EncryUtil {

    /**
     * 使用默认密钥进行DES加密
     */
    public static String encrypt(String plainText) {
        try {
            return new DES().encrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用指定密钥进行DES解密
     */
    public static String encrypt(String plainText, String key) {
        try {
            return new DES(key).encrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用默认密钥进行DES解密
     */
    public static String decrypt(String plainText) {
        try {
            return new DES().decrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用指定密钥进行DES解密
     */
    public static String decrypt(String plainText, String key) {
        try {
            return new DES(key).decrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void test(){
        String str = "123456";
        String t = "";
        //加密
        System.out.println("加密后：" + (EncryUtil.encrypt(str)));
        //解密
        System.out.println("解密后：" + EncryUtil.decrypt(EncryUtil.encrypt(str)));
    }


}
