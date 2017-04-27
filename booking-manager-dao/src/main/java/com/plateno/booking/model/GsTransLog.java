package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:40
 */
public class GsTransLog{
	private Integer id;	//主键
	private String orderCode;	//订单编码
	private String thirdCode;	//第三方房单号
	private String accountCode;	//账单编码
	private String innId;	//酒店编码
	private String chainId;	//第三方酒店编码
	private Double transAmount;	//入账金额
	private Date endOfDay;	//营业日
	private String remark;	//备注
	private Integer callState;	//通知第三方状态，0 未通知，1 待通知，2 已通知
	private Integer callCount;	//通知次数
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private Date updateTime;	//修改时间
	private Integer updateOprt;	//修改人
	private String thirdItemId;	//第三方记账科目
	private String ext;	//扩展字段


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

	public String getThirdCode() {
		return thirdCode;
	}

	public void setThirdCode(String thirdCode) {
		this.thirdCode = thirdCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getInnId() {
		return innId;
	}

	public void setInnId(String innId) {
		this.innId = innId;
	}

	public String getChainId() {
		return chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Date getEndOfDay() {
		return endOfDay;
	}

	public void setEndOfDay(Date endOfDay) {
		this.endOfDay = endOfDay;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateOprt() {
		return updateOprt;
	}

	public void setUpdateOprt(Integer updateOprt) {
		this.updateOprt = updateOprt;
	}

	public String getThirdItemId() {
		return thirdItemId;
	}

	public void setThirdItemId(String thirdItemId) {
		this.thirdItemId = thirdItemId;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}