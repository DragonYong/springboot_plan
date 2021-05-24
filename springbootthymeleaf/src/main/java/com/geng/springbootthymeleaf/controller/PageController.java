package com.geng.springbootthymeleaf.controller;

import com.geng.springbootthymeleaf.entity.Users;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.rmi.MarshalledObject;
import java.util.*;

/**
 * @Time: 2021-05-20 12:54
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: PageController.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootthymeleaf.controller
 **/
@Controller
public class PageController {
    @GetMapping("/show")
    public String showPage(Model model, HttpServletRequest request) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        model.addAttribute("date", new Date());
        model.addAttribute("sex", "男");
        model.addAttribute("id", 1);

        List<Users> list = new ArrayList<>();
        list.add(new Users("lizi", "1", 3123));
        list.add(new Users("awd", "2", 3123));
        list.add(new Users("das", "3", 31));
        list.add(new Users("sda", "4", 213));
        model.addAttribute("list", list);


        Map<String, Users> map = new HashMap<>();
        map.put("user1", new Users("sajd", "1", 212));
        map.put("user2", new Users("sdf", "2", 768));
        map.put("user3", new Users("asd", "3", 4353));
        model.addAttribute("map", map);

        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("ses", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "app");

        model.addAttribute("id", 100);
        model.addAttribute("name", "old");
        return "index";
    }

    @GetMapping("/show2")
    public String show2(String id, String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }

    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id,
                        @PathVariable String name) {
        System.out.println(id+" "+name);
        return "index2";
    }

    @GetMapping("/show4/{id}")
    public String show4(@PathVariable String id,
                        String name) {
        System.out.println(id+" "+name);
        return "index2";
    }
}
