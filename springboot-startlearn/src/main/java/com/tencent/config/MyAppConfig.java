package com.tencent.config;

import com.tencent.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project:spring_learn
 * @ClassName:MyAppConfig
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */

@Configuration
public class MyAppConfig implements WebMvcConfigurer{

    /**
     * 添加拦截器对象，注入到容器中
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //创建拦截器对象
        HandlerInterceptor loginInterceptor = new LoginInterceptor();

        //指定拦截器拦截的请求url地址
        String path []={"/user/**"};
        String excludePath []={"/user/login"};
        registry.addInterceptor(loginInterceptor).addPathPatterns(path).excludePathPatterns(excludePath);

    }
}
