package com.griftt.lifemix.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author griftt
 */
@Configuration
@Data
@ConfigurationProperties(prefix ="spring.datasource")
public class DuridConfigProperties {
    //开发数据库

    private SQLConnectParmter dev;

    //生产数据库
    private SQLConnectParmter prod;

    //基础配置
    private  DruidCommonProperties druidCommonProperties;


}

