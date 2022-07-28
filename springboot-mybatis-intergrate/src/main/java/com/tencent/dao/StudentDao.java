package com.tencent.dao;

import com.tencent.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Project:spring_learn
 * @ClassName:StudentDao
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:
 *
 */
//@Mapper告诉mybatis这是Dao接口，创建此接口的代理对象，访问数据库
@Mapper
public interface StudentDao {

    Student selectById(@Param("stuId") Integer id);
}
