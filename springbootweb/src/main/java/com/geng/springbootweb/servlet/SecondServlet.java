package com.geng.springbootweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Time: 2021-05-20 15:24
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: SecondServlet.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.servlet
 **/
/*
整合方式二
 */
public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Second servlet............");
    }
}
