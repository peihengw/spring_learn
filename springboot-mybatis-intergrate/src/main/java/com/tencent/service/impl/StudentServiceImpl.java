package com.tencent.service.impl;

import com.tencent.dao.StudentDao;
import com.tencent.model.Student;
import com.tencent.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Project:spring_learn
 * @ClassName:StudentServiceImpl
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource//自动注入mybatis扫描mapper之后创建的mapper接口的代理对象
    private StudentDao studentDao;

    @Override
    public Student queryStu(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
