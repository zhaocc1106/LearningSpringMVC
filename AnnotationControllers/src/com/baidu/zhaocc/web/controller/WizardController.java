package com.baidu.zhaocc.web.controller;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.util.WebUtils;

import com.baidu.zhaocc.support.model.UserModel;
import com.sun.org.apache.xerces.internal.util.Status;

@Controller
@RequestMapping("/wizard")
@SessionAttributes(value = "user")
// 将user model放到会话范围中
public class WizardController {

	public static final String PARAM_TAGET = "_target";
	public static final String PARAM_PAGE = "_page";

	private String pageViews[];


	public void setPageViews(String[] pageViews) {
		this.pageViews = pageViews;
	}

	private String successView;

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	private String failView;

	public void setFailView(String failView) {
		this.failView = failView;
	}

	@ModelAttribute("user")
	// 如果模型数据中没有user，则存储一个
	public UserModel initUser() {
		System.out.println("initUser");
		return new UserModel();
	}

	@ModelAttribute
	public void referenceData(
			HttpServletRequest request,
			@RequestParam(value = PARAM_PAGE, defaultValue = "0") int currentPage,
			Map model) {
		System.out.println("referenceData page:" + currentPage + " servletPath:" + request.getServletPath()
				+ " local Addr:" + request.getLocalAddr() + " local name:" + request.getLocalName()
				+ " local port:" + request.getLocalPort() + " remote addr:" + request.getRemoteAddr()
				+ " remote name:" + request.getRemoteHost() + " remote port:" + request.getRemotePort()
				+ " url:" + request.getRequestURL()
				);
		if (request.getServletPath().equals("/wizard")) {
			if (getTargetPage(request, currentPage) == 1) {
				System.out.println("put cityList");
				model.put("schoolTypeList", Arrays.asList("小学", "高中", "大学"));
				return;
			} else if (getTargetPage(request, currentPage) == 2) {
				System.out.println("put schoolTypeList");
				model.put("cityList", new String[] { "北京", "上海", "天津" });
				return;
			}
		}
	}

	// 得到下一页页码
	private int getTargetPage(HttpServletRequest request, int currentPage) {
		return WebUtils.getTargetPage(request, PARAM_TAGET, currentPage);
	}

	@RequestMapping(params = { "!_finish", "!_cancel" })
	public String showForm(HttpServletRequest request,
			@RequestParam(value = "_page", defaultValue="0") int currentPage,
			@ModelAttribute("user") UserModel user) {
		System.out.println("showForm currentPage:" + currentPage);
		return pageViews[getTargetPage(request, currentPage)];
	}

	@RequestMapping(params = "_finish")
	public String submit(@ModelAttribute("user") UserModel user, SessionStatus status, Map model) {
		System.out.println("submit user:" + user + " model:" + model);
		status.setComplete();
		model.remove("cityList");
		return successView;
	}

	@RequestMapping(params = "_cancel")
	public String cancel(@ModelAttribute("user") UserModel user, SessionStatus status) {
		System.out.println("cancel user:" + user);
		status.setComplete();
		return failView;
	}
}
