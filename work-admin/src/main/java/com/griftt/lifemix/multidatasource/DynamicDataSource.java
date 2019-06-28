package com.griftt.lifemix.multidatasource;

import cn.stylefeng.roses.core.mutidatasource.DataSourceContextHolder;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 此处用于切换相应的数据库
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceType();
    }
}
