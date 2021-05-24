package com.geng.springbootjdbc.dao;

import com.geng.springbootjdbc.entity.Users;

import java.util.List;

/**
 * @Time: 2021-05-21 07:17
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersDao.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.dao
 **/
public interface UsersDao {
    void insertUsers(Users users);

    List<Users> selectUsersAll();

    Users selectUserById(Integer id);

    void updateUsers(Users users);

    void deleteUserById(Integer id);
}
