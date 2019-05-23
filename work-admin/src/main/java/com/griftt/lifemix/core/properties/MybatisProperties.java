package com.griftt.lifemix.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("mybatis-plus")
public class MybatisProperties {
 private String typeAliasesPackage;
 private String mapperLocation;
 private String callSettersOnNulls;

}
