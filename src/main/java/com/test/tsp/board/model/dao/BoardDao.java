package com.test.tsp.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;

public interface BoardDao {

	ArrayList<HashMap<String,Object>> selectBoardList(SqlSessionTemplate sqlSession, int bCode);

}
