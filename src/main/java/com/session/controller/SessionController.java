package com.session.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * Session控制器<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年4月25日<br>
 */
@Controller
@RequestMapping("/session")
public class SessionController {

	@RequestMapping("/create")
	public String create(HttpServletRequest request) {
		String attributeName = request.getParameter("attributeName");
		String attributeValue = request.getParameter("attributeValue");
		request.getSession().setAttribute(attributeName, attributeValue);
		return "redirect:/";
	}

}
