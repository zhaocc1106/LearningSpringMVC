package com.baidu.zhaocc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller				//or @RequestMapping		declare a POJO to controller
public class HelloController {
	@RequestMapping(value="hello")
	public ModelAndView HelloController() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "hello, this is the first controller.");
		mv.setViewName("hello");
		return mv;
	}
}
