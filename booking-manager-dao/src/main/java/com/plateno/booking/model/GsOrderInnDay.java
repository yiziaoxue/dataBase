package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:39
 */
public class GsOrderInnDay{
	private Integer id;	//主键
	private String orderCode;	//订单编码
	private Integer memberId;	//会员编码
	private Date roomDay;	//入住时间
	private Double roomRate;	//房间原始单价
	private Double roomMemberRate;	//房间会员单价
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private Date updateTime;	//修改时间
	private Integer updateOprt;	//修改人
	private Double roomActivityRate;	//房间活动单价
	private String activityCode;	//活动编码
	private String activityItem;	//活动账目
	private Integer tranType;	//记账方式
	private Double backCash;	//返现金额
	private String marketId;	//市场ID
	private Integer returnPoint;	//预付返还积分
	private Integer mebType;	//会员类型
	private Integer spotReturnPoint;	//现付返还积分
	private String currency;	//币种：CNY-人民币
	private Integer storeReturnPoint;	//全储值返还积分


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

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Date getRoomDay() {
		return roomDay;
	}

	public void setRoomDay(Date roomDay) {
		this.roomDay = roomDay;
	}

	public Double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(Double roomRate) {
		this.roomRate = roomRate;
	}

	public Double getRoomMemberRate() {
		return roomMemberRate;
	}

	public void setRoomMemberRate(Double roomMemberRate) {
		this.roomMemberRate = roomMemberRate;
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

	public Double getRoomActivityRate() {
		return roomActivityRate;
	}

	public void setRoomActivityRate(Double roomActivityRate) {
		this.roomActivityRate = roomActivityRate;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityItem() {
		return activityItem;
	}

	public void setActivityItem(String activityItem) {
		this.activityItem = activityItem;
	}

	public Integer getTranType() {
		return tranType;
	}

	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}

	public Double getBackCash() {
		return backCash;
	}

	public void setBackCash(Double backCash) {
		this.backCash = backCash;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public Integer getReturnPoint() {
		return returnPoint;
	}

	public void setReturnPoint(Integer returnPoint) {
		this.returnPoint = returnPoint;
	}

	public Integer getMebType() {
		return mebType;
	}

	public void setMebType(Integer mebType) {
		this.mebType = mebType;
	}

	public Integer getSpotReturnPoint() {
		return spotReturnPoint;
	}

	public void setSpotReturnPoint(Integer spotReturnPoint) {
		this.spotReturnPoint = spotReturnPoint;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getStoreReturnPoint() {
		return storeReturnPoint;
	}

	public void setStoreReturnPoint(Integer storeReturnPoint) {
		this.storeReturnPoint = storeReturnPoint;
	}

}