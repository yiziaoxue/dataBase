package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:36
 */
public class GsOrderAccount{
	private Integer id;	//主键
	private String accountCode;	//账单编码
	private String orderCode;	//订单编码
	private String itemCode;	//科目编码
	private Integer itemType;	//科目类型
	private Double amount;	//金额
	private String currency;	//币种：CNY-人民币
	private Date endOfDay;	//营业日
	private String merchantNo;	//支付商户号（区分是app支付商户，官网支付商户，微信支付商户）
	private String payOrderNo;	//支付服务订单号
	private Integer payChannel;	//支付渠道（1微信渠道，微信公众平台支付；3微信渠道，微信开放平台支付；5 支付宝渠道，支付宝支付；等等）
	private String tranDesc;	//交易描述
	private String thirdItemId;	//第三方科目编码
	private String remark;	//备注
	private Integer positiveFlag;	//正数标志（1：正数，0：负数）
	private Integer flag;	//账单标志（1：有效，0：无效）
	private String thirdOrderId;	//第三方订单号
	private String chainId;	//第三方酒店id
	private String couponId;	//优惠券id
	private Double useCount;	//使用个数
	private Integer isReturn;	//取消是否返回（0：不返，1：返，默认1）
	private String externalId;	//订单外部跟踪号
	private String ext;	//扩展字段
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getEndOfDay() {
		return endOfDay;
	}

	public void setEndOfDay(Date endOfDay) {
		this.endOfDay = endOfDay;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public String getTranDesc() {
		return tranDesc;
	}

	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}

	public String getThirdItemId() {
		return thirdItemId;
	}

	public void setThirdItemId(String thirdItemId) {
		this.thirdItemId = thirdItemId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPositiveFlag() {
		return positiveFlag;
	}

	public void setPositiveFlag(Integer positiveFlag) {
		this.positiveFlag = positiveFlag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getThirdOrderId() {
		return thirdOrderId;
	}

	public void setThirdOrderId(String thirdOrderId) {
		this.thirdOrderId = thirdOrderId;
	}

	public String getChainId() {
		return chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Double getUseCount() {
		return useCount;
	}

	public void setUseCount(Double useCount) {
		this.useCount = useCount;
	}

	public Integer getIsReturn() {
		return isReturn;
	}

	public void setIsReturn(Integer isReturn) {
		this.isReturn = isReturn;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
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

}