package com.geng.springbootvalidate.entity;



import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Time: 2021-05-22 16:10
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: Users.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootvalidate.entity
 **/

public class Users {
    //    @NotNull(message = "用户id不能为空")
    @NotNull(message = "{userid.notnull}")
    private Integer userid;
    //    @NotBlank(message = "用户姓名不能为空")
    @NotBlank(message = "{username.notnull}")
    @Length(min = 3,max = 8,message = "个撒京东国际丧假看结果")
    private String username;
    @NotBlank(message = "用户性别不能为空")
    private String usersex;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                '}';
    }
}
