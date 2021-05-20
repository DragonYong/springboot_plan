package com.geng.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Time: 2021-05-20 16:12
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: FirstListener.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.listener
 * 整合Listener
 **/
@WebListener
public class FirstListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent event) {

    }

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("First....Listener ...... Init");
    }
}
