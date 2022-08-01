package com.tencent.service.impl;

import com.tencent.dao.StudentMapper;
import com.tencent.model.Student;
import com.tencent.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Project:spring_learn
 * @ClassName:StudentServiceImpl
 * @Author:v_peihengwu
 * @Date:2022/7/28
 * @Description:TODO
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper studentDao;


    /**
     *
     *默认：
     *      隔离级别：使用库的隔离级别
     *      传播行为：REQUIRED
     *      超时时间：-1
     *跑出运行时一次就会回滚事务
     * @param student
     * @return
     */
    //@Transactional： 标识方法有事务支持
    @Transactional
    public int addStudent(Student student) {

        System.out.println("业务方法addStudent");
        int rows = studentDao.insert(student);

        System.out.println("执行sql语句");

//        跑出一个运行时异常，目的是回滚异常
        int a = 10 / 0;

        return rows;
    }
}
