package com.tencent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 原理：cacheManager缓存管理器==>帮我们创建出cache缓存组件，来实际给缓存中存取数据
 * 引入redis的starter，
 * 		RedisAutoConfiguration配置类就导入了RedisTemplate类的bean，
 * 		RedisCacheConfiguration生效的条件是存在RedisTemplate的bean。
 * 		所以容器中保存的是RedisCacheManager作为cacheManager
 *
 * RedisCacheManager帮我们创建RedisCache作为缓存组件，RedisCache通过操作redis缓存数据
 * 默认保存数据k-v都是object，默认是JDK序列化后保存redis
 * 		如何保存为json？
 * 			1、引入redis的starter，cacheManger就变为RedisCacheManager
 * 			2、默认创建的
 *
 *
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.tencent.dao","com.tencent.mapper"})
@EnableCaching
public class SpringbootMybatisIntergrateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisIntergrateApplication.class, args);
	}

}
