package com.baidu.zhaocc.web.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

	@RequestMapping(value = "/requestParam1")
	public String requestParam1(@RequestParam String username) {
		System.out.println("requestParam1 username:" + username);
		return "success";
	}

	@RequestMapping(value = "/requestParam2")
	public String requestParam2(@RequestParam("username") String username) {
		System.out.println("requestParam2 username:" + username);
		return "success";
	}

	@RequestMapping(value = "/requestParam3")
	public String requestParam3(
			@RequestParam(value = "username", required = false, defaultValue = "zhao") String username) {
		System.out.println("requestParam3 username:" + username);
		return "success";
	}

	@RequestMapping(value = "/requestParam4")
	public String requestParam4(
			@RequestParam(value = "list") String[] list) {
		System.out.println("requestParam4 list:" + Arrays.asList(list));
		return "success";
	}
}
