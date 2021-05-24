package com.geng.springbootexceptionandandjunit.exception;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @Time: 2021-05-22 15:04
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: GlobalException2.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.exception
 * 此方法返回值必须是SimpleMappingExceptionResolver
 **/
//@Configuration
//public class GlobalException2 {
//    @Bean
//    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
//        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
//        Properties properties = new Properties();
//        properties.put("java.lang.ArithmeticException", "error3");
//        properties.put("java.lang.NullPointerException", "error4");
//
//        simpleMappingExceptionResolver.setExceptionMappings(properties);
//        return simpleMappingExceptionResolver;
//    }
//
//
//}
