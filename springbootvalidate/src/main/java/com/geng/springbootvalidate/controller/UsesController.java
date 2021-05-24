package com.geng.springbootvalidate.controller;

import com.geng.springbootvalidate.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Time: 2021-05-22 16:11
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsesController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootvalidate.controller
 **/
@Controller
@RequestMapping("/user")
@Validated
public class UsesController {
    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(@Validated Users users,
                          BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError err : list) {
                FieldError fieldError = (FieldError) err;
                String fielName = fieldError.getField();
                String msg = fieldError.getDefaultMessage();
                System.out.println(fielName + "\t" + msg);
            }
            return "addUser";
        }
        System.out.println(users);
        return "ok";
    }

    @PostMapping("/findUser")
    public String findUser(@NotBlank(message = "用户名不能为空") String username) {
        System.out.println(username);
        System.out.println("geng");
        return "ok";
    }
}
