package com.dyhc.sdglgroundconnection.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公共的mapper接口，自己的mapper接口要继承该接口，可以使用mybatis的公共插件
 **/
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
