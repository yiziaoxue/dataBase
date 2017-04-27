package com.plateno.booking.config;
/**
* @author zhenhua.chun 
* @version 2017年1月12日 下午4:41:27
* @Description
*/
public class ThreadHolder {
	private Integer dataSourceType;

	private String currentDataSourceType;

	public Integer getDataSourceType() {
		return dataSourceType;
	}

	public void setDataSourceType(Integer dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public String getCurrentDataSourceType() {
		return currentDataSourceType;
	}

	public void setCurrentDataSourceType(String currentDataSourceType) {
		this.currentDataSourceType = currentDataSourceType;
	}

}
