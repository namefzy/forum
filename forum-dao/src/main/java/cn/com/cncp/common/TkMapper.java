package cn.com.cncp.common;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
@RegisterMapper
public interface TkMapper<T> extends Mapper<T> {
}
