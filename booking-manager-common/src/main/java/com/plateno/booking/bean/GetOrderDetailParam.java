package com.plateno.booking.bean;

import com.plateno.annotation.NotNull;

/**
* @author zhenhua.chun 
* @version 2016年12月5日 下午5:39:41
* @Description
*/
public class GetOrderDetailParam{
	
	private Integer offset;
	
	private Integer limit;
	
	private String orderCode; // 订单编码 是
	
	private Integer memberId; // 会员 id 否
	
	private Integer page;
	
	private Integer total;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
