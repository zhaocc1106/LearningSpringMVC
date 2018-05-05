package com.baidu.zhaocc.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;



import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.zhaocc.support.editor.PhoneNumberEditor;
import com.baidu.zhaocc.support.model.DataBindTestModel;
import com.baidu.zhaocc.support.model.PhoneNumberModel;

@Controller
public class DataBindTestController {

	@RequestMapping("/dataBind")
	public String test(DataBindTestModel data, ModelMap map) {
		map.put("dataBindTest", data);
		System.out.println("data:" + data.toString());
		return "bindAndValidate/success";
	}

	/*
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("initBinder");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor de = new CustomDateEditor(df, true);
		dataBinder.registerCustomEditor(Date.class, de);
		PhoneNumberEditor ne = new PhoneNumberEditor();
		dataBinder.registerCustomEditor(PhoneNumberModel.class, ne);
	}
	*/
}
