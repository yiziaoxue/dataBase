package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:20
 */
public class SysArea{
	private String id;	//主键
	private String sCode;	//系统自维护编号
	private String areaPinyin;	//区域拼音
	private String firstLetter;	//区域首字母
	private String postCode;	//邮政编码
	private Integer sort;	//排序
	private Short valid;	//是否有效 1 是 0 否
	private Short areaType;	//区域类型 0 国家 1 省份 2 城市 3区域
	private String parentId;	//父ID
	private Date createDateTime;	//创建时间
	private Date updateDateTime;	//修改时间


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSCode() {
		return sCode;
	}

	public void setSCode(String sCode) {
		this.sCode = sCode;
	}

	public String getAreaPinyin() {
		return areaPinyin;
	}

	public void setAreaPinyin(String areaPinyin) {
		this.areaPinyin = areaPinyin;
	}

	public String getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Short getValid() {
		return valid;
	}

	public void setValid(Short valid) {
		this.valid = valid;
	}

	public Short getAreaType() {
		return areaType;
	}

	public void setAreaType(Short areaType) {
		this.areaType = areaType;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}