package com.geng.springbootfreemarker.controller;

import com.geng.springbootfreemarker.entity.Users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2021-05-20 19:01
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootfreemarker.controller
 **/
@Controller
public class UsersController {
    @GetMapping("/showUsers")
    public String showUsers(Model model) {
        System.out.println(">>>>>>>>>>>");
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin", "F", "32"));
        list.add(new Users("lisi", "M", "356"));
        list.add(new Users("wanghui", "F", "89"));
        model.addAttribute("list", list);
        return "usersList";
    }
}
