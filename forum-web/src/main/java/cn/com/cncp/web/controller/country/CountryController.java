package cn.com.cncp.web.controller.country;

import cn.com.cncp.entity.Country;
import cn.com.cncp.service.ICountryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private ICountryService countryService;
    @GetMapping("selectCountryById")
    public List<Country> selectCountryById(){
        PageHelper.startPage(0,2);
        List<Country> countries = countryService.selectAll();
        return countries;
    }

    /**
     * 模拟复杂语句，测试mapper.xml文件是否能调用成功
     * @return
     */
    @GetMapping("complex")
    public List<Country> simulation(){
        int i = 1/0;
        return countryService.simulation();
    }
}
