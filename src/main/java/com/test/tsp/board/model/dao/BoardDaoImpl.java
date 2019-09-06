package com.test.tsp.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.test.tsp.board.model.vo.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public ArrayList<HashMap<String,Object>> selectBoardList(SqlSessionTemplate sqlSession, int bCode) {
		return (ArrayList)sqlSession.selectList("Board.selectBoardList",bCode);
	}

	@Override
	public int insertBoard(SqlSessionTemplate sqlSession, HashMap<String,Object> insertMap) {
		return sqlSession.insert("Board.insertBoard",insertMap);
	}

}
