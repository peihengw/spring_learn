package com.tencent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 原理：cacheManager=cache 缓存组件来实际给缓存中存取数据
 * 引入redis的starter，容器中保存的是RedisCacheManager
 * RedisCacheManager帮我们创建RedisCache
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.tencent.dao","com.tencent.mapper"})
@EnableCaching
public class SpringbootMybatisIntergrateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisIntergrateApplication.class, args);
	}

}
