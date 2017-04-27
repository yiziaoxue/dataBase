package com.plateno.booking.param;

import com.plateno.booking.model.GsOrderInn;

/**
* @author zhenhua.chun 
* @version 2016年12月13日 下午9:30:24
* @Description
*/
public class OrderInnParam extends GsOrderInn{
	
	private Integer firstItem;
	private Integer lastItem;
	
	public Integer getFirstItem() {
		return firstItem;
	}
	public void setFirstItem(Integer firstItem) {
		this.firstItem = firstItem;
	}
	public Integer getLastItem() {
		return lastItem;
	}
	public void setLastItem(Integer lastItem) {
		this.lastItem = lastItem;
	}
	
}
