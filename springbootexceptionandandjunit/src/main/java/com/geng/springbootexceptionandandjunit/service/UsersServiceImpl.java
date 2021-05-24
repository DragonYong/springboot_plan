package com.geng.springbootexceptionandandjunit.service;

import com.geng.springbootexceptionandandjunit.dao.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Time: 2021-05-22 15:38
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersServiceImpl.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.service
 **/
@Service
public class UsersServiceImpl {
    @Autowired
    private UsersDaoImpl usersDao;

    public void addUser() {
        this.usersDao.insert();
    }
}
