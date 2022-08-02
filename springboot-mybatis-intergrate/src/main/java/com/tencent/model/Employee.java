package com.tencent.model;

/**
 * @Project:spring_learn
 * @ClassName:Employee
 * @Author:v_peihengwu
 * @Date:2022/8/2
 * @Description:TODO
 */
public class Employee {

    private Integer id;

    private String name;

    private Integer dId;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dId=" + dId +
                '}';
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
