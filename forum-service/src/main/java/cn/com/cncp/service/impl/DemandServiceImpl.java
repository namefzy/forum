package cn.com.cncp.service.impl;

import cn.com.cncp.entity.Demand;
import cn.com.cncp.mapper.DemandMapper;
import cn.com.cncp.service.IDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class DemandServiceImpl implements IDemandService {
    @Autowired
    private DemandMapper demandMapper;

    @Override
    public List<Demand> getDemandPageList() {
        return demandMapper.selectAll();
    }

    /**
     * demandMapper.select(demand)：默认以id查询
     * Example:多条件查询
     * @param demand
     * @return
     */
    @Override
    public List<Demand> getDemandContent(Demand demand) {
        Example example = new Example(Demand.class);
        example.createCriteria().andEqualTo("tdTitle",demand.getTdTitle());
        return demandMapper.selectByExample(example);
    }
}
