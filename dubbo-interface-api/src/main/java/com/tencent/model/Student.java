package com.tencent.model;

import java.io.Serializable;

/**
 * @Project:spring_learn
 * @ClassName:Student
 * @Author:v_peihengwu
 * @Date:2022/8/2
 * @Description:TODO
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -3005147047027594117L;

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
