package com.test.tsp.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.test.tsp.board.model.exception.InsertBoardException;
import com.test.tsp.board.model.vo.Board;

public interface BoardService {

	ArrayList<HashMap<String,Object>> selectBoardList(int bCode);

	void insertBoard(HashMap<String,Object> insertMap) throws InsertBoardException;

}
