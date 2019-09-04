package com.test.tsp.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tsp.board.model.dao.BoardDao;

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

}
