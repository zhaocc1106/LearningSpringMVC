package com.baidu.zhaocc.web.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.baidu.zhaocc.module.UserModule;

public class ValidatorTestController extends SimpleFormController {
	public ValidatorTestController() {
		setCommandClass(UserModule.class);
		setCommandName("user");
	}

	@Override
	protected void doSubmitAction(Object command) throws Exception {
		System.out.println("command:" + command);
	}
	
	
}
