package com.tencent.model;

/**
 * @Project:spring_learn
 * @ClassName:Student
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
