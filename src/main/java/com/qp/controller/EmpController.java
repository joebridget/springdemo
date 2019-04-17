package com.qp.controller;

import com.qp.entity.Emp;
import com.qp.service.EmpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("/queryAll")
    public Map<String,Object> queryAll(){
        Map<String,Object> map = new HashMap<>();
        List<Emp> emps = empService.selectAll();
        map.put("success",200);
        map.put("emps",emps);
        return map;
    }
}
