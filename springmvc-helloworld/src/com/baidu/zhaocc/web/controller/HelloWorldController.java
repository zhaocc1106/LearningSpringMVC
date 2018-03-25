package com.baidu.zhaocc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

public class HelloWorldController extends AbstractController implements LastModified{
	
	private long lastModified = 0L;

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		//1、收集参数
		//2、绑定参数到命令对象
		//3、调用业务对象
		//4、选择下一个页面
//		ModelAndView mv = new ModelAndView();
//		//添加模型数据 可以是任意的POJO对象
//		mv.addObject("message", "Hello World!");
//		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
//		mv.setViewName("hello");
		arg1.getWriter().write("<a href=''>this</a>");
		return null;
	}

	@Override
	public long getLastModified(HttpServletRequest arg0) {
		if (lastModified == 0L) {
			lastModified = System.currentTimeMillis();
		}
		return lastModified;
	}
}
