package com.tencent.controller;

import com.tencent.model.Student;
import com.tencent.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Project:spring_learn
 * @ClassName:StudentController
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/stu/query")
    @ResponseBody
    public String queryStu(Integer id){
        Student student = studentService.queryStu(id);
        return student.toString();
    }
}
