package com.plateno.booking.model;
import java.util.Date;
import java.util.Date;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:20
 */
public class SysTimeZone{
	private String id;	//
	private String timeZoneType;	//GMT
	private Double timeZoneV;	//
	private String timeZoneName;	//
	private String timeZoneCode;	//
	private String remark;	//
	private Date createDateTime;	//
	private Date updateDateTime;	//


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimeZoneType() {
		return timeZoneType;
	}

	public void setTimeZoneType(String timeZoneType) {
		this.timeZoneType = timeZoneType;
	}

	public Double getTimeZoneV() {
		return timeZoneV;
	}

	public void setTimeZoneV(Double timeZoneV) {
		this.timeZoneV = timeZoneV;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}

	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

	public String getTimeZoneCode() {
		return timeZoneCode;
	}

	public void setTimeZoneCode(String timeZoneCode) {
		this.timeZoneCode = timeZoneCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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