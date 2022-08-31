package com.tencent.springbootesintergrate.repository;

import com.tencent.springbootesintergrate.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Project:spring_learn
 * @ClassName:BookRepository
 * @Author:v_peihengwu
 * @Date:2022/8/31
 * @Description:TODO
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    //https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.query-methods.criterions
    public List<Book> findByNameLike(String name);
}
