package com.baidu.zhaocc.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.baidu.zhaocc.module.BaseInfoModel;

public class InfoFillWizardFormController extends AbstractWizardFormController {
	public InfoFillWizardFormController() {
		setCommandClass(BaseInfoModel.class);
		setCommandName("user");
	}
	
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {
		Map map = new HashMap();
		switch(page)
		{
			case 1:
				map.put("schoolTypeList", Arrays.asList("高中", "本科", "研究生"));
				break;
			case 2:
				map.put("cityList", Arrays.asList("北京", "上海", "天津"));
				break;
		}
		return map;
	}
	
	@Override
	protected void validatePage(Object command, Errors errors, int page,
			boolean finish) {
		super.validatePage(command, errors, page, finish);
	}

	//每一页完成后的处理
	@Override
	protected void postProcessPage(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {
		super.postProcessPage(request, command, errors, page);
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object command, BindException arg3)
			throws Exception {
		System.out.println("command:" + command);
		return new ModelAndView("redirect:/success");
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("command:" + command);
		return new ModelAndView("redirect:/cancel");
	}
}
