package com.tencent.control;

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
 * @Date:2022/7/28
 * @Description:TODO
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name,Integer age){
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);

        int rows = studentService.addStudent(s1);

        return "添加学生："+ rows;
    }
}
