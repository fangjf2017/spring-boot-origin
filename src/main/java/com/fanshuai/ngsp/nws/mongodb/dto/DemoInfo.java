package com.fanshuai.ngsp.nws.mongodb.dto;

import org.springframework.data.annotation.Id;

/**
 * Created by fanshuai on 2017/9/22.
 */
public class DemoInfo {

    //id属性是给mongodb用的，用@Id注解修饰
    @Id
    private String id;

    private String name;

    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
