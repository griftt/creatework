package com.griftt.lifemix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//@SpringBootApplication
@MapperScan(basePackages = "com.griftt.biz.mapper")
@ComponentScan(basePackages = "com.griftt")
@EnableAsync(proxyTargetClass=true)
@EnableAspectJAutoProxy(proxyTargetClass=true)
//@EnableTransactionManagement
public class CreateforworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(CreateforworkApplication.class, args);
    }
}


