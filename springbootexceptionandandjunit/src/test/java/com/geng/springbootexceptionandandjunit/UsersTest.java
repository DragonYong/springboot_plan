package com.geng.springbootexceptionandandjunit;


import com.geng.springbootexceptionandandjunit.service.UsersServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Time: 2021-05-22 15:30
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersTest.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootexceptionandandjunit.model
 **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SpringbootexceptionandandjunitApplication.class)
@SpringBootTest
public class UsersTest {
//    @Test
//    public void app() {
//        System.out.println("OK");
//    }

    @Autowired
    private UsersServiceImpl usersService;

    @Test
    public void sdfgfhk() {
        this.usersService.addUser();
    }
}
