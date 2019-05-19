package com.griftt.lifemix.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author griftt
 */
//@Configuration
//@PropertySource("classpath:config/application-druid.yml")
//@ConfigurationProperties(prefix ="spring.datasource")
public class DuridConfigProperties {
    //开发数据库
    private SQLConnectParmter dev;

    //生产数据库
    private SQLConnectParmter prod;




    public SQLConnectParmter getDev() {
        return dev;
    }

    public void setDev(SQLConnectParmter dev) {
        this.dev = dev;
    }

    public SQLConnectParmter getProd() {
        return prod;
    }
    public void setProd(SQLConnectParmter prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "DuridConfig{" +
                "dev=" + dev +
                ", prod=" + prod +
                '}';
    }
}

