package com.plateno.booking.model;
import java.util.Date;
/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:38
 */
public class GsOrderInn{
	private Integer id;	//主键
	private String orderCode;	//订单编号
	private String thirdOrderCode;	//第三方订单编码
	private String innId;	//
	private String innName;	//酒店名称
	private String chainId;	//
	private String roomTypeId;	//
	private String roomTypeName;	//房间类型名称
	private String thirdRoomtypeId;	//
	private Integer bkMebId;	//预订人会员id
	private String bkName;	//预订人姓名
	private String bkMobile;	//预订人手机
	private String bkEmail;	//预订人电子邮箱
	private Integer bkMebType;	//预订人会员类型
	private String bkCardNo;	//预订人卡号
	private Integer bkPropertyId;	//预订人属性id
	private Integer bkProtypeId;	//预订人属性类型id
	private String contactName;	//联系人姓名
	private String contactPhone;	//联系人电话号码
	private String contactEmail;	//联系人电子邮箱
	private String guestsName;	//入住人姓名
	private Integer guestsNum;	//客人数量
	private String bkIp;	//预订人ip地址
	private Integer supplierId;	//供应商信息id
	private Integer assureType;	//担保类型
	private Integer assureMebPoint;	//会员担保积分
	private Integer sourceType;	//预订来源，app，官网，M站，微信等
	private String innerRemarks;	//员工内部备注
	private String remarks;	//备注
	private Integer orderState;	//订单状态 （0待确认，1预订成功，2已取消，3预订未到，4已入住，5已完成，6确认失败）
	private String activityCode;	//
	private Integer sellerId;	//业绩销售员
	private Integer payState;	//支付状态 0未付款 1已付款 2退款处理中 3已退款
	private Integer canCancel;	//是否可以取消
	private Integer needInvoice;	//是否需要发票
	private Integer payType;	//支付方式(0到付；1线上预付；2信用住)
	private Double origRate;	//原价
	private Double totalRate;	//总价
	private Double payRate;	//支付价
	private Double discPrice;	//优惠金额（根据资产子表）
	private String rateCode;	//价格代码
	private Date origArrDate;	//预计抵店时间
	private Date origDepDate;	//预计离店时间
	private Date arrDate;	//实际到店时间
	private Date depDate;	//实际离店时间
	private Integer dayLength;	//入住天数
	private Integer roomQty;	//房间数
	private Date canCancelTime;	//取消截止时间
	private Date keepDate;	//保留时间
	private Integer flag;	//订单标志位 1可用 0不可用
	private Date createTime;	//创建时间
	private Integer createOprt;	//创建人
	private Date updateTime;	//修改时间
	private Integer updateOprt;	//修改人
	private Integer channelSourceType;	//订单渠道来源
	private String externalId;	//外部跟踪号
	private String brandId;	//品牌编码
	private String roomSourceType;	//房源编码
	private String cityCode;	//城市编码
	private Double chargedRate;	//后付订单实扣金额
	private String timeZone;	//酒店时区
	private String innEngName;	//酒店英文名称
	private String roomTypeEngName;	//房型英文名称
	private String bkLastName;	//预订人英文姓（中文拼音姓）
	private String bkFirstName;	//预订人英文名（中文拼音名）
	private String countryCode;	//国家编码
	private String preference;	//客户偏好（逗号隔开）
	private String currency;	//币种：CNY-人民币
	private Integer overtimeState;	//超时状态（0无,1下单超时,2取消超时）
	private Integer accState;	//账单状态
	private String concatLastName;	//联系人英文姓（中文拼音姓）
	private String concatFirstName;	//联系人英文名（中文拼音名）
	private String channelCode;	//酒店房态渠道来源
	private Integer businessMebId;	//企业会员id
	private Integer businessMebType;	//企业会员类型
	private Double minPayRate;	//订单最低消费金额
	private Integer minLiveDays;	//订单最低连住天数
	private Integer orderType;	//订单业务类型（2酒+景 3酒店 4酒+机）
	private Integer saleType;	//销售类型（1单独销售 2捆绑礼包销售）


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

	public String getInnId() {
		return innId;
	}

	public void setInnId(String innId) {
		this.innId = innId;
	}

	public String getInnName() {
		return innName;
	}

	public void setInnName(String innName) {
		this.innName = innName;
	}

	public String getChainId() {
		return chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getThirdRoomtypeId() {
		return thirdRoomtypeId;
	}

	public void setThirdRoomtypeId(String thirdRoomtypeId) {
		this.thirdRoomtypeId = thirdRoomtypeId;
	}

	public Integer getBkMebId() {
		return bkMebId;
	}

	public void setBkMebId(Integer bkMebId) {
		this.bkMebId = bkMebId;
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public String getBkMobile() {
		return bkMobile;
	}

	public void setBkMobile(String bkMobile) {
		this.bkMobile = bkMobile;
	}

	public String getBkEmail() {
		return bkEmail;
	}

	public void setBkEmail(String bkEmail) {
		this.bkEmail = bkEmail;
	}

	public Integer getBkMebType() {
		return bkMebType;
	}

	public void setBkMebType(Integer bkMebType) {
		this.bkMebType = bkMebType;
	}

	public String getBkCardNo() {
		return bkCardNo;
	}

	public void setBkCardNo(String bkCardNo) {
		this.bkCardNo = bkCardNo;
	}

	public Integer getBkPropertyId() {
		return bkPropertyId;
	}

	public void setBkPropertyId(Integer bkPropertyId) {
		this.bkPropertyId = bkPropertyId;
	}

	public Integer getBkProtypeId() {
		return bkProtypeId;
	}

	public void setBkProtypeId(Integer bkProtypeId) {
		this.bkProtypeId = bkProtypeId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getGuestsName() {
		return guestsName;
	}

	public void setGuestsName(String guestsName) {
		this.guestsName = guestsName;
	}

	public Integer getGuestsNum() {
		return guestsNum;
	}

	public void setGuestsNum(Integer guestsNum) {
		this.guestsNum = guestsNum;
	}

	public String getBkIp() {
		return bkIp;
	}

	public void setBkIp(String bkIp) {
		this.bkIp = bkIp;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getAssureType() {
		return assureType;
	}

	public void setAssureType(Integer assureType) {
		this.assureType = assureType;
	}

	public Integer getAssureMebPoint() {
		return assureMebPoint;
	}

	public void setAssureMebPoint(Integer assureMebPoint) {
		this.assureMebPoint = assureMebPoint;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public String getInnerRemarks() {
		return innerRemarks;
	}

	public void setInnerRemarks(String innerRemarks) {
		this.innerRemarks = innerRemarks;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getPayState() {
		return payState;
	}

	public void setPayState(Integer payState) {
		this.payState = payState;
	}

	public Integer getCanCancel() {
		return canCancel;
	}

	public void setCanCancel(Integer canCancel) {
		this.canCancel = canCancel;
	}

	public Integer getNeedInvoice() {
		return needInvoice;
	}

	public void setNeedInvoice(Integer needInvoice) {
		this.needInvoice = needInvoice;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Double getOrigRate() {
		return origRate;
	}

	public void setOrigRate(Double origRate) {
		this.origRate = origRate;
	}

	public Double getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(Double totalRate) {
		this.totalRate = totalRate;
	}

	public Double getPayRate() {
		return payRate;
	}

	public void setPayRate(Double payRate) {
		this.payRate = payRate;
	}

	public Double getDiscPrice() {
		return discPrice;
	}

	public void setDiscPrice(Double discPrice) {
		this.discPrice = discPrice;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public Date getOrigArrDate() {
		return origArrDate;
	}

	public void setOrigArrDate(Date origArrDate) {
		this.origArrDate = origArrDate;
	}

	public Date getOrigDepDate() {
		return origDepDate;
	}

	public void setOrigDepDate(Date origDepDate) {
		this.origDepDate = origDepDate;
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

	public Integer getDayLength() {
		return dayLength;
	}

	public void setDayLength(Integer dayLength) {
		this.dayLength = dayLength;
	}

	public Integer getRoomQty() {
		return roomQty;
	}

	public void setRoomQty(Integer roomQty) {
		this.roomQty = roomQty;
	}

	public Date getCanCancelTime() {
		return canCancelTime;
	}

	public void setCanCancelTime(Date canCancelTime) {
		this.canCancelTime = canCancelTime;
	}

	public Date getKeepDate() {
		return keepDate;
	}

	public void setKeepDate(Date keepDate) {
		this.keepDate = keepDate;
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

	public Integer getChannelSourceType() {
		return channelSourceType;
	}

	public void setChannelSourceType(Integer channelSourceType) {
		this.channelSourceType = channelSourceType;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getRoomSourceType() {
		return roomSourceType;
	}

	public void setRoomSourceType(String roomSourceType) {
		this.roomSourceType = roomSourceType;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Double getChargedRate() {
		return chargedRate;
	}

	public void setChargedRate(Double chargedRate) {
		this.chargedRate = chargedRate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getInnEngName() {
		return innEngName;
	}

	public void setInnEngName(String innEngName) {
		this.innEngName = innEngName;
	}

	public String getRoomTypeEngName() {
		return roomTypeEngName;
	}

	public void setRoomTypeEngName(String roomTypeEngName) {
		this.roomTypeEngName = roomTypeEngName;
	}

	public String getBkLastName() {
		return bkLastName;
	}

	public void setBkLastName(String bkLastName) {
		this.bkLastName = bkLastName;
	}

	public String getBkFirstName() {
		return bkFirstName;
	}

	public void setBkFirstName(String bkFirstName) {
		this.bkFirstName = bkFirstName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getOvertimeState() {
		return overtimeState;
	}

	public void setOvertimeState(Integer overtimeState) {
		this.overtimeState = overtimeState;
	}

	public Integer getAccState() {
		return accState;
	}

	public void setAccState(Integer accState) {
		this.accState = accState;
	}

	public String getConcatLastName() {
		return concatLastName;
	}

	public void setConcatLastName(String concatLastName) {
		this.concatLastName = concatLastName;
	}

	public String getConcatFirstName() {
		return concatFirstName;
	}

	public void setConcatFirstName(String concatFirstName) {
		this.concatFirstName = concatFirstName;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Integer getBusinessMebId() {
		return businessMebId;
	}

	public void setBusinessMebId(Integer businessMebId) {
		this.businessMebId = businessMebId;
	}

	public Integer getBusinessMebType() {
		return businessMebType;
	}

	public void setBusinessMebType(Integer businessMebType) {
		this.businessMebType = businessMebType;
	}

	public Double getMinPayRate() {
		return minPayRate;
	}

	public void setMinPayRate(Double minPayRate) {
		this.minPayRate = minPayRate;
	}

	public Integer getMinLiveDays() {
		return minLiveDays;
	}

	public void setMinLiveDays(Integer minLiveDays) {
		this.minLiveDays = minLiveDays;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getSaleType() {
		return saleType;
	}

	public void setSaleType(Integer saleType) {
		this.saleType = saleType;
	}

}