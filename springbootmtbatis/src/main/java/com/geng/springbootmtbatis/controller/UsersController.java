package com.geng.springbootmtbatis.controller;

import com.geng.springbootmtbatis.entity.Users;
import com.geng.springbootmtbatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 2021-05-21 16:42
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootmtbatis.controller
 * 用户管理
 **/
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("/addUser")
    public String addUsers(Users users) {
        try {
            this.usersService.addUsers(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
