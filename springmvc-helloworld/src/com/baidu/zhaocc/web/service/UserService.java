package com.baidu.zhaocc.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baidu.zhaocc.module.UserModule;

public class UserService {
	private Map userMap = new HashMap();
	
	public UserService() {
		System.out.println("construct function");
	}

	public List list() {
		System.out.println("list function userMap:" + userMap.values());
		return new ArrayList(userMap.values());
	}
	
	public void create(UserModule userModel) {
		System.out.println("create function");
		userMap.put(userModel.getUserName(), userModel);
	}
	
	public void update(String key, UserModule value) {
		System.out.println("update function key= " + key + " value= " + value);
		userMap.put(key, value);
	}
	
	public void delete(String key) {
		System.out.println("delete function key = " + key);
		userMap.remove(key);
	}
	
	public UserModule get(String key) {
		System.out.println("get function");
		return (UserModule)userMap.get(key);
	}
}
