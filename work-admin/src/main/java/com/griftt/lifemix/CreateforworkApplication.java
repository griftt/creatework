package com.griftt.lifemix;

import com.griftt.lifemix.core.properties.DuridConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableConfigurationProperties(DuridConfigProperties.class)
@ServletComponentScan("com.griftt.lifemix.filter")
public class CreateforworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(CreateforworkApplication.class, args);
    }
}
