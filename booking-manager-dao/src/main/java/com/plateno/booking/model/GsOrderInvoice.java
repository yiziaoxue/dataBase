package com.plateno.booking.model;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:39
 */
public class GsOrderInvoice{
	private Integer id;	//主键
	private String orderCode;	//订单编号
	private String invoiceTitle;	//发票抬头
	private String invoiceValue;	//发票内容
	private Integer invoiceType;	//发票类型
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private String invoiceCode;	//发票类型编码
	private String invoiceMsg;	//发票信息


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

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(String invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateOprt() {
		return createOprt;
	}

	public void setCreateOprt(Integer createOprt) {
		this.createOprt = createOprt;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceMsg() {
		return invoiceMsg;
	}

	public void setInvoiceMsg(String invoiceMsg) {
		this.invoiceMsg = invoiceMsg;
	}

}