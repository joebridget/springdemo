package com.qp.service.impl;

import com.qp.dao.EmpMapper;
import com.qp.entity.Emp;
import com.qp.entity.EmpExample;
import com.qp.service.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Override
    public List<Emp> selectAll() {
        EmpExample example = new EmpExample();
        example.createCriteria().andIdIsNotNull();
        return empMapper.selectByExample(example);
    }
}
