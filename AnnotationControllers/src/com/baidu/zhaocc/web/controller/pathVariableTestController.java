package com.baidu.zhaocc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pathVariableTestController {
	@RequestMapping(value = { "/products/{category:\\d+}-{pageNumber:\\d+}" })
	public ModelAndView test(@PathVariable(value = "category") int category,
			@PathVariable(value = "pageNumber") int pageNumber) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("message", category + "-" + pageNumber);
		return mv;
	}
}
