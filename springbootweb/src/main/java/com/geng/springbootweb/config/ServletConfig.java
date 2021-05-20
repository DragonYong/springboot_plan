package com.geng.springbootweb.config;

import com.geng.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Time: 2021-05-20 15:26
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: ServletConfig.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.config
 **/
@Configuration
public class ServletConfig {
    // 完成servlet组件的注册
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }
}
