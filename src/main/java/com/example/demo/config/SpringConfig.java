package com.example.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
@PropertySource("classpath:config/db.properties")
/**
 　* @description: database数据库基础信息
 　* @author dqy
 　* @date 2019/11/24
 　*/
public class SpringConfig {
    @Value("${db_url}")
    private String url;
    @Value("${db_username}")
    private String username;
    @Value("${db_password}")
    private String password;
    @Value("${db_driver}")
    private String driver;

    @Bean
    public DriverManagerDataSource driverManagerDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(driverManagerDataSource());
    }
}
