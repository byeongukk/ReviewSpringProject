package com.test.tsp.common.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/common/error")
public class ErrorController {
	
	
	public String PageError500(HttpServletRequest request,Model model) {
		System.out.println("500번 에러");
		return "common/errorPage";
	}
}
