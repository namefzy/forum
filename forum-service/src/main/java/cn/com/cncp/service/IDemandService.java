package cn.com.cncp.service;

import cn.com.cncp.entity.Demand;

import java.util.List;

public interface IDemandService {
    List<Demand> getDemandPageList();

    List<Demand> getDemandContent(Demand demand);
}
