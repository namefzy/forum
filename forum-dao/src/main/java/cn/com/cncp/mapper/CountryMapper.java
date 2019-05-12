package cn.com.cncp.mapper;

import cn.com.cncp.common.TkMapper;
import cn.com.cncp.entity.Country;

import java.util.List;

public interface CountryMapper extends TkMapper<Country> {
    List<Country> simulation();
}