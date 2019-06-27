package com.griftt.lifemix.core.properties;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLException;

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

    public void config(DruidDataSource dataSource) {
        dataSource.setInitialSize(druidCommonProperties.getInitialSize());     //定义初始连接数
        dataSource.setMinIdle(druidCommonProperties.getMinIdle());             //最小空闲
        dataSource.setMaxActive(druidCommonProperties.getMaxActive());         //定义最大连接数
        dataSource.setMaxWait(druidCommonProperties.getMaxWait());             //最长等待时间

        // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setTimeBetweenEvictionRunsMillis(druidCommonProperties.getTimeBetweenEvictionRunsMillis());

        // 配置一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(druidCommonProperties.getMinEvictableIdleTimeMillis());
        // dataSource.setValidationQuery(null);
        // dataSource.setTestWhileIdle(druidCommonProperties.get);
        //dataSource.setTestOnBorrow(testOnBorrow);
        //dataSource.setTestOnReturn(testOnReturn);

        // 打开PSCache，并且指定每个连接上PSCache的大小
        // dataSource.setPoolPreparedStatements(druidCommonProperties.get);
        //dataSource.setMaxPoolPreparedStatementPerConnectionSize();

        try {
            dataSource.setFilters(druidCommonProperties.getFilters());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

