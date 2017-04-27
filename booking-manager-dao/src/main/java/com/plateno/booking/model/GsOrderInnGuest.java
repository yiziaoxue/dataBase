package com.plateno.booking.model;

/**
 * model文件，系统自动生成
 * @author: TaneRoom
 * @since: 2016-12-07 10:17:39
 */
public class GsOrderInnGuest{
	private Integer id;	//主键
	private String orderCode;	//订单编号
	private String name;	//姓名
	private String sex;	//性别
	private Integer doctType;	//证件类型
	private String doctNo;	//证件号码
	private String mobile;	//手机号码
	private String telephone;	//电话号码
	private String remark;	//备注
	private String lastName;	//英文姓（中文拼音姓）
	private String firstName;	//英文名（中文拼音名）
	private String countryCode;	//国家编码
	private Integer age;	//年龄
	private String isAdult;	//默认成人，Y为成人，N为儿童
	private String email;	//邮箱


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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getDoctType() {
		return doctType;
	}

	public void setDoctType(Integer doctType) {
		this.doctType = doctType;
	}

	public String getDoctNo() {
		return doctNo;
	}

	public void setDoctNo(String doctNo) {
		this.doctNo = doctNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}