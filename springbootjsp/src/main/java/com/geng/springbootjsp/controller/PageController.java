package com.geng.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Time: 2021-05-20 18:37
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: PageController.java
 * @Program: springbootjsp
 * @Package: com.geng.springbootjsp.controller
 * 页面跳转Controller
 **/
@Controller
public class PageController {
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page) {
        System.out.println("geng...............");
        return page;
    }
}
