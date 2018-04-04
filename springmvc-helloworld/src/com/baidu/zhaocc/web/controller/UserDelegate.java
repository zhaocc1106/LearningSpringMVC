package com.baidu.zhaocc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.baidu.zhaocc.module.UserModule;
import com.baidu.zhaocc.web.service.UserService;

public class UserDelegate {
	private UserService userService;
	private String createView;
	private String listView;
	private String deleteView;
	private String updateView;
	private String redirectToListView;

	public String getRedirectToListView() {
		return redirectToListView;
	}

	public void setRedirectToListView(String redirectToListView) {
		this.redirectToListView = redirectToListView;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getCreateView() {
		return createView;
	}

	public void setCreateView(String createView) {
		this.createView = createView;
	}

	public String getListView() {
		return listView;
	}

	public void setListView(String listView) {
		this.listView = listView;
	}

	public String getDeleteView() {
		return deleteView;
	}

	public void setDeleteView(String deleteView) {
		this.deleteView = deleteView;
	}

	public String getUpdateView() {
		return updateView;
	}

	public void setUpdateView(String updateView) {
		this.updateView = updateView;
	}

	public String create(HttpServletRequest request,
			HttpServletResponse response, UserModule userModel) {
		if ("GET".equals(request.getMethod())) {
			return getCreateView();
		}
		userService.create(userModel);
		return getRedirectToListView();
	}

	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userList", userService.list());
		mv.setViewName(getListView());
		return mv;
	}

	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response, UserModule userModel) {
		if ("GET".equals(request.getMethod())) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("command", userService.get(userModel.getUserName()));
			mv.setViewName(getUpdateView());
			return mv;
		}
		System.out.println("userName = " + userModel.getUserName()
				+ " password = " + userModel.getPassword());
		userService.update(userModel.getUserName(), userModel);
		return new ModelAndView(getRedirectToListView());
	}

	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response, UserModule userModel) {
		if ("GET".equals(request.getMethod())) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("command", userService.get(userModel.getUserName()));
			mv.setViewName(getDeleteView());
			return mv;
		}
		userService.delete(userModel.getUserName());
		return new ModelAndView(getRedirectToListView());
	}

}
