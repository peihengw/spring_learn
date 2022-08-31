package com.tencent.service;

import com.tencent.model.Employee;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Project:spring_learn
 * @ClassName:EmployeeService
 * @Author:v_peihengwu
 * @Date:2022/8/4
 * @Description:TODO
 */
public interface EmployeeService {

    /**
     * 将方法的运行结果进行缓存
     * CacheManager缓存管理器，管理多个缓存组件，对缓存真正的crud操作在缓存组件中，每个缓存组件有唯一名称cacheName
     *
     * cacheName/value：指定组件名称
     * key：缓存数据使用的key，默认使用方法的参数的值
     *      写法：#id，参数id的值，  #a0  #p0  #root.args[0]
     * CacheManager/cacheResolver二选一
     * condition:什么情况下缓存
     *      #a0>0 第一个参数的值>0的时候缓存
     * unless:否定缓存，跟condition相反
     *
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"emp","tmp"},key = "#root.methodName+'['+#id+']'",condition = "#id>0 and #ab>1",unless = "#result==null")
    public Employee getEmp(Integer id, String ab);
}
