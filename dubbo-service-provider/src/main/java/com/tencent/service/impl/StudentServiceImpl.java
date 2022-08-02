package com.tencent.service.impl;

import com.tencent.model.Student;
import com.tencent.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @Project:spring_learn
 * @ClassName:StudentServiceImpl
 * @Author:v_peihengwu
 * @Date:2022/8/2
 * @Description:TODO
 */

@DubboService(interfaceClass=StudentService.class,version = "1.0.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {

    @Override
    public Student queryStudentById(Integer id) {
        Student student = new Student();
        if (1001==id) {
            student.setId(1001);
            student.setName("1001-zs");
            student.setAge(20);

        }else if (1002==id) {
            student.setId(1002);
            student.setName("1002-ls");
            student.setAge(22);

        }
        return student;
    }
}
