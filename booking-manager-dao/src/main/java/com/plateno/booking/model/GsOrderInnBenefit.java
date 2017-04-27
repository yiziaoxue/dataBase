package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:39
 */
public class GsOrderInnBenefit{
	private Integer id;	//主键
	private String benefitCode;	//利益编码
	private String orderCode;	//订单编码
	private String itemCode;	//科目编码
	private Integer itemType;	//科目类型
	private Double spotAmount;	//现付数额（储值金额，抵用券金额，积分数目）
	private Double advanceAmount;	//预付数额（储值金额，抵用券金额，积分数目）
	private Double backAmount;	//后付数额（储值金额，抵用券金额，积分数目）
	private String currency;	//币种：CNY-人民币
	private Integer sellerId;	//销售者id
	private Date endOfDay;	//营业日
	private String tranDesc;	//交易描述
	private String thirdItemId;	//第三方科目
	private String innerRemark;	//内部备注
	private String remark;	//备注信息
	private String thirdOrderId;	//第三方订单号
	private String chainId;	//第三方酒店编码
	private Integer mebId;	//会员编码
	private Integer mebType;	//会员类型
	private Date usedBeginTime;	//使用开始时间
	private Date usedEndTime;	//使用结束时间
	private String useLimit;	//使用限制类型
	private String innIdLimit;	//酒店限制编码
	private String brandIdLimit;	//品牌限制编码
	private String cityIdLimit;	//城市限制编码
	private String innId;	//酒店编码
	private String addSource;	//增加来源
	private Integer channel;	//渠道（0：正常，1：客服）
	private Integer flag;	//有效标志（0：无效，1：有效）
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

	public String getBenefitCode() {
		return benefitCode;
	}

	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
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

	public Double getSpotAmount() {
		return spotAmount;
	}

	public void setSpotAmount(Double spotAmount) {
		this.spotAmount = spotAmount;
	}

	public Double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(Double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public Double getBackAmount() {
		return backAmount;
	}

	public void setBackAmount(Double backAmount) {
		this.backAmount = backAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Date getEndOfDay() {
		return endOfDay;
	}

	public void setEndOfDay(Date endOfDay) {
		this.endOfDay = endOfDay;
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

	public String getInnerRemark() {
		return innerRemark;
	}

	public void setInnerRemark(String innerRemark) {
		this.innerRemark = innerRemark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Integer getMebId() {
		return mebId;
	}

	public void setMebId(Integer mebId) {
		this.mebId = mebId;
	}

	public Integer getMebType() {
		return mebType;
	}

	public void setMebType(Integer mebType) {
		this.mebType = mebType;
	}

	public Date getUsedBeginTime() {
		return usedBeginTime;
	}

	public void setUsedBeginTime(Date usedBeginTime) {
		this.usedBeginTime = usedBeginTime;
	}

	public Date getUsedEndTime() {
		return usedEndTime;
	}

	public void setUsedEndTime(Date usedEndTime) {
		this.usedEndTime = usedEndTime;
	}

	public String getUseLimit() {
		return useLimit;
	}

	public void setUseLimit(String useLimit) {
		this.useLimit = useLimit;
	}

	public String getInnIdLimit() {
		return innIdLimit;
	}

	public void setInnIdLimit(String innIdLimit) {
		this.innIdLimit = innIdLimit;
	}

	public String getBrandIdLimit() {
		return brandIdLimit;
	}

	public void setBrandIdLimit(String brandIdLimit) {
		this.brandIdLimit = brandIdLimit;
	}

	public String getCityIdLimit() {
		return cityIdLimit;
	}

	public void setCityIdLimit(String cityIdLimit) {
		this.cityIdLimit = cityIdLimit;
	}

	public String getInnId() {
		return innId;
	}

	public void setInnId(String innId) {
		this.innId = innId;
	}

	public String getAddSource() {
		return addSource;
	}

	public void setAddSource(String addSource) {
		this.addSource = addSource;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
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