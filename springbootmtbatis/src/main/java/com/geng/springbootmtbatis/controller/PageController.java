package com.geng.springbootmtbatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 2021-05-21 16:40
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: PageController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootmtbatis.controller
 **/
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
