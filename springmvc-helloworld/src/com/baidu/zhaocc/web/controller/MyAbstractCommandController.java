package com.baidu.zhaocc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.baidu.zhaocc.module.UserModule;

public class MyAbstractCommandController extends AbstractCommandController {
	public MyAbstractCommandController() {
		setCommandClass(UserModule.class);
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException exception)
			throws Exception {
		UserModule user = (UserModule)command;
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("adbstractView");
		return mv;
	}

}
