package com.baidu.zhaocc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.zhaocc.support.dao.UserDao;
import com.baidu.zhaocc.support.model.UserInfo;

@Controller
public class UserInfoRegisterController {

	@ModelAttribute("user")        //① 暴露表单引用对象为模型数据
	public UserInfo getUser() {
		return new UserInfo();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterForm() {   //② 表单展示
		return "register/userInfoRegister";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String submitForm(
			@ModelAttribute("user") UserInfo user) {           //③ 表单提交
		System.out.println("user:" + user.toString());
		UserDao.save(user);
		return "redirect:/success";
	}
}
