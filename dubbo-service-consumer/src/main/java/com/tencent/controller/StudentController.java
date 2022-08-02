package com.tencent.controller;

import com.tencent.model.Student;
import com.tencent.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project:spring_learn
 * @ClassName:StudentController
 * @Author:v_peihengwu
 * @Date:2022/8/2
 * @Description:TODO
 */

@RestController
public class StudentController {

    @DubboReference(version = "1.0")
    private StudentService studentService;

    @GetMapping("/queryStu/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer id){
        Student student = studentService.queryStudentById(id);
        return "调用远程接口，获取对象：" + student;
    }
}
