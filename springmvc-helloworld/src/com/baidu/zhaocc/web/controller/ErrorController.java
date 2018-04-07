package com.baidu.zhaocc.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.baidu.zhaocc.module.DataBindTestModel;

public class ErrorController extends AbstractCommandController {
	public ErrorController() {
		setCommandClass(DataBindTestModel.class);
		setCommandName("command");
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		errors.reject("username.not.empty");
		errors.reject("username.not.empty1", "用户不能为空1");
		errors.reject("username.length.error", new Object[]{5, 10}, "用户长度不合法");
		
		Map model = errors.getModel();
		System.out.println("model:" + model);
		return new ModelAndView("bindAndValidate/error", model);
	}
}
