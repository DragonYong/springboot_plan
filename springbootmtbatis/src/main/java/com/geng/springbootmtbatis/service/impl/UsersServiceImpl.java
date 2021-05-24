package com.geng.springbootmtbatis.service.impl;

import com.geng.springbootmtbatis.entity.Users;
import com.geng.springbootmtbatis.mapper.UsersMapper;
import com.geng.springbootmtbatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Time: 2021-05-21 16:45
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersServiceImpl.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootmtbatis.service
 * 用户管理业务层
 **/
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUsers(Users users) {
        this.usersMapper.insert(users);
    }
}
