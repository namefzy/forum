package cn.com.cncp.service;


import cn.com.cncp.entity.Country;

import java.util.List;

public interface ICountryService {
    Country selectById(Integer id);

    List<Country> selectAll();

    List<Country> simulation();
}
