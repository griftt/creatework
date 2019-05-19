package com.griftt.lifemix.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
//@PropertySource("classpath:config/application-druid.yml")
@ConfigurationProperties(prefix ="spring.datasource")
public class DruidDataSource {
    //开发数据库
    private SQLConnectParmter dev;

    //生产数据库
    private SQLConnectParmter prod;

}
