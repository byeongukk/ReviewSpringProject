package com.test.tsp.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tsp.board.model.dao.BoardDao;
import com.test.tsp.board.model.exception.InsertBoardException;
import com.test.tsp.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao bd;
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<HashMap<String,Object>> selectBoardList(int bCode) {		
		return bd.selectBoardList(sqlSession,bCode);
	}

	@Override
	public void insertBoard(HashMap<String,Object> insertMap) throws InsertBoardException {
		int result = bd.insertBoard(sqlSession,insertMap);
		if(result<=0) {
			throw new InsertBoardException("게시글 작성 실패");
		}
		
	}

}
