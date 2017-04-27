package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:38
 */
public class GsOrderInnAsset{
	private Integer id;	//主键
	private String accountCode;	//账单编码
	private String orderCode;	//订单编码
	private Double offsetPrices;	//抵消价格
	private Integer itemId;	//项目id
	private String itemName;	//项目名称
	private Integer count;	//使用数目
	private String remark;	//描述
	private Integer isCancelReturn;	//取消是否可返回
	private Integer isPrepare;	//是否前置（下单时就有该配置了）
	private Integer flag;	//有效标志位
	private String ext;	//扩展字段
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private Date updateTime;	//修改时间
	private Integer updateOprt;	//修改人
	private String ext2;	//扩展字段2
	private String merchantno;	//支付商户号
	private String ext3;	//扩展字段3


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

	public Double getOffsetPrices() {
		return offsetPrices;
	}

	public void setOffsetPrices(Double offsetPrices) {
		this.offsetPrices = offsetPrices;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
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

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getMerchantno() {
		return merchantno;
	}

	public void setMerchantno(String merchantno) {
		this.merchantno = merchantno;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

}