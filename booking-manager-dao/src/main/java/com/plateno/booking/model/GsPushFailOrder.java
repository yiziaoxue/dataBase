package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:20
 */
public class GsPushFailOrder{
	private Integer id;	//
	private String recordKey;	//执行识别码，唯一
	private String contentJson;	//执行内容 
	private Integer state;	//执行状态 1 :success ；2：fail
	private Integer execcount;	//执行次数
	private Integer pushType;	//推送类型
	private Date createTime;	//创建时间
	private Date updateTime;	//修改时间
	private Integer memberId;	//
	private String errorMsg;	//
	private Integer orderState;	//


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(String recordKey) {
		this.recordKey = recordKey;
	}

	public String getContentJson() {
		return contentJson;
	}

	public void setContentJson(String contentJson) {
		this.contentJson = contentJson;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getExeccount() {
		return execcount;
	}

	public void setExeccount(Integer execcount) {
		this.execcount = execcount;
	}

	public Integer getPushType() {
		return pushType;
	}

	public void setPushType(Integer pushType) {
		this.pushType = pushType;
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

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

}