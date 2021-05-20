package com.geng.springbootweb.config;

import com.geng.springbootweb.listener.SecondListener;
import com.geng.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Time: 2021-05-20 16:19
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: ListenerConfig.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.config
 **/
@Configuration
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new
                ServletListenerRegistrationBean(new SecondListener());

        return servletListenerRegistrationBean;
    }
}
