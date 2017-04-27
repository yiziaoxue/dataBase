package com.plateno.booking.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
* @author zhenhua.chun 
* @version 2016年12月16日 下午12:58:45
* @Description 动态数据源.
*/
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	@Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
