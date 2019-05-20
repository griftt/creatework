package com.griftt.lifemix.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
public class DruidCommonProperties {
    private String type;
    private Integer initialSize;
    private  Integer minIdle;
    private  Integer maxActive;
    private  Integer maxWait;
    private Integer timeBetweenEvictionRunsMillis;
    private Integer minEvictableIdleTimeMillis;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private String  filters;
    private boolean logSlowSql;

}
