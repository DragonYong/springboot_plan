package com.geng.springbootthymeleaf.entity;

/**
 * @Time: 2021-05-20 13:37
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: Users.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootthymeleaf.entity
 **/
public class Users {
    private String name;
    private String id;
    private int age;

    public Users() {

    }

    public Users(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
