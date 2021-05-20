package com.geng.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 2021-05-20 16:36
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: PageController.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.controller
 **/
@Controller
public class PageController {
    @RequestMapping("/page")
    public String showPage(){
        return "index.html";
    }
}
