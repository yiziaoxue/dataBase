package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:36
 */
public class GsOrderExtra{
	private Integer id;	//主键
	private String orderCode;	//订单id
	private Double origRate;	//商品原始价
	private Double mebRate;	//商品会员价
	private Double totalRate;	//商品总价
	private String name;	//名称
	private String remark;	//描述
	private Integer isFree;	//是否免费
	private Integer isCancelReturn;	//取消是否可返回
	private Integer isPrepare;	//是否前置（下单时就有该配置了）
	private Integer num;	//数量
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private Date updateTime;	//修改时间
	private Integer updateOprt;	//修改人


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

	public Double getOrigRate() {
		return origRate;
	}

	public void setOrigRate(Double origRate) {
		this.origRate = origRate;
	}

	public Double getMebRate() {
		return mebRate;
	}

	public void setMebRate(Double mebRate) {
		this.mebRate = mebRate;
	}

	public Double getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(Double totalRate) {
		this.totalRate = totalRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsFree() {
		return isFree;
	}

	public void setIsFree(Integer isFree) {
		this.isFree = isFree;
	}

	public Integer getIsCancelReturn() {
		return isCancelReturn;
	}

	public void setIsCancelReturn(Integer isCancelReturn) {
		this.isCancelReturn = isCancelReturn;
	}

	public Integer getIsPrepare() {
		return isPrepare;
	}

	public void setIsPrepare(Integer isPrepare) {
		this.isPrepare = isPrepare;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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

}