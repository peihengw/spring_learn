package com.tencent.mapper;

import com.tencent.model.School;

/**
 * @Project:spring_learn
 * @ClassName:SchoolDao
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */

public interface SchoolDao {

    public School selectSchoolById(String id);
}
