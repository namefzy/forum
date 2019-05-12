package cn.com.cncp.service.impl;

import cn.com.cncp.entity.Country;
import cn.com.cncp.mapper.CountryMapper;
import cn.com.cncp.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {
    @Autowired
    private CountryMapper countryMapper;

    public Country selectById(Integer id){
        return countryMapper.selectByPrimaryKey(id);
    }

    public List<Country> selectAll() {
        return countryMapper.selectAll();
    }

    public List<Country> simulation() {
        List<Country> simulation = countryMapper.simulation();
        System.out.println(simulation);
        return simulation;
    }
}
