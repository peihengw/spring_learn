package com.tencent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages = {"com.tencent.dao","com.tencent.mapper"})
public class SpringbootMybatisIntergrateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisIntergrateApplication.class, args);
	}

}
