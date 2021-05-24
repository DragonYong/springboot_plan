package com.geng.springbootlogback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Time: 2021-05-22 23:03
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: HelloController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootlogback
 **/
@RestController
@RequestMapping("/logback")
public class HelloController {
    private final static Logger logger= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("show")
    public String show(){
        logger.info("记录日志");
        return "ok";
    }
}
