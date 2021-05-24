package com.geng.springbootjdbc.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Time: 2021-05-21 06:24
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: JdbcProperties.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.config
 * jdbc配置信息属性类
 **/
@ConfigurationProperties(prefix = "jdbc")  // 是spring的注解不能读取ITA配置文件，智能读取spring的
public class JdbcProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
