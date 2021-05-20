package com.geng.springbootweb.config;

import com.geng.springbootweb.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Time: 2021-05-20 16:04
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: FilterConfig.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.config
 **/
/*
filter配置类
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        // filterRegistrationBean.addUrlPatterns(new String[]  {"*.do","*.jsp"});
        filterRegistrationBean.addUrlPatterns("/second");
        return filterRegistrationBean;
    }
}
