package com.geng.springbootserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer  // 开启admin端服务端
public class SpringbootserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootserverApplication.class, args);
    }

}
