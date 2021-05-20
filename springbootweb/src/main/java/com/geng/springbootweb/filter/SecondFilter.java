package com.geng.springbootweb.filter;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Time: 2021-05-20 16:02
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: SecondFilter.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.filter
 **/
//整合Filter方式二

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Second Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开Second Filter");
    }

    @Override
    public void destroy() {

    }
}
