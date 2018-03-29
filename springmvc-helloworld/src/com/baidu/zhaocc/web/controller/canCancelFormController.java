package com.baidu.zhaocc.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.Errors;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.baidu.zhaocc.module.UserModule;

public class canCancelFormController extends CancellableFormController {
	public canCancelFormController() {
		setCommandClass(UserModule.class);
		setCommandName("user");
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		UserModule user = new UserModule();
		user.setUserName("请输入账号");
		user.setPassword("请输入密码");
		return user;
	}
	
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		Map map = new HashMap();
		map.put("cityList", Arrays.asList("北京", "上海", "广州"));
		return map;
	}
	
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		UserModule user = (UserModule) command;
		System.out.printf("user:%s,%s\n", user.getUserName(), user.getPassword());
	}
}
