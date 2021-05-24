package com.geng.springbootexceptionandandjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Time: 2021-05-22 14:09
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.controller
 **/
@Controller
public class UsersController {
    @RequestMapping("show")
    public String showInfo() {
        String str = null;
        str.length();
        return "ok";
    }

    //    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullpointExceptionHandler(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err", e.toString());
//        modelAndView.setViewName("error1");
//        return modelAndView;
//    }
    @RequestMapping("show2")
    public String show2() {

        int a = 10 / 0;
        return "ok";
    }

//    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
//    public ModelAndView arithmeticExceptionHandler(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err", e.toString());
//        modelAndView.setViewName("error2");
//        return modelAndView;
//    }
}
