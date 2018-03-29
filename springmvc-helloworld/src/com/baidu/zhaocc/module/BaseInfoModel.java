package com.baidu.zhaocc.module;

public class BaseInfoModel {
	private String userName;
	private String password;
	private String realName;
	private SchoolInfoModel schoolInfo;
	private WorkInfoModel workInfo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public SchoolInfoModel getSchoolInfo() {
		return schoolInfo;
	}
	public void setSchoolInfo(SchoolInfoModel schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public WorkInfoModel getWorkInfo() {
		return workInfo;
	}
	public void setWorkInfo(WorkInfoModel workInfo) {
		this.workInfo = workInfo;
	}
	
}
