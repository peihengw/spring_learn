package com.tencent.config;

import com.tencent.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project:spring_learn
 * @ClassName:ServletConfig
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */
@Configuration
public class ServletConfig {

    //定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(
                new MyServlet(),
                "/myservlet"
        );

        return bean;
    }
}
