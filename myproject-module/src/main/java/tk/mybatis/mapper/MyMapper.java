package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 *
 * @author Vikki
 * @date 2018/01/17 下午 4:15
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
