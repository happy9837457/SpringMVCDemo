package com.palm.springmvc.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palm.springmvc.bean.UserInfo;
import com.palm.springmvc.service.UserInfoService;

@RequestMapping("/login")
@Controller
public class LoginAction {
	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,
			HttpServletResponse response, UserInfo userInfo) {
		UserInfo user = userInfoService.queryUserInfo(userInfo.getUsername(),
				userInfo.getPassword());
		HttpSession session = request.getSession();
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/loginok.jsp";
		} else {
			return "error";
		}
	}
}
