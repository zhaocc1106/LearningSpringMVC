package com.baidu.zhaocc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.zhaocc.support.model.UserModel;

@Controller
public class ModelAtrributeController {

	@RequestMapping(value="/modelAtrribute")
	public String request1(@ModelAttribute("user") UserModel user) {
		return "success";
	}
}
