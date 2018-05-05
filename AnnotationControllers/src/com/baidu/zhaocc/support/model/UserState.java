package com.baidu.zhaocc.support.model;

public enum UserState{
	normal("正常", 0), blocked("锁定", 1);
	private String desc;
	private int index;

	public String getDesc() {
		return desc;
	}

	private UserState(String desc, int index) {
		this.desc = desc;
		this.index = index;
	}
	
	@Override
	public String toString() {
		return index + "_" +desc;
	}
}
