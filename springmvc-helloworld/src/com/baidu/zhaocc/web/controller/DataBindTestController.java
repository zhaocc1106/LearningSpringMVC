package com.baidu.zhaocc.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.baidu.zhaocc.module.DataBindTestModel;
import com.baidu.zhaocc.module.PhoneNumberModel;
import com.baidu.zhaocc.web.controller.support.editor.PhoneNumberEditor;

public class DataBindTestController extends AbstractCommandController {

	public DataBindTestController() {
		setCommandClass(DataBindTestModel.class);
		setCommandName("dataBindTest");
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException exception)
			throws Exception {
		System.out.println(command);
		return new ModelAndView("bindAndValidate/success").addObject("dataBindTest", command);
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		super.initBinder(request, binder);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		binder.registerCustomEditor(Date.class, dateEditor);
		binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
	}
}
