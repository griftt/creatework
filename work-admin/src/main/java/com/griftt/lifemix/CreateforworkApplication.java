package com.griftt.lifemix;

import com.griftt.lifemix.core.properties.DuridConfigProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan(basePackages = "com.griftt.biz.mapper")
@ComponentScan(basePackages = "com.griftt")
public class CreateforworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(CreateforworkApplication.class, args);
    }
}
