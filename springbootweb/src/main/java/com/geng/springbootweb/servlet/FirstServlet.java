package com.geng.springbootweb.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Time: 2021-05-20 15:17
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: FirstServlet.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.servlet
 **/

/**
 * 整合servlet方式一
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("First servlet............");
    }
}
