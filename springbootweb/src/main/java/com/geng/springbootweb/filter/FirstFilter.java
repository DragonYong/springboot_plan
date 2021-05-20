package com.geng.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Time: 2021-05-20 15:42
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: FirstFilter.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.filter
 **/
// 整合Filter方式一

//@WebFilter(filterName = "FirstFilter", urlPatterns = {"*.do", "*.jsp"})
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入First Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开First Filter");
    }

    @Override
    public void destroy() {

    }

}
