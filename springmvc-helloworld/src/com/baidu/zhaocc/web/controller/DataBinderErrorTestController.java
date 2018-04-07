package com.baidu.zhaocc.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.baidu.zhaocc.module.DataBindTestModel;
import com.baidu.zhaocc.module.PhoneNumberModel;
import com.baidu.zhaocc.web.controller.support.editor.PhoneNumberEditor;

public class DataBinderErrorTestController extends SimpleFormController {
	public DataBinderErrorTestController() {
		setCommandClass(DataBindTestModel.class);
		setCommandName("dataBinderTest");
	}

	// @Override
	// protected ModelAndView processFormSubmission(HttpServletRequest request,
	// HttpServletResponse response, Object command, BindException errors)
	// throws Exception {
	// Map model = new HashMap();
	// model.put("dataBinderTest", command);
	// return new ModelAndView("bindAndValidate/success", model);
	// }

	@Override
	protected void doSubmitAction(Object command) throws Exception {
		System.out.println("command:" + command);
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest request,
			HttpServletResponse response, BindException errors)
			throws Exception {
		System.out.println(errors);
		return super.showForm(request, response, errors);
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		super.initBinder(request, binder);
		DateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		binder.registerCustomEditor(Date.class, dateEditor);
		binder.registerCustomEditor(PhoneNumberModel.class,
				new PhoneNumberEditor());
	}
}
