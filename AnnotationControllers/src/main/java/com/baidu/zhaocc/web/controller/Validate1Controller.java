package com.baidu.zhaocc.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.zhaocc.support.model.UserModel;

@Controller
public class Validate1Controller {
	
	@RequestMapping("/validate/validate1")
	public String validate(@Valid @ModelAttribute("user") UserModel user, Errors error) {
		List<ObjectError> errors = error.getAllErrors();
		System.out.println("All errors:" + errors.toString());
		if (error.hasErrors()) {
			return "/validate/error";
		} else {
			return "/validate/success";
		}
	}
}
