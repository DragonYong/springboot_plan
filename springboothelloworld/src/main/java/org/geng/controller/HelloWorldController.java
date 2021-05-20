package org.geng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time: 2021-05-20 14:57
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: HelloWorldController.java
 * @Program: springboot_demo
 * @Package: org.geng.controller
 **/
@RestController // @Controller+@ResponseBody 直接返回json串
public class HelloWorldController {
    // @RequestMapping("/helloWorld")
    @GetMapping("/helloWorld")
    public String showHelloWorld() {
        System.out.println("Geng");
        return "HelloWorld";
    }

}
