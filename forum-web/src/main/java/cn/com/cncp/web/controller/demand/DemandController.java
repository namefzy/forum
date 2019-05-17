package cn.com.cncp.web.controller.demand;

import cn.com.cncp.entity.Demand;
import cn.com.cncp.service.IDemandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demand")
public class DemandController {

    @Autowired
    private IDemandService demandService;

    /**
     * 需求首页
     * @return
     */
    @GetMapping("getDemandPageList")
    public List<Demand> getDemandPageList(){
        PageHelper.startPage(0,2).setOrderBy("create_time desc");
        return demandService.getDemandPageList();
    }

    /**
     * 实现restful风格
     * @param tdTitle
     * @return
     */
    @GetMapping("getDemandContent/{tdTitle}")
    public List<Demand> getDemandContent(@PathVariable(name = "tdTitle")String tdTitle, Demand demand){
        PageHelper.startPage(0,2).setOrderBy("create_time desc");
        return demandService.getDemandContent(demand);
    }
    /**
     * 判断是否响应
     */
    @GetMapping("ifResponse/{tdId}")
    public Demand ifResponse(@PathVariable(name = "tdId")String tdId){
        return null;
    }

}
