package com.test.tsp.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;

import com.test.tsp.board.model.vo.Board;

public interface BoardDao {

	ArrayList<HashMap<String,Object>> selectBoardList(SqlSessionTemplate sqlSession, int bCode);

	int insertBoard(SqlSessionTemplate sqlSession, HashMap<String,Object> insertMap);

}
