package com.tencent.mapper;

import com.tencent.model.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @Project:spring_learn
 * @ClassName:EmployeeMapper
 * @Author:v_peihengwu
 * @Date:2022/8/2
 * @Description:TODO
 */

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set name=#{name},d_id=#{dId} where id=#{id}")
    public void updateEmp(Employee emp);

    @Delete("delete from employee where id=#{id}")
    public void delEmpById(Integer id);

    @Insert("insert into employee(name,d_id) values(#{name},#{dId})")
    public void insertEmp(Employee emp);
}
