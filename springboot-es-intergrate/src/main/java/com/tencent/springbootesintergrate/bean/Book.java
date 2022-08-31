package com.tencent.springbootesintergrate.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Project:spring_learn
 * @ClassName:Book
 * @Author:v_peihengwu
 * @Date:2022/8/31
 * @Description:TODO
 */

@Document(indexName = "tencent", indexStoreType = "book")
public class Book {
    private Integer id;
    private String name;
    private String author;


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
