package com.baidu.zhaocc.web.controller.consumesproduces;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class RequestContentTypeController {
	
	@RequestMapping(value = "consumes/requestContentType", method = RequestMethod.GET)
	public String showForm() throws IOException{
		return "consumes/requestContentType";
	}

	@RequestMapping(value = "consumes/requestContentType", method = RequestMethod.POST,
					consumes = "application/x-www-form-urlencoded")
	public String request1(HttpServletRequest request) throws IOException {
		String contentType = request.getContentType();
		String encoding = request.getCharacterEncoding();
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		System.out.println("ContentType = " + contentType + " encoding = " + encoding
				+" name = " + name + " pwd = " + pwd);
		return "success";
	}

	@RequestMapping(value = "consumes/requestContentType", method = RequestMethod.POST,
					consumes = "application/json")
	public void request2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		InputStream is = request.getInputStream();
		byte[] bytes = new byte[request.getContentLength()];
		is.read(bytes);
		String jsonStr = new String(bytes, request.getCharacterEncoding());
		System.out.println("jsonStr:" + jsonStr);
		//response.getOutputStream().write("jsonStr success!".getBytes());
		response.setContentType("application/json;charset=utf-8");
		String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
		response.getWriter().write(jsonData);
	}
}