package com.geng.springbootfreemarker.entity;

/**
 * @Time: 2021-05-20 19:04
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: Users.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootfreemarker.entity
 **/
public class Users {
    private String username;
    private String usersex;
    private String userage;

    public Users(String username, String usersex, String userage) {
        this.username = username;
        this.usersex = usersex;
        this.userage = userage;
    }

    public Users() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }
}
