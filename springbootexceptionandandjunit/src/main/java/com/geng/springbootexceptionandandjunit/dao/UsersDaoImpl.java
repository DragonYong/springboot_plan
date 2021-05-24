package com.geng.springbootexceptionandandjunit.dao;

import org.springframework.stereotype.Repository;

/**
 * @Time: 2021-05-22 15:37
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersDao.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.dao
 **/
@Repository
public class UsersDaoImpl {
    public void insert() {
        System.out.println("insert into user values..............................");
    }
}
