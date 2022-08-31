package com.tencent.controller;

import com.tencent.model.Employee;
import com.tencent.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Project:spring_learn
 * @ClassName:EmployeeController
 * @Author:v_peihengwu
 * @Date:2022/8/4
 * @Description:TODO
 */
//rest返回json数据
@RestController
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}/{ab}")
    public Employee getEmp(@PathVariable Integer id,@PathVariable String ab){
        Employee emp = employeeService.getEmp(id, ab);

        return emp;
    }

}
