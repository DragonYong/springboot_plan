package com.geng.springbootjdbc.service.impl;

import com.geng.springbootjdbc.dao.UsersDao;
import com.geng.springbootjdbc.entity.Users;
import com.geng.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Time: 2021-05-21 07:55
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersServiceImpl.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootjdbc.service.impl
 **/
@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insertUsers(users);
    }

    @Override
    public List<Users> findUsersAll() {
        return this.usersDao.selectUsersAll();
    }

    @Override
    public Users findUserById(Integer id) {
        return this.usersDao.selectUserById(id);
    }

    @Override
    @Transactional
    public void modifyUser(Users users) {
        this.usersDao.updateUsers(users);
    }

    @Override
    public void dropUser(Integer id) {
        this.usersDao.deleteUserById(id);
    }
}
