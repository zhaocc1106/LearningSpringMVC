package com.baidu.zhaocc.support.model;

public class UserModel {

	private String username;
	private String pwd;
	private SchoolInfoModel schoolInfo;
	private WorkInfoModel workInfo;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "username:" + username + " pwd:" + pwd + " schoolInfo:" + schoolInfo + " workInfo:" + workInfo;
	}
}
