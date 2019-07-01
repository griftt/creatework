package com.griftt.lifemix.transactionmanagement;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 配置多个数据源做数据管理
 */

//@Configuration
public class TransactionManegementConfig {


    /**
     * 默认数据库
     * @param dataSource
     * @return
     */
    @Bean
    public PlatformTransactionManager primaryTransactionManagement(@Qualifier("primaryDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * 动态数据库
     * @return
     */
    @Bean
    public PlatformTransactionManager multiTransactionManagement(@Qualifier("multiDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);

    }

}
