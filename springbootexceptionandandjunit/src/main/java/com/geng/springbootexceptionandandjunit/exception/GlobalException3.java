package com.geng.springbootexceptionandandjunit.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Time: 2021-05-22 15:13
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: GlobalException3.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.exception
 * 必须要实现HandlerExceptionResolver
 **/
@Configuration
public class GlobalException3 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object handler,
                                         Exception e) {
        ModelAndView modelAndView = new
                ModelAndView();
        if (e instanceof NullPointerException) {
            modelAndView.setViewName("error5");
        }
        if (e instanceof ArithmeticException) {
            modelAndView.setViewName("error6");
        }

        modelAndView.addObject("err", e.toString());
        return modelAndView;
    }
}
