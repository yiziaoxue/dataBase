package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:36
 */
public class GsOrderBackpay{
	private Integer id;	//主键
	private String orderCode;	//订单编码
	private String thirdOrderCode;	//第三方订单号
	private Integer memberId;	//会员编码
	private Integer memberType;	//固定传1，支付服务有定义是铂涛的，非铂涛的
	private Double amount;	//扣款金额
	private Integer origFolioNum;	//预计推送的房单个数
	private Integer realFolioNum;	//实际推送的房单个数
	private Integer payChannel;	//支付渠道
	private String remark;	//备注
	private Integer callState;	//通知状态 0 未通知，1 待通知，2 已通知
	private Integer callCount;	//通知次数
	private Integer flag;	//有效标志位（0无效，1有效）
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

	public String getThirdOrderCode() {
		return thirdOrderCode;
	}

	public void setThirdOrderCode(String thirdOrderCode) {
		this.thirdOrderCode = thirdOrderCode;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getOrigFolioNum() {
		return origFolioNum;
	}

	public void setOrigFolioNum(Integer origFolioNum) {
		this.origFolioNum = origFolioNum;
	}

	public Integer getRealFolioNum() {
		return realFolioNum;
	}

	public void setRealFolioNum(Integer realFolioNum) {
		this.realFolioNum = realFolioNum;
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

	public Integer getCallState() {
		return callState;
	}

	public void setCallState(Integer callState) {
		this.callState = callState;
	}

	public Integer getCallCount() {
		return callCount;
	}

	public void setCallCount(Integer callCount) {
		this.callCount = callCount;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}