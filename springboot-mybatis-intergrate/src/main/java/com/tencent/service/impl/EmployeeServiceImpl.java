package com.tencent.service.impl;

import com.tencent.mapper.EmployeeMapper;
import com.tencent.model.Employee;
import com.tencent.service.EmployeeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Project:spring_learn
 * @ClassName:EmployeeServiceImpl
 * @Author:v_peihengwu
 * @Date:2022/8/4
 * @Description:TODO
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    public EmployeeMapper employeeMapper;



    @Cacheable
    @Override
    public Employee getEmp(Integer id,String ab) {
        return employeeMapper.getEmpById(id);

    }

}
