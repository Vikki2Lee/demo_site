package com.vikki.myproject.database.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 *  自己的 Mapper
 *  该接口不能被扫描到
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
