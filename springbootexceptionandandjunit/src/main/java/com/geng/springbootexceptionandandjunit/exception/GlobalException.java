package com.geng.springbootexceptionandandjunit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Time: 2021-05-22 14:58
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: Global.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.exception
 * 全局异常处理
 **/
//@ControllerAdvice
//public class GlobalException {
//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullpointExceptionHandler(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err", e.toString());
//        modelAndView.setViewName("error1");
//        return modelAndView;
//    }
//}
