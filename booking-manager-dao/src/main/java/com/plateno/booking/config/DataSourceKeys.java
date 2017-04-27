package com.plateno.booking.config;

import java.util.ArrayList;
import java.util.List;
/**
 * 保存所有dataSourceKeys
 * @author Giant
 *
 */
public class DataSourceKeys {

	/**
	 * 数据源所有的key值
	 */
	public static List<Integer> dataSourceKeyList = new ArrayList<Integer>();

	/**
	 * @return
	 */
	public static List<Integer> getDataSourceKeyList(){
		return dataSourceKeyList;
	}
}
