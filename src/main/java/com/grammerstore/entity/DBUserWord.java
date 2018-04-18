package com.grammerstore.entity;

import java.util.Date;

public class DBUserWord {
	private Integer id;
	private String userName;
	private Integer operateDay;
	private Integer operateMonth;
	private Integer operateYear;
	private Date operateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Integer getOperateDay() {
		return operateDay;
	}
	public void setOperateDay(Integer operateDay) {
		this.operateDay = operateDay;
	}
	public Integer getOperateMonth() {
		return operateMonth;
	}
	public void setOperateMonth(Integer operateMonth) {
		this.operateMonth = operateMonth;
	}
	
	public Integer getOperateYear() {
		return operateYear;
	}
	public void setOperateYear(Integer operateYear) {
		this.operateYear = operateYear;
	}
	public Date getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}
	
	
}
