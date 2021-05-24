package com.geng.springbootjdbc.service;

import com.geng.springbootjdbc.entity.Users;

import java.util.List;

/**
 * @Time: 2021-05-21 07:14
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UserService.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.service
 **/
public interface UserService {
    void addUser(Users users);

    List<Users> findUsersAll();

    Users findUserById(Integer id);

    void modifyUser(Users users);

    void dropUser(Integer id);
}
