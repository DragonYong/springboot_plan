package com.geng.springbootjdbc.entity;

/**
 * @Time: 2021-05-21 07:01
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: Users.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.entity
 **/
public class Users {
    private String username;
    private Integer userid;
    private String usersex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }
}
