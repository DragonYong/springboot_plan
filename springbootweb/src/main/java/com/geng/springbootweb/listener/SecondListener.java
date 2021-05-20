package com.geng.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Time: 2021-05-20 16:18
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: SecondListen.java
 * @Program: springbootweb
 * @Package: com.geng.springbootweb.listener
 * 整合Listen配置
 **/
public class SecondListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent event) {

    }

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Second....Listener ...... Init");
    }
}
