package com.geng.springbootvalidate.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

/**
 * @Time: 2021-05-22 21:45
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: GlobalException.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootvalidate.exception
 **/
@Configuration
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同视图的跳转
        if (e instanceof NullPointerException) {
            mv.setViewName("error5");
        }
        if (e instanceof ArithmeticException) {
            mv.setViewName("error6");
        }
        if (e instanceof ConstraintViolationException) {
            mv.setViewName("findUser");
        }
        mv.addObject("error", e.getMessage().split(":")[1]);
        return mv;
    }
}
