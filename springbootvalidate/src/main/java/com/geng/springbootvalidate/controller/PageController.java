package com.geng.springbootvalidate.controller;

import com.geng.springbootvalidate.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 2021-05-22 16:55
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: PageController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootvalidate.controller
 * 解决异常的方式：可以在跳转页面的方法只能构筑一个Users对象
 * 由于SpringMVC会将改对象放入到Model中传递，key的名称会使用还对象的驼峰命名规则作为key
 **/
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, Users users) {
        return page;
    }
}
