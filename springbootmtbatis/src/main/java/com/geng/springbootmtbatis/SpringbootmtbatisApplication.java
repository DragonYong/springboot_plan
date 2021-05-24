package com.geng.springbootmtbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.geng.springbootmtbatis.mapper")   // 指定扫描接口与映射配置文件的包名
public class SpringbootmtbatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmtbatisApplication.class, args);
    }

}
