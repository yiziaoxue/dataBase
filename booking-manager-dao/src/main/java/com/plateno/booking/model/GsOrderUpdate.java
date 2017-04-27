package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public class GsOrderUpdate{
	private Integer id;	//主键
	private String orderCode;	//订单编码
	private String oldOrderCode;	//修改前的订单编码
	private Double oldPayRate;	//修改前的订单支付价
	private String newOrderCode;	//修改后的订单编码
	private Date createTime;	//创建时间
	private Date updateTime;	//修改时间


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOldOrderCode() {
		return oldOrderCode;
	}

	public void setOldOrderCode(String oldOrderCode) {
		this.oldOrderCode = oldOrderCode;
	}

	public Double getOldPayRate() {
		return oldPayRate;
	}

	public void setOldPayRate(Double oldPayRate) {
		this.oldPayRate = oldPayRate;
	}

	public String getNewOrderCode() {
		return newOrderCode;
	}

	public void setNewOrderCode(String newOrderCode) {
		this.newOrderCode = newOrderCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}