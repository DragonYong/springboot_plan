package com.geng.springbootjdbc.controller;

import com.geng.springbootjdbc.entity.Users;
import com.geng.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Time: 2021-05-21 06:07
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UserController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.controller
 **/
@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private DataSource dataSource;

//    @GetMapping("/showInfo")
//    public String showInfo() {
//
//        return "ok";
//    }

    @Autowired
    private UserService userService;

    @PostMapping("addUser")
    public String showInfo(Users users) {
        try {
            this.userService.addUser(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }

    /*
    查询全部用户
     */
    @GetMapping("/findUserAll")
    public String findUserAll(Model model) {
//        System.out.println(1);
        List<Users> list = null;
        try {
            list = this.userService.findUsersAll();
//            System.out.println(list);
            model.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }

    // 预更新用户查询
    @GetMapping("/preupdateUser")
    public String preupdateUser(Integer id, Model model) {
        try {
            Users users = this.userService.findUserById(id);
            model.addAttribute("user", users);
            System.out.println("=====================");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }

    // 更新用户
    @PostMapping("/updateUser")
    public String updateUser(Users users) {
        try {
            this.userService.modifyUser(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    @GetMapping("deleteUser")
    public String deleteUser(Integer id) {
        try {
            this.userService.dropUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        // 防治重复提交,
        return "redirect:/ok";
    }
}
