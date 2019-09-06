package com.test.tsp.board.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.tsp.board.model.exception.InsertBoardException;
import com.test.tsp.board.model.service.BoardService;
import com.test.tsp.board.model.vo.Board;
import com.test.tsp.board.validator.BoardInsertValidator;
import com.test.tsp.member.model.vo.Member;

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
		
		if(request.getSession().getAttribute("loginMember") != null) {
			Board board = new Board();
			model.addAttribute("bCode",bCode);
			model.addAttribute("board", board);
			return "board/boardInsertForm";
			
		} else {
			model.addAttribute("msg","로그인이 필요한 서비스입니다");
			return "common/errorPage";
		}
	}
	
	@RequestMapping("insertBoard.bo")
	public String insertBoard(HttpServletRequest request, Model model,Board board, Errors errors) throws InsertBoardException {
		new BoardInsertValidator().validate(board, errors);
		if(errors.hasErrors()) {
			model.addAttribute("bCode",board.getbCode());
			model.addAttribute("errors",errors);
			return "board/boardInsertForm";
		}else {
			Member member = (Member)request.getSession().getAttribute("loginMember");
			HashMap<String,Object> insertMap = new HashMap<>();
			insertMap.put("member", member);
			insertMap.put("board", board);
			
			bs.insertBoard(insertMap);
			return "redirect:index.jsp";
		}
		
	}
	
	
}
