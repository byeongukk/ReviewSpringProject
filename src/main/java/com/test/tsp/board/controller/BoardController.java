package com.test.tsp.board.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.tsp.board.model.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@RequestMapping("selectBoardList.bo")
	public String selectBoardList(HttpServletRequest request,Model model,int bCode) {
		System.out.println(request.getParameter("bCode"));
		int bCode1 = Integer.parseInt(request.getParameter("bCode"));
		
		ArrayList<HashMap<String,Object>> boardList = bs.selectBoardList(bCode1);		
		model.addAttribute("boardList",boardList);
		model.addAttribute("bCode",bCode);
		
		return "board/boardList";
	}
	
	@RequestMapping("showBoardInsertForm.bo")
	public String showBoardInsertForm(HttpServletRequest request,Model model,int bCode) {
		if(request.getSession().getAttribute("loginMember") == null) {
			model.addAttribute("msg","로그인이 필요한 서비스입니다");
			return "common/errorPage";
		} else {
			model.addAttribute("bCode",bCode);
			return "board/boardInsertForm";
		}
		
	}
	
}
