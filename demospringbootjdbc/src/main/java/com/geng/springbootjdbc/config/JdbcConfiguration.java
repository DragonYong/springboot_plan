package com.geng.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Time: 2021-05-21 06:00
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: JdbcConfiguration.java
 * @Program: springbootfreemarker
 * @Package: com.geng.demospringbootjdbc.config
 **/
//@Configuration
//@PropertySource("classpath:/jdbc.properties")  // 加载指定的properties配置文件
//@EnableConfigurationProperties(JdbcProperties.class)  // 指定加载那个配置信息的属性类
public class JdbcConfiguration {

//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

//    @Autowired
//    private JdbcProperties jdbcProperties;

    // 实例化Druid
    @Bean
    @ConfigurationProperties(prefix = "jdbc")  // 是spring的注解不能读取ITA配置文件，智能读取spring的
    public DataSource getDataSource() {
        DruidDataSource source = new DruidDataSource();

//        source.setUsername(this.password);
//        source.setPassword(this.username);
//        source.setUrl(this.url);
//        source.setDriverClassName(this.driverClassName);
//        source.setDriverClassName(this.jdbcProperties.getDriverClassName());
//        source.setUrl(this.jdbcProperties.getUrl());
//        source.setUsername(this.jdbcProperties.getUsername());
//        source.setPassword(this.jdbcProperties.getPassword());
        return source;
    }
}
