package com.test.tsp.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.test.tsp.member.model.exception.LoginException;
import com.test.tsp.member.model.service.MemberService;
import com.test.tsp.member.model.vo.Member;

//Spring에서 사용하기위해
//bean에 등록
@Controller
public class MemberController {

	
	@Autowired
	private MemberService ms;

	
	@RequestMapping("login.me")
	public String loginCheck(Member member,HttpServletRequest request) {
		
		System.out.println(member);
		
		Member loginMember;
		try {
			loginMember = ms.loginMember(member);
			request.getSession().setAttribute("loginMember", loginMember);
			return "redirect:index.jsp";
		} catch (LoginException e) {
			request.setAttribute("msg", e.getMessage());

			return "common/errorPage";
		}
		
	}
	@RequestMapping("logout.me")
	public String logoutMember(SessionStatus status,HttpSession session) {
		session.invalidate();
		status.setComplete();
		System.out.println("세션 말소");
		return "redirect:index.jsp";
	}
	
	
	@RequestMapping("/memberJoinView.me")
	public String showMemberJoinView() {
		return "member/memberJoin";
	}
	
	
	
	
	

}










