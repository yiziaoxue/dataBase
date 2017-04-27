package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:36
 */
public class GsOrderBackpayLog{
	private Integer id;	//主键
	private String orderCode;	//订单编码
	private String folioId;	//房单号
	private String chainId;	//第三方酒店id
	private Integer folioState;	//房单状态
	private Double totalDay;	//房单总房晚数
	private Double useDay;	//实际使用的房晚数
	private Double origPayAmount;	//原本支付价格
	private Double needPayAmount;	//房单实际需要扣款金额
	private Double pmsReturnAmount;	//pms的2319科目返储值金额
	private Double realReturnAmount;	//房单实际返储值金额
	private Date arrDate;	//实际入住时间
	private Date depDate;	//实际离店时间
	private Integer payChannel;	//支付渠道
	private String remark;	//备注
	private Integer flag;	//有效标志位（0：无效，1：有效）
	private Date createTime;	//创建时间


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

	public String getFolioId() {
		return folioId;
	}

	public void setFolioId(String folioId) {
		this.folioId = folioId;
	}

	public String getChainId() {
		return chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public Integer getFolioState() {
		return folioState;
	}

	public void setFolioState(Integer folioState) {
		this.folioState = folioState;
	}

	public Double getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(Double totalDay) {
		this.totalDay = totalDay;
	}

	public Double getUseDay() {
		return useDay;
	}

	public void setUseDay(Double useDay) {
		this.useDay = useDay;
	}

	public Double getOrigPayAmount() {
		return origPayAmount;
	}

	public void setOrigPayAmount(Double origPayAmount) {
		this.origPayAmount = origPayAmount;
	}

	public Double getNeedPayAmount() {
		return needPayAmount;
	}

	public void setNeedPayAmount(Double needPayAmount) {
		this.needPayAmount = needPayAmount;
	}

	public Double getPmsReturnAmount() {
		return pmsReturnAmount;
	}

	public void setPmsReturnAmount(Double pmsReturnAmount) {
		this.pmsReturnAmount = pmsReturnAmount;
	}

	public Double getRealReturnAmount() {
		return realReturnAmount;
	}

	public void setRealReturnAmount(Double realReturnAmount) {
		this.realReturnAmount = realReturnAmount;
	}

	public Date getArrDate() {
		return arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}